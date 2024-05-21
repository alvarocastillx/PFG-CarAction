package com.acasloa946.pfg_caraction.carscreen;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import com.acasloa946.pfg_caraction.R;
import com.google.relay.compose.MainAxisAlignment;
import com.google.relay.compose.RelayContainerArrangement;
import com.google.relay.compose.RelayContainerScope;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b9\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a>\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a>\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u008c\u0001\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u001a\b\u0010\u001b\u001a\u00020\u0001H\u0003\u001a\u0012\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010$\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010&\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010\'\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010(\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u001a\u0010)\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010*\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u001a\u0010+\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010,\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010-\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010.\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u001a\u0010/\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u00100\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u001a\u00101\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u00102\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u00103\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u00104\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u00105\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u00106\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u00107\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u00108\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u00109\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010;\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010<\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010=\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010>\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010?\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u001a\u0010@\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010A\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010B\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u0012\u0010C\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010D\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010E\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010F\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010G\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006H"}, d2 = {"AO", "", "yearText", "", "modifier", "Landroidx/compose/ui/Modifier;", "Banner", "content", "Lkotlin/Function1;", "Lcom/google/relay/compose/RelayContainerScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BannerImage", "ButtonContact", "onContactClick", "Lkotlin/Function0;", "ButtonFavs", "onFavClick", "CarScreen", "makeText", "modelText", "plateText", "localizationText", "kmText", "transText", "fuelText", "priceText", "CarScreenPreview", "ContactarConVendedor", "Elipe", "FavText", "FieldAO", "FieldFuel", "FieldKM", "FieldLocalization", "FieldMake", "FieldModel", "FieldPlate", "FieldPrice", "FieldTrans", "FrameUsername", "Fueld", "ImageFrame", "KMS", "LocalizaciN", "MainCarScreen", "MapFrame", "Marca", "MaterialSymbolsMenu", "MatrCula", "Modelo", "Precio", "RC", "RC2", "RC3", "RC4", "RC6", "RC7", "Rectangle", "Rectangle2", "Rectangle3", "RectangleFav", "RectanglePublish", "TopLevel", "Trans", "UserImage", "UserImageSynth", "UserImageVECVEC", "UserName", "Vector", "VectorFav", "VectorPublish", "app_debug"})
public final class CarScreenKt {
    
    /**
     * This composable was generated from the UI Package 'car_screen'.
     * Generated code; do not edit directly
     */
    @androidx.compose.runtime.Composable
    public static final void CarScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String makeText, @org.jetbrains.annotations.NotNull
    java.lang.String modelText, @org.jetbrains.annotations.NotNull
    java.lang.String plateText, @org.jetbrains.annotations.NotNull
    java.lang.String localizationText, @org.jetbrains.annotations.NotNull
    java.lang.String yearText, @org.jetbrains.annotations.NotNull
    java.lang.String kmText, @org.jetbrains.annotations.NotNull
    java.lang.String transText, @org.jetbrains.annotations.NotNull
    java.lang.String fuelText, @org.jetbrains.annotations.NotNull
    java.lang.String priceText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onContactClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFavClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(widthDp = 360, heightDp = 1295)
    @androidx.compose.runtime.Composable
    private static final void CarScreenPreview() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Vector(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MaterialSymbolsMenu(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BannerImage(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Banner(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void UserName(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Elipe(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void UserImageSynth(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void UserImageVECVEC(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void UserImage(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FrameUsername(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ImageFrame(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MapFrame(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Rectangle2(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Marca(@org.jetbrains.annotations.NotNull
    java.lang.String makeText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldMake(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RC(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Modelo(@org.jetbrains.annotations.NotNull
    java.lang.String modelText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldModel(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Rectangle(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MatrCula(@org.jetbrains.annotations.NotNull
    java.lang.String plateText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldPlate(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Rectangle3(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void LocalizaciN(@org.jetbrains.annotations.NotNull
    java.lang.String localizationText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldLocalization(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RC2(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AO(@org.jetbrains.annotations.NotNull
    java.lang.String yearText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldAO(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RC3(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void KMS(@org.jetbrains.annotations.NotNull
    java.lang.String kmText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldKM(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RC6(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Trans(@org.jetbrains.annotations.NotNull
    java.lang.String transText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldTrans(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RC7(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Fueld(@org.jetbrains.annotations.NotNull
    java.lang.String fuelText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldFuel(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RC4(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Precio(@org.jetbrains.annotations.NotNull
    java.lang.String priceText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FieldPrice(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RectanglePublish(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void VectorPublish(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ContactarConVendedor(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonContact(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onContactClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RectangleFav(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void VectorFav(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FavText(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonFavs(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFavClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MainCarScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TopLevel(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
}