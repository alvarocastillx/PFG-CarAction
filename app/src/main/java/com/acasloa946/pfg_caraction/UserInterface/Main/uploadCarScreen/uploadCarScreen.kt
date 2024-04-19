package com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.Main.carMakesScreen.carMakesViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carModelScreen.carModelViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.PantallaPrincipalComponent
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.bottomnavbar.BottomNavBar
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.google.firebase.Firebase
import com.google.relay.compose.RowScopeInstanceImpl.align

@Composable
fun UploadCarScreen(navController: NavController, uploadCarViewmodel: uploadCarViewmodel, carMakesViewmodel: carMakesViewmodel, carModelViewmodel: carModelViewmodel) {
    val context = LocalContext.current

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri: Uri? -> uri?.let { uploadCarViewmodel.getSelectedImage(it) } }
    )
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
            carMakesViewmodel.getMakes {
                toastMaker("Error al recuperar marcas. Inténtelo de nuevo en otro momento.",context)
            }
            carModelViewmodel.getModels(uploadCarViewmodel.selectedMake.name.toString())
            UploadCarScreenComponent(uploadCarViewmodel = uploadCarViewmodel, modifier = Modifier.fillMaxWidth().height(875.dp),
                uploadImageClick = {
                    launcher.launch("image/*")
                },
                onMakeClick = {
                    navController.navigate(Routes.CarMakesScreen.route)
                },
                onModelClick = {
                    if (uploadCarViewmodel.makeButtonText=="Marca") {
                        toastMaker("Seleccione la marca de su coche", context)
                    }
                    else {
                        navController.navigate(Routes.CarModelScreen.route)
                    }
                }
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