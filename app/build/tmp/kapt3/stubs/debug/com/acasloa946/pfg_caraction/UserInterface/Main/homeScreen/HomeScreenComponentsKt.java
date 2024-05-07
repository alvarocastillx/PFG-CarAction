package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.KeyboardType;
import com.acasloa946.pfg_caraction.R;
import com.acasloa946.pfg_caraction.data.Entities.CarEntityType;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001ap\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u001aD\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"CarCardComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "makeModelText", "Landroidx/compose/ui/text/AnnotatedString;", "priceText", "", "locationText", "yearText", "kmText", "transText", "fuelTypeText", "image", "onCarClick", "Lkotlin/Function0;", "PantallaPrincipalComponent", "textWelcome", "rightMenuClick", "onUserClick", "homeScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/homeScreen/homeScreenViewmodel;", "app_debug"})
public final class HomeScreenComponentsKt {
    
    /**
     * Pujas, calificación de usuarios.
     * BDDs: users, cars, pujas
     * Notificaciones
     * API PARA MARCAS Y ¿MODELOS? Y UTILIZAR FOTOS DESPUES
     */
    @androidx.compose.runtime.Composable
    public static final void PantallaPrincipalComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String textWelcome, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> rightMenuClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onUserClick, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel homeScreenViewmodel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CarCardComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString makeModelText, @org.jetbrains.annotations.NotNull
    java.lang.String priceText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString locationText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString yearText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString kmText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString transText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString fuelTypeText, @org.jetbrains.annotations.NotNull
    java.lang.String image, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCarClick) {
    }
}