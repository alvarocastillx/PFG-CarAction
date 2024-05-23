package com.acasloa946.pfg_caraction.UserInterface.MainScreens.FilterDialog

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.filterdialog.ApplyText
import com.acasloa946.pfg_caraction.filterdialog.ButtonApply
import com.acasloa946.pfg_caraction.filterdialog.ButtonApplySynth
import com.acasloa946.pfg_caraction.filterdialog.ButtonDeleteFilters
import com.acasloa946.pfg_caraction.filterdialog.ButtonDeleteFiltersSynth
import com.acasloa946.pfg_caraction.filterdialog.Class1
import com.acasloa946.pfg_caraction.filterdialog.FilterTexx
import com.acasloa946.pfg_caraction.filterdialog.Rectangle4
import com.acasloa946.pfg_caraction.filterdialog.SliderKMFrame
import com.acasloa946.pfg_caraction.filterdialog.SliderKMPrice
import com.acasloa946.pfg_caraction.filterdialog.TopLevel
import com.acasloa946.pfg_caraction.filterdialog.VectorFav
import com.acasloa946.pfg_caraction.filterdialog.raillinc
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText

@Composable
fun FilterDialogComponent(
    modifier: Modifier = Modifier,
    filterDialogViewmodel: FilterDialogViewmodel,
    homeScreenViewmodel: homeScreenViewmodel,
    onApplyClick : () -> Unit,
    onDeleteFilterClick:()->Unit
) {

    LaunchedEffect(Unit) {
        filterDialogViewmodel.getMaxKM(homeScreenViewmodel.fetchedCars)
        filterDialogViewmodel.getMaxPrice(homeScreenViewmodel.fetchedCars)
    }

    TopLevel(modifier = modifier) {
        ReaDeFiltradoComponent()
        Rectangle4(modifier = Modifier.rowWeight(1.0f))
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Kilómetros máximos", fontFamily = raillincFont, color = BlancoMain)
        SliderKMFrame {
            Slider(
                value = filterDialogViewmodel.kmFilter, onValueChange = {
                    filterDialogViewmodel.changeKMFilter(it)
                },
                valueRange = 0f..filterDialogViewmodel.maxKm.toFloat()
            )

        }
        KMComponent(kmText = "${filterDialogViewmodel.kmFilter.toInt()} km")
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Precio máximo", fontFamily = raillincFont, color = BlancoMain)
        SliderKMPrice {
            Slider(value = filterDialogViewmodel.priceFilter, onValueChange = {
                filterDialogViewmodel.changePriceFilter(it)
            },
                valueRange = 0f..filterDialogViewmodel.maxPrice.toFloat())
        }
        PRECIOComponent(priceText = "${filterDialogViewmodel.priceFilter.toInt()} €")
        ButtonApply(
            onApplyClick = onApplyClick,
            modifier = Modifier.rowWeight(1.0f)
        ) {
            ButtonApplySynth {
                ApplyText(modifier = Modifier.rowWeight(1.0f))
            }
            VectorFav(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 118.78181838989258.dp,
                        y = -0.05876445770263672.dp
                    )
                )
            )
        }
        ButtonDeleteFilters(
            onDeleteFilterClick = onDeleteFilterClick,
            modifier = Modifier.rowWeight(1.0f)
        ) {
            ButtonDeleteFiltersSynth {
                FilterTexx(modifier = Modifier.rowWeight(1.0f))
            }
            Class1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 118.78181838989258.dp,
                        y = -0.05876445770263672.dp
                    )
                )
            )
        }
    }
}

@Composable
fun ReaDeFiltradoComponent(modifier: Modifier = Modifier) {
    RelayText(
        content = "Área de filtrado",
        fontSize = 28.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.6039999553135462.em,
        modifier = modifier
    )
}

@Composable
fun KMComponent(modifier: Modifier = Modifier,
       kmText:String) {
    RelayText(
        content = kmText,
        fontSize = 15.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.6039999643961587.em,
        modifier = modifier
    )
}

@Composable
fun PRECIOComponent(modifier: Modifier = Modifier, priceText:String) {
    RelayText(
        content = priceText,
        fontSize = 15.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.6039999643961587.em,
        modifier = modifier
    )
}