package com.acasloa946.pfg_caraction.domain.CarsUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class linkCarToProfileUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(carModel: CarModel, context: Context, email:String) {
        userRepository.linkCarToProfile(carModel, context, email)
    }
}