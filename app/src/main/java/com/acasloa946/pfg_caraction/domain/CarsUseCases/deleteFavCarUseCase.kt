package com.acasloa946.pfg_caraction.domain.CarsUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso destinado a eliminar un coche de la pestaña favoritos
 * @param context: contexto de la aplicación
 * @param carModel: coche a eliminar
 */
class deleteFavCarUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, carModel: CarModel) {
        userRepository.deleteFavCar(context, carModel)
    }
}