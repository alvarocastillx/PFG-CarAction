package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carModelScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen.uploadCarViewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.modelcomponent.ModelComponent
import com.acasloa946.pfg_caraction.modelscreen.TopLevel

@Composable
fun ModelScreenComponent(modifier: Modifier = Modifier, carModelViewmodel: carModelViewmodel, navController: NavController, uploadCarViewmodel: uploadCarViewmodel) {
    val context = LocalContext.current
    TopLevel(modifier = modifier) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(bottom = 80.dp)
        ) {
            if (!carModelViewmodel.modelList.isEmpty()) {
                items(carModelViewmodel.modelList) {
                    ModelComponent(modelText = it.name.toString(), onModelClick = {
                        uploadCarViewmodel.selectModel(it)
                        navController.navigate(Routes.UploadCarScreen.route)
                    })
                }
            }
            else {
                toastMaker("No se han encontrado modelos de la marca seleccionada", context)
                navController.navigate(Routes.UploadCarScreen.route)
            }
        }
    }
}
