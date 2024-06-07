package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carModelScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen.uploadCarViewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.currentchatsscreen.Linea1
import com.acasloa946.pfg_caraction.modelcomponent.ModelComponent
import com.acasloa946.pfg_caraction.modelscreen.TopLevel
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain

@Composable
fun ModelScreenComponent(modifier: Modifier = Modifier, carModelViewmodel: carModelViewmodel, navController: NavController, uploadCarViewmodel: uploadCarViewmodel) {
    val context = LocalContext.current
    TopLevel(modifier = modifier) {
        androidx.compose.material3.OutlinedTextField(
            value = carModelViewmodel.searchBarText,
            onValueChange = {
                carModelViewmodel.changeSearchBarText(it)
            },
            shape = RoundedCornerShape(17.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = RojoMain,
                unfocusedBorderColor = RojoMain,
                focusedLabelColor = RojoMain,
                unfocusedLabelColor = RojoMain,
                unfocusedTextColor = RojoMain,
                focusedTextColor = RojoMain,
            ),
            modifier = Modifier
                .background(BlancoMain)
                .fillMaxWidth().height(45.dp)
                .border(3.dp, RojoMain, RoundedCornerShape(17.dp)).background(GrisMain),
            textStyle = TextStyle.Default.copy(fontSize = 10.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            singleLine = true
        )
        Linea1()
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(bottom = 80.dp)
        ) {

            if (!carModelViewmodel.modelList.isEmpty() || carModelViewmodel.searchBarText.isNotBlank()) {
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
