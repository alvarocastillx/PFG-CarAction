package com.acasloa946.pfg_caraction.bottomnavbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.acasloa946.pfg_caraction.R
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'bottom_nav_bar'.
 * Generated code; do not edit directly
 */
@Composable
fun BottomNavBar(
    modifier: Modifier = Modifier,
    onHomeClick: () -> Unit = {},
    onCarClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        FrameHomeIcon(onHomeClick = onHomeClick) {
            HomeIcon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -3.5.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                HomeVector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
        }
        VerticalLine()
        FrameCarIcon(onCarClick = onCarClick) {
            UploadCarIcon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 0.5.dp
                    )
                )
            ) {
                CarVector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.9875001907348633.dp,
                            y = -0.9999980926513672.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 345, heightDp = 58)
@Composable
private fun BottomNavBarPreview() {
    MaterialTheme {
        BottomNavBar(
            onHomeClick = {},
            onCarClick = {}
        )
    }
}

@Composable
fun HomeVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.bottom_nav_bar_home_vector),
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun HomeIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun FrameHomeIcon(
    onHomeClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onHomeClick).requiredWidth(171.0.dp).requiredHeight(58.0.dp)
    )
}

@Composable
fun VerticalLine(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.bottom_nav_bar_vertical_line),
        modifier = modifier.requiredWidth(1.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun CarVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.bottom_nav_bar_car_vector),
        modifier = modifier.requiredWidth(20.975000381469727.dp).requiredHeight(20.000003814697266.dp)
    )
}

@Composable
fun UploadCarIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(23.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun FrameCarIcon(
    onCarClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onCarClick).requiredWidth(171.0.dp).requiredHeight(58.0.dp)
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
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 1.0.dp,
            top = 0.0.dp,
            end = 1.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier
    )
}
