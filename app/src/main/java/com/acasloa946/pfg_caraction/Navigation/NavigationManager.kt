package com.acasloa946.pfg_caraction.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.CarLocationScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.carLocationViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carMakesScreen.CarMakesScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.carMakesScreen.carMakesViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carModelScreen.CarModelScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.carModelScreen.carModelViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen.ChatScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen.chatScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen.currentChatsScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen.currentChatsViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.favouritesScreen.FavouriteScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.favouritesScreen.favouritesViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.HomeScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen.ProfileScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen.profileViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.splashScreen.SplashScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen.UploadCarScreen
import com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen.uploadCarViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.InitPage
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.InitScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.LoginScreen.LoginScreen
import com.acasloa946.pfg_caraction.UserInterface.Start.LoginScreen.loginViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Screen
import com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen.Q2Screen
import com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen.Q2Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterScreen

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
    favouritesViewmodel: favouritesViewmodel
) {

    val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "SplashScreen") {
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
                    profileViewmodel
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
                    homeScreenViewmodel
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