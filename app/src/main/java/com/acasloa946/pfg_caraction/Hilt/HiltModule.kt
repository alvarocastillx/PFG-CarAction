package com.acasloa946.pfg_caraction.Hilt

import com.acasloa946.pfg_caraction.data.UserDao
import com.acasloa946.pfg_caraction.data.UserRepository
import com.acasloa946.pfg_caraction.domain.CarsUseCases.addCarToFavouritesUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.addCarUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.addUserUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.checkIfUserExistsUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.deleteCarUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.deleteFavCarUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarTypesUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUploadedByUserUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchFavouriteCarsUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserByNameUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.getMessagesUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.linkCarToProfileUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.sendMessageUseCase
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
    fun provideSendMessageUseCase(userRepository: UserRepository): sendMessageUseCase {
        return sendMessageUseCase(userRepository)
    }

    @Provides
    fun providegetMessageUseCase(userRepository: UserRepository): getMessagesUseCase {
        return getMessagesUseCase(userRepository)
    }
    @Provides
    fun provideFetchChatsOfUserUseCase(userRepository: UserRepository): fetchChatsOfUserUseCase {
        return fetchChatsOfUserUseCase(userRepository)
    }
    @Provides
    fun provideAddCarToDatabase(userRepository: UserRepository): addCarToFavouritesUseCase {
        return addCarToFavouritesUseCase(userRepository)
    }
    @Provides
    fun provideFetchFavCars(userRepository: UserRepository): fetchFavouriteCarsUseCase {
        return fetchFavouriteCarsUseCase(userRepository)
    }
    @Provides
    fun provideCheckIfUserExistsUseCase(userRepository: UserRepository): checkIfUserExistsUseCase {
        return checkIfUserExistsUseCase(userRepository)
    }

    @Provides
    fun provideDeleteCarUseCase(userRepository: UserRepository): deleteCarUseCase {
        return deleteCarUseCase(userRepository)
    }
    @Provides
    fun provideDeleteFavCarUseCase(userRepository: UserRepository) : deleteFavCarUseCase {
        return deleteFavCarUseCase(userRepository)
    }








    @Provides
    @Singleton
    fun provideUserDao(): UserDao {
        return object : UserDao {

        }
    }
}