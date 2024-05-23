package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.LoginScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont

@Composable
fun LoginScreen(navController: NavController, loginViewmodel: loginViewmodel) {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GrisMain)
            .verticalScroll(rememberScrollState(10000), true, reverseScrolling = true),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainLoginComponents(loginViewmodel = loginViewmodel, modifier = Modifier
            .fillMaxWidth()
            .height(711.dp),
            onLoginClick = {
                loginViewmodel.signIn(
                    success = {
                        toastMaker("Se ha iniciado sesión correctamente", context = context)
                        navController.navigate(Routes.SplashScreen.route)
                    },
                    failure = {
                        toastMaker("E-mail o contraseña incorrectos", context)
                    },
                    emptyTextfield = {
                        toastMaker("Introduzca su correo o contraseña", context)
                    }
                )
            })
        Text(
            text = "CarAction® 2024 ",
            modifier = Modifier.padding(top = 50.dp),
            color = BlancoMain,
            fontFamily = raillincFont
        )
    }
}
