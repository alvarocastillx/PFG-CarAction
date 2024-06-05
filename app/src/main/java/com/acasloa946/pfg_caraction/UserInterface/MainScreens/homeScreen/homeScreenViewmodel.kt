package com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.API.const.Companion.CURRENT_CHATS
import com.acasloa946.pfg_caraction.API.const.Companion.INITIAL_CHATS
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarTypesUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class homeScreenViewmodel @Inject constructor(
    private val fetchUserUseCase: fetchUserUseCase,
    private val fetchCarsUseCase: fetchCarsUseCase,
    private val fetchCarTypesUseCase: fetchCarTypesUseCase,
    private val fetchChatsOfUserUseCase: fetchChatsOfUserUseCase
) : ViewModel() {


    private val auth = Firebase.auth
    private var fetched = false
    private var alreadyFetchedCars = false

    var searchBarText by mutableStateOf("")
    private var _originalCarList: MutableList<CarModel> = mutableListOf()

    var userName: String by mutableStateOf("")

    val fetchedCars = MutableStateFlow<List<CarModel>>(emptyList())
    val fetchedCarTypes = MutableStateFlow<List<String>>(emptyList())

    private var _typeSortedList: MutableList<CarModel> = mutableListOf()

    var isDialogOpened by mutableStateOf(false)



    private var alreadyFetchedChats by mutableStateOf(false)


    fun changeDialog() {
        isDialogOpened = !isDialogOpened
    }

    fun clearScreen() {
        alreadyFetchedChats = false
        _typeSortedList = mutableListOf()
        searchBarText = ""
        alreadyFetchedCars = false
        fetched = false
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
        } else {
            if (userInput != "") {
                fetchedCars.value = fetchedCars.value.filter { item ->
                    val makeModel = "${item.make} ${item.model}"
                    makeModel.contains(userInput, ignoreCase = true)
                }
            } else {
                fetchedCars.value = _typeSortedList
            }

        }

    }

    fun filterListByTypeButton(typeToSearch: String) {
        if (previousType != typeToSearch) {
            fetchedCars.value = _originalCarList.filter { item ->
                item.type!!.contains(typeToSearch)
            }
            previousType = typeToSearch
        } else {
            fetchedCars.value = _originalCarList
            previousType = ""
        }
        _typeSortedList = fetchedCars.value.toMutableList()


    }


    suspend fun fetchCarTypes() {
        var carTypeList = mutableListOf<String>()
        viewModelScope.launch {
            try {
                carTypeList = fetchCarTypesUseCase.invoke()
            } catch (e: Exception) {
                Log.d("Error", "Error al recuperar tipos")
            }
        }.join()
        fetchedCarTypes.value = carTypeList

    }

    fun filterArea(filterList: List<Any>) {
        if (filterList[0].toString().replace(",", "").toFloat() != 0f) {
            fetchedCars.value = _originalCarList.filter { item ->
                item.km!! < filterList[0].toString()
                    .replace(",", "").toFloat()
            }
        }
        if (filterList[1].toString().replace(",", "").toFloat() != 0f) {
            fetchedCars.value = fetchedCars.value.filter { item ->
                item.price != "" && item.price?.replace(",", "")!!.toFloat() < filterList[1].toString()
                    .replace(",", "").toFloat()


            }
        }

    }

    fun signOut(navController: NavController){
        auth.signOut()
        FirebaseAuth.getInstance().signOut()
        navController.navigate(Routes.InitScreen.route)
        fetched = false
        alreadyFetchedChats = false
        alreadyFetchedCars = false
        searchBarText = ""
        userName = ""

    }

    fun checkChatsForNotif(context: Context, sendNotification : () -> Unit){
        try {
            viewModelScope.launch {
                if (!alreadyFetchedChats) {
                    INITIAL_CHATS = fetchChatsOfUserUseCase.invoke(context, auth.currentUser?.email.toString()).size
                    CURRENT_CHATS = INITIAL_CHATS
                    alreadyFetchedChats = true
                }
                else {
                    CURRENT_CHATS = fetchChatsOfUserUseCase.invoke(context, auth.currentUser?.email.toString()).size
                    if (CURRENT_CHATS>INITIAL_CHATS) {
                        sendNotification()
                        INITIAL_CHATS = CURRENT_CHATS
                    }
                }
            }
        }
        catch (e:Exception){
            Log.d("Error","Error recuperando chats")
        }
    }



}