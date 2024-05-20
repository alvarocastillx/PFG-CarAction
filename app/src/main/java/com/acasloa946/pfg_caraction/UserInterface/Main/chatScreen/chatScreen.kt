package com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen.currentChatsViewmodel
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.ColumnScopeInstanceImpl.weight


@Composable
fun ChatScreen(
    navController: NavController,
    carScreenViewmodel: CarScreenViewmodel,
    chatScreenViewmodel: chatScreenViewmodel,
    currentChatsViewmodel: currentChatsViewmodel
) {

    Column(
        modifier = Modifier
            .columnWeight(1.0f)
            .verticalScroll(
                rememberScrollState(10000),
                enabled = true,
                reverseScrolling = true
            )
            .background(GrisMain),
    ) {
        var userNameText = ""
        if (currentChatsViewmodel.clickedUserToChat != "") {
            userNameText = currentChatsViewmodel.clickedUserToChat
        }
        else {
            userNameText = carScreenViewmodel.clickedCar.userName.toString()
        }
        ChatScreenComponent(
            modifier = Modifier
                .fillMaxWidth()
                .height(800.dp),
            userNameText = userNameText,
            chatScreenViewmodel = chatScreenViewmodel,
            carScreenViewmodel,
            currentChatsViewmodel,
            navController
        )
    }
}