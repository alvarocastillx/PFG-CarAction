package com.acasloa946.pfg_caraction.domain.CarsUseCases

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.data.UserRepository
import javax.inject.Inject

/**
 * Caso de uso para añadir coche a favoritos
 * @param context: Contexto de la aplicación
 * @param email: Email del usuario que va a agregar el coche a favoritos
 * @param carModel: coche que se desea agregar a favoritos
 */
class addCarToFavouritesUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(context: Context, email:String, carModel: CarModel) {
        userRepository.addCarToFavourites(context, email, carModel)
    }
}