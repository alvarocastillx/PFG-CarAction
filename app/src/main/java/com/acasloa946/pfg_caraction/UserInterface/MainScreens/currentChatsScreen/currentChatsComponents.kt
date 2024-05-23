package com.acasloa946.pfg_caraction.UserInterface.MainScreens.currentChatsScreen

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
import androidx.compose.material3.Text
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
import com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.UserInterface.LottieComponent.NoCarsAnimation
import com.acasloa946.pfg_caraction.UserInterface.LottieComponent.NoChatsNoFavAnimation
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel
import com.acasloa946.pfg_caraction.chatbutton.ChatButton
import com.acasloa946.pfg_caraction.currentchatsscreen.Banner
import com.acasloa946.pfg_caraction.currentchatsscreen.BannerImage
import com.acasloa946.pfg_caraction.currentchatsscreen.Linea1
import com.acasloa946.pfg_caraction.currentchatsscreen.MainChats
import com.acasloa946.pfg_caraction.currentchatsscreen.MaterialSymbolsMenu
import com.acasloa946.pfg_caraction.currentchatsscreen.TopLevel
import com.acasloa946.pfg_caraction.currentchatsscreen.UserChatsFrame
import com.acasloa946.pfg_caraction.currentchatsscreen.Vector
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText
import com.google.relay.compose.RowScopeInstanceImpl.align
import androidx.compose.material3.CircularProgressIndicator as CircularProgressIndicator

@Composable
fun CurrentChatsScreenComponent(
    modifier: Modifier = Modifier,
    leftMenuClick: () -> Unit = {},
    currentChatsViewmodel: currentChatsViewmodel,
    navController: NavController
) {
    val userCurrentChatsState by currentChatsViewmodel.userCurrentChatsState.observeAsState(
        ResultStateCurrentChats.Loading
    )
    val context = LocalContext.current


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
        MainChats {
            ChatsComponents()
            Linea1()
            UserChatsFrame {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    UserChatsFrame(
                        resultState = userCurrentChatsState, context, navController = navController,
                        currentChatsViewmodel
                    )

                }


            }
        }
    }
}

@Composable
fun UserChatsFrame(
    resultState: ResultStateCurrentChats<List<UserModel>>,
    context: Context,
    navController: NavController,
    currentChatsViewmodel: currentChatsViewmodel
) {
    when (resultState) {
        is ResultStateCurrentChats.Loading -> {
            CircularProgressIndicator(modifier = Modifier.size(200.dp))
        }

        is ResultStateCurrentChats.Success -> {
            if (resultState.data.isNotEmpty()) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    items(resultState.data) {
                        ChatButton(chatUsernameText = it.name, onChatClick = {
                            currentChatsViewmodel.clickedUserToChat = it.name
                            navController.navigate(Routes.ChatScreen.route)
                        })
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
                        "No se han encontrado chats",
                        fontFamily = raillincFont,
                        color = BlancoMain
                    )
                    NoChatsNoFavAnimation(modifier = Modifier.size(200.dp))

                }
            }


        }

        is ResultStateCurrentChats.Error -> {
            toastMaker("Error al obtener chats", context)
        }
    }
}


@Composable
fun ChatsComponents(modifier: Modifier = Modifier) {
    RelayText(
        content = "Chats",
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
            .requiredWidth(106.0.dp)
            .requiredHeight(33.0.dp)
    )
}
