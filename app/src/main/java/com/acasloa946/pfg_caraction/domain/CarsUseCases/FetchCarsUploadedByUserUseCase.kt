package com.acasloa946.pfg_caraction.domain.CarsUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class fetchCarsUploadedByUserUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, email:String): MutableList<CarModel> {
        val carList = userRepository.fetchCarsUploadedByUser(context, email)
        val carModelList = mutableListOf<CarModel>()

        for (i in carList) {
            val latitude = i.location!!.get("first")
            val longitude = i.location.get("second")
            carModelList.add(CarModel(i.type!!, i.image!!,i.make!!, i.model!!, i.plate!!, i.year!!, i.km!!, i.price!!, Pair(latitude,longitude), i.locationName!!, i.userName!!, i.fuelType!!, i.transmisionType!!, i.carInfo))
        }
        return carModelList
    }
}