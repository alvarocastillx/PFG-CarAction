package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Casos de uso destinado a recuperar los chats de usuario
 * @param: context -> contexto de la aplicación
 * @param: userReading -> usuario del que se quieren recuperar los chats
 */
class fetchChatsOfUserUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, userReading: String): List<MessageModel> {
        return userRepository.fetchChatsOfUser(context, userReading)
    }
}