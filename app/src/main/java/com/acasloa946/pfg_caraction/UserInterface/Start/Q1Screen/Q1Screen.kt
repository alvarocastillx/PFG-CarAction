package com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.mainq1.MainQ1
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont

@Composable
fun Q1Screen(navController: NavController, q1Viewmodel: Q1Viewmodel) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GrisMain)
            .verticalScroll(rememberScrollState(10000), true, reverseScrolling = true),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainQ1Components(modifier =  Modifier
            .fillMaxWidth()
            .height(695.dp),
            q1Viewmodel = q1Viewmodel,
            onNextClick = {
                navController.navigate(Routes.Q2Screen.route)
            })
        Text(
            text = "CarAction® 2024",
            modifier = Modifier.padding(top = 50.dp),
            color = BlancoMain,
            fontFamily = raillincFont
        )
    }
}