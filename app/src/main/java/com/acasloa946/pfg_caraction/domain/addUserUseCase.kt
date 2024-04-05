package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class addUserUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(userModel: UserModel, context: Context) {
        userRepository.addUser(userModel, context)
    }
}