package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class fetchUserByNameUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, name:String): UserModel {
        val user = userRepository.fetchUserByName(context, name)
        return UserModel(user?.name.toString(), user?.type!!, user.email!!, user.uploadedCars!!,user.memberSince)
    }
}