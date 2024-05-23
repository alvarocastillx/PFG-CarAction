package com.acasloa946.pfg_caraction.Navigation;

import android.util.Log;
import androidx.compose.runtime.Composable;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.FilterDialog.FilterDialogViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carLocationScreen.carLocationViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carMakesScreen.carMakesViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carModelScreen.carModelViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen.CarScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.chatScreen.chatScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.currentChatsScreen.currentChatsViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen.favouritesViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen.homeScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen.profileViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen.uploadCarViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen.InitScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.LoginScreen.loginViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q1Screen.Q1Viewmodel;
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q2Screen.Q2Viewmodel;
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.RegisterViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.notifications.notif;
import com.google.firebase.Firebase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0007\u00a8\u0006$"}, d2 = {"NavigationManager", "", "registerViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/AuthScreens/RegisterScreen/RegisterViewmodel;", "initScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/AuthScreens/InitScreen/InitScreenViewmodel;", "q1Viewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/AuthScreens/Q1Screen/Q1Viewmodel;", "q2Viewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/AuthScreens/Q2Screen/Q2Viewmodel;", "loginViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/AuthScreens/LoginScreen/loginViewmodel;", "homeScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/homeScreen/homeScreenViewmodel;", "uploadCarViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/uploadCarScreen/uploadCarViewmodel;", "carMakesViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/carMakesScreen/carMakesViewmodel;", "carModelViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/carModelScreen/carModelViewmodel;", "carLocationViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/carLocationScreen/carLocationViewmodel;", "carScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/carScreen/CarScreenViewmodel;", "profileViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/profileScreen/profileViewmodel;", "chatScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/chatScreen/chatScreenViewmodel;", "currentChatsViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/currentChatsScreen/currentChatsViewmodel;", "favouritesViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/favouritesScreen/favouritesViewmodel;", "filterDialogViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/FilterDialog/FilterDialogViewmodel;", "notif", "Lcom/acasloa946/pfg_caraction/UserInterface/notifications/notif;", "app_debug"})
public final class NavigationManagerKt {
    
    @androidx.compose.runtime.Composable
    public static final void NavigationManager(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.AuthScreens.RegisterScreen.RegisterViewmodel registerViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen.InitScreenViewmodel initScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q1Screen.Q1Viewmodel q1Viewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q2Screen.Q2Viewmodel q2Viewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.AuthScreens.LoginScreen.loginViewmodel loginViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen.homeScreenViewmodel homeScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen.uploadCarViewmodel uploadCarViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.carMakesScreen.carMakesViewmodel carMakesViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.carModelScreen.carModelViewmodel carModelViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.carLocationScreen.carLocationViewmodel carLocationViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen.CarScreenViewmodel carScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen.profileViewmodel profileViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.chatScreen.chatScreenViewmodel chatScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.currentChatsScreen.currentChatsViewmodel currentChatsViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen.favouritesViewmodel favouritesViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.MainScreens.FilterDialog.FilterDialogViewmodel filterDialogViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.notifications.notif notif) {
    }
}