package com.acasloa946.pfg_caraction.data

enum class CarEntityType {
    SUV,
    BERLINA,
    ESTATE,
    ELÉCTRICO,
    SUPERCOCHE,
    CABRIO
}
data class CarEntity (
    var type:CarEntityType
)
