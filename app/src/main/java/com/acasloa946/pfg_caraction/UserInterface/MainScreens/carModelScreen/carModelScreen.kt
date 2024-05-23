package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carModelScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen.uploadCarViewmodel
import com.acasloa946.pfg_caraction.bottomnavbar.BottomNavBar
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.google.relay.compose.RowScopeInstanceImpl.align

@Composable
fun CarModelScreen(navController: NavController, carModelViewmodel: carModelViewmodel, uploadCarViewmodel: uploadCarViewmodel) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .align(Alignment.CenterVertically)
    ) {
        Column(
            modifier = Modifier
                .background(GrisMain),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )  {
            ModelScreenComponent(modifier = Modifier.fillMaxWidth(), carModelViewmodel, navController, uploadCarViewmodel)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
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