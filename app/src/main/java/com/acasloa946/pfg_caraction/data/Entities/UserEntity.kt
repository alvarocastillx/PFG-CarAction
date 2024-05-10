package com.acasloa946.pfg_caraction.data.Entities


enum class UserType {
    BUYER,
    SELLER,
    NULL
}
data class UserEntity(
    val name:String? = null,
    val type:UserType? = null,
    val email:String? = null,
    val uploadedCars:MutableList<String>? = null
)
