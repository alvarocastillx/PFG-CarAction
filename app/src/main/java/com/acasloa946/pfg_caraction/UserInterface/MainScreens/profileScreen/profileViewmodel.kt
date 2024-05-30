package com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUploadedByUserUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserByNameUseCase
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

    private val _profileStates = MutableLiveData<ProfileScreenStates<List<CarModel>>>()
    val profileStates: LiveData<ProfileScreenStates<List<CarModel>>> = _profileStates


    private fun formatDate(date: String): String {
        val splittedDate = date.split("-")
        return try {
            monthMap[splittedDate[1].toInt()] + " de " + splittedDate[0]
        }catch (e:Exception) {
            date
        }
    }

    fun fetchCarsUploadedByUser(context: Context) {
        _profileStates.value = ProfileScreenStates.Loading
        viewModelScope.launch {
            try {
                val user = fetchUserByNameUseCase.invoke(context, userName)
                val userMail = user.email
                memberSince = formatDate(user.memberSince.toString())
                fetchedCarsUploadedByUser.value =
                    fetchCarsUploadedByUserUseCase.invoke(context, userMail).toList()
                _profileStates.value = ProfileScreenStates.Success(fetchedCarsUploadedByUser.value)
            } catch (e: Exception) {
                Log.d("Error", "Error al encontrar al usuario.", e)
                _profileStates.value = ProfileScreenStates.Error(e)
            }

        }
    }

}