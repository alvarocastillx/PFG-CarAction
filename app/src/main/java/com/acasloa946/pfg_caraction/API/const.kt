package com.acasloa946.pfg_caraction.API

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class const {
    companion object {
        const val BASE_URL_MAKES = "https://carapi.app/api/"
        const val ENDPOINT_MAKES = "makes"
        const val ENDPOINT_MODEL = "models"

        const val BASE_URL_TYPE = "https://public.opendatasoft.com/api/explore/v2.1/catalog/datasets/all-vehicles-model/"
        const val ENDPOINT_TYPE = "records"


        const val BASE_URL_AI = "https://api.acloudapp.com/v1/chat/completions/"
        const val SYSTEM_AI_MESSAGE = "Tu objetivo es dar información sobre vehículos. Te pasaré el nombre de un vehículo y me darás sus especificaciones EN UN MÁXIMO DE 45 PALABRAS."
        var INITIAL_CHATS by mutableStateOf(0)
        var CURRENT_CHATS by mutableStateOf(0)



    }
}