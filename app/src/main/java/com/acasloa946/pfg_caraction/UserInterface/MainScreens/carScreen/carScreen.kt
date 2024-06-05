package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.PushPin
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen.homeScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen.profileViewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.bottomnavbar.BottomNavBar
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RowScopeInstanceImpl.align
import kotlinx.coroutines.launch

@Composable
fun CarScreen(
    navController: NavController,
    carScreenViewmodel: CarScreenViewmodel,
    profileViewmodel: profileViewmodel,
    homeScreenViewmodel: homeScreenViewmodel
) {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutine = rememberCoroutineScope()
    val context = LocalContext.current

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier
                    .height(840.dp)
                    .background(BlancoMain)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(top = 30.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle, contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )

                    Text(text = homeScreenViewmodel.userName, fontFamily = raillincFont)
                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = Icons.Default.Face, contentDescription = null)
                        },
                        label = { Text(text = "Perfil") },
                        selected = false, onClick = {
                            navController.navigate(Routes.ProfileScreen.route)
                            profileViewmodel.userName = homeScreenViewmodel.userName
                        })
                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = Icons.Default.Chat, contentDescription = null)
                        },
                        label = { Text(text = "Chats") },
                        selected = false,
                        onClick = { navController.navigate(Routes.CurrentChatsScreen.route) })
                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = Icons.Default.PushPin, contentDescription = null)
                        },
                        label = { Text(text = "Favoritos") },
                        selected = false,
                        onClick = { navController.navigate(Routes.FavouritesScreen.route) })
                    Spacer(modifier = Modifier.padding(180.dp))
                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = Icons.Default.Bedtime, contentDescription = null)
                        },
                        label = { Text(text = "Cerrar sesión") },
                        selected = false, onClick = { homeScreenViewmodel.signOut(navController) },
                    )

                }

            }
        },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.CenterVertically)
                    .background(GrisMain)
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(
                            rememberScrollState(10000),
                            enabled = true,
                            reverseScrolling = true
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    CarScreenComponent(modifier = Modifier
                        .fillMaxWidth()
                        .height(1740.dp),
                        makeText = carScreenViewmodel.clickedCar.make!!,
                        modelText = carScreenViewmodel.clickedCar.model!!,
                        plateText = carScreenViewmodel.clickedCar.plate!!,
                        userNameText = carScreenViewmodel.clickedCar.userName!!,
                        transText = carScreenViewmodel.clickedCar.transmisionType!!,
                        kmText = "${carScreenViewmodel.clickedCar.km} km.",
                        yearText = carScreenViewmodel.clickedCar.year.toString(),
                        priceText = "${carScreenViewmodel.clickedCar.price}€",
                        fuelText = carScreenViewmodel.clickedCar.fuelType!!,
                        localizationText = carScreenViewmodel.formatLocationString(
                            carScreenViewmodel.clickedCar.locationName!!
                        ),
                        onContactClick = {
                            navController.navigate(Routes.ChatScreen.route)
                        },
                        carScreenViewmodel = carScreenViewmodel,
                        navController = navController,
                        profileViewmodel = profileViewmodel,
                        onLeftMenuClick = {
                            coroutine.launch {
                                drawerState.open()
                            }
                        },
                        onFavClick = {
                            carScreenViewmodel.addCarToFavourites(context = context,
                                onSuccess = {
                                    toastMaker("Coche agregado a favoritos", context = context)
                                },
                                onError = {
                                    toastMaker(
                                        "Error al agregar coche a favoritos, inténtelo de nuevo más tarde",
                                        context = context
                                    )
                                })
                        },
                        infoText = carScreenViewmodel.clickedCar.carInfo.toString(),
                        onDeleteClick = {
                            carScreenViewmodel.deleteCar(context, Success = {
                                toastMaker("El anuncio se ha eliminado correctamente", context)
                                navController.navigate(Routes.HomeScreen.route)
                            },
                                Failed = {
                                    toastMaker(
                                        "Error al eliminar el anuncio. Inténtelo de nuevo más tarde",
                                        context
                                    )
                                })
                        }
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 15.dp)
                ) {
                    BottomNavBar(modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .clip(RoundedCornerShape(10.dp)),
                        onCarClick = {
                            navController.navigate(Routes.UploadCarScreen.route)
                        },
                        onHomeClick = {
                            navController.navigate(Routes.HomeScreen.route)
                        }
                    )
                }
            }
        }
    )
}
/*

*/