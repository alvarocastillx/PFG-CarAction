package com.acasloa946.pfg_caraction.UserInterface.States

sealed class ProfileScreenStates<out T> {
    data object Loading : ProfileScreenStates<Nothing>()
    data class Success<out T>(val data: T) : ProfileScreenStates<T>()
    data class Error(val exception: Throwable) : ProfileScreenStates<Nothing>()
}