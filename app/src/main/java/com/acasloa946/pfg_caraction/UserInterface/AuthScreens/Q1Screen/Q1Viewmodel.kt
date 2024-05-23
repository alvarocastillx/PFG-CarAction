package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q1Screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class Q1Viewmodel : ViewModel() {

    var name by mutableStateOf("")

    fun changeName(input:String) {
        name = input
    }

    fun checkName(
        emptyName:() -> Unit,
        success: () -> Unit
    ) {
        if (name.isBlank()) {
            emptyName()
        }
        else {
            success()
        }
    }


}