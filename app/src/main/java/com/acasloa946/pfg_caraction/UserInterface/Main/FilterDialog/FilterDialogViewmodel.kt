package com.acasloa946.pfg_caraction.UserInterface.Main.FilterDialog

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class FilterDialogViewmodel : ViewModel() {


    var maxKm by mutableIntStateOf(0)

    var kmFilter by mutableStateOf(0f)

    fun changeKMFilter(it:Float){
        kmFilter = it
    }



    fun getMaxKM(fetchedCars : MutableStateFlow<List<CarModel>>){
        fetchedCars.value.forEach {
            if (it.km!! > maxKm) {
                maxKm = it.km
            }
        }

    }

    var maxPrice by mutableIntStateOf(0)
    var priceFilter by mutableStateOf(0f)

    fun changePriceFilter(it:Float){
        priceFilter = it
    }



    fun getMaxPrice(fetchedCars : MutableStateFlow<List<CarModel>>) {
        fetchedCars.value.forEach {
           if (it.price!="" && it.price!!.replace(",","").toInt()>maxPrice) {
               maxPrice = it.price.replace(",","").toInt()
           }
       }
    }

    fun filterObjectMaker(): List<Any> {
        return listOf(kmFilter,priceFilter)
    }


}