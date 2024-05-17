package com.acasloa946.pfg_caraction.UserInterface

sealed class ResultStateCurrentChats<out T> {
    data object Loading : ResultStateCurrentChats<Nothing>()
    data class Success<out T>(val data: T) : ResultStateCurrentChats<T>()
    data class Error(val exception: Throwable) : ResultStateCurrentChats<Nothing>()
}