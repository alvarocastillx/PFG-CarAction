package com.acasloa946.pfg_caraction.mainq1

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
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'main_q1'.
 * Generated code; do not edit directly
 */
@Composable
fun MainQ1(
    modifier: Modifier = Modifier,
    onNextClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ImageCarAction()
        TextName()
        TextFieldName {}
        ButtonNext(onNextClick = onNextClick) {
            Rectangle2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 2.7535400390625.dp
                    )
                )
            )
            TexrNext(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 3.67144775390625.dp,
                        y = 2.7535400390625.dp
                    )
                )
            )
            ButtonNextGroup {
                RectangleButtonSell(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Siguiente(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 1.8357315063476562.dp,
                            y = 2.2945899963378906.dp
                        )
                    )
                )
            }
        }
        Frame1 {
            Ellipse3()
            Ellipse2()
        }
    }
}

@Preview(widthDp = 360, heightDp = 695)
@Composable
private fun MainQ1Preview() {
    MaterialTheme {
        RelayContainer {
            MainQ1(
                onNextClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ImageCarAction(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.main_q1_image_car_action),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(245.0.dp).requiredHeight(246.0.dp)
    )
}

@Composable
fun TextName(modifier: Modifier = Modifier) {
    RelayText(
        content = "¿Cómo te llamas?",
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
fun TextFieldName(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(288.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Rectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_q1_rectangle_2),
        modifier = modifier.requiredWidth(257.0.dp).requiredHeight(33.96071243286133.dp)
    )
}

@Composable
fun TexrNext(modifier: Modifier = Modifier) {
    RelayText(
        content = "Siguiente >",
        fontSize = 21.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(253.3285675048828.dp).requiredHeight(33.96071243286133.dp)
    )
}

@Composable
fun RectangleButtonSell(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_q1_rectangle_button_sell),
        modifier = modifier.requiredWidth(257.0.dp).requiredHeight(38.54999923706055.dp)
    )
}

@Composable
fun Siguiente(modifier: Modifier = Modifier) {
    RelayText(
        content = "Siguiente",
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
        modifier = modifier.requiredWidth(253.3285675048828.dp).requiredHeight(33.96071243286133.dp)
    )
}

@Composable
fun ButtonNextGroup(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(257.0.dp).requiredHeight(38.54999923706055.dp).relayDropShadow(
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
fun ButtonNext(
    onNextClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.tappable(onTap = onNextClick).requiredWidth(257.0.dp).requiredHeight(38.54999923706055.dp).relayDropShadow(
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
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_q1_ellipse_3),
        modifier = modifier.requiredWidth(13.0.dp).requiredHeight(13.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_q1_ellipse_2),
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
        itemSpacing = 49.0,
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
