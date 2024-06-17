package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso destinado a recuperar un usuario (en este caso mediante el email)
 * @param email: email del usuario que se quiere recuperar
 * @param context: contexto de la aplicación
 */
class fetchUserUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(email: String, context: Context):UserModel {
        val user = userRepository.fetchUser(context, email)
        var userToReturn = UserModel("", UserType.NULL,"")
        if (user!=null){
            userToReturn = UserModel(user.name.toString(),
                user.type, user.email.toString(), user.uploadedCars,user.memberSince)
        }
        return userToReturn
    }
}