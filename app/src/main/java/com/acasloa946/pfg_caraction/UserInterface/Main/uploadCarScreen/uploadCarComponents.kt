package com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.acasloa946.pfg_caraction.uploadcarscreen.Banner
import com.acasloa946.pfg_caraction.uploadcarscreen.BannerImage
import com.acasloa946.pfg_caraction.uploadcarscreen.ButtonMake
import com.acasloa946.pfg_caraction.uploadcarscreen.ButtonModel
import com.acasloa946.pfg_caraction.uploadcarscreen.ImageFrame
import com.acasloa946.pfg_caraction.uploadcarscreen.MainUploadScreen
import com.acasloa946.pfg_caraction.uploadcarscreen.Marca
import com.acasloa946.pfg_caraction.uploadcarscreen.MaterialSymbolsMenu
import com.acasloa946.pfg_caraction.uploadcarscreen.Modelo
import com.acasloa946.pfg_caraction.uploadcarscreen.Rectangle
import com.acasloa946.pfg_caraction.uploadcarscreen.Rectangle2
import com.acasloa946.pfg_caraction.uploadcarscreen.TextFieldKM
import com.acasloa946.pfg_caraction.uploadcarscreen.TextFieldPlate
import com.acasloa946.pfg_caraction.uploadcarscreen.TextFieldPrice
import com.acasloa946.pfg_caraction.uploadcarscreen.TextFieldYear
import com.acasloa946.pfg_caraction.uploadcarscreen.TopLevel
import com.acasloa946.pfg_caraction.uploadcarscreen.UploadIcon
import com.acasloa946.pfg_caraction.uploadcarscreen.UploadImageFrame
import com.acasloa946.pfg_caraction.uploadcarscreen.UploadText
import com.acasloa946.pfg_caraction.uploadcarscreen.UploadVector
import com.acasloa946.pfg_caraction.uploadcarscreen.Vector
import com.acasloa946.pfg_caraction.uploadcarscreen.VectorNext1
import com.acasloa946.pfg_caraction.uploadcarscreen.VectorNext2
import com.google.relay.compose.RelayText

@Composable
fun UploadCarScreenComponent(
    modifier: Modifier = Modifier,
    rightMenuClick: () -> Unit = {},
    uploadImageClick: () -> Unit = {},
    onMakeClick : () -> Unit = {},
    onModelClick : () -> Unit = {},
    uploadCarViewmodel: uploadCarViewmodel
) {
    TopLevel(modifier = modifier) {
        Banner(modifier = Modifier
            .rowWeight(1.0f)
            .clip(BottomRoundedShape(60.dp))
            .border(2.dp, RojoMain, BottomRoundedShape(60.dp))) {
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
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_banner),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        MainUploadScreen(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)) {
            UploadImageFrame(
                uploadImageClick = uploadImageClick,
                modifier = Modifier.rowWeight(1.0f)
            ) {
                UploadIcon {
                    UploadVector(modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f))
                }
                UploadTextComponent()
            }
            ImageFrame {

            }
            TextFieldPlate {
                TextField(
                    value = "", onValueChange = {
                        ""
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = RojoMain,
                        unfocusedBorderColor = BlancoMain,
                        focusedLabelColor = BlancoMain,
                        unfocusedLabelColor = BlancoMain,
                        unfocusedTextColor = BlancoMain,
                        focusedTextColor = BlancoMain
                    ),
                    placeholder = {
                        Text("KM.", color = BlancoMain, fontSize = 15.sp)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email , contentDescription = null)
                    }
                )

            }
            Spacer(modifier = Modifier.padding(5.dp))
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
                Marca(makeText = uploadCarViewmodel.makeButtonText,
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
                Modelo(modelText = uploadCarViewmodel.modelButtonText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.000030517578125.dp,
                            y = 0.9825668334960938.dp
                        )
                    )
                )
            }
            TextFieldYear {
                TextField(
                    value = "", onValueChange = {
                        ""
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = RojoMain,
                        unfocusedBorderColor = BlancoMain,
                        focusedLabelColor = BlancoMain,
                        unfocusedLabelColor = BlancoMain,
                        unfocusedTextColor = BlancoMain,
                        focusedTextColor = BlancoMain
                    ),
                    placeholder = {
                        Text("KM.", color = BlancoMain, fontSize = 15.sp)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email , contentDescription = null)
                    }
                )
            }
            TextFieldKM {
                TextField(
                    value = "", onValueChange = {
                        ""
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = RojoMain,
                        unfocusedBorderColor = BlancoMain,
                        focusedLabelColor = BlancoMain,
                        unfocusedLabelColor = BlancoMain,
                        unfocusedTextColor = BlancoMain,
                        focusedTextColor = BlancoMain
                    ),
                    placeholder = {
                        Text("KM.", color = BlancoMain, fontSize = 15.sp)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email , contentDescription = null)
                    }
                )
            }
            TextFieldPrice {
                TextField(
                    value = "", onValueChange = {
                        ""
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = RojoMain,
                        unfocusedBorderColor = BlancoMain,
                        focusedLabelColor = BlancoMain,
                        unfocusedLabelColor = BlancoMain,
                        unfocusedTextColor = BlancoMain,
                        focusedTextColor = BlancoMain
                    ),
                    placeholder = {
                        Text("KM.", color = BlancoMain, fontSize = 15.sp)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email , contentDescription = null)
                    }
                )
            }
        }
    }
}

@Composable
fun UploadTextComponent(modifier: Modifier = Modifier) {
    RelayText(
        content = "Subir fotografías",
        fontSize = 18.0.sp,
        fontFamily = raillincFont,
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

/*
Image(
                    painter = painterResource(id = R.drawable.image_banner),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )


                modifier = Modifier
                .rowWeight(1.0f)
                .clip(BottomRoundedShape(60.dp))
                .border(2.dp, RojoMain, BottomRoundedShape(60.dp))
 */
