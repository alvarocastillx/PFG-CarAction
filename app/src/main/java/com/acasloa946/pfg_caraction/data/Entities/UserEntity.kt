package com.acasloa946.pfg_caraction.data.Entities

/**
 * Tipos de vendedor
 */
enum class UserType {
    BUYER,
    SELLER,
    NULL
}

/**
 * Entidad de usuario
 */
data class UserEntity(
    val name:String? = null,
    val type:UserType? = null,
    val email:String? = null,
    val uploadedCars:MutableList<String>? = null,
    val memberSince: String? = null,
    val userFavouriteCars:MutableList<String>?=null
)
