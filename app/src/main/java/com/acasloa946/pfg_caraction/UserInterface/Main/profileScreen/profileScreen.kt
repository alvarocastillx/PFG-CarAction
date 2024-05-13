package com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.bottomnavbar.BottomNavBar
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.google.relay.compose.RowScopeInstanceImpl.align

@Composable
fun ProfileScreen(navController: NavController, profileViewmodel: profileViewmodel, homeScreenViewmodel: homeScreenViewmodel) {

    val context = LocalContext.current

    LaunchedEffect(Unit) {
        profileViewmodel.fetchCarsUploadedByUser(context)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .align(Alignment.CenterVertically)
            .background(GrisMain)

    ) {
        Column(
            modifier = Modifier
                .verticalScroll(
                    rememberScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            ProfileScreenComponent(modifier = Modifier
                .fillMaxWidth()
                .height(800.dp),
                userText = profileViewmodel.userName,
                profileViewmodel = profileViewmodel,
                memberSinceText = "Miembro desde ${profileViewmodel.memberSince}")

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
