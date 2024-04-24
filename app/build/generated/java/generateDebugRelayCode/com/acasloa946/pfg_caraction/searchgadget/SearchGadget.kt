package com.acasloa946.pfg_caraction.searchgadget

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'search_gadget'.
 * Generated code; do not edit directly
 */
@Composable
fun SearchGadget(
    modifier: Modifier = Modifier,
    gadgetText: String = "",
    onGadgetClicked: () -> Unit = {}
) {
    TopLevel(
        onGadgetClicked = onGadgetClicked,
        modifier = modifier
    ) {
        TopLevelSynth(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Image1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        TEXT(
            gadgetText = gadgetText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 0.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 104, heightDp = 32)
@Composable
private fun SearchGadgetPreview() {
    MaterialTheme {
        RelayContainer {
            SearchGadget(
                onGadgetClicked = {},
                gadgetText = "TEXT",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Image1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.search_gadget_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 27.0.dp,
            top = 3.0.dp,
            end = 27.0.dp,
            bottom = 3.0.dp
        ),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).alpha(alpha = 100.0f)
    )
}

@Composable
fun TEXT(
    gadgetText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = gadgetText,
        fontSize = 15.0.sp,
        fontFamily = zabalDEMO,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.2150000254313151.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(900.0.toInt()),
        italic = true,
        modifier = modifier
    )
}

@Composable
fun TopLevel(
    onGadgetClicked: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 53,
            green = 54,
            blue = 52
        ),
        isStructured = false,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.tappable(onTap = onGadgetClicked).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
