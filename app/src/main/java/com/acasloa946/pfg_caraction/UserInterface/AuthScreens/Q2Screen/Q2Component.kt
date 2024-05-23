package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q2Screen

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.mainq2.ButtonBuy
import com.acasloa946.pfg_caraction.mainq2.ButtonSell
import com.acasloa946.pfg_caraction.mainq2.ButtonsQS
import com.acasloa946.pfg_caraction.mainq2.CarActionImage
import com.acasloa946.pfg_caraction.mainq2.Ellipse2
import com.acasloa946.pfg_caraction.mainq2.Ellipse3
import com.acasloa946.pfg_caraction.mainq2.Frame1
import com.acasloa946.pfg_caraction.mainq2.RectangleBuy
import com.acasloa946.pfg_caraction.mainq2.RectangleSell
import com.acasloa946.pfg_caraction.mainq2.Textbuy
import com.acasloa946.pfg_caraction.mainq2.Textsell
import com.acasloa946.pfg_caraction.mainq2.TopLevel
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText

@Composable
fun MainQ2Component(
    modifier: Modifier = Modifier,
    onClickSell: () -> Unit,
    onClickBuy: () -> Unit
) {
    TopLevel(
        modifier = modifier
            .clip(BottomRoundedShape(60.dp))
            .border(
                2.dp, RojoMain,
                BottomRoundedShape(60.dp)
            )
    ) {
        CarActionImage()
        TextMid()
        ButtonsQS {
            ButtonSell {
                RectangleSell(
                    modifier = Modifier
                        .boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                        .clickable {
                            onClickSell()
                        }
                )
                Textsell(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.500244140625.dp,
                            y = -3.0.dp
                        )
                    )
                )
            }
            ButtonBuy {
                RectangleBuy(
                    modifier = Modifier
                        .boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                        .clickable {
                            onClickBuy()
                        }
                )
                Textbuy(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0863189697265625.dp,
                            y = -1.2659568786621094.dp
                        )
                    )
                )
            }
        }
        Frame1 {
            Ellipse2()
            Ellipse3()
        }
    }
}

@Composable
fun TextMid(modifier: Modifier = Modifier) {
    RelayText(
        content = "¿Qué deseas hacer?",
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
