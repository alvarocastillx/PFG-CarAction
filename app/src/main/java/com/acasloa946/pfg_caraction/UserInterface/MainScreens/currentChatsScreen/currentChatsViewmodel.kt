package com.acasloa946.pfg_caraction.UserInterface.MainScreens.currentChatsScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class currentChatsViewmodel @Inject constructor(private val fetchChatsOfUserUseCase: fetchChatsOfUserUseCase, private val fetchUserUseCase: fetchUserUseCase): ViewModel() {

    val auth = Firebase.auth


    private val _userCurrentChatsState = MutableLiveData<ResultStateCurrentChats<List<UserModel>>>()
    val userCurrentChatsState: LiveData<ResultStateCurrentChats<List<UserModel>>> = _userCurrentChatsState

    var clickedUserToChat by mutableStateOf("")

    private val userChats by mutableStateOf(mutableListOf<UserModel>())
    fun fetchChats(context: Context) {
        userChats.clear()
        val currentUserMail = auth.currentUser!!.email!!
        _userCurrentChatsState.value = ResultStateCurrentChats.Loading
        val userMailChats by mutableStateOf(mutableListOf<String>())
        viewModelScope.launch {
            try {
                val messagesList = fetchChatsOfUserUseCase.invoke(context, currentUserMail)
                for (i in messagesList) {
                    if (i.sent_by == currentUserMail && (!userMailChats.contains(i.sent_to))) {
                        userMailChats.add(i.sent_to!!)
                    }
                    else if(i.sent_to == currentUserMail && (!userMailChats.contains(i.sent_by))) {
                        userMailChats.add(i.sent_by!!)
                    }
                }
                for (userMail in userMailChats) {
                    val user = fetchUserUseCase.invoke(userMail, context)
                    userChats.add(user)
                }
                _userCurrentChatsState.value = ResultStateCurrentChats.Success(userChats)
            }
            catch (e:Exception) {
                _userCurrentChatsState.value = ResultStateCurrentChats.Error(e)
                Log.d("Error", e.stackTraceToString())
            }
        }

    }

}