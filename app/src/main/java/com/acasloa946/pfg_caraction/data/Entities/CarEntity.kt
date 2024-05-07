package com.acasloa946.pfg_caraction.data.Entities

enum class CarEntityType {
    SUV,
    BERLINA,
    ESTATE,
    ELÉCTRICO,
    SUPERCOCHE,
    CABRIO
}


data class CarEntity (
    val type: String? = null,
    val image: String? = null,
    val make:String? = null,
    val model:String? = null,
    val plate:String? = null,
    val year:Int? = null,
    val km:Int? = null,
    val price:Double? = null,
    val location: Map<String,Double>? = null,
    val locationName : String? = null,
    val userName: String? = null,
    val fuelType:String? = null,
    val transmisionType:String? = null

)
