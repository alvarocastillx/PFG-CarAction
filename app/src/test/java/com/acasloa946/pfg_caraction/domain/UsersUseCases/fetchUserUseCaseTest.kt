package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.data.Entities.UserEntity
import com.acasloa946.pfg_caraction.data.UserRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class fetchUserUseCaseTest() {
    @RelaxedMockK
    private lateinit var userRepository: UserRepository

    lateinit var fetchUserUseCase: fetchUserUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        fetchUserUseCase = fetchUserUseCase(userRepository)
    }

    @Test
    fun fetchUserUseCaseTest() = runBlocking {
        //Given
        coEvery {
            userRepository.fetchUser(any(),any())
        } returns UserEntity()

        //When
        val context = mockk<Context>(relaxed = true)
        fetchUserUseCase("test4@test.com",context)

        //Then
        coVerify(exactly = 1) {
            userRepository.fetchUser(any(),any())
        }

    }

}