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
import com.acasloa946.pfg_caraction.UserInterface.RegisterScreen.RegisterViewmodel
import com.acasloa946.pfg_caraction.ui.theme.PFGCarActionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val registerViewmodel: RegisterViewmodel by viewModels()


        setContent {
            PFGCarActionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationManager(registerViewmodel)
                }
            }
        }
    }
}

