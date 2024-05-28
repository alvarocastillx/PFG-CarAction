package com.acasloa946.pfg_caraction.API

import com.acasloa946.pfg_caraction.API.Models.AIModels.ChatCompletionResponse
import com.acasloa946.pfg_caraction.API.Models.AIModels.ChatRequest
import com.acasloa946.pfg_caraction.API.Models.CarTypes.APITypeResponse
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMakeResponse
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModelResponse
import com.acasloa946.pfg_caraction.API.const.Companion.BASE_URL_AI
import com.acasloa946.pfg_caraction.API.const.Companion.ENDPOINT_MAKES
import com.acasloa946.pfg_caraction.API.const.Companion.ENDPOINT_MODEL
import com.acasloa946.pfg_caraction.API.const.Companion.ENDPOINT_TYPE
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
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

    @Headers("Content-Type:application/json","Authorization: Bearer zu-9da0bc0fffba037dd942e468bcde2db1")
    @POST(BASE_URL_AI)
    suspend fun AIGetInfo(
        @Body chatRequest : ChatRequest): ChatCompletionResponse






}