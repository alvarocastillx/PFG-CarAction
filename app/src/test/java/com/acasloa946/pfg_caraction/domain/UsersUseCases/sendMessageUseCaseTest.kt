package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel
import com.acasloa946.pfg_caraction.data.UserRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class sendMessageUseCaseTest() {
    @RelaxedMockK
    private lateinit var userRepository: UserRepository

    lateinit var sendMessagesUseCase: sendMessageUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        sendMessagesUseCase = sendMessageUseCase(userRepository)
    }

    @Test
    fun sendMessafeUseCaseTest() = runBlocking {
        //Given
        coEvery {
            userRepository.sendMessage(any(),any())
        } returns Unit

        //When
        val context = mockk<Context>(relaxed = true)
        sendMessagesUseCase(context, MessageModel())

        //Then
        coVerify {
            userRepository.sendMessage(any(),any())
        }
    }

}