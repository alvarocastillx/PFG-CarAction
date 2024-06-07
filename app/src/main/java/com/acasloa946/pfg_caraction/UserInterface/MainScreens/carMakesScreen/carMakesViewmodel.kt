package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carMakesScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.API.APIModule
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel
import kotlinx.coroutines.launch

class carMakesViewmodel : ViewModel() {

    var carMakes by mutableStateOf(listOf<APIMake>())

    private var makesFetched by mutableStateOf(false)

    var searchBarText by mutableStateOf("")
    private var originalList by mutableStateOf(listOf<APIMake>())

    fun getMakes(failed : () -> Unit) {
        val apiModule = APIModule()
        if (!makesFetched) {
            viewModelScope.launch {
                try {
                    carMakes = apiModule.getCarMakes()
                    makesFetched = true
                    originalList = carMakes
                }
                catch (e:Exception) {
                    failed()
                }
            }
        }
    }

    fun changeSearchBarText(input: String) {
        searchBarText = input
        filterListBySearchbar(searchBarText)
    }

    fun filterListBySearchbar(searchBarText:String) {
        carMakes = originalList.filter { it.name!!.contains(searchBarText, ignoreCase = true) }
        if (searchBarText.isBlank()) {
            carMakes = originalList
        }
    }


}