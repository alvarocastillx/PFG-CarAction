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
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.InitScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen.Q2Viewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.ui.theme.PFGCarActionTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val registerViewmodel: RegisterViewmodel by viewModels()
        val initScreenViewmodel: InitScreenViewmodel by viewModels()
        val q1Viewmodel : Q1Viewmodel by viewModels()
        val q2Viewmodel : Q2Viewmodel by viewModels()


        setContent {
            PFGCarActionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationManager(registerViewmodel,initScreenViewmodel, q1Viewmodel, q2Viewmodel)
                }
            }
        }
    }
}

