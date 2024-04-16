package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class fetchUserUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(email: String, context: Context):UserModel {
        val user = userRepository.fetchUser(context, email)
        return UserModel(user!!.name!!, user.type!!, user.email!!)
    }
}