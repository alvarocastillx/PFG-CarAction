package com.acasloa946.pfg_caraction.UserInterface.States

sealed class FavouriteCarStates<out T> {
    data object Loading : FavouriteCarStates<Nothing>()
    data class Success<out T>(val data: T) : FavouriteCarStates<T>()
    data class Error(val exception: Throwable) : FavouriteCarStates<Nothing>()
}