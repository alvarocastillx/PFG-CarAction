package com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.CarCardComponent
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.NotFoundAlertComponent
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.profilescreen.Banner
import com.acasloa946.pfg_caraction.profilescreen.BannerImage
import com.acasloa946.pfg_caraction.profilescreen.FramePFP
import com.acasloa946.pfg_caraction.profilescreen.FramePFPSynth
import com.acasloa946.pfg_caraction.profilescreen.FrameProfile
import com.acasloa946.pfg_caraction.profilescreen.FrameUploadedCars
import com.acasloa946.pfg_caraction.profilescreen.Linea1
import com.acasloa946.pfg_caraction.profilescreen.Linea2
import com.acasloa946.pfg_caraction.profilescreen.MainHome
import com.acasloa946.pfg_caraction.profilescreen.MaterialSymbolsMenu
import com.acasloa946.pfg_caraction.profilescreen.PFP
import com.acasloa946.pfg_caraction.profilescreen.PFPCircle
import com.acasloa946.pfg_caraction.profilescreen.TopLevel
import com.acasloa946.pfg_caraction.profilescreen.Vector
import com.acasloa946.pfg_caraction.profilescreen.Vector1
import com.acasloa946.pfg_caraction.profilescreen.Vector2
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText
import com.google.relay.compose.RowScopeInstanceImpl.align

@Composable
fun ProfileScreenComponent(
    modifier: Modifier = Modifier,
    userText: String = "",
    leftMenuClick: () -> Unit = {},
    profileViewmodel: profileViewmodel,
    navController: NavController
) {
    val fetchedCars by profileViewmodel.fetchedCarsUploadedByUser.collectAsState()

    TopLevel(modifier = modifier) {
        Banner(modifier = Modifier
            .rowWeight(1.0f)
            .clip(BottomRoundedShape(60.dp))
            .border(2.dp, RojoMain, BottomRoundedShape(60.dp))) {
            MaterialSymbolsMenu(
                leftMenuClick = leftMenuClick,
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
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_banner),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        MainHome(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)) {
            Linea1()
            FrameProfile(modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f)) {
                FramePFP {
                    FramePFPSynth {
                        PFPCircle()
                    }
                    PFP(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.5.dp
                            )
                        )
                    ) {
                        Vector2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = -3.7496747970581055.dp,
                                    y = -22.249918937683105.dp
                                )
                            )
                        )
                        Vector1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = -3.751302719116211.dp,
                                    y = 13.208251953125.dp
                                )
                            )
                        )
                    }
                }
                UserNameComponent(userText = userText)
                Spacer(modifier = Modifier.padding(3.dp))
                Linea2()
                FrameUploadedCars {
                    val scrollState = rememberLazyListState()
                    var countOfList = 5
                    if (!fetchedCars.isEmpty()) {
                        LazyColumn(
                            verticalArrangement = Arrangement.spacedBy(5.dp),
                            state = scrollState
                        ) {
                            if (!scrollState.canScrollForward) {
                                countOfList += 5
                            }
                            items(fetchedCars.take(countOfList)) {
                                CarCardComponent(
                                    makeModelText = AnnotatedString("${it.make} ${it.model}"),
                                    priceText = "${it.price}€",
                                    locationText = AnnotatedString(
                                        "Localización: " + profileViewmodel.formatLocationString(
                                            it.locationName!!
                                        )
                                    ),
                                    yearText = AnnotatedString("Año: " + it.year.toString()),
                                    kmText = AnnotatedString("Km´s: " + it.km.toString()+ " km´s"),
                                    transText = AnnotatedString("Tipo de transmisión: " + it.transmisionType),
                                    fuelTypeText = AnnotatedString("Tipo de combustible: " + it.fuelType),
                                    image = it.image!!,
                                    onCarClick = {
                                        //
                                    }
                                )
                            }

                        }
                    } else {
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .fillMaxSize()
                        ){
                            NotFoundAlertComponent(modifier = Modifier.size(205.dp,29.dp))
                        }
                    }






                }
            }
        }
    }
}


@Composable
fun UserNameComponent(
    userText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = userText,
        fontSize = 15.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.6039999643961587.em,
        modifier = modifier
    )
}
