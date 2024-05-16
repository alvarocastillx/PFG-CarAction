package com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel


@Composable
fun ChatScreen(navController: NavController, carScreenViewmodel: CarScreenViewmodel, chatScreenViewmodel: chatScreenViewmodel) {

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        ChatScreenComponent(modifier = Modifier.fillMaxWidth(), userNameText = carScreenViewmodel.clickedCar.userName!!, chatScreenViewmodel = chatScreenViewmodel, carScreenViewmodel)
    }
}