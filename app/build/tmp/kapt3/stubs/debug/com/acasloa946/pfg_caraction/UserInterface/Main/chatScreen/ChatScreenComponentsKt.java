package com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen;

import android.content.Context;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.navigation.NavController;
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen.currentChatsViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates;
import com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a<\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u001a\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\u0016"}, d2 = {"ChatFrameComponent", "", "userStates", "Lcom/acasloa946/pfg_caraction/UserInterface/States/ChatScreenStates;", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/MessageModel;", "chatScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/chatScreen/chatScreenViewmodel;", "context", "Landroid/content/Context;", "ChatScreenComponent", "modifier", "Landroidx/compose/ui/Modifier;", "userNameText", "", "carScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carScreen/CarScreenViewmodel;", "currentChatsViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/currentChatsScreen/currentChatsViewmodel;", "navController", "Landroidx/navigation/NavController;", "UserNameTextComponent", "app_debug"})
public final class ChatScreenComponentsKt {
    
    @androidx.compose.runtime.Composable
    public static final void ChatScreenComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String userNameText, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen.chatScreenViewmodel chatScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel carScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.currentChatsScreen.currentChatsViewmodel currentChatsViewmodel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void UserNameTextComponent(@org.jetbrains.annotations.NotNull
    java.lang.String userNameText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ChatFrameComponent(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates<? extends java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.MessageModel>> userStates, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.chatScreen.chatScreenViewmodel chatScreenViewmodel, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}