package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class fetchCarsUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(): MutableList<CarModel> {
        val carEntityList = userRepository.fetchCars()
        val carModelList = mutableListOf<CarModel>()

        for (i in carEntityList) {
            val latitude = i.location!!.get("first")
            val longitude = i.location.get("second")
            carModelList.add(CarModel(i.type!!, i.image!!,i.make!!, i.model!!, i.plate!!, i.year!!, i.km!!, i.price!!, Pair(latitude,longitude), i.locationName!!, i.userName!!, i.fuelType!!, i.transmisionType!!))
        }
        return carModelList
    }
}