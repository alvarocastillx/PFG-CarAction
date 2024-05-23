package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carLocationScreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.locationscreen.AssignLocationButton
import com.acasloa946.pfg_caraction.locationscreen.AssignLocationButtonSynth
import com.acasloa946.pfg_caraction.locationscreen.AssignLocationText
import com.acasloa946.pfg_caraction.locationscreen.FrameButtons
import com.acasloa946.pfg_caraction.locationscreen.LineSeparatoria
import com.acasloa946.pfg_caraction.locationscreen.MapFrame
import com.acasloa946.pfg_caraction.locationscreen.TextFieldLocation
import com.acasloa946.pfg_caraction.locationscreen.ThisLocationButton
import com.acasloa946.pfg_caraction.locationscreen.ThisLocationButtonSynth
import com.acasloa946.pfg_caraction.locationscreen.ThisLocationText
import com.acasloa946.pfg_caraction.locationscreen.TopLevel
import com.acasloa946.pfg_caraction.locationscreen.Vector
import com.acasloa946.pfg_caraction.locationscreen.Vector2
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.relay.compose.BoxScopeInstanceImpl.align
import kotlinx.coroutines.delay

@Composable
fun LocationScreenComponent(
    modifier: Modifier = Modifier,
    onThisLocationClick: () -> Unit = {},
    carLocationViewmodel: carLocationViewmodel,
    userLocation: Pair<Double, Double>,
    onAssignClick : () -> Unit = {}

) {


    val cameraPositionState = rememberCameraPositionState {
        position =
            CameraPosition.fromLatLngZoom(LatLng(userLocation.first, userLocation.second), 8f)
    }
    val context = LocalContext.current

    var isMapLoaded by remember { mutableStateOf(false) }


    LaunchedEffect(Unit) {
        delay(2000)
        isMapLoaded = true
    }



    TopLevel(modifier = modifier) {
        MapFrame(modifier = Modifier.rowWeight(1.0f)) {
            if (isMapLoaded) {
                GoogleMap(
                    cameraPositionState = cameraPositionState,
                    uiSettings = MapUiSettings(scrollGesturesEnabled = false)

                ) {
                    if (userLocation.first != 0.0) {
                        Marker(
                            position = LatLng(userLocation.first, userLocation.second),
                            title = "Tu ubicación"
                        )
                        cameraPositionState.move(
                            update = CameraUpdateFactory.newLatLng(
                                LatLng(
                                    userLocation.first,
                                    userLocation.second
                                )
                            )
                        )
                    }
                }
            }
            else {
                CircularProgressIndicator(
                    modifier = Modifier
                        .align(Alignment.Center).size(100.dp),
                    color = RojoMain
                )
            }

        }
        Spacer(modifier = Modifier.padding(5.dp))
        LineSeparatoria()
        TextFieldLocation {

            TextField(
                value = "SAN FERNANDO", onValueChange = {

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
                    Text("Introduzca la localización del coche", color = BlancoMain, fontSize = 12.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.AddLocation, contentDescription = null, tint = BlancoMain)
                }
            )



            /*
            carLocationViewmodel.getMarkerAddressDetails(
                    userLocation.first,
                    userLocation.second,
                    context
                )
             */
        }
        Spacer(modifier = Modifier.padding(3.dp))
        FrameButtons(modifier = Modifier.rowWeight(1.0f)) {
            ThisLocationButton(
                onThisLocationClick = onThisLocationClick,
                modifier = Modifier.rowWeight(1.0f)
            ) {
                ThisLocationButtonSynth {
                    ThisLocationText()
                }
                Vector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 134.0.dp,
                            y = -0.49983692169189453.dp
                        )
                    )
                )
            }
            AssignLocationButton(
                onAssignClick = onAssignClick,
                modifier = Modifier.rowWeight(1.0f)
            ) {
                AssignLocationButtonSynth {
                    AssignLocationText()
                }
                Vector2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 134.0.dp,
                            y = -0.49983692169189453.dp
                        )
                    )
                )
            }
        }
    }
}