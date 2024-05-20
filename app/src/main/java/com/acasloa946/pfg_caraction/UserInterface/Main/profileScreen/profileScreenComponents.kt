package com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen

import android.content.Context
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
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates
import com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
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
import com.acasloa946.pfg_caraction.profilescreen.MiembroDesde15DeMayoDe2024
import com.acasloa946.pfg_caraction.profilescreen.PFP
import com.acasloa946.pfg_caraction.profilescreen.PFPCircle
import com.acasloa946.pfg_caraction.profilescreen.TopLevel
import com.acasloa946.pfg_caraction.profilescreen.Vector
import com.acasloa946.pfg_caraction.profilescreen.Vector1
import com.acasloa946.pfg_caraction.profilescreen.Vector2
import com.acasloa946.pfg_caraction.profilescreen.raillinc
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
    memberSinceText: String
) {
    val fetchedCars by profileViewmodel.fetchedCarsUploadedByUser.collectAsState()
    val profileStates by profileViewmodel.profileStates.observeAsState(
        ProfileScreenStates.Loading
    )

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
                MemberSinceComponent(memberSinceText = memberSinceText)
                Linea2()
                Spacer(modifier = Modifier.padding(30.dp))
                FrameUploadedCars () {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ProfileCars(
                            profileStates = profileStates,
                            fetchedCars = fetchedCars,
                            context = LocalContext.current
                        )
                    }

                }

            }
        }
    }
    Spacer(modifier = Modifier.padding(33.dp))
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


@Composable
fun MemberSinceComponent(
    memberSinceText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = memberSinceText,
        fontSize = 11.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.603999918157404.em,
        modifier = modifier
    )
}

@Composable
fun ProfileCars(
    profileStates : ProfileScreenStates<List<CarModel>>,
    fetchedCars : List<CarModel>,
    context: Context
){
    when (profileStates) {
        is ProfileScreenStates.Loading -> {

            CircularProgressIndicator(modifier = Modifier.size(200.dp))
        }
        is ProfileScreenStates.Success -> {
            val scrollState = rememberLazyListState()
            var countOfList = 5
            if (!fetchedCars.isEmpty()) {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    state = scrollState,
                    modifier = Modifier.padding(bottom = 45.dp)
                ) {
                    if (!scrollState.canScrollForward) {
                        countOfList += 5
                    }
                    items(fetchedCars.take(countOfList)) {
                        CarCardComponent(
                            makeModelText = ("${it.make} ${it.model}"),
                            priceText = "${it.price}€",
                            image = it.image!!,
                            onCarClick = {

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
        is ProfileScreenStates.Error -> {
            toastMaker("Error al encontrar coches subidos por el usuario. Inténtelo de nuevo más tarde", context)
        }
    }
}