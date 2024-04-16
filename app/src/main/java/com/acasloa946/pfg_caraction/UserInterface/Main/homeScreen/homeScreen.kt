package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.pantallaprincipal.PantallaPrincipal
import com.acasloa946.pfg_caraction.ui.theme.GrisMain


@Composable
fun HomeScreen(navController: NavController, homeScreenViewmodel: homeScreenViewmodel) {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GrisMain)
            .verticalScroll(rememberScrollState(10000),true, reverseScrolling = true),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        homeScreenViewmodel.fetchUserName(context,
            onError = {
                toastMaker("Ha ocurrido un error con su cuenta", context)
                navController.navigate(Routes.InitScreen.route)
            })

        PantallaPrincipalComponent(modifier = Modifier.fillMaxWidth().height(800.dp),
            textWelcome = homeScreenViewmodel.userName, homeScreenViewmodel = homeScreenViewmodel)
    }
}



