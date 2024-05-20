package com.acasloa946.pfg_caraction.carcard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.R
import com.google.relay.compose.RelayContainer
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
    makeModelText: String = "",
    priceText: String = "",
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
        PriceText(priceText = priceText)
    }
}

@Preview(widthDp = 392, heightDp = 229)
@Composable
private fun CarCardPreview() {
    MaterialTheme {
        CarCard(
            onCarClick = {},
            makeModelText = "Mercedes SL",
            priceText = "35.000€"
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
    makeModelText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = makeModelText,
        fontSize = 20.0.sp,
        fontFamily = against,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.3649999618530273.em,
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
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawRect(
                    brush = Brush.linearGradient(
                        0.0f to Color(
                            alpha = 255,
                            red = 53,
                            green = 54,
                            blue = 52
                        ),
                        Float.POSITIVE_INFINITY to Color(
                            alpha = 255,
                            red = 230,
                            green = 50,
                            blue = 75
                        ),
                        start = Offset(
                            0.5f,
                            0.0f
                        ),
                        end = Offset(
                            0.5f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).tappable(onTap = onCarClick)
    )
}
