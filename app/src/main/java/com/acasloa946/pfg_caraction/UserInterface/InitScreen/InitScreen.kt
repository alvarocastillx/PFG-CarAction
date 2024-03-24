package com.acasloa946.pfg_caraction.UserInterface.InitScreen

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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont

@Composable
fun InitPage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GrisMain)
            .verticalScroll(rememberScrollState(10000),true, reverseScrolling = true),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InitScreenComponent(
            modifier = Modifier
                .fillMaxWidth()
                .height(711.dp),
            onLoginClick = {
                //todo
            },
            onRegisterClick = {
                navController.navigate(Routes.RegisterScreen.route)
            }
        )
        Text(
            text = "CarAction® 2024 ",
            modifier = Modifier.padding(top = 50.dp),
            color = BlancoMain,
            fontFamily = raillincFont
        )
    }

}



