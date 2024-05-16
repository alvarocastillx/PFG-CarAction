package com.acasloa946.pfg_caraction.UserInterface.models

data class MessageModel(
    var message : String? = null,
    var sent_by : String? = null,
    val sent_to : String? = null,
    val sent_on: Long = System.currentTimeMillis()
)