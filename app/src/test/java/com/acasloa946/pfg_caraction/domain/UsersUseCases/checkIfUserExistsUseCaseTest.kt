package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.data.UserRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class checkIfUserExistsUseCaseTest {
    @RelaxedMockK
    private lateinit var userRepository: UserRepository

    lateinit var checkIfUserExistsUseCase: checkIfUserExistsUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        checkIfUserExistsUseCase = checkIfUserExistsUseCase(userRepository)
    }

    @Test
    fun checkIfUserExistUseCaseTest() = runBlocking {
        //Given
        coEvery {
            userRepository.checkIfUserExists(any(),any())
        } returns false
        //When
        val context = mockk<Context>(relaxed = true)
        checkIfUserExistsUseCase(context,"pruebatest@pruebatest.com")
        //Then
        coVerify (exactly = 1) {
            userRepository.checkIfUserExists(any(),any())
        }
    }

}