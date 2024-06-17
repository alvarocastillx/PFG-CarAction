package com.acasloa946.pfg_caraction.UserInterface.MainScreens.FilterDialog

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import kotlinx.coroutines.flow.MutableStateFlow

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
           if (it.price!="" && (it.price!!.replace(".","").toInt()>maxPrice) ) {
               maxPrice = it.price.replace(".","").toInt()
           }
       }
    }

    fun filterObjectMaker(): List<Any> {
        return listOf(kmFilter,priceFilter)
    }


}