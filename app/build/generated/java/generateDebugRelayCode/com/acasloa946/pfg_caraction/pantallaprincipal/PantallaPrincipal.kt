package com.acasloa946.pfg_caraction.pantallaprincipal

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'pantalla_principal'.
 * Generated code; do not edit directly
 */
@Composable
fun PantallaPrincipal(
    modifier: Modifier = Modifier,
    textWelcome: String = "",
    rightMenuClick: () -> Unit = {},
    onUserClick: () -> Unit = {},
    onFilterClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Banner(modifier = Modifier.rowWeight(1.0f)) {
            MaterialSymbolsMenu(
                rightMenuClick = rightMenuClick,
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
                            x = -0.000003814697265625.dp,
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
            BienvenidaCard(
                onUserClick = onUserClick,
                modifier = Modifier.rowWeight(1.0f)
            ) {
                TextWelcome(textWelcome = textWelcome)
                UserImage {
                    Elipe(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    UserImageVEC(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -0.000041961669921875.dp,
                                y = 0.000019073486328125.dp
                            )
                        )
                    ) {
                        UserImageVECVEC(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = 0.0000171661376953125.dp,
                                    y = 0.0001163482666015625.dp
                                )
                            )
                        )
                    }
                }
            }
            Linea1()
            FrameButtonsSearch(modifier = Modifier.rowWeight(1.0f)) {}
            Linea2()
            SearchBar(modifier = Modifier.rowWeight(1.0f)) {
                SearchBarFrame(modifier = Modifier.rowWeight(1.0f)) {}
                FilterIcon(onFilterClick = onFilterClick) {
                    FilterIconVector(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.24255084991455078.dp,
                                y = 0.3011016845703125.dp
                            )
                        )
                    )
                }
            }
            FrameCars(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun PantallaPrincipalPreview() {
    MaterialTheme {
        RelayContainer {
            PantallaPrincipal(
                rightMenuClick = {},
                onUserClick = {},
                textWelcome = "Bienvenido, User",
                onFilterClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_principal_vector),
        modifier = modifier.requiredWidth(31.13372039794922.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun MaterialSymbolsMenu(
    rightMenuClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = rightMenuClick).requiredWidth(41.511627197265625.dp).requiredHeight(50.0.dp)
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
fun TextWelcome(
    textWelcome: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textWelcome,
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
fun Elipe(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_principal_elipe),
        modifier = modifier.requiredWidth(26.367647171020508.dp).requiredHeight(26.367647171020508.dp)
    )
}

@Composable
fun UserImageVECVEC(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_principal_user_image_vecvec),
        modifier = modifier.requiredWidth(13.400312423706055.dp).requiredHeight(16.463132858276367.dp)
    )
}

@Composable
fun UserImageVEC(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(18.377450942993164.dp).requiredHeight(18.377450942993164.dp)
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
        modifier = modifier.requiredWidth(26.367647171020508.dp).requiredHeight(26.367647171020508.dp)
    )
}

@Composable
fun BienvenidaCard(
    onUserClick: () -> Unit,
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
            start = 21.0.dp,
            top = 4.0.dp,
            end = 21.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 182.0,
        clipToParent = false,
        radius = 15.0,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.tappable(onTap = onUserClick).fillMaxWidth(1.0f).requiredHeight(42.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 15.0.dp,
            blur = 6.900000095367432.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun Linea1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_principal_linea1),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun FrameButtonsSearch(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(45.0.dp)
    )
}

@Composable
fun Linea2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_principal_linea2),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun SearchBarFrame(
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
fun FilterIconVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_principal_filter_icon_vector),
        modifier = modifier.requiredWidth(24.8298282623291.dp).requiredHeight(13.601226806640625.dp)
    )
}

@Composable
fun FilterIcon(
    onFilterClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onFilterClick).requiredWidth(32.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(48.0.dp)
    )
}

@Composable
fun FrameCars(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
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
