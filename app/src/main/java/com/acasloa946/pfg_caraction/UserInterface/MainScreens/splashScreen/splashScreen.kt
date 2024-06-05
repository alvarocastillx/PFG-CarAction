package com.acasloa946.pfg_caraction.UserInterface.MainScreens.splashScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen.homeScreenViewmodel
import kotlinx.coroutines.delay
import okhttp3.internal.wait

@Composable
fun SplashScreen(navController: NavController, homeScreenViewmodel: homeScreenViewmodel){
    LaunchedEffect(Unit) {
        homeScreenViewmodel.fetchCars()
        delay(750)
        navController.popBackStack()
        navController.navigate(Routes.HomeScreen.route)
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SplashScreenComponents(modifier = Modifier.fillMaxSize())
    }
}