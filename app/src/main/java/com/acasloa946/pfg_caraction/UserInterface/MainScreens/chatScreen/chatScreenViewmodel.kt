package com.acasloa946.pfg_caraction.UserInterface.MainScreens.chatScreen

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.API.const.Companion.INITIAL_CHATS
import com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel
import com.acasloa946.pfg_caraction.domain.fetchUserByNameUseCase
import com.acasloa946.pfg_caraction.domain.getMessagesUseCase
import com.acasloa946.pfg_caraction.domain.sendMessageUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class chatScreenViewmodel @Inject constructor(private val sendMessageUseCase: sendMessageUseCase, private val fetchUserByNameUseCase: fetchUserByNameUseCase, private val getMessagesUseCase: getMessagesUseCase) :
    ViewModel() {
    private val auth = Firebase.auth

    var messageField by mutableStateOf("")
    private var messagesList by mutableStateOf(mutableListOf<MessageModel>())
    var otherUserMail by mutableStateOf("")

    private val _userChatsState = MutableLiveData<ChatScreenStates<List<MessageModel>>>()
    val userChatsState: LiveData<ChatScreenStates<List<MessageModel>>> = _userChatsState
    var loaded by mutableStateOf(false)
    private var sentOnce by mutableStateOf(false)

    fun sendMessage(context: Context, sent_to: String,
                    errorSendingMessage : () -> Unit) {
        viewModelScope.launch {
            try {
                if (messageField.isNotBlank()) {
                    val messageModel = MessageModel(messageField, auth.currentUser!!.email!!, otherUserMail)
                    sendMessageUseCase.invoke(context, messageModel)
                    messageField = ""
                    getMessages(context, sent_to)

                    if (!sentOnce) {
                        INITIAL_CHATS +=1
                        sentOnce = true
                    }
                }
            } catch (e: Exception) {
                errorSendingMessage()
            }
        }
    }

    fun changeMessageField(message:String) {
        messageField = message
    }

    fun getMessages(context: Context, sent_to: String) {
        if (!loaded) {
            _userChatsState.value = ChatScreenStates.Loading
            loaded = true
        }
        viewModelScope.launch {
            try {
                otherUserMail = fetchUserByNameUseCase.invoke(context,sent_to).email
                messagesList = getMessagesUseCase.invoke(context,  auth.currentUser!!.email!!, otherUserMail).toMutableList()
                _userChatsState.value = ChatScreenStates.Success(messagesList)
            }
            catch (e:Exception) {
                _userChatsState.value = ChatScreenStates.Error(e)
            }
        }
    }

}