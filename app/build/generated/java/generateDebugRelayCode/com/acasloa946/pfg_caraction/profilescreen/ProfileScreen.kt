package com.acasloa946.pfg_caraction.profilescreen

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
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'profile_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    userText: String = "",
    leftMenuClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Banner(modifier = Modifier.rowWeight(1.0f)) {
            MaterialSymbolsMenu(
                leftMenuClick = leftMenuClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 38.0.dp,
                        y = 26.0.dp
                    )
                )
            ) {
                Vector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.000476837158203125.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            BannerImage(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.0732574462890625.dp,
                        y = 0.0.dp
                    )
                )
            ) {}
        }
        MainHome(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Linea1()
            FrameProfile(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                FramePFP {
                    FramePFPSynth {
                        PFPCircle()
                    }
                    PFP(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.5.dp
                            )
                        )
                    ) {
                        Vector2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = -3.7496747970581055.dp,
                                    y = -22.249918937683105.dp
                                )
                            )
                        )
                        Vector1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = -3.751302719116211.dp,
                                    y = 13.208251953125.dp
                                )
                            )
                        )
                    }
                }
                UserName(userText = userText)
                Linea2()
                FrameUploadedCars {}
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun ProfileScreenPreview() {
    MaterialTheme {
        RelayContainer {
            ProfileScreen(
                leftMenuClick = {},
                userText = "UserName",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_screen_vector),
        modifier = modifier.requiredWidth(31.13372039794922.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun MaterialSymbolsMenu(
    leftMenuClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = leftMenuClick).requiredWidth(41.511627197265625.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun BannerImage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(83.85348510742188.dp).requiredHeight(96.0.dp)
    )
}

@Composable
fun Banner(
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
        isStructured = false,
        clipToParent = false,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(102.0.dp)
    )
}

@Composable
fun Linea1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_screen_linea1),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun PFPCircle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_screen_pfpcircle),
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(115.0.dp)
    )
}

@Composable
fun FramePFPSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_screen_vector2),
        modifier = modifier.requiredWidth(24.66666603088379.dp).requiredHeight(24.66666603088379.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_screen_vector1),
        modifier = modifier.requiredWidth(49.33333206176758.dp).requiredHeight(27.75.dp)
    )
}

@Composable
fun PFP(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun FramePFP(
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
fun UserName(
    userText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = userText,
        fontSize = 15.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.6039999643961587.em,
        modifier = modifier
    )
}

@Composable
fun Linea2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_screen_linea2),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun FrameUploadedCars(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(340.0.dp).requiredHeight(474.0.dp)
    )
}

@Composable
fun FrameProfile(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        padding = PaddingValues(
            start = 112.0.dp,
            top = 24.0.dp,
            end = 112.0.dp,
            bottom = 24.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MainHome(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        padding = PaddingValues(
            start = 8.0.dp,
            top = 0.0.dp,
            end = 8.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 6.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
