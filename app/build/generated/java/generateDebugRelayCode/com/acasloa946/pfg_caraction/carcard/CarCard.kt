package com.acasloa946.pfg_caraction.carcard

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'car_card'.
 * Generated code; do not edit directly
 */
@Composable
fun CarCard(
    modifier: Modifier = Modifier,
    makeModelText: AnnotatedString = AnnotatedString(""),
    priceText: String = "",
    locationText: AnnotatedString = AnnotatedString(""),
    yearText: AnnotatedString = AnnotatedString(""),
    kmText: AnnotatedString = AnnotatedString(""),
    transText: AnnotatedString = AnnotatedString(""),
    fuelTypeText: AnnotatedString = AnnotatedString(""),
    onCarClick: () -> Unit = {}
) {
    TopLevel(
        onCarClick = onCarClick,
        modifier = modifier
    ) {
        FrameImage {}
        Line1()
        MakeModelText(makeModelText = makeModelText)
        Line2()
        Frame1 {
            LocationText(locationText = locationText)
            YearText(yearText = yearText)
        }
        Frame2 {
            KMText(kmText = kmText)
        }
        Frame4 {
            TransType(transText = transText)
        }
        Frame3 {
            FuelTypeText(fuelTypeText = fuelTypeText)
        }
        Line3()
        PriceText(priceText = priceText)
    }
}

@Preview(widthDp = 392, heightDp = 411)
@Composable
private fun CarCardPreview() {
    MaterialTheme {
        CarCard(
            onCarClick = {},
            makeModelText = buildAnnotatedString {
                append("Mercedes ")
                withStyle(
                    style = SpanStyle(
                        fontFamily = kaiseiHarunoUmi,
                        fontWeight = FontWeight(400.0.toInt())
                    )
                ) {
                    append("SL")
                }
            },
            priceText = "35.000€",
            locationText = buildAnnotatedString {
                append("Localización: ")
                withStyle(
                    style = SpanStyle(
                        fontFamily = kaiseiHarunoUmi,
                        fontWeight = FontWeight(400.0.toInt())
                    )
                ) {
                    append("Málaga")
                }
            },
            yearText = buildAnnotatedString {
                append("Año: ")
                withStyle(
                    style = SpanStyle(
                        fontFamily = kaiseiHarunoUmi,
                        fontWeight = FontWeight(400.0.toInt())
                    )
                ) {
                    append("2024")
                }
            },
            kmText = buildAnnotatedString {
                append("Kilometraje: ")
                withStyle(
                    style = SpanStyle(
                        fontFamily = kaiseiHarunoUmi,
                        fontWeight = FontWeight(400.0.toInt())
                    )
                ) {
                    append("192.000km")
                }
            },
            transText = buildAnnotatedString {
                append("Tipo de transmisión: ")
                withStyle(
                    style = SpanStyle(
                        fontFamily = kaiseiHarunoUmi,
                        fontWeight = FontWeight(400.0.toInt())
                    )
                ) {
                    append("192cv.")
                }
            },
            fuelTypeText = buildAnnotatedString {
                append("Tipo de combustible: ")
                withStyle(
                    style = SpanStyle(
                        fontFamily = kaiseiHarunoUmi,
                        fontWeight = FontWeight(400.0.toInt())
                    )
                ) {
                    append("Gasolina")
                }
            }
        )
    }
}

@Composable
fun FrameImage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(195.0.dp).requiredHeight(133.0.dp)
    )
}

@Composable
fun Line1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_card_line1),
        modifier = modifier.requiredWidth(392.0.dp).requiredHeight(2.0.dp)
    )
}

@Composable
fun MakeModelText(
    makeModelText: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = makeModelText,
        fontSize = 20.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Line2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_card_line2),
        modifier = modifier.requiredWidth(392.0.dp).requiredHeight(2.0.dp)
    )
}

@Composable
fun LocationText(
    locationText: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = locationText,
        fontSize = 12.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun YearText(
    yearText: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = yearText,
        fontSize = 12.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun KMText(
    kmText: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = kmText,
        fontSize = 12.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TransType(
    transText: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = transText,
        fontSize = 12.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun FuelTypeText(
    fuelTypeText: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = fuelTypeText,
        fontSize = 12.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Line3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_card_line3),
        modifier = modifier.requiredWidth(392.0.dp).requiredHeight(2.0.dp)
    )
}

@Composable
fun PriceText(
    priceText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = priceText,
        fontSize = 20.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevel(
    onCarClick: () -> Unit,
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
        padding = PaddingValues(
            start = 0.0.dp,
            top = 6.0.dp,
            end = 0.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 6.0,
        clipToParent = false,
        radius = 19.0,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.tappable(onTap = onCarClick)
    )
}
