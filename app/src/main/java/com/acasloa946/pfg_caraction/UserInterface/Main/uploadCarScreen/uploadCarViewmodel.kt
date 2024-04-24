package com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen

import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.API.APIModule
import com.acasloa946.pfg_caraction.API.Models.APIMake
import com.acasloa946.pfg_caraction.API.Models.APIModel
import com.google.firebase.Firebase
import com.google.firebase.storage.storage
import kotlinx.coroutines.launch

//TODO: FUN CLEAR VIEWMODEL
class uploadCarViewmodel : ViewModel() {
    private val storageRef = Firebase.storage

    var selectedImageUri: Uri? by mutableStateOf(null)

    var selectedMake by mutableStateOf(APIMake())
    var makeButtonText by mutableStateOf("Marca")

    var selectedModel by mutableStateOf(APIModel())
    var modelButtonText by mutableStateOf("Modelo")



    fun getSelectedImage(uri: Uri?) {
        selectedImageUri = uri
        uploadImage(selectedImageUri)
    }

    fun uploadImage(uri: Uri?) {
        val imageRef = storageRef.reference.child("$uri")
        viewModelScope.launch {
            uri?.let {
                imageRef.putFile(it).addOnSuccessListener {
                    println("Imagen subida correctamente")
                }.addOnFailureListener {
                    println("Error al subir imagen")
                }
            }
        }
    }

    fun selectMake(make:APIMake) {
        if (modelButtonText!="Modelo") {
            selectedModel = APIModel()
            modelButtonText = "Modelo"
        }
        selectedMake = make
        makeButtonText = make.name.toString()

    }

    fun selectModel(model:APIModel) {
        selectedModel = model
        modelButtonText = model.name.toString()
    }






}