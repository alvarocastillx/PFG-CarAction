package com.acasloa946.pfg_caraction.UserInterface.models

data class CarModel (
    val type: String? = null,
    val image: String? = null,
    val make:String? = null,
    val model:String? = null,
    val plate:String? = null,
    val year:Int? = null,
    val km:Int? = null,
    val price:String? = null,
    val location: Pair<Double?,Double?>? = null,
    val locationName : String? = null,
    val userName: String? = null,
    val fuelType:String? = null,
    val transmisionType:String? = null


)
