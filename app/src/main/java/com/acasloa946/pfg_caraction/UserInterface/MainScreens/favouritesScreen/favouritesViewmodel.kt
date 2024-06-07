package com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.UserInterface.States.FavouriteCarStates
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.domain.CarsUseCases.deleteFavCarUseCase
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchFavouriteCarsUseCase
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class favouritesViewmodel @Inject constructor(private val fetchFavouriteCarsUseCase: fetchFavouriteCarsUseCase,
    private val deleteFavCarUseCase: deleteFavCarUseCase): ViewModel() {

    private val auth = Firebase.auth

    private val fetchedFavCars = MutableStateFlow<List<CarModel>>(emptyList())

    private val _favouriteCarStates = MutableLiveData<FavouriteCarStates<List<CarModel>>>()
    val favouriteCarStates: LiveData<FavouriteCarStates<List<CarModel>>> = _favouriteCarStates

    fun fetchFavCars(context: Context) {
        _favouriteCarStates.value = FavouriteCarStates.Loading
        viewModelScope.launch {
            try {
                fetchedFavCars.value = fetchFavouriteCarsUseCase.invoke(context, auth.currentUser?.email.toString())
                _favouriteCarStates.value = FavouriteCarStates.Success(fetchedFavCars.value)
            }
            catch (e: Exception) {
                _favouriteCarStates.value = FavouriteCarStates.Error(e)
            }
        }

    }

    fun deleteFavCar(context: Context, carModel: CarModel,
                     error : () ->  Unit, success : () -> Unit){

        viewModelScope.launch {
            try {
                deleteFavCarUseCase.invoke(context, carModel)
                success()
                fetchFavCars(context)
            }
            catch (e:Exception){
                error()
            }
        }
    }

}