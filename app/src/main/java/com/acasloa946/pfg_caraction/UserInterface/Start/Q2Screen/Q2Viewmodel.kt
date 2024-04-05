package com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.acasloa946.pfg_caraction.domain.addUserUseCase
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Q2Viewmodel @Inject constructor(private val addUserUseCase: addUserUseCase) : ViewModel() {

    private val auth = Firebase.auth

    fun createUserAcc(name:String, userType: UserType, context : Context) {
        val currentMail = auth.currentUser!!.email
        viewModelScope.launch {
            addUserUseCase.invoke(UserModel(name,userType, currentMail!!),context)
        }
        auth.currentUser!!.delete()
    }


}