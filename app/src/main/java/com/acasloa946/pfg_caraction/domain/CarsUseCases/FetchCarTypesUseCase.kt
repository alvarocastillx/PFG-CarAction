package com.acasloa946.pfg_caraction.domain.CarsUseCases

import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

class fetchCarTypesUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(): MutableList<String> {
        return userRepository.fetchCarTypes()
    }
}