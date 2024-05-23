package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.initscreenandroidlarge.ButtonLogin
import com.acasloa946.pfg_caraction.initscreenandroidlarge.ButtonRegister
import com.acasloa946.pfg_caraction.initscreenandroidlarge.ButtonsFrame
import com.acasloa946.pfg_caraction.initscreenandroidlarge.ImageCarAction
import com.acasloa946.pfg_caraction.initscreenandroidlarge.RectangleLog
import com.acasloa946.pfg_caraction.initscreenandroidlarge.RectangleREG
import com.acasloa946.pfg_caraction.initscreenandroidlarge.TextLogin
import com.acasloa946.pfg_caraction.initscreenandroidlarge.TextRegister
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.relayDropShadow
import androidx.compose.material.icons.filled.*
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.toastMaker


@Composable
fun InitScreenComponent(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    onRegisterClick: () -> Unit = {},
    initScreenViewmodel: InitScreenViewmodel,
    navController: NavController
) {

    val context = LocalContext.current
    val token = stringResource(R.string.default_web_client_id)

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult(),
    ) {
        initScreenViewmodel.googleAuth(it, onFailure = {
                toastMaker("Error al iniciar sesión con Google",context)
        },
            onSuccessCreateAccount = {
                toastMaker("Su cuenta se ha creado correctamente",context)
                navController.navigate(Routes.Q1Screen.route)
            },
            onSuccessSignIn = {
                toastMaker("Se ha iniciado sesión correctamente",context)
                navController.navigate(Routes.SplashScreen.route)
            },
            context)
    }

    TopLevelComponent(
        modifier = modifier
            .clip(BottomRoundedShape(60.dp))
            .border(2.dp, RojoMain, BottomRoundedShape(60.dp))
    ) {
        ImageCarAction()
        WelcomeTextComponent()
        ButtonsFrame {
            ButtonLogin(onLoginClick = onLoginClick) {
                RectangleLog(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                TextLogin(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.42423248291015625.dp,
                            y = -0.2809486389160156.dp
                        )
                    )
                )
            }
            ButtonRegister(onRegisterClick = onRegisterClick) {
                RectangleREG(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                TextRegister(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.16666698455810547.dp
                        )
                    )
                )
            }
            Button(onClick = {

                val gso = GoogleSignInOptions
                    .Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestIdToken(token)
                    .requestEmail()
                    .build()
                val googleSignInClient = GoogleSignIn.getClient(context, gso)
                launcher.launch(googleSignInClient.signInIntent)
            }) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(text = "Iniciar sesión con Google")

                }
            }
        }
    }
}

@Composable
fun TopLevelComponent(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        padding = PaddingValues(
            start = 50.0.dp,
            top = 40.0.dp,
            end = 50.0.dp,
            bottom = 40.0.dp
        ),
        itemSpacing = 45.0,
        clipToParent = false,
        strokeWidth = 10.0,
        borderAlignment = BorderAlignment.Outside,
        strokeColor = RojoMain,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
            .relayDropShadow(
                color = Color(
                    alpha = 63,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                borderRadius = 0.0.dp,
                blur = 45.20000076293945.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}


@Composable
fun WelcomeTextComponent(modifier: Modifier = Modifier) {
    RelayText(
        content = "¡Bienvenido a CarAction!",
        fontSize = 20.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.6039999008178711.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

fun BottomRoundedShape(cornerSize: Dp): RoundedCornerShape {
    return RoundedCornerShape(
        topStart = 0.dp,
        topEnd = 0.dp,
        bottomEnd = cornerSize,
        bottomStart = cornerSize
    )
}


