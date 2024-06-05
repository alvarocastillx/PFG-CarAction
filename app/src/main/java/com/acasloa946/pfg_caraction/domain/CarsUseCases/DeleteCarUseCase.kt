package com.acasloa946.pfg_caraction.domain.CarsUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso destinado a eliminar una publicación de un coche
 * @param context: contexto de la aplicación
 * @param carModel: coche que se quiere eliminar
 * @param email: email del usuario que quiere eliminar el coche (debe ser el autor del anuncio)
 */
class deleteCarUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, carModel: CarModel, email:String) {
        userRepository.deleteCarFunction(context, carModel, email)
    }
}