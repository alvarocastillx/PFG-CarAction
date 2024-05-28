package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class deleteCarUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, carModel: CarModel, email:String) {
        userRepository.deleteCarFunction(context, carModel, email)
    }
}