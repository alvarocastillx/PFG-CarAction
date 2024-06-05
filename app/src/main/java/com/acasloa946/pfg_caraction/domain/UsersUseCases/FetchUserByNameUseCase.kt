package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso destinado a recuperar a un usuario mediante el nombre
 * @param context: contexto de la aplicacion
 * @param name:nombre del usuario a recuperar
 */
class fetchUserByNameUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, name:String): UserModel {
        val user = userRepository.fetchUserByName(context, name)
        var userToReturn = UserModel("",UserType.NULL,"")
        if (user!=null) {
            userToReturn = UserModel(user.name.toString(),
                user.type, user.email.toString(), user.uploadedCars,user.memberSince)
        }
        return userToReturn
    }
}