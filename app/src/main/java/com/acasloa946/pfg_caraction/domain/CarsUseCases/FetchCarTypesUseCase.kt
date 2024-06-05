package com.acasloa946.pfg_caraction.domain.CarsUseCases

import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso destinado a recuperar todos los tipos de coche de la BDD (los tipos de coches se envian a la BDD mediante una API cuando se sube un anuncio
 */
class fetchCarTypesUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(): MutableList<String> {
        return userRepository.fetchCarTypes()
    }
}