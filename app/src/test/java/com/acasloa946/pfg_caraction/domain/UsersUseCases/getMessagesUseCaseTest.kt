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


class getMessagesUseCaseTest() {
    @RelaxedMockK
    private lateinit var userRepository: UserRepository

    lateinit var getMessagesUseCase: getMessagesUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getMessagesUseCase = getMessagesUseCase(userRepository)
    }

    @Test
    fun fetchChatsOfUserCaseTest() = runBlocking {
        //Given
        coEvery {
            userRepository.getMessages(any(),any(),any())
        } returns listOf<MessageModel>()

        //When
        val context = mockk<Context>(relaxed = true)
        getMessagesUseCase(context, "","testmovil@gmail.com")

        //Then
        coVerify (exactly = 1){
            userRepository.getMessages(any(),any(),any())
        }



    }
}