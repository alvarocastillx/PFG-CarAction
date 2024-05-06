package com.acasloa946.pfg_caraction.API

import com.acasloa946.pfg_caraction.API.const.Companion.BASE_URL_MAKES
import com.acasloa946.pfg_caraction.API.const.Companion.BASE_URL_TYPE
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val apiMakesModels: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL_MAKES)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiService::class.java)
    }

    val apiCarType: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL_TYPE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiService::class.java)
    }

}