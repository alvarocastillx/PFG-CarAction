package com.acasloa946.pfg_caraction.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.acasloa946.pfg_caraction.UserInterface.InitScreen.InitPage
import com.acasloa946.pfg_caraction.UserInterface.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.UserInterface.RegisterScreen.RegisterScreen

@Composable
fun NavigationManager(registerViewmodel: RegisterViewmodel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "InitScreen") {
        composable("InitScreen") {
            InitPage(navController)
        }
        composable("RegisterScreen") {
            RegisterScreen(navController,registerViewmodel)
        }
        }
}