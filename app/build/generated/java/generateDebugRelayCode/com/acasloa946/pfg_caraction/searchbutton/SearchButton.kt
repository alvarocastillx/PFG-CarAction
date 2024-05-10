package com.acasloa946.pfg_caraction.searchbutton

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'search_button'.
 * Generated code; do not edit directly
 */
@Composable
fun SearchButton(
    modifier: Modifier = Modifier,
    searchText: String = "",
    onSearchClick: () -> Unit = {}
) {
    TopLevel(
        onSearchClick = onSearchClick,
        modifier = modifier
    ) {
        Text(searchText = searchText)
    }
}

@Preview(widthDp = 107, heightDp = 29)
@Composable
private fun SearchButtonPreview() {
    MaterialTheme {
        SearchButton(
            onSearchClick = {},
            searchText = "text"
        )
    }
}

@Composable
fun Text(
    searchText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = searchText,
        fontSize = 15.0.sp,
        fontFamily = raillinc,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.6039999643961587.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(31.0.dp).requiredHeight(21.0.dp)
    )
}

@Composable
fun TopLevel(
    onSearchClick: () -> Unit,
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
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 38.0.dp,
            top = 4.0.dp,
            end = 38.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 230,
            green = 50,
            blue = 75
        ),
        content = content,
        modifier = modifier.tappable(onTap = onSearchClick)
    )
}
