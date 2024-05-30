package com.acasloa946.pfg_caraction.UserInterface.models

import com.acasloa946.pfg_caraction.data.Entities.UserType

data class UserModel(
    val name:String,
    val type: UserType?,
    val email:String,
    val uploadedCars:MutableList<String>? = null,
    val memberSince: String? = null,
    val userFavouriteCars:MutableList<String>?=null
)