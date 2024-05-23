package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.addCarToFavouritesUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarScreenViewmodel @Inject constructor(private val addCarToFavouritesUseCase: addCarToFavouritesUseCase) :
    ViewModel() {

    var clickedCar by mutableStateOf(CarModel())
    private val auth = Firebase.auth


    fun addCarToFavourites(
        context: Context,
        onSuccess: () -> Unit,
        onError: () -> Unit
    ) {
        viewModelScope.launch {
            try {
                addCarToFavouritesUseCase.invoke(
                    context,
                    auth.currentUser?.email.toString(), clickedCar
                )
                onSuccess()
            } catch (e: Exception) {
                Log.d("ERROR", "Error al añadir coche a favoritos")
                onError()
            }
        }
    }

    fun formatLocationString(locationString: String): String {
        val locationParts = locationString.split(",")
        return locationParts[1] + "," + locationParts[3]
    }


}