package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class checkIfUserExistsUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, email:String):Boolean {
        return userRepository.checkIfUserExists(context, email)
    }
}