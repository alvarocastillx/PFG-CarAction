package com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen

import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import android.Manifest
import android.annotation.SuppressLint
import android.location.Address
import android.location.Geocoder
import android.os.Build
import android.os.Build.VERSION.SDK_INT
import android.util.Log
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.maps.model.LatLng
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.AutocompletePrediction
import com.google.android.libraries.places.api.model.AutocompleteSessionToken
import com.google.android.libraries.places.api.model.PlaceTypes
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import java.util.Locale
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class carLocationViewmodel : ViewModel() {

    private var locationService: FusedLocationProviderClient? = null

    //Localización (latitud, longitud)
    private var _userLocation = MutableLiveData<Pair<Double, Double>>()
    var userLocation: LiveData<Pair<Double, Double>> = _userLocation

    //Dirección (string de calle)
    private val _markerAddressDetail =
        MutableStateFlow<ResponseState<Address>>(ResponseState.Idle)//ResponseState is a wrapper class
    private val markerAddressDetail = _markerAddressDetail.asStateFlow()
    var userAddress by mutableStateOf("")


    fun getLocationPermission(
        context: Context,
        permission: String,
        launcher: ManagedActivityResultLauncher<String, Boolean>
    ) {
        if (ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            launcher.launch(permission)
        } else {
            launcher.launch(permission)
        }
    }

    @SuppressLint("MissingPermission")
    fun getLocation(
        fusedLocationProviderClient: FusedLocationProviderClient,
        failedToGetLocation: () -> Unit
    ) {
        viewModelScope.launch {
            try {
                fusedLocationProviderClient.lastLocation.addOnSuccessListener { location ->
                    if (location != null) {
                        _userLocation.value = Pair(location.latitude, location.longitude)
                    } else {
                        failedToGetLocation()
                    }
                }.addOnFailureListener {
                    failedToGetLocation()
                }.await()
            }
            catch (e:Exception) {
                failedToGetLocation()
            }
        }

    }


    fun getMarkerAddressDetails(lat: Double, long: Double, context: Context) {
        _markerAddressDetail.value = ResponseState.Loading
        try {
            val geocoder = Geocoder(context, Locale.getDefault())
            if (SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                geocoder.getFromLocation(
                    lat,
                    long,
                    1
                ) { p0 ->
                    _markerAddressDetail.value = ResponseState.Success(p0[0])
                }
            } else {
                val addresses = geocoder.getFromLocation(
                    lat,
                    long,
                    1,
                )
                _markerAddressDetail.value =
                    if (!addresses.isNullOrEmpty()) {
                        ResponseState.Success(addresses[0])
                    } else {
                        ResponseState.Error(Exception("No existe la dirección"))
                    }
                userAddress =
                    (markerAddressDetail.value as ResponseState.Success<Address>).data.getAddressLine(
                        0
                    )


            }
        } catch (e: Exception) {
            _markerAddressDetail.value = ResponseState.Error(e)
        }
    }


}


sealed class ResponseState<out T> {
    object Idle : ResponseState<Nothing>()
    object Loading : ResponseState<Nothing>()
    data class Error(val error: Throwable) : ResponseState<Nothing>()
    data class Success<R>(val data: R) : ResponseState<R>()
}




