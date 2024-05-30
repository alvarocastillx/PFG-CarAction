package com.acasloa946.pfg_caraction.domain.CarsUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class fetchFavouriteCarsUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, email:String): List<CarModel> {
        val carEntityList = userRepository.fetchFavCars(context, email)
        val carModelList = carEntityList.map { item -> CarModel(item.type, item.image,item.make, item.model, item.plate, item.year, item.km, item.price,
            Pair(item.location!!.get("first"), item.location.get("second")), item.locationName, item.userName, item.fuelType, item.transmisionType, item.carInfo) }

        return carModelList
    }
}