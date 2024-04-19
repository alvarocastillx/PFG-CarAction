package com.acasloa946.pfg_caraction.API

import com.acasloa946.pfg_caraction.API.Models.APIMakeResponse
import com.acasloa946.pfg_caraction.API.Models.APIModelResponse
import com.acasloa946.pfg_caraction.API.const.Companion.ENDPOINT_MAKES
import com.acasloa946.pfg_caraction.API.const.Companion.ENDPOINT_MODEL
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(ENDPOINT_MAKES)
    suspend fun getMakes(
    ): APIMakeResponse

    @GET(ENDPOINT_MODEL)
    suspend fun getModels(
        @Query("year") year:Int = 2015,
        @Query("make") make:String
    ): APIModelResponse


}