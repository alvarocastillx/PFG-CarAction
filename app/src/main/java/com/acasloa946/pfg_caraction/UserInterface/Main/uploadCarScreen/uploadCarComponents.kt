package com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
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
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.acasloa946.pfg_caraction.uploadcarscreen.Banner
import com.acasloa946.pfg_caraction.uploadcarscreen.BannerImage
import com.acasloa946.pfg_caraction.uploadcarscreen.MainUploadScreen
import com.acasloa946.pfg_caraction.uploadcarscreen.MaterialSymbolsMenu
import com.acasloa946.pfg_caraction.uploadcarscreen.TopLevel
import com.acasloa946.pfg_caraction.uploadcarscreen.UploadIcon
import com.acasloa946.pfg_caraction.uploadcarscreen.UploadImageFrame
import com.acasloa946.pfg_caraction.uploadcarscreen.UploadVector
import com.acasloa946.pfg_caraction.uploadcarscreen.Vector
import com.google.relay.compose.RelayText

@Composable
fun UploadCarScreenComponent(
    modifier: Modifier = Modifier,
    rightMenuClick: () -> Unit = {},
    uploadImageClick: () -> Unit = {},
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
                Image(painter = painterResource(id = R.drawable.image_banner), contentDescription = null,
                    modifier = Modifier.fillMaxSize())
            }
        }
        MainUploadScreen(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)) {
            if (uploadCarViewmodel.selectedImageUri != null) {
                Column(
                    modifier = Modifier.size(100.dp)
                ) {

                    SubcomposeAsyncImage(
                        model = uploadCarViewmodel.selectedImageUri,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        loading = {
                            CircularProgressIndicator(
                                modifier = Modifier.size(
                                    100.dp
                                ), color = Color(0xFF1ACE4D)
                            )
                        }
                    )
                }
            }
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
            Column (
                modifier = Modifier.size(200.dp)
            ){
                var expanded by remember { mutableStateOf(false) }
                DropdownMenu(expanded = expanded, onDismissRequest = { /*TODO*/ },) {
                    DropdownMenuItem(text = {
                        Text("1")
                    }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text ={
                        Text("2")
                    }, onClick = { /*TODO*/ })
                }
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


