package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.navigation.NavController;
import com.acasloa946.pfg_caraction.Navigation.Routes;
import com.acasloa946.pfg_caraction.R;
import com.acasloa946.pfg_caraction.UserInterface.Main.FilterDialog.FilterDialogViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u001a\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001ab\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a,\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00052\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\u001a\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006\u001e"}, d2 = {"CarCardComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "makeModelText", "", "priceText", "onCarClick", "Lkotlin/Function0;", "image", "FilterDialog", "homeScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/homeScreen/homeScreenViewmodel;", "filterDialogViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/FilterDialog/FilterDialogViewmodel;", "MakeModelTextC", "NotFoundAlertComponent", "PantallaPrincipalComponent", "textWelcome", "rightMenuClick", "onUserClick", "navController", "Landroidx/navigation/NavController;", "carScreenViewmodel", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carScreen/CarScreenViewmodel;", "onFilterClick", "SearchButtonComponent", "searchText", "onSearchClick", "TextComponent", "app_debug"})
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
    com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel homeScreenViewmodel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel carScreenViewmodel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFilterClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CarCardComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String makeModelText, @org.jetbrains.annotations.NotNull
    java.lang.String priceText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCarClick, @org.jetbrains.annotations.NotNull
    java.lang.String image) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MakeModelTextC(@org.jetbrains.annotations.NotNull
    java.lang.String makeModelText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SearchButtonComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String searchText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TextComponent(@org.jetbrains.annotations.NotNull
    java.lang.String searchText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NotFoundAlertComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FilterDialog(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel homeScreenViewmodel, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.Main.FilterDialog.FilterDialogViewmodel filterDialogViewmodel) {
    }
}