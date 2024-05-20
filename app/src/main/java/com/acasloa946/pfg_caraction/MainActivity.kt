package com.acasloa946.pfg_caraction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.acasloa946.pfg_caraction.Navigation.NavigationManager
import com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.carLocationViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carMakesScreen.carMakesViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carModelScreen.carModelViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen.chatScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen.currentChatsViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen.profileViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen.uploadCarViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.InitScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.LoginScreen.loginViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen.Q2Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.UserInterface.notifications.notif
import com.acasloa946.pfg_caraction.ui.theme.PFGCarActionTheme
import com.google.android.libraries.places.api.Places
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val registerViewmodel: RegisterViewmodel by viewModels()
        val initScreenViewmodel: InitScreenViewmodel by viewModels()
        val q1Viewmodel: Q1Viewmodel by viewModels()
        val q2Viewmodel: Q2Viewmodel by viewModels()
        val loginViewmodel: loginViewmodel by viewModels()
        val homeScreenViewmodel: homeScreenViewmodel by viewModels()
        val uploadCarViewmodel: uploadCarViewmodel by viewModels()
        val carMakesViewmodel: carMakesViewmodel by viewModels()
        val carModelViewmodel: carModelViewmodel by viewModels()
        val carLocationViewmodel : carLocationViewmodel by viewModels()
        val carScreenViewmodel : CarScreenViewmodel by viewModels()
        val profileViewmodel : profileViewmodel by viewModels()
        val chatScreenViewmodel : chatScreenViewmodel by viewModels()
        val currentChatsViewmodel : currentChatsViewmodel by viewModels()




        setContent {
            PFGCarActionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {



                    NavigationManager(
                        registerViewmodel,
                        initScreenViewmodel,
                        q1Viewmodel,
                        q2Viewmodel,
                        loginViewmodel,
                        homeScreenViewmodel,
                        uploadCarViewmodel,
                        carMakesViewmodel,
                        carModelViewmodel,
                        carLocationViewmodel,
                        carScreenViewmodel,
                        profileViewmodel,
                        chatScreenViewmodel,
                        currentChatsViewmodel
                    )
                }
            }
        }
    }
}

