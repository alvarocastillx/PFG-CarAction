package com.acasloa946.pfg_caraction.UserInterface.Main.splashScreen

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.splashscreen.GifFrame
import com.acasloa946.pfg_caraction.splashscreen.TopLevel

@Composable
fun SplashScreenComponents(modifier: Modifier = Modifier){
    TopLevel(modifier = modifier) {
        GifFrame(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            val painter = rememberAsyncImagePainter(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(R.drawable.logogif)
                    .decoderFactory(GifDecoder.Factory())
                    .size(Size(200,300))
                    .build()
            )

            Image(
                painter = painter,
                contentDescription = null,
                modifier = modifier
            )
        }
    }
}

