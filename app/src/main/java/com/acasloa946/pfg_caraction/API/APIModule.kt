package com.acasloa946.pfg_caraction.API

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.acasloa946.pfg_caraction.API.Models.APIMake
import com.acasloa946.pfg_caraction.API.Models.APIModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException

class APIModule {
    val apiService = RetrofitInstance.api

    suspend fun getCarMakes(): List<APIMake> {

        val makeList: MutableState<List<APIMake>> = mutableStateOf(listOf())
        val coroutineScope = CoroutineScope(Dispatchers.Default)


        coroutineScope.launch {
            try {
                val response = apiService.getMakes()
                makeList.value = response.data

            } catch (e: HttpException) {
                println("Error HTTP: ${e.code()}")
                println("Mensaje de error: ${e.message()}")
            } catch (e: Exception) {
                println("Error desconocido: $e")

            }
        }.join()
        return makeList.value
    }

    suspend fun getCarModels(make:String): List<APIModel> {
        val modelList : MutableState<List<APIModel>> = mutableStateOf(listOf())
        val coroutineScope = CoroutineScope(Dispatchers.Default)

        coroutineScope.launch {
            try {
                val response = apiService.getModels(make = make)
                modelList.value = response.data

            } catch (e: HttpException) {
                println("Error HTTP: ${e.code()}")
                println("Mensaje de error: ${e.message()}")
            } catch (e: Exception) {
                println("Error desconocido: $e")

            }
        }.join()
        return modelList.value
    }
}
