package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso destinado a recuperar los mensajes entre 2 usuarios
 * @param: context -> contexto de la aplicación
 * @param userReading -> usuario que esta utilizando la aplicación
 * @param otherUser -> usuario con el que habla el usuario que está utilizando la aplicación
 */
class getMessagesUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, userReading:String, otherUser:String): List<MessageModel> {
        return userRepository.getMessages(context, userReading, otherUser)
    }
}