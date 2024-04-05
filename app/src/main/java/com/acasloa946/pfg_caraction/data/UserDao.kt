package com.acasloa946.pfg_caraction.data

import android.content.Context
import android.util.Log
import com.acasloa946.pfg_caraction.data.Entities.UserEntity
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

interface UserDao {


    suspend fun createUserInDatabase(userEntity: UserEntity, context: Context) {
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            try {
                db.collection("Users").document(userEntity.email).set(
                    userEntity
                ).addOnSuccessListener {
                    Log.d("Success","USUARIO AGREGADO CORRECTAMENTE")
                }.addOnFailureListener {
                    Log.d("Error","ERROR AL AGREGAR USUARIO")
                }.await()

            } catch (e: Exception) {
                Log.d("Error","ERROR INESPERADO")

            }

        } else {
            Log.d("error","ERROR")

        }
    }

}