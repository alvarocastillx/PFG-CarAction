package com.acasloa946.pfg_caraction.API

import com.acasloa946.pfg_caraction.API.Models.CarTypes.APITypeResponse
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMakeResponse
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModelResponse
import com.acasloa946.pfg_caraction.API.const.Companion.ENDPOINT_MAKES
import com.acasloa946.pfg_caraction.API.const.Companion.ENDPOINT_MODEL
import com.acasloa946.pfg_caraction.API.const.Companion.ENDPOINT_TYPE
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


    @GET(ENDPOINT_TYPE)
    suspend fun getType(
        @Query("select") select:String = "make,model,vclass,fueltype1,trany",
        @Query ("") make:String,
        @Query ("") model:String,
        @Query("where") where:String = "make='$make' and model='$model'",
        @Query("limit") limit:Int = 1
    ): APITypeResponse






}