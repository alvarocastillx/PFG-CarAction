package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carModelScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.API.APIModule
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel
import kotlinx.coroutines.launch

class carModelViewmodel : ViewModel() {
    var modelList by mutableStateOf(listOf<APIModel>())
    var searchBarText by mutableStateOf("")
    private var originalList by mutableStateOf(listOf<APIModel>())


    fun getModels(make: String) {
        val apiModule = APIModule()
        viewModelScope.launch {
            modelList = apiModule.getCarModels(make)
            originalList = modelList
        }
    }
    fun changeSearchBarText(input: String) {
        searchBarText = input
        filterListBySearchbar(searchBarText)
    }

    fun filterListBySearchbar(searchBarText:String) {
        modelList = originalList.filter { it.name!!.contains(searchBarText, ignoreCase = true) }
        if (searchBarText.isBlank()) {
            modelList = originalList
        }
    }
}