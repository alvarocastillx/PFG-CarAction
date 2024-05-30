package com.acasloa946.pfg_caraction.domain.UsersUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.acasloa946.pfg_caraction.data.UserRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class addUserUseCaseTest {

    @RelaxedMockK
    private lateinit var userRepository: UserRepository

    lateinit var addUserUseCaseVar: addUserUseCase
    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        addUserUseCaseVar = addUserUseCase(userRepository)
    }

    @Test
    fun addUserUseCaseTest() = runBlocking {
        //Given
        coEvery {
            userRepository.addUser(any(),any())
        } returns Unit
        //When
        val userModel = UserModel("",UserType.NULL,"", mutableListOf(),
            memberSince = "", userFavouriteCars = mutableListOf())
        val context = mockk<Context>(relaxed = true)

        addUserUseCaseVar(userModel,context)
        //Then
        coVerify { userRepository.addUser(userModel, context) }
    }
}