package com.acasloa946.pfg_caraction.data

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.data.Entities.CarEntity
import com.acasloa946.pfg_caraction.data.Entities.UserEntity
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await


interface UserDao {


    suspend fun createUserInDatabase(userEntity: UserEntity, context: Context) {
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            try {
                db.collection("Users").document(userEntity.email!!).set(
                    userEntity
                ).addOnSuccessListener {
                    Log.d("Success", "USUARIO AGREGADO CORRECTAMENTE")
                }.addOnFailureListener {
                    Log.d("Error", "ERROR AL AGREGAR USUARIO")
                }.await()

            } catch (e: Exception) {
                Log.d("Error", "ERROR INESPERADO")
            }
        } else {
            Log.d("error", "ERROR")

        }
    }

    suspend fun fetchUser(context: Context, email: String): UserEntity? {
        var user: UserEntity? = UserEntity("", UserType.NULL, "")
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            db.collection("Users").document(email).get()
                .addOnSuccessListener { documento ->
                    if (documento != null) {
                        user = documento.toObject(UserEntity::class.java)
                    }
                }
                .addOnFailureListener { _ ->
                    Log.d("ERROR", "NO SE HA PODIDO ENCONTRAR AL USUARIO")
                }.await()
        } else {
            Log.d("error", "ERROR")

        }
        return user
    }

    suspend fun uploadCarToDatabase(
        carEntity: CarEntity, context: Context,
    ) {
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            try {
                val docRef = db.collection("Cars")
                    .document(carEntity.plate + carEntity.model + carEntity.year)
                val coche = docRef.get().await()
                if (coche.exists()) {
                    Log.d("NO SE AGREGA", "YA EXISTE")
                } else {
                    docRef.set(carEntity).await()
                    Log.d("Success", "COCHE SUBIDO CORRECTAMENTE")
                }
            } catch (e: Exception) {
                Log.e("Error", "ERROR AL AGREGAR COCHE", e)
            }
        } else {
            Log.e("Error", "ERROR: FirebaseApp no inicializado")
        }
    }


    suspend fun fetchCars(): MutableList<CarEntity> {

        val db = FirebaseFirestore.getInstance()
        val querySnapshot = db.collection("Cars").get().await()

        val carList = mutableListOf<CarEntity>()
        for (document in querySnapshot) {
            val car = document.toObject(CarEntity::class.java)
            carList.add(car)
        }


        return carList.toMutableList()

    }

}