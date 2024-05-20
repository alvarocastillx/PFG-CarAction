package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.fetchCarTypesUseCase
import com.acasloa946.pfg_caraction.domain.fetchCarsUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@HiltViewModel
class homeScreenViewmodel @Inject constructor(
    private val fetchUserUseCase: fetchUserUseCase, private val fetchCarsUseCase: fetchCarsUseCase, private val fetchCarTypesUseCase: fetchCarTypesUseCase,
) : ViewModel() {



    private val auth = Firebase.auth
    private var fetched = false
    private var alreadyFetchedCars = false

    var searchBarText by mutableStateOf("")
    private var _originalCarList: MutableList<CarModel> = mutableListOf()

    var userName: String by mutableStateOf("")

    val fetchedCars = MutableStateFlow<List<CarModel>>(emptyList())
    val fetchedCarTypes  = MutableStateFlow<List<String>>(emptyList())

    private var _typeSortedList: MutableList<CarModel> = mutableListOf()

    var countOfList by mutableStateOf(5)



    fun add5toList() {
        countOfList += 5
    }

    fun fetchUserName(context: Context, onError: () -> Unit) {
        val currentEmail = auth.currentUser?.email
        viewModelScope.launch {
            try {
                if (!fetched) {
                    val user = fetchUserUseCase.invoke(currentEmail!!, context)
                    userName = user.name
                    fetched = true
                    fetchCars()
                    fetchCarTypes()
                }
            } catch (e: Exception) {
                auth.currentUser?.delete()
                onError()
            }

        }
    }

    fun changeSearchBarText(input: String) {
        searchBarText = input
        filterListBySearchbar(searchBarText)
    }

    suspend fun fetchCars() {
        var carModelList = mutableListOf<CarModel>()
        viewModelScope.launch {
            carModelList = fetchCarsUseCase.invoke()
        }.join()

        if (!alreadyFetchedCars) {
            fetchedCars.value = carModelList.shuffled()
            alreadyFetchedCars = true
        } else if (searchBarText.isBlank() && alreadyFetchedCars) {
            fetchedCars.value = carModelList
        }
        _originalCarList = fetchedCars.value.toMutableList()


    }
    private var previousType = ""
    private fun filterListBySearchbar(userInput: String) {
        if (previousType == "") {
            fetchedCars.value = _originalCarList.filter { item ->
                val makeModel = "${item.make} ${item.model}"
                makeModel.contains(userInput, ignoreCase = true)
            }
        }
        else {
            if (userInput != "") {
                fetchedCars.value = fetchedCars.value.filter { item ->
                    val makeModel = "${item.make} ${item.model}"
                    makeModel.contains(userInput, ignoreCase = true)
                }
            }
            else {
                fetchedCars.value = _typeSortedList
            }

        }

    }

    fun filterListByTypeButton(typeToSearch:String) {
        if (previousType != typeToSearch) {
            fetchedCars.value = _originalCarList.filter { item ->
                item.type!!.contains(typeToSearch)
            }
            previousType = typeToSearch
        }
        else {
            fetchedCars.value = _originalCarList
            previousType = ""
        }
        _typeSortedList = fetchedCars.value.toMutableList()


    }

    fun formatLocationString(locationString: String): String {
        val locationParts = locationString.split(",")
        return locationParts[1] + "," + locationParts[3]
    }

    suspend fun fetchCarTypes() {
        var carTypeList = mutableListOf<String>()
        viewModelScope.launch {
            try {
                carTypeList = fetchCarTypesUseCase.invoke()
            }
            catch (e:Exception) {
                Log.d("Error","Error al recuperar tipos")
            }
        }.join()
        fetchedCarTypes.value = carTypeList

    }
}