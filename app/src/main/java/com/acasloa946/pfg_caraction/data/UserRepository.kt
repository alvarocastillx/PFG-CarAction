package com.acasloa946.pfg_caraction.data

import android.content.Context
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.data.Entities.UserEntity
import javax.inject.Inject

class UserRepository @Inject constructor(private val userDao : UserDao) {
    suspend fun addUser(userModel: UserModel, context: Context) {
        userDao.createUserInDatabase(UserEntity(userModel.name,userModel.type,userModel.email),context)
    }

    suspend fun fetchUser(context: Context, email:String):UserEntity? {
        val user = userDao.fetchUser(context, email)
        return user
    }

}