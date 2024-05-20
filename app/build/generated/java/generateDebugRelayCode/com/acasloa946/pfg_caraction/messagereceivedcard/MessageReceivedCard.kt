package com.acasloa946.pfg_caraction.messagereceivedcard

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'message_received_card'.
 * Generated code; do not edit directly
 */
@Composable
fun MessageReceivedCard(
    modifier: Modifier = Modifier,
    messageContentText: String = ""
) {
    TopLevel(modifier = modifier) {
        MessageText(messageContentText = messageContentText)
    }
}

@Preview(widthDp = 130, heightDp = 39)
@Composable
private fun MessageReceivedCardPreview() {
    MaterialTheme {
        MessageReceivedCard(messageContentText = "Message Received")
    }
}

@Composable
fun MessageText(
    messageContentText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = messageContentText,
        fontSize = 12.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.6039999326070147.em,
        textAlign = TextAlign.Left,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
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
            red = 230,
            green = 50,
            blue = 75
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        radius = 25.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier
    )
}
