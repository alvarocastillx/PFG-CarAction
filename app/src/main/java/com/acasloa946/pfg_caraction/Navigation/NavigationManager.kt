package com.acasloa946.pfg_caraction.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.InitPage
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.InitScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Screen
import com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen.Q2Screen
import com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen.Q2Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterScreen

@Composable
fun NavigationManager(registerViewmodel: RegisterViewmodel, initScreenViewmodel: InitScreenViewmodel, q1Viewmodel: Q1Viewmodel, q2Viewmodel: Q2Viewmodel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "InitScreen") {
        composable("InitScreen") {
            InitPage(navController,initScreenViewmodel)
        }
        composable("RegisterScreen") {
            RegisterScreen(navController,registerViewmodel)
        }
        composable("Q1Screen") {
            Q1Screen(navController, q1Viewmodel)
        }
        composable("Q2Screen") {
            Q2Screen(navController, q2Viewmodel, q1Viewmodel)
        }
        }
}