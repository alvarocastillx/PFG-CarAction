package com.acasloa946.pfg_caraction.API.Models.CarTypes

import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.Collection

data class APITypeResult(
    val make : String? = null,
    val model : String? = null,
    val vclass : String? = null,
    val fueltype1 : String? = null,
    val trany : String? = null
)