package com.acasloa946.pfg_caraction.filterdialog

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'filter_dialog'.
 * Generated code; do not edit directly
 */
@Composable
fun FilterDialog(
    modifier: Modifier = Modifier,
    onApplyClick: () -> Unit = {},
    onDeleteFilterClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ReaDeFiltrado()
        Rectangle4()
        SliderKMFrame {}
        KM()
        SliderKMPrice {}
        PRECIO()
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

@Preview(widthDp = 322, heightDp = 350)
@Composable
private fun FilterDialogPreview() {
    MaterialTheme {
        FilterDialog(
            onApplyClick = {},
            onDeleteFilterClick = {}
        )
    }
}

@Composable
fun ReaDeFiltrado(modifier: Modifier = Modifier) {
    RelayText(
        content = "Área de filtrado",
        fontSize = 28.0.sp,
        fontFamily = raillinc,
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
fun Rectangle4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.filter_dialog_rectangle_4),
        modifier = modifier.requiredWidth(280.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun SliderKMFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(280.0.dp).requiredHeight(34.0.dp)
    )
}

@Composable
fun KM(modifier: Modifier = Modifier) {
    RelayText(
        content = "KM",
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
fun SliderKMPrice(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(280.0.dp).requiredHeight(34.0.dp)
    )
}

@Composable
fun PRECIO(modifier: Modifier = Modifier) {
    RelayText(
        content = "PRECIO",
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
fun ApplyText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Aplicar filtros",
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
        modifier = modifier.graphicsLayer(rotationZ = -0.0f).fillMaxWidth(1.0f).requiredHeight(26.784196853637695.dp)
    )
}

@Composable
fun ButtonApplySynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 5.0.dp,
            end = 0.0.dp,
            bottom = 5.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 14.0,
        content = content,
        modifier = modifier.requiredWidth(280.0.dp).alpha(alpha = 100.0f)
    )
}

@Composable
fun VectorFav(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.filter_dialog_vector_fav),
        modifier = modifier.requiredWidth(11.563636779785156.dp).requiredHeight(18.66666603088379.dp)
    )
}

@Composable
fun ButtonApply(
    onApplyClick: () -> Unit,
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
        radius = 14.0,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.tappable(onTap = onApplyClick).fillMaxWidth(1.0f).requiredHeight(36.78419494628906.dp)
    )
}

@Composable
fun FilterTexx(modifier: Modifier = Modifier) {
    RelayText(
        content = "Eliminar filtros aplicados",
        fontSize = 15.0.sp,
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
        modifier = modifier.graphicsLayer(rotationZ = -0.0f).fillMaxWidth(1.0f).requiredHeight(26.784196853637695.dp)
    )
}

@Composable
fun ButtonDeleteFiltersSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 5.0.dp,
            end = 0.0.dp,
            bottom = 5.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 14.0,
        content = content,
        modifier = modifier.requiredWidth(280.0.dp).alpha(alpha = 100.0f)
    )
}

@Composable
fun Class1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.filter_dialog_1),
        modifier = modifier.requiredWidth(11.563636779785156.dp).requiredHeight(18.66666603088379.dp)
    )
}

@Composable
fun ButtonDeleteFilters(
    onDeleteFilterClick: () -> Unit,
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
        isStructured = false,
        clipToParent = false,
        radius = 14.0,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.tappable(onTap = onDeleteFilterClick).fillMaxWidth(1.0f).requiredHeight(36.78419494628906.dp)
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
        padding = PaddingValues(
            start = 21.0.dp,
            top = 22.0.dp,
            end = 21.0.dp,
            bottom = 22.0.dp
        ),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier
    )
}
