package com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerInputScope
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen.CarCardComponent
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.UserInterface.LottieComponent.NoChatsNoFavAnimation
import com.acasloa946.pfg_caraction.UserInterface.States.FavouriteCarStates
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.favouritescreen.Banner
import com.acasloa946.pfg_caraction.favouritescreen.BannerImage
import com.acasloa946.pfg_caraction.favouritescreen.FavsFrame
import com.acasloa946.pfg_caraction.favouritescreen.Linea1
import com.acasloa946.pfg_caraction.favouritescreen.MainFavs
import com.acasloa946.pfg_caraction.favouritescreen.MaterialSymbolsMenu
import com.acasloa946.pfg_caraction.favouritescreen.TopLevel
import com.acasloa946.pfg_caraction.favouritescreen.Vector
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText
import com.google.relay.compose.RowScopeInstanceImpl.align

@Composable
fun FavouriteScreenComponent(
    modifier: Modifier = Modifier,
    leftMenuClick: () -> Unit = {},
    favouritesViewmodel: favouritesViewmodel,
    navController: NavController,
    carScreenViewmodel: CarScreenViewmodel
) {

    val context = LocalContext.current
    val favouriteCarsStates by favouritesViewmodel.favouriteCarStates.observeAsState(
        FavouriteCarStates.Loading
    )

    TopLevel(modifier = modifier) {
        Banner(
            modifier = Modifier
                .rowWeight(1.0f)
                .clip(BottomRoundedShape(60.dp))
                .border(2.dp, RojoMain, BottomRoundedShape(60.dp))
        ) {
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
        MainFavs {
            FavoritosComponent()
            Linea1()
            FavsFrame {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    FavouriteCars(
                        resultState = favouriteCarsStates,
                        navController,
                        carScreenViewmodel,
                        favouritesViewmodel,
                        context
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.padding(37.dp))
}

@Composable
fun FavoritosComponent(modifier: Modifier = Modifier) {
    RelayText(
        content = "Favoritos\n",
        fontSize = 28.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.6039999553135462.em,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(136.0.dp)
            .requiredHeight(33.0.dp)
    )
}

@Composable
fun FavouriteCars(
    resultState: FavouriteCarStates<List<CarModel>>,
    navController: NavController,
    carScreenViewmodel: CarScreenViewmodel,
    favouritesViewmodel: favouritesViewmodel,
    context: Context

) {
    when (resultState) {
        is FavouriteCarStates.Loading -> {
            CircularProgressIndicator(modifier = Modifier.size(200.dp))
        }

        is FavouriteCarStates.Success -> {
            if (resultState.data.isNotEmpty()) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    items(resultState.data) { car ->
                        CarCardComponent(
                            makeModelText = ("${car.make} ${car.model}"),
                            priceText = "${car.price}€",
                            image = car.image!!,
                            onCarClick = {
                                navController.navigate(Routes.CarScreen.route)
                                carScreenViewmodel.clickedCar = car
                            },
                            modifier = Modifier.pointerInput(Unit) {
                                detectTransformGestures { _, pan, zoom, rotation ->
                                    val dragAmountX = pan.x

                                    if (dragAmountX < -100) { // Ajusta este valor según tus necesidades para detectar un arrastre suficientemente largo hacia la izquierda
                                        favouritesViewmodel.deleteFavCar(context, car, error = {
                                            toastMaker("Error al eliminar coche de favoritos, inténtelo de nuevo más tarde.", context)
                                        },
                                            success = {
                                                toastMaker("Coche eliminado de favoritos", context)
                                            })
                                    }
                                }
                            }
                        )
                    }
                }
            } else {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .fillMaxSize()
                ) {
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(
                        "No has agregado ningún coche como favorito",
                        fontFamily = raillincFont,
                        color = BlancoMain,
                        fontSize = 14.sp
                    )
                    NoChatsNoFavAnimation(modifier = Modifier.size(200.dp))

                }
            }

        }

        is FavouriteCarStates.Error -> {
            toastMaker("Error al obtener coches favoritos", context)
        }
    }
}