package com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavController;
import com.acasloa946.pfg_caraction.Navigation.Routes;
import com.acasloa946.pfg_caraction.R;
import com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates;
import com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a2\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0007\u001a<\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0015"}, d2 = {"MemberSinceComponent", "", "memberSinceText", "", "modifier", "Landroidx/compose/ui/Modifier;", "ProfileCars", "profileStates", "Lcom/acasloa946/pfg_caraction/UserInterface/States/ProfileScreenStates;", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "fetchedCars", "context", "Landroid/content/Context;", "ProfileScreenComponent", "userText", "leftMenuClick", "Lkotlin/Function0;", "profileViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/profileScreen/profileViewmodel;", "UserNameComponent", "app_debug"})
public final class ProfileScreenComponentsKt {
    
    @androidx.compose.runtime.Composable
    public static final void ProfileScreenComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String userText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> leftMenuClick, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen.profileViewmodel profileViewmodel, @org.jetbrains.annotations.NotNull
    java.lang.String memberSinceText) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void UserNameComponent(@org.jetbrains.annotations.NotNull
    java.lang.String userText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MemberSinceComponent(@org.jetbrains.annotations.NotNull
    java.lang.String memberSinceText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileCars(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates<? extends java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> profileStates, @org.jetbrains.annotations.NotNull
    java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel> fetchedCars, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}