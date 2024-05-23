package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.LoginScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class loginViewmodel : ViewModel() {

    var textFieldEmail by mutableStateOf("")

    var textFieldPassw by mutableStateOf("")

    var passwordVisible by mutableStateOf(false)

    private val auth = Firebase.auth



    fun changeMail(input:String) {
        textFieldEmail = input
    }

    fun changePassw(input:String) {
        textFieldPassw = input
    }

    fun changePasswVisibility() {
        passwordVisible = !passwordVisible

    }

    fun signIn(
        success : () -> Unit,
        failure : () -> Unit,
        emptyTextfield : () -> Unit
    ) {
        if (textFieldEmail.isBlank() || textFieldPassw.isBlank()) {
            emptyTextfield()
        }
        else {
            viewModelScope.launch {
                auth.signInWithEmailAndPassword(textFieldEmail,textFieldPassw).addOnSuccessListener {
                    success()
                }.addOnFailureListener {
                    failure()
                }
            }
        }

    }
}