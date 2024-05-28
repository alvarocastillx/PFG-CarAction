package com.acasloa946.pfg_caraction.Navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.FilterDialog.FilterDialogViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carLocationScreen.CarLocationScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carLocationScreen.carLocationViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carMakesScreen.CarMakesScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carMakesScreen.carMakesViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carModelScreen.CarModelScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carModelScreen.carModelViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen.CarScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.chatScreen.ChatScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.chatScreen.chatScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.currentChatsScreen.currentChatsScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.currentChatsScreen.currentChatsViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen.FavouriteScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen.favouritesViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen.HomeScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen.ProfileScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen.profileViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.splashScreen.SplashScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen.UploadCarScreen
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen.uploadCarViewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen.InitPage
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen.InitScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.LoginScreen.LoginScreen
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.LoginScreen.loginViewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q1Screen.Q1Screen
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q1Screen.Q1Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q2Screen.Q2Screen
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q2Screen.Q2Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.RegisterScreen
import com.acasloa946.pfg_caraction.UserInterface.notifications.notif
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

@Composable
fun NavigationManager(
    registerViewmodel: RegisterViewmodel,
    initScreenViewmodel: InitScreenViewmodel,
    q1Viewmodel: Q1Viewmodel,
    q2Viewmodel: Q2Viewmodel,
    loginViewmodel: loginViewmodel,
    homeScreenViewmodel: homeScreenViewmodel,
    uploadCarViewmodel: uploadCarViewmodel,
    carMakesViewmodel: carMakesViewmodel,
    carModelViewmodel: carModelViewmodel,
    carLocationViewmodel: carLocationViewmodel,
    carScreenViewmodel: CarScreenViewmodel,
    profileViewmodel: profileViewmodel,
    chatScreenViewmodel: chatScreenViewmodel,
    currentChatsViewmodel: currentChatsViewmodel,
    favouritesViewmodel: favouritesViewmodel,
    filterDialogViewmodel: FilterDialogViewmodel,
    notif: notif
) {

    val auth = Firebase.auth
    var startDestination = ""

    if (auth.currentUser?.email != null) {
        startDestination = "SplashScreen"
        Log.d("EMAAIL",auth.currentUser?.email.toString())
    }
    else {
        startDestination = "InitScreen"
    }

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable("InitScreen") {
                InitPage(navController, initScreenViewmodel)
            }
            composable("RegisterScreen") {
                RegisterScreen(navController, registerViewmodel)
            }
            composable("Q1Screen") {
                Q1Screen(navController, q1Viewmodel)
            }
            composable("Q2Screen") {
                Q2Screen(navController, q2Viewmodel, q1Viewmodel)
            }
            composable("LoginScreen") {
                LoginScreen(navController = navController, loginViewmodel = loginViewmodel)
            }
            composable("HomeScreen") {
                HomeScreen(
                    navController = navController,
                    homeScreenViewmodel = homeScreenViewmodel,
                    carScreenViewmodel,
                    profileViewmodel,
                    filterDialogViewmodel,
                    notif
                )
            }
            composable("UploadCarScreen") {
                UploadCarScreen(
                    navController = navController,
                    uploadCarViewmodel = uploadCarViewmodel,
                    carMakesViewmodel,
                    carModelViewmodel,
                    profileViewmodel,
                    homeScreenViewmodel
                )
            }
            composable("CarMakesScreen") {
                CarMakesScreen(
                    navController = navController,
                    carMakesViewmodel = carMakesViewmodel,
                    uploadCarViewmodel
                )
            }
            composable("CarModelScreen") {
                CarModelScreen(
                    navController = navController,
                    carModelViewmodel = carModelViewmodel,
                    uploadCarViewmodel
                )
            }
            composable("CarLocationScreen") {
                CarLocationScreen(
                    navController = navController,
                    carLocationViewmodel = carLocationViewmodel,
                    uploadCarViewmodel
                )
            }
            composable("CarScreen") {
                CarScreen(
                    navController = navController,
                    carScreenViewmodel = carScreenViewmodel,
                    profileViewmodel,
                    homeScreenViewmodel
                )
            }
            composable("ProfileScreen") {
                ProfileScreen(
                    navController = navController,
                    profileViewmodel = profileViewmodel,
                    homeScreenViewmodel,
                    carScreenViewmodel
                )
            }
            composable("SplashScreen") {
                SplashScreen(navController, homeScreenViewmodel)
            }
            composable("ChatScreen") {
                ChatScreen(navController = navController, carScreenViewmodel, chatScreenViewmodel, currentChatsViewmodel)
            }
            composable("CurrentChatsScreen") {
                currentChatsScreen(navController = navController, homeScreenViewmodel = homeScreenViewmodel, profileViewmodel = profileViewmodel, currentChatsViewmodel)
            }
            composable("FavouritesScreen") {
                FavouriteScreen(navController = navController, homeScreenViewmodel = homeScreenViewmodel, profileViewmodel = profileViewmodel, favouritesViewmodel = favouritesViewmodel, carScreenViewmodel)
            }

    }
}