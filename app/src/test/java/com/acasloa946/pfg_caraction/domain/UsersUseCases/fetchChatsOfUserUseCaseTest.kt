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

class fetchChatsOfUserUseCaseTest {

    @RelaxedMockK
    private lateinit var userRepository: UserRepository

    lateinit var fetchChatsOfUserUseCase: fetchChatsOfUserUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        fetchChatsOfUserUseCase = fetchChatsOfUserUseCase(userRepository)
    }

    @Test
    fun fetchChatsOfUserTest() = runBlocking {
        //Given
        coEvery {
            userRepository.fetchChatsOfUser(any(),any())
        } returns listOf<MessageModel>()
        //When
        val context = mockk<Context>(relaxed = true)
        fetchChatsOfUserUseCase(context,"test4@test.com")

        //Then
        coVerify (exactly = 1) {
            userRepository.fetchChatsOfUser(any(),any())
        }
    }
}