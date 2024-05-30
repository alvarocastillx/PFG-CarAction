package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class getMessagesUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, userReading:String, otherUser:String): List<MessageModel> {
        return userRepository.getMessages(context, userReading, otherUser)
    }
}