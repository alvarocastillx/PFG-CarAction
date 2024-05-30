package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso para crear usuario en base de datos
 * @param context: Contexto de la aplicación
 * @param userModel: Usuario a agregar
 */
class addUserUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(userModel: UserModel, context: Context) {
        userRepository.addUser(userModel, context)
    }
}