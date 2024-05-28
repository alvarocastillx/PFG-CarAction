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
import com.acasloa946.pfg_caraction.domain.deleteCarUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarScreenViewmodel @Inject constructor(
    private val addCarToFavouritesUseCase: addCarToFavouritesUseCase,
    private val fetchUserUseCase: fetchUserUseCase,
    private val deleteCarUseCase: deleteCarUseCase
) :
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

    suspend fun checkIfAuthor(context: Context): Boolean {
        var check by mutableStateOf(false)
        viewModelScope.launch {
            val user = fetchUserUseCase.invoke(auth.currentUser?.email.toString(), context)
            if (clickedCar.userName == user.name) {
                check = true
            }
        }.join()
        return check
    }

    fun deleteCar(
        context: Context,
        Success: () -> Unit,
        Failed : () -> Unit
    ) {
        viewModelScope.launch {
            try {
                deleteCarUseCase.invoke(context, clickedCar, auth.currentUser?.email.toString())
                Success()
            } catch (e: Exception) {
                Failed()
            }
        }
    }

}