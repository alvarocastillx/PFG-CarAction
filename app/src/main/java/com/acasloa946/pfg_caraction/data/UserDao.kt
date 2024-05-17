package com.acasloa946.pfg_caraction.data

import android.content.Context
import android.os.Message
import android.util.Log
import com.acasloa946.pfg_caraction.data.Entities.CarEntity
import com.acasloa946.pfg_caraction.data.Entities.MessageEntity
import com.acasloa946.pfg_caraction.data.Entities.UserEntity
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.toObject
import kotlinx.coroutines.delay
import kotlinx.coroutines.tasks.await
import okhttp3.internal.threadName


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
        val carTypeList = mutableListOf<String>()

        for (document in querySnapshot) {
            val car = document.toObject(CarEntity::class.java)
            carList.add(car)

            if (!carTypeList.contains(car.type)) {
                carTypeList.add(car.type!!)
            }
        }


        return carList.toMutableList()

    }

    suspend fun fetchCarTypes(): MutableList<String> {

        val db = FirebaseFirestore.getInstance()
        val querySnapshot = db.collection("Cars").get().await()

        val carTypeList = mutableListOf<String>()

        for (document in querySnapshot) {
            val car = document.toObject(CarEntity::class.java)
            if (!carTypeList.contains(car.type)) {
                carTypeList.add(car.type!!)
            }
        }
        return carTypeList
    }

    suspend fun linkCarToProfile(
        carEntity: CarEntity, context: Context, email: String
    ) {
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            var user = UserEntity()
            try {
                val fetchedUser = db.collection("Users").document(email).get().await()
                if (fetchedUser != null) {
                    user = fetchedUser.toObject(UserEntity::class.java)!!
                }
                val carsUploadedByUser = user.uploadedCars!!
                carsUploadedByUser.add(carEntity.plate + carEntity.model + carEntity.year)
                db.collection("Users")
                    .document(email).update(
                        "uploadedCars",
                        carsUploadedByUser
                    ).addOnSuccessListener {
                        Log.d("Success", "Coche linkeado correctamente")
                    }.addOnFailureListener { Log.d("Error", "Error al linkear coche") }
            } catch (e: Exception) {
                Log.e("Error", "ERROR", e)
            }
        } else {
            Log.e("Error", "ERROR: FirebaseApp no inicializado")
        }
    }
    suspend fun fetchCarsUploadedByUser(
        context: Context, email: String
    ): MutableList<CarEntity> {
        var user = UserEntity()
        val carsOfUser = mutableListOf<CarEntity>()
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            try {
                val fetchedUser = db.collection("Users").document(email).get().await()
                if (fetchedUser != null) {
                    user = fetchedUser.toObject(UserEntity::class.java)!!
                }
                for (i in user.uploadedCars!!) {
                    val fetchedCar = db.collection("Cars").document(i).get().await()
                    carsOfUser.add(fetchedCar.toObject(CarEntity::class.java)!!)
                }


            } catch (e: Exception) {
                Log.e("Error", "ERROR", e)
            }
        } else {
            Log.e("Error", "ERROR: FirebaseApp no inicializado")
        }
        return carsOfUser
    }

    suspend fun fetchUserByName(context: Context, name:String):UserEntity? {
        var user: UserEntity? = UserEntity("", UserType.NULL, "")
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            val t = db.collection("Users").get().await()
                    for (documento in t.documents) {
                        val fireBaseUser = documento.toObject(UserEntity::class.java)
                        if (fireBaseUser?.name == name) {
                            user = fireBaseUser
                        }
                    }
                }
         else {
            Log.d("error", "ERROR")
        }
        return user
    }

    suspend fun sendMessage(context: Context, messageEntity : MessageEntity) {
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            try {
                db.collection("Messages").document().set(
                    messageEntity
                ).addOnSuccessListener {
                    Log.d("Success", "Mensaje enviado correctamente")
                }.addOnFailureListener {
                    Log.d("Error", "ERROR AL ENVIAR MENSAJE")
                }.await()

            } catch (e: Exception) {
                Log.d("Error", "ERROR INESPERADO")
            }
        } else {
            Log.d("error", "ERROR")

        }
    }

    suspend fun getMessages(context: Context, userReading:String, otherUser:String): List<MessageEntity> {
        val sentMessages = mutableListOf<MessageEntity>()
        val receivedMessages = mutableListOf<MessageEntity>()
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            try {
                val messages = db.collection("Messages").get().await()
                for (message in messages) {
                    val messageObject = message.toObject(MessageEntity::class.java)
                    if (messageObject.sent_by == userReading && messageObject.sent_to==otherUser) {
                        sentMessages.add(messageObject)
                    }
                    else if (messageObject.sent_by == otherUser && messageObject.sent_to==userReading) {
                        receivedMessages.add(messageObject)
                    }
                }

            } catch (e: Exception) {
                Log.d("Error", "ERROR INESPERADO")
            }
        } else {
            Log.d("error", "ERROR")
        }
        return (sentMessages+receivedMessages).sortedBy { messageEntity -> messageEntity.sent_on }
    }

    suspend fun fetchChatsOfUser(context: Context, userReading:String): MutableList<MessageEntity>{
        val messagesList = mutableListOf<MessageEntity>()
        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            try {
                val messages = db.collection("Messages").get().await()
                for (message in messages) {
                    val messageObject = message.toObject(MessageEntity::class.java)
                    if (messageObject.sent_by == userReading || messageObject.sent_to==userReading) {
                        messagesList.add(messageObject)
                    }
                }

            } catch (e: Exception) {
                Log.d("Error", "ERROR INESPERADO")
            }
        } else {
            Log.d("error", "ERROR")
        }

        return messagesList
    }


}