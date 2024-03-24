package com.acasloa946.pfg_caraction.UserInterface.RegisterScreen

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
import com.acasloa946.pfg_caraction.UserInterface.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.registerscreen.ButtonRegister
import com.acasloa946.pfg_caraction.registerscreen.ImageCarAction
import com.acasloa946.pfg_caraction.registerscreen.RectangleReg
import com.acasloa946.pfg_caraction.registerscreen.TextFieldMail
import com.acasloa946.pfg_caraction.registerscreen.TextFieldPassw
import com.acasloa946.pfg_caraction.registerscreen.TextRegister
import com.acasloa946.pfg_caraction.registerscreen.TopLevel
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText

@Composable
fun RegisterScreenComponent(
    modifier: Modifier = Modifier,
    onRegisterClick: () -> Unit = {},
    registerViewmodel: RegisterViewmodel
) {
    TopLevel(modifier = modifier
        .clip(BottomRoundedShape(60.dp))
        .border(
            2.dp, RojoMain,
            BottomRoundedShape(60.dp)
        )) {
        ImageCarAction()
        RegisterTextComponent()
        TextFieldMail {
            TextField(
                value = registerViewmodel.textFieldEmail, onValueChange = {
                    registerViewmodel.changeTextFieldMail(it)
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
        TextFieldPassw {
            TextField(
                value = registerViewmodel.textFieldPassword, onValueChange = {
                    registerViewmodel.changeTextFieldPassword(it)
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
                    if (!registerViewmodel.passWordVisible) {
                        Icon(imageVector = Icons.Default.Lock , contentDescription = null, modifier = Modifier.clickable {

                            registerViewmodel.setPasswordVisibility()
                        })
                    }
                    else {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null,modifier = Modifier.clickable {
                            registerViewmodel.setPasswordVisibility()
                        })
                    }
                },
                visualTransformation = if (registerViewmodel.passWordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
        }
        ButtonRegister(onRegisterClick = onRegisterClick) {
            RectangleReg(
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
fun RegisterTextComponent(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registro",
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