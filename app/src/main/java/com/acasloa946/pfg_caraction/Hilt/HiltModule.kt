package com.acasloa946.pfg_caraction.Hilt

import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.data.UserDao
import com.acasloa946.pfg_caraction.data.UserRepository
import com.acasloa946.pfg_caraction.domain.addCarUseCase
import com.acasloa946.pfg_caraction.domain.addUserUseCase
import com.acasloa946.pfg_caraction.domain.fetchCarsUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class HiltModule {
    @Provides
    fun provideAddUserUseCase(userRepository: UserRepository): addUserUseCase {
        return addUserUseCase(userRepository)
    }
    @Provides
    fun provideFetchUserCase(userRepository: UserRepository): fetchUserUseCase {
        return fetchUserUseCase(userRepository)
    }

    @Provides
    fun provideAddCarUseCase(userRepository: UserRepository): addCarUseCase {
        return addCarUseCase(userRepository)
    }

    @Provides
    fun provideFetchCarsUseCase(userRepository: UserRepository): fetchCarsUseCase {
        return fetchCarsUseCase(userRepository)
    }








    @Provides
    @Singleton
    fun provideUserDao(): UserDao {
        return object : UserDao {

        }
    }
}