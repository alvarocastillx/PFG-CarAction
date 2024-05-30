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

class fetchUserByNameUseCaseTest(){
    @RelaxedMockK
    private lateinit var userRepository: UserRepository

    lateinit var fetchUserByNameUseCase: fetchUserByNameUseCase
    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        fetchUserByNameUseCase = fetchUserByNameUseCase(userRepository)
    }

    @Test
    fun fetchUserByNameUseCaseTest() = runBlocking {
        //Given
        coEvery {
            userRepository.fetchUserByName(any(),any())
        } returns UserEntity()

        //When
        val context = mockk<Context>(relaxed = true)
        fetchUserByNameUseCase(name = "teest", context = context)

        //Then
        coVerify (exactly = 1){ userRepository.fetchUserByName(any(),any())}



    }

}