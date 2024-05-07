package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.addUserUseCase
import com.acasloa946.pfg_caraction.domain.fetchCarsUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class homeScreenViewmodel @Inject constructor(
    private val fetchUserUseCase: fetchUserUseCase, private val fetchCarsUseCase: fetchCarsUseCase
) : ViewModel() {

    private val auth = Firebase.auth
    private var fetched = false
    private var alreadyFetchedCars = false

    var searchBarText by mutableStateOf("")
    var originalCarList: MutableList<CarModel> = mutableListOf()

    var userName: String by mutableStateOf("")

    val fetchedCars = MutableStateFlow<List<CarModel>>(emptyList())
    fun fetchUserName(context: Context, onError: () -> Unit) {
        val currentEmail = auth.currentUser?.email
        viewModelScope.launch {
            try {
                if (!fetched) {
                    val user = fetchUserUseCase.invoke(currentEmail!!, context)
                    userName = user.name
                    fetched = true
                    fetchCars()
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
        originalCarList = fetchedCars.value.toMutableList()


    }

    fun filterListBySearchbar(userInput: String) {

        fetchedCars.value = originalCarList.filter { item ->
            val makeModel = "${item.make} ${item.model}"
            makeModel.contains(userInput, ignoreCase = true)
        }

    }

    fun formatLocationString(locationString: String): String {
        val locationParts = locationString.split(",")
        return locationParts[1] + "," + locationParts[3]
    }
}