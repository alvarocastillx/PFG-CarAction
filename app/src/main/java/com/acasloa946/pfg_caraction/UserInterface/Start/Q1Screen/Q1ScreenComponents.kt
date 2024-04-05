package com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.mainq1.ButtonNext
import com.acasloa946.pfg_caraction.mainq1.ButtonNextGroup
import com.acasloa946.pfg_caraction.mainq1.Ellipse2
import com.acasloa946.pfg_caraction.mainq1.Ellipse3
import com.acasloa946.pfg_caraction.mainq1.Frame1
import com.acasloa946.pfg_caraction.mainq1.ImageCarAction
import com.acasloa946.pfg_caraction.mainq1.Rectangle2
import com.acasloa946.pfg_caraction.mainq1.RectangleButtonSell
import com.acasloa946.pfg_caraction.mainq1.Siguiente
import com.acasloa946.pfg_caraction.mainq1.TexrNext
import com.acasloa946.pfg_caraction.mainq1.TextFieldName
import com.acasloa946.pfg_caraction.mainq1.TextName
import com.acasloa946.pfg_caraction.mainq1.TopLevel
import com.acasloa946.pfg_caraction.mainq1.raillinc
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText

@Composable
fun MainQ1Components(
    modifier: Modifier = Modifier,
    onNextClick: () -> Unit = {},
    q1Viewmodel : Q1Viewmodel
) {
    TopLevel(modifier = modifier
        .clip(BottomRoundedShape(60.dp))
        .border(
            2.dp, RojoMain,
            BottomRoundedShape(60.dp)
        )) {
        ImageCarAction()
        TextNameC()
        TextFieldName {
            TextField(
                value = q1Viewmodel.name, onValueChange = {
                    q1Viewmodel.changeName(it)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = RojoMain,
                    unfocusedBorderColor = GrisMain,
                    focusedLabelColor = BlancoMain,
                    unfocusedLabelColor = BlancoMain,
                    unfocusedTextColor = GrisMain,
                    focusedTextColor = GrisMain
                ),
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Face , contentDescription = null)
                }
            )

        }
        ButtonNext(onNextClick = onNextClick) {
            Rectangle2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 2.7535400390625.dp
                    )
                )
            )
            TexrNext(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 3.67144775390625.dp,
                        y = 2.7535400390625.dp
                    )
                )
            )
            ButtonNextGroup {
                RectangleButtonSell(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Siguiente(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 1.8357315063476562.dp,
                            y = 2.2945899963378906.dp
                        )
                    )
                )
            }
        }
        Frame1 {
            Ellipse3()
            Ellipse2()
        }
    }
}

@Composable
fun TextNameC(modifier: Modifier = Modifier) {
    RelayText(
        content = "¿Cómo te llamas?",
        fontSize = 22.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.603999918157404.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}