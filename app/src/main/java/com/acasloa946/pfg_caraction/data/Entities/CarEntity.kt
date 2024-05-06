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
    val type: String,
    val image: String,
    val make:String,
    val model:String,
    val plate:String,
    val year:Int,
    val km:Int,
    val price:Double,
    val location: Pair<Double,Double>,
    val locationName : String,
    val userName: String

)
