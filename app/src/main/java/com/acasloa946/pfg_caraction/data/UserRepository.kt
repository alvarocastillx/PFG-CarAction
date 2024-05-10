package com.acasloa946.pfg_caraction.data

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.Entities.CarEntity
import com.acasloa946.pfg_caraction.data.Entities.UserEntity
import javax.inject.Inject

class UserRepository @Inject constructor(private val userDao : UserDao) {
    suspend fun addUser(userModel: UserModel, context: Context) {
        userDao.createUserInDatabase(UserEntity(userModel.name,userModel.type,userModel.email, userModel.uploadedCars),context)
    }

    suspend fun fetchUser(context: Context, email: String): UserEntity? {
        return userDao.fetchUser(context, email)
    }

    suspend fun addCar(carModel: CarModel ,context: Context,
    ){
        userDao.uploadCarToDatabase(carEntity = CarEntity(carModel.type, carModel.image,carModel.make, carModel.model, carModel.plate, carModel.year, carModel.km, carModel.price,
            mapOf("first" to carModel.location!!.first!!,"second" to carModel.location.second!!), carModel.locationName, carModel.userName, carModel.fuelType, carModel.transmisionType), context,)
    }

    suspend fun fetchCars(): MutableList<CarEntity> {
        return userDao.fetchCars()
    }
    suspend fun fetchCarTypes(): MutableList<String> {
        return userDao.fetchCarTypes()
    }

    suspend fun linkCarToProfile(carModel: CarModel, context: Context, email:String) {
        userDao.linkCarToProfile(CarEntity(carModel.type, carModel.image,carModel.make, carModel.model, carModel.plate, carModel.year, carModel.km, carModel.price,
            mapOf("first" to carModel.location!!.first!!,"second" to carModel.location.second!!), carModel.locationName, carModel.userName, carModel.fuelType, carModel.transmisionType), context, email
        )

    }

    suspend fun fetchCarsUploadedByUser(context: Context, email: String): MutableList<CarEntity> {
        return userDao.fetchCarsUploadedByUser(context, email)
    }

}