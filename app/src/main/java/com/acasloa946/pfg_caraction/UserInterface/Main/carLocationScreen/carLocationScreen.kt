package com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen

import android.Manifest
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.MutableLiveData
import com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen.uploadCarViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.bottomnavbar.BottomNavBar
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.google.android.gms.location.LocationServices
import com.google.relay.compose.RowScopeInstanceImpl.align

@Composable
fun CarLocationScreen(navController: NavController, carLocationViewmodel: carLocationViewmodel, uploadCarViewmodel: uploadCarViewmodel) {


    val context = LocalContext.current
    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            val locationService = LocationServices.getFusedLocationProviderClient(context)
            carLocationViewmodel.getLocation(locationService,
                failedToGetLocation = {
                    toastMaker("Ha ocurrido un error obteniendo su ubicación",context)
                })
        } else {
            toastMaker(
                "No se puede obtener la ubicación. Permisos denegados",
                context
            )
        }
    }


    val userLocation by carLocationViewmodel.userLocation.observeAsState(initial = Pair(40.416775, -3.703790)) //DEFAULT : MADRID


    Box(
        modifier = Modifier
            .fillMaxSize()
            .align(Alignment.CenterVertically)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(
                    rememberScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            LocationScreenComponent(modifier = Modifier
                .fillMaxWidth()
                .height(800.dp),
                onThisLocationClick = {
                    carLocationViewmodel.getLocationPermission(
                        context,
                        permission = Manifest.permission.ACCESS_COARSE_LOCATION,
                        launcher = launcher,
                    )
                },
                carLocationViewmodel,
                userLocation,
                onAssignClick = {
                    uploadCarViewmodel.userLocation = carLocationViewmodel.userLocation as MutableLiveData<Pair<Double, Double>>
                    carLocationViewmodel.getMarkerAddressDetails(userLocation.first,userLocation.second,context)
                    uploadCarViewmodel.userLocationString = carLocationViewmodel.userAddress
                    navController.navigate(Routes.UploadCarScreen.route)
                })

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(GrisMain)
                .align(Alignment.BottomCenter)
                .padding(bottom = 15.dp)

        ) {
            BottomNavBar(modifier = Modifier
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(10.dp)),
                onCarClick = {
                    navController.navigate(Routes.UploadCarScreen.route)
                },
                onHomeClick = {
                    navController.navigate(Routes.HomeScreen.route)
                }
            )
        }
    }
}


