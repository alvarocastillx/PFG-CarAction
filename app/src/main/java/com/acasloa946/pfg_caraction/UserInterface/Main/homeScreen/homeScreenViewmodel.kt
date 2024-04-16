package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.domain.addUserUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class homeScreenViewmodel @Inject constructor(private val fetchUserUseCase: fetchUserUseCase) : ViewModel() {

    private val auth = Firebase.auth
    private var fetched = false

    var searchBarText by mutableStateOf("")


    var userName: String by mutableStateOf("")

    fun fetchUserName(context : Context, onError: () -> Unit) {
        val currentEmail = auth.currentUser?.email
        viewModelScope.launch {
            try {
                if (!fetched) {
                    val user = fetchUserUseCase.invoke(currentEmail!!,context)
                    userName = user.name
                    fetched = true
                }
            }
            catch (e:Exception) {
                auth.currentUser?.delete()
                onError()
            }

        }
    }

    fun changeSearchBarText(input:String) {
        searchBarText = input
        println(searchBarText)
    }
}