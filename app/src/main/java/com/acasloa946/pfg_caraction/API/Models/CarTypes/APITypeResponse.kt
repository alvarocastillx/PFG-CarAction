package com.acasloa946.pfg_caraction.API.Models.CarTypes

import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.Collection

data class APITypeResponse(
    val total_count: Int,
    val results: List<APITypeResult>
)