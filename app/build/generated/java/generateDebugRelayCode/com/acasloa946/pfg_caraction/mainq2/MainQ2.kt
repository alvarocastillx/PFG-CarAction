package com.acasloa946.pfg_caraction.mainq2

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
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow

/**
 * This composable was generated from the UI Package 'main_q2'.
 * Generated code; do not edit directly
 */
@Composable
fun MainQ2(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        CarActionImage()
        QuDeseasHacer()
        ButtonsQS {
            ButtonSell {
                RectangleSell(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Textsell(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.500244140625.dp,
                            y = -3.0.dp
                        )
                    )
                )
            }
            ButtonBuy {
                RectangleBuy(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Textbuy(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0863189697265625.dp,
                            y = -1.2659568786621094.dp
                        )
                    )
                )
            }
        }
        Frame1 {
            Ellipse2()
            Ellipse3()
        }
    }
}

@Preview(widthDp = 360, heightDp = 695)
@Composable
private fun MainQ2Preview() {
    MaterialTheme {
        RelayContainer {
            MainQ2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun CarActionImage(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.main_q2_car_action_image),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(245.0.dp).requiredHeight(246.0.dp)
    )
}

@Composable
fun QuDeseasHacer(modifier: Modifier = Modifier) {
    RelayText(
        content = "¿Qué deseas hacer?",
        fontSize = 22.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.603999918157404.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun RectangleSell(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_q2_rectangle_sell),
        modifier = modifier.requiredWidth(253.5.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun Textsell(modifier: Modifier = Modifier) {
    RelayText(
        content = "Vender un coche",
        fontSize = 15.0.sp,
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
        modifier = modifier.requiredWidth(245.0.dp).requiredHeight(21.0.dp)
    )
}

@Composable
fun ButtonSell(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(253.5.dp).requiredHeight(33.0.dp).relayDropShadow(
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
fun RectangleBuy(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_q2_rectangle_buy),
        modifier = modifier.requiredWidth(260.02105712890625.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun Textbuy(modifier: Modifier = Modifier) {
    RelayText(
        content = "Comprar un coche",
        fontSize = 15.0.sp,
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
        modifier = modifier.requiredWidth(259.1150817871094.dp).requiredHeight(22.46808624267578.dp)
    )
}

@Composable
fun ButtonBuy(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(260.02105712890625.dp).requiredHeight(33.0.dp).relayDropShadow(
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
fun ButtonsQS(
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
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_q2_ellipse_2),
        modifier = modifier.requiredWidth(13.0.dp).requiredHeight(13.0.dp)
    )
}

@Composable
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_q2_ellipse_3),
        modifier = modifier.requiredWidth(13.0.dp).requiredHeight(13.0.dp)
    )
}

@Composable
fun Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 30.0,
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
        itemSpacing = 42.0,
        clipToParent = false,
        strokeWidth = 3.0,
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
