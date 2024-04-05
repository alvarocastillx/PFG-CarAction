package com.acasloa946.pfg_caraction.initscreenandroidlarge

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.R
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'init_screen_android_large'.
 * Generated code; do not edit directly
 */
@Composable
fun InitScreenAndroidLarge(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    onRegisterClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ImageCarAction()
        WelcomeText()
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
        }
    }
}

@Preview(widthDp = 360, heightDp = 711)
@Composable
private fun InitScreenAndroidLargePreview() {
    MaterialTheme {
        RelayContainer {
            InitScreenAndroidLarge(
                onLoginClick = {},
                onRegisterClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ImageCarAction(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.init_screen_android_large_image_car_action),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(245.0.dp).requiredHeight(246.0.dp)
    )
}

@Composable
fun WelcomeText(modifier: Modifier = Modifier) {
    RelayText(
        content = "¡Bienvenido a CarAction!",
        fontSize = 20.0.sp,
        fontFamily = raillinc,
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

@Composable
fun RectangleLog(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.init_screen_android_large_rectangle_log),
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(47.0.dp)
    )
}

@Composable
fun TextLogin(modifier: Modifier = Modifier) {
    RelayText(
        content = "Iniciar sesión",
        fontSize = 21.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.4479999542236328.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(139.1515350341797.dp).requiredHeight(30.43810272216797.dp)
    )
}

@Composable
fun ButtonLogin(
    onLoginClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.tappable(onTap = onLoginClick).requiredWidth(287.0.dp).requiredHeight(47.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 15.0.dp,
            blur = 45.0.dp,
            offsetX = 0.0.dp,
            offsetY = 11.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun RectangleREG(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.init_screen_android_large_rectangle_reg),
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(47.0.dp)
    )
}

@Composable
fun TextRegister(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registrarse",
        fontSize = 21.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.4479999542236328.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(160.0.dp).requiredHeight(31.33333396911621.dp)
    )
}

@Composable
fun ButtonRegister(
    onRegisterClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.tappable(onTap = onRegisterClick).requiredWidth(287.0.dp).requiredHeight(47.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 15.0.dp,
            blur = 45.0.dp,
            offsetX = 0.0.dp,
            offsetY = 1.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun ButtonsFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 11.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TopLevel(
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
        strokeWidth = 4.0,
        borderAlignment = BorderAlignment.Outside,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).relayDropShadow(
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
