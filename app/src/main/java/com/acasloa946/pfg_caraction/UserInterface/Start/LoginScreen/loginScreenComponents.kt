package com.acasloa946.pfg_caraction.UserInterface.Start.LoginScreen

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.mainlogin.CarActionImage
import com.acasloa946.pfg_caraction.mainlogin.IniciarSesiN
import com.acasloa946.pfg_caraction.mainlogin.InicioDeSesiN
import com.acasloa946.pfg_caraction.mainlogin.LoginButton
import com.acasloa946.pfg_caraction.mainlogin.Rectangle2
import com.acasloa946.pfg_caraction.mainlogin.TextFieldMail
import com.acasloa946.pfg_caraction.mainlogin.TextFieldPassword
import com.acasloa946.pfg_caraction.mainlogin.TopLevel
import com.acasloa946.pfg_caraction.mainlogin.raillinc
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText

@Composable
fun MainLoginComponents(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    loginViewmodel: loginViewmodel
) {
    TopLevel(modifier = modifier
        .clip(BottomRoundedShape(60.dp))
        .border(
            2.dp, RojoMain,
            BottomRoundedShape(60.dp)
        )) {
        CarActionImage()
        TextLoginComponent()
        TextFieldMail {
            TextField(
                value = loginViewmodel.textFieldEmail, onValueChange = {
                    loginViewmodel.changeMail(it)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = RojoMain,
                    unfocusedBorderColor = GrisMain,
                    focusedLabelColor = BlancoMain,
                    unfocusedLabelColor = BlancoMain,
                    unfocusedTextColor = GrisMain,
                    focusedTextColor = GrisMain
                ),
                placeholder = {
                    Text("Introduzca su correo electrónico", color = Color.Black, fontSize = 15.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email , contentDescription = null)
                }
            )

        }
        TextFieldPassword {
            TextField(
                value = loginViewmodel.textFieldPassw, onValueChange = {
                    loginViewmodel.changePassw(it)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = RojoMain,
                    unfocusedBorderColor = GrisMain,
                    focusedLabelColor = BlancoMain,
                    unfocusedLabelColor = BlancoMain,
                    unfocusedTextColor = GrisMain,
                    focusedTextColor = GrisMain
                ),
                placeholder = {
                    Text("Introduzca su contraseña", color = Color.Black, fontSize = 15.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    if (!loginViewmodel.passwordVisible) {
                        Icon(imageVector = Icons.Default.Lock , contentDescription = null, modifier = Modifier.clickable {

                            loginViewmodel.changePasswVisibility()
                        })
                    }
                    else {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null,modifier = Modifier.clickable {
                            loginViewmodel.changePasswVisibility()
                        })
                    }
                },
                visualTransformation = if (loginViewmodel.passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

        }
        LoginButton(onLoginClick = onLoginClick) {
            Rectangle2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            IniciarSesiN(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.CenterEnd,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 2.5.dp
                    )
                )
            )
        }
    }
}


@Composable
fun TextLoginComponent(modifier: Modifier = Modifier) {
    RelayText(
        content = "Inicio de sesión",
        fontSize = 26.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.603999944833609.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}