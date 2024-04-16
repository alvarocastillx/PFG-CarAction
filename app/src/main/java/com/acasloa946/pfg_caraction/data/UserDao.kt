package com.acasloa946.pfg_caraction.data

import android.content.Context
import android.util.Log
import com.acasloa946.pfg_caraction.data.Entities.UserEntity
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

interface UserDao {


    suspend fun createUserInDatabase(userEntity: UserEntity, context: Context) {
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            try {
                db.collection("Users").document(userEntity.email!!).set(
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

    suspend fun fetchUser(context: Context, email:String):UserEntity? {
        var user : UserEntity? = UserEntity("",UserType.NULL,"")
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
                db.collection("Users").document(email).get()
                .addOnSuccessListener { documento ->
                    if (documento != null) {
                        user = documento.toObject(UserEntity::class.java)
                    }
                }
                .addOnFailureListener { exception ->
                    Log.d("ERROR","NO SE HA PODIDO ENCONTRAR AL USUARIO")
                }.await()
        } else {
            Log.d("error","ERROR")

        }
        return user
    }

}