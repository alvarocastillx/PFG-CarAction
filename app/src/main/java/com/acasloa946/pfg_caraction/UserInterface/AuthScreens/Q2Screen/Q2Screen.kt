package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q2Screen

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
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q1Screen.Q1Viewmodel
import com.acasloa946.pfg_caraction.data.Entities.UserType
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont

@Composable
fun Q2Screen(navController: NavController, q2Viewmodel: Q2Viewmodel, q1Viewmodel: Q1Viewmodel) {

    val context = LocalContext.current


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GrisMain)
            .verticalScroll(rememberScrollState(10000), true, reverseScrolling = true),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainQ2Component(modifier = Modifier.fillMaxWidth().height(695.dp),
            onClickBuy = {
                q2Viewmodel.createUserAcc(q1Viewmodel.name, userType = UserType.BUYER, context)
                navController.navigate(Routes.SplashScreen.route)
            },
            onClickSell = {
                q2Viewmodel.createUserAcc(q1Viewmodel.name, userType = UserType.SELLER, context)
                navController.navigate(Routes.SplashScreen.route)
            })
        Text(
            text = "CarAction® 2024",
            modifier = Modifier.padding(top = 50.dp),
            color = BlancoMain,
            fontFamily = raillincFont
        )
    }
}
