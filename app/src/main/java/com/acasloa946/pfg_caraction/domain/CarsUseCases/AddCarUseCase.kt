package com.acasloa946.pfg_caraction.domain.CarsUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso para subir anuncio de coche
 * @param context: Contexto de la aplicación
 * @param carModel: Coche del que se desea subir el anuncio
 */
class addCarUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(carModel: CarModel, context: Context) {
        userRepository.addCar(carModel, context)
    }
}