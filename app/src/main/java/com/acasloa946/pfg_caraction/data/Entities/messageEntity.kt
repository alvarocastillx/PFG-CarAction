package com.acasloa946.pfg_caraction.data.Entities
/**
 * Entidad de mensaje
 */
data class MessageEntity(
    var message : String? = null,
    var sent_by : String? = null,
    val sent_to : String? = null,
    val sent_on: Long = System.currentTimeMillis()
)