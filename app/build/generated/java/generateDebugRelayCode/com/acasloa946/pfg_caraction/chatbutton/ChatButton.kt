package com.acasloa946.pfg_caraction.chatbutton

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'chat_button'.
 * Generated code; do not edit directly
 */
@Composable
fun ChatButton(
    modifier: Modifier = Modifier,
    chatUsernameText: String = "",
    onChatClick: () -> Unit = {}
) {
    TopLevel(
        onChatClick = onChatClick,
        modifier = modifier
    ) {
        TopLevelSynth(modifier = Modifier.rowWeight(1.0f)) {
            UserNameText(chatUsernameText = chatUsernameText)
        }
        Vector(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 134.0.dp,
                    y = -0.49983692169189453.dp
                )
            )
        )
    }
}

@Preview(widthDp = 344, heightDp = 46)
@Composable
private fun ChatButtonPreview() {
    MaterialTheme {
        RelayContainer {
            ChatButton(
                onChatClick = {},
                chatUsernameText = "Username",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun UserNameText(
    chatUsernameText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = chatUsernameText,
        fontSize = 18.0.sp,
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
        modifier = modifier.requiredWidth(326.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 2.0.dp,
            top = 9.0.dp,
            end = 2.0.dp,
            bottom = 9.0.dp
        ),
        itemSpacing = 10.0,
        radius = 15.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).alpha(alpha = 100.0f)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.chat_button_vector),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(18.33333396911621.dp)
    )
}

@Composable
fun TopLevel(
    onChatClick: () -> Unit,
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
        radius = 15.0,
        strokeWidth = 2.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.tappable(onTap = onChatClick).fillMaxWidth(1.0f).fillMaxHeight(1.0f).relayDropShadow(
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