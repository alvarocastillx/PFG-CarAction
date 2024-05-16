package com.acasloa946.pfg_caraction.domain

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.Entities.MessageEntity
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class sendMessageUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, messageModel: MessageModel) {
        userRepository.sendMessage(context, messageModel)
    }
}