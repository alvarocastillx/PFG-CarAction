package com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.ResultStateCurrentChats
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.domain.fetchChatsOfUserUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class currentChatsViewmodel @Inject constructor(private val fetchChatsOfUserUseCase: fetchChatsOfUserUseCase, private val fetchUserUseCase: fetchUserUseCase): ViewModel() {

    val auth = Firebase.auth


    private val _userChatsState = MutableLiveData<ResultStateCurrentChats<List<UserModel>>>()
    val userChatsState: LiveData<ResultStateCurrentChats<List<UserModel>>> = _userChatsState

    var clickedUserToChat by mutableStateOf("")

    private val userChats by mutableStateOf(mutableListOf<UserModel>())
    fun fetchChats(context: Context) {
        userChats.clear()
        val currentUserMail = auth.currentUser!!.email!!
        _userChatsState.value = ResultStateCurrentChats.Loading
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
                _userChatsState.value = ResultStateCurrentChats.Success(userChats)
            }
            catch (e:Exception) {
                _userChatsState.value = ResultStateCurrentChats.Error(e)
            }
        }

    }

}