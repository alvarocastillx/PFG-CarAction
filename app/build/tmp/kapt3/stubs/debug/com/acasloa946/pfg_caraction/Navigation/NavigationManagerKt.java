package com.acasloa946.pfg_caraction.Navigation;

import androidx.compose.runtime.Composable;
import com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.carLocationViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Main.carMakesScreen.carMakesViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Main.carModelScreen.carModelViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen.profileViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen.uploadCarViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.InitScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Start.LoginScreen.loginViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Viewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen.Q2Viewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ah\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u00a8\u0006\u001a"}, d2 = {"NavigationManager", "", "registerViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Start/RegisterScreen/RegisterViewmodel;", "initScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Start/InitScreen/InitScreenViewmodel;", "q1Viewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Start/Q1Screen/Q1Viewmodel;", "q2Viewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Start/Q2Screen/Q2Viewmodel;", "loginViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Start/LoginScreen/loginViewmodel;", "homeScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/homeScreen/homeScreenViewmodel;", "uploadCarViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/uploadCarScreen/uploadCarViewmodel;", "carMakesViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carMakesScreen/carMakesViewmodel;", "carModelViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carModelScreen/carModelViewmodel;", "carLocationViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/carLocationViewmodel;", "carScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carScreen/CarScreenViewmodel;", "profileViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/profileScreen/profileViewmodel;", "app_debug"})
public final class NavigationManagerKt {
    
    @androidx.compose.runtime.Composable
    public static final void NavigationManager(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel registerViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.InitScreenViewmodel initScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Start.Q1Screen.Q1Viewmodel q1Viewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Start.Q2Screen.Q2Viewmodel q2Viewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Start.LoginScreen.loginViewmodel loginViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel homeScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen.uploadCarViewmodel uploadCarViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.carMakesScreen.carMakesViewmodel carMakesViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.carModelScreen.carModelViewmodel carModelViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.carLocationViewmodel carLocationViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel carScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen.profileViewmodel profileViewmodel) {
    }
}