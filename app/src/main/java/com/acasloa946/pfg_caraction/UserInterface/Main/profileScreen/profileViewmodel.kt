package com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class profileViewmodel @Inject constructor(
    private val fetchCarsUploadedByUserUseCase: fetchCarsUploadedByUserUseCase
) : ViewModel() {
    val fetchedCarsUploadedByUser = MutableStateFlow<List<CarModel>>(emptyList())
    private val auth = Firebase.auth

    fun fetchCarsUploadedByUser(context: Context) {
        viewModelScope.launch {
            fetchedCarsUploadedByUser.value = fetchCarsUploadedByUserUseCase.invoke(context, auth.currentUser!!.email!!).toList()
            println(fetchedCarsUploadedByUser.value)
        }
    }

    fun formatLocationString(locationString: String): String {
        val locationParts = locationString.split(",")
        return locationParts[1] + "," + locationParts[3]
    }
}