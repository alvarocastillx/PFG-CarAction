package com.acasloa946.pfg_caraction.Hilt

import com.acasloa946.pfg_caraction.data.UserDao
import com.acasloa946.pfg_caraction.data.UserRepository
import com.acasloa946.pfg_caraction.domain.addCarUseCase
import com.acasloa946.pfg_caraction.domain.addUserUseCase
import com.acasloa946.pfg_caraction.domain.fetchCarTypesUseCase
import com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase
import com.acasloa946.pfg_caraction.domain.fetchCarsUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserByNameUseCase
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase
import com.acasloa946.pfg_caraction.domain.linkCarToProfileUseCase
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
    fun provideFetchCarsTypeUseCase(userRepository: UserRepository): fetchCarTypesUseCase {
        return fetchCarTypesUseCase(userRepository)
    }

    @Provides
    fun provideLinkCarToProfileUseCase(userRepository: UserRepository): linkCarToProfileUseCase {
        return linkCarToProfileUseCase(userRepository)
    }

    @Provides
    fun provideFetchCarsUploadedByUserUseCase(userRepository: UserRepository): fetchCarsUploadedByUserUseCase {
        return fetchCarsUploadedByUserUseCase(userRepository)
    }

    @Provides
    fun provideFetchUserByNameUseCase(userRepository: UserRepository): fetchUserByNameUseCase {
        return fetchUserByNameUseCase(userRepository)
    }










    @Provides
    @Singleton
    fun provideUserDao(): UserDao {
        return object : UserDao {

        }
    }
}