package com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen

import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Firebase
import com.google.firebase.storage.storage
import kotlinx.coroutines.launch


class uploadCarViewmodel : ViewModel() {
    val storageRef = Firebase.storage

    var selectedImageUri : Uri? by mutableStateOf(null)


    fun getSelectedImage(uri: Uri?) {
        selectedImageUri = uri
        uploadImage(selectedImageUri)
    }

    fun uploadImage(uri: Uri?) {
        val imageRef = storageRef.reference.child("$uri")
        viewModelScope.launch {
            uri?.let { imageRef.putFile(it).addOnSuccessListener {
                println("Imagen subida correctamente")
            }.addOnFailureListener {
                println("Error al subir imagen")
            } }
        }
    }


}