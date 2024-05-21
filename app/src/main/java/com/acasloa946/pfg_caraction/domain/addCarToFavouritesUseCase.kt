package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class addCarToFavouritesUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, email:String, carModel: CarModel) {
        userRepository.addCarToFavourites(context, email, carModel)
    }
}