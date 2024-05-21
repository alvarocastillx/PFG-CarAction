package com.acasloa946.pfg_caraction.UserInterface.Main.favouritesScreen

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen.currentChatsViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.CarCardComponent
import com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen.profileViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.UserInterface.States.FavouriteCarStates
import com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.chatbutton.ChatButton
import com.acasloa946.pfg_caraction.favouritescreen.Banner
import com.acasloa946.pfg_caraction.favouritescreen.BannerImage
import com.acasloa946.pfg_caraction.favouritescreen.Favoritos
import com.acasloa946.pfg_caraction.favouritescreen.FavsFrame
import com.acasloa946.pfg_caraction.favouritescreen.Linea1
import com.acasloa946.pfg_caraction.favouritescreen.MainFavs
import com.acasloa946.pfg_caraction.favouritescreen.MaterialSymbolsMenu
import com.acasloa946.pfg_caraction.favouritescreen.TopLevel
import com.acasloa946.pfg_caraction.favouritescreen.Vector
import com.acasloa946.pfg_caraction.favouritescreen.raillinc
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText

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
        FavouriteCarStates.Loading)

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
        MainFavs {
            FavoritosComponent()
            Linea1()
            FavsFrame {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    FavouriteCars(resultState = favouriteCarsStates, context = context, navController, carScreenViewmodel)
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
    resultState : FavouriteCarStates<List<CarModel>>,
    context: Context,
    navController: NavController,
    carScreenViewmodel : CarScreenViewmodel

){
    when (resultState) {
        is FavouriteCarStates.Loading -> {
            CircularProgressIndicator(modifier = Modifier.size(200.dp))
        }
        is FavouriteCarStates.Success -> {
            LazyColumn (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ){
                items(resultState.data) {
                    CarCardComponent(
                        makeModelText = ("${it.make} ${it.model}"),
                        priceText = "${it.price}€",
                        image = it.image!!,
                        onCarClick = {
                            navController.navigate(Routes.CarScreen.route)
                            carScreenViewmodel.clickedCar = it
                        }
                    )
                }
            }
        }
        is FavouriteCarStates.Error -> {
            toastMaker("Error al obtener coches favoritos", context)
        }
    }
}