package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class addCarUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(carModel: CarModel, context: Context) {
        userRepository.addCar(carModel, context)
    }
}