package com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen

import android.content.Context
import android.health.connect.datatypes.units.Length
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.text.isDigitsOnly
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.acasloa946.pfg_caraction.domain.addUserUseCase
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewmodel @Inject constructor() : ViewModel() {

    var textFieldEmail by mutableStateOf("")
        private set

    var textFieldPassword by mutableStateOf("")
        private set


    var passWordVisible by mutableStateOf(false)
        private set

    val auth = Firebase.auth



    fun setPasswordVisibility() {
        passWordVisible = !passWordVisible
    }
    fun changeTextFieldPassword(input:String) {
        textFieldPassword = input
    }

    fun changeTextFieldMail(input:String) {
        textFieldEmail = input
    }



    fun registerAuth(onSuccess: () -> Unit, onFailure : () -> Unit, onShortLength: () -> Unit, onNoDigit: () -> Unit, failedMail: () -> Unit, context: Context) {
        val passWordCheck = checkPassword(onShortLength,onNoDigit)
        val mailCheck =  checkMail(failedMail)
        if (passWordCheck && mailCheck) {
            viewModelScope.launch {
                auth.createUserWithEmailAndPassword(textFieldEmail,textFieldPassword).addOnSuccessListener {
                    onSuccess()
                }.addOnFailureListener {
                    onFailure()
                }
            }
        }
    }

    fun checkPassword(
        onShortLength: () -> Unit,
        onNoDigit: () -> Unit
    ):Boolean {

        var hasDigit = false
        var shortLength = false

        //checks for password length
        if (textFieldPassword.length<6) {
            shortLength = true
        }
        //checks for numbers
        for (i in textFieldPassword) {
            if (i.isDigit()) {
                hasDigit = true
            }
        }

        if (!hasDigit) {
            onNoDigit()
        }
        if (shortLength) {
            onShortLength()
        }

        if (!hasDigit || shortLength) {
            return false
        }
        else {
            return true
        }



    }

    fun checkMail(
        failedMail: () -> Unit
    ):Boolean {
        if (textFieldEmail.contains("@")) {
            return true
        }
        else {
            failedMail()
            return false
        }
    }




}