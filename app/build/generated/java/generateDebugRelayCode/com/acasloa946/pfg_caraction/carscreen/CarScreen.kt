package com.acasloa946.pfg_caraction.carscreen

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
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'car_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun CarScreen(
    modifier: Modifier = Modifier,
    makeText: String = "",
    modelText: String = "",
    plateText: String = "",
    localizationText: String = "",
    yearText: String = "",
    kmText: String = "",
    transText: String = "",
    fuelText: String = "",
    priceText: String = "",
    onContactClick: () -> Unit = {},
    onFavClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Banner(modifier = Modifier.rowWeight(1.0f)) {
            MaterialSymbolsMenu(
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
        MainCarScreen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            FrameUsername {
                UserName()
                UserImage {
                    UserImageSynth {
                        Elipe()
                    }
                    UserImageVECVEC(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -0.0002689361572265625.dp,
                                y = 0.0001354217529296875.dp
                            )
                        )
                    )
                }
            }
            ImageFrame {}
            MapFrame {}
            FieldMake {
                Rectangle2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Marca(
                    makeText = makeText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            FieldModel {
                RC(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Modelo(
                    modelText = modelText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            FieldPlate {
                Rectangle(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                MatrCula(
                    plateText = plateText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            FieldLocalization {
                Rectangle3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                LocalizaciN(
                    localizationText = localizationText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            FieldAO {
                RC2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                AO(
                    yearText = yearText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            FieldKM {
                RC3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                KMS(
                    kmText = kmText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            FieldTrans {
                RC6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Trans(
                    transText = transText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            FieldFuel {
                RC7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Fueld(
                    fuelText = fuelText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            FieldPrice {
                RC4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Precio(
                    priceText = priceText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            ButtonContact(onContactClick = onContactClick) {
                RectanglePublish(
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
                            x = 129.12752151489258.dp,
                            y = 0.00008106231689453125.dp
                        )
                    )
                )
                ContactarConVendedor(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -0.5.dp
                        )
                    )
                )
            }
            ButtonFavs(onFavClick = onFavClick) {
                RectangleFav(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                VectorFav(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 129.12752151489258.dp,
                            y = 0.00008106231689453125.dp
                        )
                    )
                )
                FavText(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.13232421875.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 1295)
@Composable
private fun CarScreenPreview() {
    MaterialTheme {
        RelayContainer {
            CarScreen(
                onContactClick = {},
                onFavClick = {},
                makeText = "Marca ",
                modelText = "Modelo",
                plateText = "Matrícula",
                localizationText = "Localización",
                yearText = "Año",
                kmText = "KMS",
                transText = "Tranmisión\n",
                fuelText = "Combustible\n",
                priceText = "Precio ",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_vector),
        modifier = modifier.requiredWidth(31.13372039794922.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun MaterialSymbolsMenu(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(41.511627197265625.dp).requiredHeight(50.0.dp)
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
fun UserName(modifier: Modifier = Modifier) {
    RelayText(
        content = "UserName",
        fontSize = 12.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.6039999326070147.em,
        modifier = modifier
    )
}

@Composable
fun Elipe(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_elipe),
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
        vector = painterResource(R.drawable.car_screen_user_image_vecvec),
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
fun FrameUsername(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
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
fun MapFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(268.0.dp)
    )
}

@Composable
fun Rectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rectangle_2),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
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
fun FieldMake(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun RC(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rc),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
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
fun FieldModel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun Rectangle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rectangle),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun MatrCula(
    plateText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = plateText,
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
fun FieldPlate(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun Rectangle3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rectangle3),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun LocalizaciN(
    localizationText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = localizationText,
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
fun FieldLocalization(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun RC2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rc2),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun AO(
    yearText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = yearText,
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
fun FieldAO(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun RC3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rc3),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun KMS(
    kmText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = kmText,
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
fun FieldKM(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun RC6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rc6),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun Trans(
    transText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = transText,
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
fun FieldTrans(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun RC7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rc7),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun Fueld(
    fuelText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = fuelText,
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
fun FieldFuel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun RC4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rc4),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun Precio(
    priceText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = priceText,
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
fun FieldPrice(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp).relayDropShadow(
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
fun RectanglePublish(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rectangle_publish),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun VectorPublish(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_vector_publish),
        modifier = modifier.requiredWidth(11.563636779785156.dp).requiredHeight(18.66666603088379.dp)
    )
}

@Composable
fun ContactarConVendedor(modifier: Modifier = Modifier) {
    RelayText(
        content = "Contactar con vendedor",
        fontSize = 18.0.sp,
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
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun ButtonContact(
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onContactClick).requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun RectangleFav(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_rectangle_fav),
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun VectorFav(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.car_screen_vector_fav),
        modifier = modifier.requiredWidth(11.563636779785156.dp).requiredHeight(18.66666603088379.dp)
    )
}

@Composable
fun FavText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Añadir a favoritos",
        fontSize = 18.0.sp,
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
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun ButtonFavs(
    onFavClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onFavClick).requiredWidth(318.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun MainCarScreen(
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
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
