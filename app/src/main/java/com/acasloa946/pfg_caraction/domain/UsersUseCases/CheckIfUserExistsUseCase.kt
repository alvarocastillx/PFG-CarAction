package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso para comprobar si el usuario existe en la base de datos (utilizado en el inicio de sesión con Google)
 * Si no existe se pasa a crear cuenta, si existe inicia sesión.
 * @param email: Email del usuario
 * @param context: Contexto de la aplicación
 *
 */
class checkIfUserExistsUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, email:String):Boolean {
        return userRepository.checkIfUserExists(context, email)
    }
}