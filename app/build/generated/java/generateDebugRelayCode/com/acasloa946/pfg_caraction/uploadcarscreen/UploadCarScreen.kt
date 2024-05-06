package com.acasloa946.pfg_caraction.uploadcarscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'upload_car_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun UploadCarScreen(
    modifier: Modifier = Modifier,
    makeText: String = "",
    modelText: String = "",
    rightMenuClick: () -> Unit = {},
    uploadImageClick: () -> Unit = {},
    onMakeClick: () -> Unit = {},
    onModelClick: () -> Unit = {},
    onPublishClick: () -> Unit = {},
    onLocationClick: () -> Unit = {}
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
                            x = 0.000011444091796875.dp,
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
        MainUploadScreen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            UploadImageFrame(
                uploadImageClick = uploadImageClick,
                modifier = Modifier.rowWeight(1.0f)
            ) {
                UploadIcon {
                    UploadVector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                UploadText()
            }
            ImageFrame {}
            TextFieldPlate {}
            ButtonMake(onMakeClick = onMakeClick) {
                Rectangle2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                VectorNext1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 129.12727737426758.dp,
                            y = 0.00008106231689453125.dp
                        )
                    )
                )
                Marca(
                    makeText = makeText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.000030517578125.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            ButtonModel(onModelClick = onModelClick) {
                Rectangle(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                VectorNext2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 129.12727737426758.dp,
                            y = 0.00008106231689453125.dp
                        )
                    )
                )
                Modelo(
                    modelText = modelText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.000030517578125.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            ButtonLocalization(onModelClick = onModelClick) {
                Rectangle3(
                    onLocationClick = onLocationClick,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                VectorNext3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 129.12727737426758.dp,
                            y = 0.00008106231689453125.dp
                        )
                    )
                )
                LocalizaciN(
                    modelText = modelText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.000030517578125.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            TextFieldYear {}
            TextFieldKM {}
            TextFieldPrice {}
            ButtonPublish(onPublishClick = onPublishClick) {
                RectanglePublish(
                    onLocationClick = onLocationClick,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                VectorPublish(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 129.12727737426758.dp,
                            y = 0.00008106231689453125.dp
                        )
                    )
                )
                PublicarAnuncio(
                    modelText = modelText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.000030517578125.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 925)
@Composable
private fun UploadCarScreenPreview() {
    MaterialTheme {
        RelayContainer {
            UploadCarScreen(
                rightMenuClick = {},
                uploadImageClick = {},
                onMakeClick = {},
                onModelClick = {},
                onPublishClick = {},
                makeText = "Marca ",
                modelText = "Publicar anuncio",
                onLocationClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_vector),
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
fun UploadVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_upload_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.833251953125.dp,
                top = 4.484375.dp,
                end = 6.833400726318359.dp,
                bottom = 3.416645050048828.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun UploadIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun UploadText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Subir fotografías",
        fontSize = 18.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.6039999855889215.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun UploadImageFrame(
    uploadImageClick: () -> Unit,
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
            start = 74.0.dp,
            top = 23.0.dp,
            end = 74.0.dp,
            bottom = 27.0.dp
        ),
        itemSpacing = 5.0,
        radius = 34.0,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.tappable(onTap = uploadImageClick).fillMaxWidth(1.0f)
    )
}

@Composable
fun ImageFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(131.0.dp)
    )
}

@Composable
fun TextFieldPlate(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun Rectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_rectangle_2),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun VectorNext1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_vector_next1),
        modifier = modifier.requiredWidth(11.563636779785156.dp).requiredHeight(18.66666603088379.dp)
    )
}

@Composable
fun Marca(
    makeText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = makeText,
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
        modifier = modifier.requiredWidth(314.14544677734375.dp).requiredHeight(36.35087585449219.dp)
    )
}

@Composable
fun ButtonMake(
    onMakeClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onMakeClick).requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 45.0.dp,
            offsetX = 0.0.dp,
            offsetY = 11.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun Rectangle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_rectangle),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun VectorNext2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_vector_next2),
        modifier = modifier.requiredWidth(11.563636779785156.dp).requiredHeight(18.66666603088379.dp)
    )
}

@Composable
fun Modelo(
    modelText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = modelText,
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
        modifier = modifier.requiredWidth(314.14544677734375.dp).requiredHeight(36.35087585449219.dp)
    )
}

@Composable
fun ButtonModel(
    onModelClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.tappable(onTap = onModelClick).requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun Rectangle3(
    onLocationClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_rectangle3),
        modifier = modifier.tappable(onTap = onLocationClick).requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun VectorNext3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_vector_next3),
        modifier = modifier.requiredWidth(11.563636779785156.dp).requiredHeight(18.66666603088379.dp)
    )
}

@Composable
fun LocalizaciN(
    modelText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = modelText,
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
        modifier = modifier.requiredWidth(314.14544677734375.dp).requiredHeight(36.35087585449219.dp)
    )
}

@Composable
fun ButtonLocalization(
    onModelClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.tappable(onTap = onModelClick).requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun TextFieldYear(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun TextFieldKM(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun TextFieldPrice(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun RectanglePublish(
    onLocationClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_rectangle_publish),
        modifier = modifier.tappable(onTap = onLocationClick).requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun VectorPublish(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_car_screen_vector_publish),
        modifier = modifier.requiredWidth(11.563636779785156.dp).requiredHeight(18.66666603088379.dp)
    )
}

@Composable
fun PublicarAnuncio(
    modelText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = modelText,
        fontSize = 21.0.sp,
        fontFamily = kaiseiHarunoUmi,
        color = Color(
            alpha = 255,
            red = 53,
            green = 54,
            blue = 52
        ),
        height = 1.4479999542236328.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(314.14544677734375.dp).requiredHeight(36.35087585449219.dp)
    )
}

@Composable
fun ButtonPublish(
    onPublishClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onPublishClick).requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun MainUploadScreen(
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
        itemSpacing = 10.0,
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
