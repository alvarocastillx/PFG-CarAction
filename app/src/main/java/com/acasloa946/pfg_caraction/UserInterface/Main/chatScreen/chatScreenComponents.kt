package com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen

import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen.currentChatsViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.toastMaker
import com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates
import com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel
import com.acasloa946.pfg_caraction.chatscreen.ChatBar
import com.acasloa946.pfg_caraction.chatscreen.ChatFrame
import com.acasloa946.pfg_caraction.chatscreen.Class1Line
import com.acasloa946.pfg_caraction.chatscreen.Class2Line
import com.acasloa946.pfg_caraction.chatscreen.Elipe
import com.acasloa946.pfg_caraction.chatscreen.MainFrame
import com.acasloa946.pfg_caraction.chatscreen.TopLevel
import com.acasloa946.pfg_caraction.chatscreen.UserImage
import com.acasloa946.pfg_caraction.chatscreen.UserImageSynth
import com.acasloa946.pfg_caraction.chatscreen.UserImageVECVEC
import com.acasloa946.pfg_caraction.chatscreen.UserNameFrame
import com.acasloa946.pfg_caraction.messagereceivedcard.MessageReceivedCard
import com.acasloa946.pfg_caraction.messagesentcard.MessageSentCard
import com.acasloa946.pfg_caraction.messagesentcard.raillinc
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText
import kotlinx.coroutines.delay

@Composable
fun ChatScreenComponent(
    modifier: Modifier = Modifier,
    userNameText: String = "",
    chatScreenViewmodel: chatScreenViewmodel,
    carScreenViewmodel: CarScreenViewmodel,
    currentChatsViewmodel: currentChatsViewmodel,
    navController: NavController
) {
    BackHandler {
        chatScreenViewmodel.loaded = false
        currentChatsViewmodel.clickedUserToChat = ""
        navController.popBackStack()
    }
    val context = LocalContext.current
    LaunchedEffect(true) {
        while (true) {
            if (currentChatsViewmodel.clickedUserToChat != "") {
                chatScreenViewmodel.getMessages(context, currentChatsViewmodel.clickedUserToChat)
            } else {
                chatScreenViewmodel.getMessages(context, carScreenViewmodel.clickedCar.userName.toString())
            }
            delay(5000)
        }
    }
    val userChatsState by chatScreenViewmodel.userChatsState.observeAsState(
        ChatScreenStates.Loading
    )


    TopLevel(modifier = modifier) {
        MainFrame(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 28.5.dp
                )
            )
        ) {
            Class1Line(modifier = Modifier.rowWeight(1.0f))
            ChatFrame(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ChatFrameComponent(userChatsState, chatScreenViewmodel, context)
                }
            }
            Class2Line(modifier = Modifier.rowWeight(1.0f))
            ChatBar(modifier = Modifier.rowWeight(1.0f)) {
                androidx.compose.material3.TextField(
                    value = chatScreenViewmodel.messageField,
                    onValueChange = {
                        chatScreenViewmodel.changeMessageField(it)
                    },
                    shape = RoundedCornerShape(5.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = RojoMain,
                        unfocusedBorderColor = RojoMain,
                        focusedLabelColor = RojoMain,
                        unfocusedLabelColor = RojoMain,
                        unfocusedTextColor = RojoMain,
                        focusedTextColor = GrisMain,
                    ),
                    modifier = Modifier
                        .background(BlancoMain)
                        .fillMaxSize()
                        .border(3.dp, RojoMain, RoundedCornerShape(15.dp)),
                    textStyle = TextStyle.Default.copy(fontSize = 10.sp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    trailingIcon = {
                        var otherUser = ""
                        if (currentChatsViewmodel.clickedUserToChat != "") {
                            otherUser = currentChatsViewmodel.clickedUserToChat
                        } else {
                            otherUser = carScreenViewmodel.clickedCar.userName.toString()
                        }
                        IconButton(onClick = {
                            chatScreenViewmodel.sendMessage(context,
                                otherUser,
                                errorSendingMessage = {
                                    toastMaker(
                                        "Error al enviar mensaje. Inténtelo de nuevo más tarde",
                                        context
                                    )
                                })
                        }) {
                            Icon(
                                imageVector = Icons.Default.Send,
                                contentDescription = "Enviar"
                            )
                        }
                    }


                )
            }
        }
        UserNameFrame(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -371.5.dp
                )
            )
        ) {
            UserNameTextComponent(
                userNameText = userNameText,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 16.0.dp
                    )
                )
            )
            UserImage(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.1838235855102539.dp,
                        y = -8.316176414489746.dp
                    )
                )
            ) {
                UserImageSynth {
                    Elipe()
                }
                UserImageVECVEC(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.0002689361572265625.dp,
                            y = -0.0001087188720703125.dp
                        )
                    )
                )
            }
        }
    }
}

/*

 */
@Composable
fun UserNameTextComponent(
    userNameText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = userNameText,
        fontSize = 12.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.6039999326070147.em,
        modifier = modifier
    )
}

@Composable
fun ChatFrameComponent(
    userStates: ChatScreenStates<List<MessageModel>>,
    chatScreenViewmodel: chatScreenViewmodel,
    context: Context
) {
    when (userStates) {
        is ChatScreenStates.Loading -> {
            CircularProgressIndicator(modifier = Modifier.size(200.dp))
        }

        is ChatScreenStates.Success -> {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(userStates.data) {
                    if (it.sent_to == chatScreenViewmodel.otherUserMail) {
                        Row(
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            MessageSentCard(
                                messageContentText = it.message!!,
                                modifier = Modifier.wrapContentHeight()
                            )
                        }
                    } else {
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            MessageReceivedCard(messageContentText = it.message!!)
                        }
                    }
                }
            }
        }

        is ChatScreenStates.Error -> {
            toastMaker("Error al obtener mensajes", context)
        }
    }

}
