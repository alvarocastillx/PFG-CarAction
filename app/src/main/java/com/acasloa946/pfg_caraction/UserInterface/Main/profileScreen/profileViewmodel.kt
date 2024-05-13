package com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserByNameUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class profileViewmodel @Inject constructor(
    private val fetchCarsUploadedByUserUseCase: fetchCarsUploadedByUserUseCase,
    private val fetchUserByNameUseCase: fetchUserByNameUseCase
) : ViewModel() {
    val fetchedCarsUploadedByUser = MutableStateFlow<List<CarModel>>(emptyList())
    private val auth = Firebase.auth

    var userName by mutableStateOf("")
    var memberSince by mutableStateOf("")

    private val monthMap = mapOf(
        1 to "Enero",
        2 to "Febrero",
        3 to "Marzo",
        4 to "Abril",
        5 to "Mayo",
        6 to "Junio",
        7 to "Julio",
        8 to "Agosto",
        9 to "Septiembre",
        10 to "Octubre",
        11 to "Noviembre",
        12 to "Diciembre"
    )

    private fun formatDate(date: String): String {
        val splittedDate = date.split("-")
        return try {
            monthMap[splittedDate[1].toInt()] + " de " + splittedDate[0]
        }catch (e:Exception) {
            date
        }
    }

    fun fetchCarsUploadedByUser(context: Context) {
        viewModelScope.launch {
            try {
                val user = fetchUserByNameUseCase.invoke(context, userName)
                val userMail = user.email
                memberSince = formatDate(user.memberSince.toString())
                fetchedCarsUploadedByUser.value =
                    fetchCarsUploadedByUserUseCase.invoke(context, userMail).toList()
            } catch (e: Exception) {
                Log.d("Error", "Error al encontrar al usuario.", e)
            }

        }
    }

    fun formatLocationString(locationString: String): String {
        val locationParts = locationString.split(",")
        return locationParts[1] + "," + locationParts[3]
    }
}