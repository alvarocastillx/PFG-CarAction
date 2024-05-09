package com.acasloa946.pfg_caraction.UserInterface.Main.carScreen

import com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen.uploadCarViewmodel
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.Main.carMakesScreen.carMakesViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carModelScreen.carModelViewmodel
import com.acasloa946.pfg_caraction.bottomnavbar.BottomNavBar
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.google.relay.compose.RowScopeInstanceImpl.align

@Composable
fun CarScreen(navController: NavController, carScreenViewmodel: CarScreenViewmodel) {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .align(Alignment.CenterVertically)
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
            CarScreenComponent(modifier = Modifier.fillMaxWidth().height(1300.dp),
                makeText = carScreenViewmodel.clickedCar.make!!,
                modelText = carScreenViewmodel.clickedCar.model!!,
                plateText = carScreenViewmodel.clickedCar.plate!!,
                userNameText = carScreenViewmodel.clickedCar.userName!!,
                transText = carScreenViewmodel.clickedCar.transmisionType!!,
                kmText = "${carScreenViewmodel.clickedCar.km} km.",
                yearText = carScreenViewmodel.clickedCar.year.toString(),
                priceText = "${carScreenViewmodel.clickedCar.price}€",
                fuelText = carScreenViewmodel.clickedCar.fuelType!!,
                localizationText = carScreenViewmodel.clickedCar.locationName!!,
                onContactClick = {

                },
                carScreenViewmodel = carScreenViewmodel
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(GrisMain)
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
/*

*/