package com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.text.isDigitsOnly
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.API.APIModule
import com.acasloa946.pfg_caraction.API.Models.AIModels.ChatRequest
import com.acasloa946.pfg_caraction.API.Models.AIModels.Message
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel
import com.acasloa946.pfg_caraction.API.const
import com.acasloa946.pfg_caraction.UserInterface.States.UploadCarStates
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.CarsUseCases.addCarUseCase
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.linkCarToProfileUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.storage.storage
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.util.Calendar
import java.util.Locale
import javax.inject.Inject
import kotlin.math.roundToInt



@HiltViewModel
class uploadCarViewmodel @Inject constructor(
    private val addCarUseCase: addCarUseCase,
    private val fetchUserUseCase: fetchUserUseCase,
    private val linkCarToProfileUseCase: linkCarToProfileUseCase
) : ViewModel() {
    private val storageRef = Firebase.storage
    private val auth = Firebase.auth

    //uri de la imagen seleccionada en galería
    var selectedImageUri: Uri? by mutableStateOf(null)

    //VARIABLES DEL COCHE
    //url de la imagen ya subida a Firebase
    private var selectedImageURL by mutableStateOf("")

    var selectedMake by mutableStateOf(APIMake())
    var makeButtonText by mutableStateOf("Marca")

    private var selectedModel by mutableStateOf(APIModel())
    var modelButtonText by mutableStateOf("Modelo")

    var carPlate by mutableStateOf("")

    var carYearField by mutableStateOf("")
    private var _carYear: Int? by mutableStateOf(0)

    var carKMField by mutableStateOf("")
    private var _carKM: Int? by mutableStateOf(0)

    var carPriceField by mutableStateOf("")
    private var _carPrice: String? by mutableStateOf("")

    private var _carType by mutableStateOf("")


    var userLocation = MutableLiveData<Pair<Double, Double>>()
    var userLocationString by mutableStateOf("")

    private var _userName by mutableStateOf("")
    private var _carFuelType by mutableStateOf("")
    private var _carTransmisionType by mutableStateOf("")

    private var _carInfo by mutableStateOf("")

    private val _uploadCarStates = MutableLiveData<UploadCarStates<Nothing>>()
    val uploadCarStates: LiveData<UploadCarStates<Nothing>> = _uploadCarStates


    init {
        userLocation.value = Pair(0.0, 0.0)
    }

    fun getSelectedImage(uri: Uri?) {
        selectedImageUri = uri
        uploadImage(selectedImageUri)
    }

    private fun uploadImage(uri: Uri?) {
        val imageRef = storageRef.reference.child("$uri")
        viewModelScope.launch {
            uri?.let {
                imageRef.putFile(it).addOnSuccessListener {
                    it.storage.downloadUrl.addOnSuccessListener {
                        selectedImageURL = it.toString()
                    }
                    println("Imagen subida correctamente")
                }.addOnFailureListener {
                    println("Error al subir imagen")
                }
            }
        }
    }

    fun selectMake(make: APIMake) {
        if (modelButtonText != "Modelo") {
            selectedModel = APIModel()
            modelButtonText = "Modelo"
        }
        selectedMake = make
        makeButtonText = make.name.toString()

    }

    fun selectModel(model: APIModel) {
        selectedModel = model
        modelButtonText = model.name.toString()
    }

    fun changePlate(plate: String) {
        carPlate = plate.uppercase(Locale.getDefault())
    }

    fun changeYear(year: String) {
        if (year.length <= 4) {
            carYearField = year
            try {
                _carYear = year.toDoubleOrNull()?.roundToInt()
            } catch (e: Exception) {
                Log.d("ERROR", "ERROR PARSEANDO YEAR")
            }
        }
    }

    fun changeKM(KM: String) {
        carKMField = KM
        try {
            _carKM = KM.toDoubleOrNull()?.roundToInt()
        } catch (e: Exception) {
            Log.d("ERROR", "ERROR PARSEANDO KMS")
        }

    }

    fun changePrice(price: String) {
        carPriceField = price
        val numberFormat = NumberFormat.getNumberInstance(Locale.getDefault())
        if (price.isNotBlank() && price.isDigitsOnly()) {
            _carPrice = numberFormat.format(price.toLongOrNull())
        }
    }

    fun getCarType(fillData: () -> Unit, context: Context, uploadedSuccessfuly: () -> Unit) {
        _uploadCarStates.value = UploadCarStates.Loading
        val apiModule = APIModule()
        if (makeButtonText != "Marca" && modelButtonText != "Modelo") {
            viewModelScope.launch {
                val APICar = apiModule.getCarType(makeButtonText, modelButtonText)

                _carType = APICar.vclass.toString()
                _carFuelType = APICar.fueltype1.toString()
                _carTransmisionType = APICar.trany.toString()

                uploadCar(fillData, context, uploadedSuccessfuly)
            }
        } else {
            _uploadCarStates.value = UploadCarStates.Error(Throwable("Introduzca los datos de su coche"))
            fillData()
        }

    }
    /*


     */

    private fun uploadCar(
        fillData: () -> Unit,
        context: Context,
        uploadedSuccessfuly: () -> Unit
    ) {

        if (selectedImageURL.isNotBlank() && carPlate.isNotBlank() && (makeButtonText != "Marca") && (modelButtonText != "Modelo") && ((_carYear.toString().length == 4) && (_carYear!! <= Calendar.getInstance()
                .get(Calendar.YEAR))) && (userLocation.value!!.first != 0.0) &&
            carKMField.isNotBlank() && carPriceField.isNotBlank() && userLocationString.isNotBlank()
        ) {
            viewModelScope.launch {
                try {
                    getAIInfo("$makeButtonText $modelButtonText")
                    val user = fetchUserUseCase.invoke(auth.currentUser!!.email.toString(), context)
                    _userName = user.name
                    val carToUpload = CarModel(
                        _carType,
                        selectedImageURL,
                        makeButtonText,
                        modelButtonText,
                        carPlate,
                        _carYear!!,
                        _carKM!!,
                        _carPrice!!,
                        userLocation.value!!,
                        userLocationString,
                        _userName,
                        _carFuelType,
                        _carTransmisionType,
                        _carInfo
                    )
                    addCarUseCase.invoke(carToUpload, context)
                    linkCarToProfileUseCase.invoke(carToUpload,context, auth.currentUser!!.email!!)
                    uploadedSuccessfuly()
                    _uploadCarStates.value = UploadCarStates.Success
                } catch (e: Exception) {
                    Log.d("ERROR", "ERROR AL AÑADIR COCHE A LA BASE DE DATOS")
                    _uploadCarStates.value = UploadCarStates.Error(e)
                }
            }
        } else {
            _uploadCarStates.value = UploadCarStates.Error(exception = Throwable("Introduzca los datos de su coche"))
            fillData()
        }

    }

    fun clearScreen() {
        selectedImageUri = null
        selectedImageURL = ""
        selectedMake = APIMake()
        makeButtonText = "Marca"
        selectedModel = APIModel()
        modelButtonText = "Modelo"
        carPlate = ""
        carYearField = ""
        _carYear = 0
        carKMField = ""
        _carKM = 0
        carPriceField = ""
        _carPrice = ""
        _carType = ""
        userLocationString = ""
        _userName = ""
        _carFuelType = ""
        _carTransmisionType = ""
        _carInfo = ""
    }

    suspend fun getAIInfo(makeModel:String) {
        val apiModule = APIModule()
        val listOfMessages = listOf(Message("system", const.SYSTEM_AI_MESSAGE), Message("user", makeModel))
        val chatRequest = ChatRequest("gemini-pro", listOfMessages, 0.7)
        viewModelScope.launch {
            try {
                _carInfo = apiModule.getAIInfo(chatRequest).choices!![0].message.content
            } catch (e: Exception) {
                Log.e("ERROR", "Error al obtener información de la IA", e)
            }
        }.join()


    }


}