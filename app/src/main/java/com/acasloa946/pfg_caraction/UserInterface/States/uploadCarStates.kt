package com.acasloa946.pfg_caraction.UserInterface.States

sealed class UploadCarStates<out T> {
    data object Loading : UploadCarStates<Nothing>()
    data object Success : UploadCarStates<Nothing>()
    data object Waiting : UploadCarStates<Nothing>()

    data class Error(val exception: Throwable) : UploadCarStates<Nothing>()
}