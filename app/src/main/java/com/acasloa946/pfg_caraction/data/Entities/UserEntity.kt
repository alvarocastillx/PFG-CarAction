package com.acasloa946.pfg_caraction.data.Entities


enum class UserType {
    BUYER,
    SELLER,
    NULL
}
data class UserEntity(
    val name:String,
    val type:UserType,
    val email:String
)
