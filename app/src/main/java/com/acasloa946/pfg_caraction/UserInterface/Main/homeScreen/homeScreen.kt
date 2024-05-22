package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.PushPin
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.PlainTooltipBox
import androidx.compose.material3.PlainTooltipState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.UserInterface.Main.FilterDialog.FilterDialogViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen.profileViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.UserInterface.notifications.notif
import com.acasloa946.pfg_caraction.bottomnavbar.BottomNavBar
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RowScopeInstanceImpl.align
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavController,
    homeScreenViewmodel: homeScreenViewmodel,
    carScreenViewmodel: CarScreenViewmodel,
    profileViewmodel: profileViewmodel,
    filterDialogViewmodel: FilterDialogViewmodel
) {

    val context = LocalContext.current
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutine = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        homeScreenViewmodel.fetchCars()
    }

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
                        selected = false, onClick = { navController.navigate(Routes.CurrentChatsScreen.route) })
                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = Icons.Default.PushPin, contentDescription = null)
                        },
                        label = { Text(text = "Favoritos") },
                        selected = false, onClick = { navController.navigate(Routes.FavouritesScreen.route) })
                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = Icons.Default.Settings, contentDescription = null)
                        },
                        label = { Text(text = "Ajustes") },
                        selected = false, onClick = { /*TODO*/ })

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
                    homeScreenViewmodel.fetchUserName(context,
                        onError = {
                            toastMaker("Ha ocurrido un error con su cuenta", context)
                            navController.navigate(Routes.InitScreen.route)
                        })
                    PantallaPrincipalComponent(modifier = Modifier
                        .fillMaxWidth()
                        .height(800.dp),
                        textWelcome = homeScreenViewmodel.userName,
                        homeScreenViewmodel = homeScreenViewmodel,
                        navController = navController,
                        carScreenViewmodel = carScreenViewmodel,
                        onUserClick = {
                            navController.navigate(Routes.ProfileScreen.route)
                            profileViewmodel.userName = homeScreenViewmodel.userName
                        },
                        rightMenuClick = {
                            coroutine.launch {
                                drawerState.open()
                            }
                        },
                        onFilterClick = {
                            homeScreenViewmodel.changeDialog()
                        })
                    if (homeScreenViewmodel.isDialogOpened) {
                        FilterDialog(homeScreenViewmodel = homeScreenViewmodel, filterDialogViewmodel = filterDialogViewmodel, coroutine)
                    }
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





