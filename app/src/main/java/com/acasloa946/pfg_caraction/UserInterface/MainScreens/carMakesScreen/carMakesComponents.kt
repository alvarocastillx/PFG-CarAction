package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carMakesScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen.uploadCarViewmodel
import com.acasloa946.pfg_caraction.makecomponent.MakeComponent
import com.acasloa946.pfg_caraction.makesscreen.TopLevel

@Composable
fun MakesScreenComponents(modifier: Modifier = Modifier, carMakesViewmodel: carMakesViewmodel, uploadCarViewmodel: uploadCarViewmodel, navController: NavController) {
    TopLevel(modifier = modifier) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(bottom = 80.dp)
        ) {
            items(carMakesViewmodel.carMakes) {
                MakeComponent(makeText = it.name.toString(), onMakeClick = {
                    uploadCarViewmodel.selectMake(it)
                    navController.navigate(Routes.UploadCarScreen.route)
                })
            }
        }
    }

}
