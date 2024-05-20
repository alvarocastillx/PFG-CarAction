package com.acasloa946.pfg_caraction.UserInterface.States

sealed class ChatScreenStates<out T> {
    data object Loading : ChatScreenStates<Nothing>()
    data class Success<out T>(val data: T) : ChatScreenStates<T>()
    data class Error(val exception: Throwable) : ChatScreenStates<Nothing>()
}