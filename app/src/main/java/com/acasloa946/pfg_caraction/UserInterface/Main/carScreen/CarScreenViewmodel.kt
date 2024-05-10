package com.acasloa946.pfg_caraction.UserInterface.Main.carScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel

class CarScreenViewmodel : ViewModel() {

    var clickedCar by mutableStateOf(CarModel())

    fun formatLocationString(locationString: String): String {
        val locationParts = locationString.split(",")
        return locationParts[1] + "," + locationParts[3]
    }


}