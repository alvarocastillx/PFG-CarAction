package com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen

import android.content.Context
import android.os.Bundle
import android.widget.Toast
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
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont

@Composable
fun RegisterScreen(navController: NavController, registerViewmodel: RegisterViewmodel) {


    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GrisMain)
            .verticalScroll(rememberScrollState(10000), true, reverseScrolling = true),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RegisterScreenComponent(
            modifier = Modifier
                .fillMaxWidth()
                .height(711.dp),
            onRegisterClick = {
                registerViewmodel.registerAuth(
                    onSuccess = {
                        toastMaker(msj = "Usuario creado correctamente.", context)
                        navController.navigate(Routes.Q1Screen.route)
                    },
                    onFailure = {
                        toastMaker(msj = "Fallo al crear usuario. Inténtelo de nuevo más tarde.", context)
                    },
                    onShortLength = {
                        toastMaker(msj = "Debe introducir 6 carácteres o más.", context)
                    },
                    onNoDigit = {
                        toastMaker(msj = "La contraseña debe tener un número como mínimo.", context)
                    },
                    failedMail = {
                        toastMaker(msj = "Formato de e-mail incorrecto.", context)
                    },
                    context
                )

            },
            registerViewmodel
        )
        Text(
            text = "CarAction® 2024 ",
            modifier = Modifier.padding(top = 50.dp),
            color = BlancoMain,
            fontFamily = raillincFont
        )
    }
}

fun toastMaker(msj:String, context:Context) {
    Toast.makeText(context,msj,Toast.LENGTH_SHORT).show()
}