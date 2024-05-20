package com.acasloa946.pfg_caraction.chatscreen

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.R
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'chat_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun ChatScreen(
    modifier: Modifier = Modifier,
    userNameText: String = ""
) {
    TopLevel(modifier = modifier) {
        MainFrame(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 28.5.dp
                )
            )
        ) {
            Class1Line(modifier = Modifier.rowWeight(1.0f))
            ChatFrame(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
            Class2Line(modifier = Modifier.rowWeight(1.0f))
            ChatBar(modifier = Modifier.rowWeight(1.0f)) {}
        }
        UserNameFrame(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -371.5.dp
                )
            )
        ) {
            USERNAME(
                userNameText = userNameText,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 16.0.dp
                    )
                )
            )
            UserImage(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.1838235855102539.dp,
                        y = -8.316176414489746.dp
                    )
                )
            ) {
                UserImageSynth {
                    Elipe()
                }
                UserImageVECVEC(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.0002689361572265625.dp,
                            y = -0.0001087188720703125.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun ChatScreenPreview() {
    MaterialTheme {
        RelayContainer {
            ChatScreen(
                userNameText = "USERNAME",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Class1Line(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.chat_screen_1line),
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(1.0.dp)
    )
}

@Composable
fun ChatFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class2Line(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.chat_screen_2line),
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(1.0.dp)
    )
}

@Composable
fun ChatBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 15.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(42.0.dp)
    )
}

@Composable
fun MainFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        padding = PaddingValues(
            start = 19.0.dp,
            top = 5.0.dp,
            end = 19.0.dp,
            bottom = 18.0.dp
        ),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(743.0.dp)
    )
}

@Composable
fun USERNAME(
    userNameText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = userNameText,
        fontSize = 12.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.6039999326070147.em,
        modifier = modifier
    )
}

@Composable
fun Elipe(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.chat_screen_elipe),
        modifier = modifier.requiredWidth(26.367647171020508.dp).requiredHeight(26.367647171020508.dp)
    )
}

@Composable
fun UserImageSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun UserImageVECVEC(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.chat_screen_user_image_vecvec),
        modifier = modifier.requiredWidth(13.400312423706055.dp).requiredHeight(16.463132858276367.dp)
    )
}

@Composable
fun UserImage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun UserNameFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(57.0.dp)
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
            red = 53,
            green = 54,
            blue = 52
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
