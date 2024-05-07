package com.acasloa946.pfg_caraction.API

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.acasloa946.pfg_caraction.API.Models.CarTypes.APITypeResult
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException

class APIModule {
    private val apiServiceMakes = RetrofitInstance.apiMakesModels
    private val apiServiceType = RetrofitInstance.apiCarType


    suspend fun getCarMakes(): List<APIMake> {

        val makeList: MutableState<List<APIMake>> = mutableStateOf(listOf())
        val coroutineScope = CoroutineScope(Dispatchers.Default)


        coroutineScope.launch {
            try {
                val response = apiServiceMakes.getMakes()
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
                val response = apiServiceMakes.getModels(make = make)
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

    suspend fun getCarType(make:String, model:String): APITypeResult {
        val carTypeList : MutableState<List<APITypeResult>> = mutableStateOf(listOf())
        val coroutineScope = CoroutineScope(Dispatchers.Default)

        coroutineScope.launch {
            try {

                val response = apiServiceType.getType(make = make, model = model)
                carTypeList.value = response.results

            } catch (e: HttpException) {
                println("Error HTTP: ${e.code()}")
                println("Mensaje de error: ${e.message()}")
            } catch (e: Exception) {
                println("Error desconocido: $e")

            }
        }.join()
        return if (carTypeList.value.isNotEmpty()){
            carTypeList.value[0]
        } else {
            APITypeResult(make = make, model = model, vclass = "Berlina", fueltype1 = "Gasolina", trany = "Manual")
        }
    }


}
