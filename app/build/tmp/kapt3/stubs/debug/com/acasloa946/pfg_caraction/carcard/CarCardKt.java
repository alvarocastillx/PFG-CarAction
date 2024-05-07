package com.acasloa946.pfg_caraction.carcard;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import com.acasloa946.pfg_caraction.R;
import com.google.relay.compose.RelayContainerArrangement;
import com.google.relay.compose.RelayContainerScope;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001ah\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0003\u001a0\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0014\u00a2\u0006\u0002\b\u0015H\u0007\u001a0\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0014\u00a2\u0006\u0002\b\u0015H\u0007\u001a0\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0014\u00a2\u0006\u0002\b\u0015H\u0007\u001a0\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0014\u00a2\u0006\u0002\b\u0015H\u0007\u001a0\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0014\u00a2\u0006\u0002\b\u0015H\u0007\u001a\u001a\u0010\u001a\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010\u001b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010\u001f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010 \u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010!\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a>\u0010\"\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0014\u00a2\u0006\u0002\b\u0015H\u0007\u001a\u001a\u0010#\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010$\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006%"}, d2 = {"CarCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "makeModelText", "Landroidx/compose/ui/text/AnnotatedString;", "priceText", "", "locationText", "yearText", "kmText", "transText", "fuelTypeText", "onCarClick", "Lkotlin/Function0;", "CarCardPreview", "Frame1", "content", "Lkotlin/Function1;", "Lcom/google/relay/compose/RelayContainerScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Frame2", "Frame3", "Frame4", "FrameImage", "FuelTypeText", "KMText", "Line1", "Line2", "Line3", "LocationText", "MakeModelText", "PriceText", "TopLevel", "TransType", "YearText", "app_debug"})
public final class CarCardKt {
    
    /**
     * This composable was generated from the UI Package 'car_card'.
     * Generated code; do not edit directly
     */
    @androidx.compose.runtime.Composable
    public static final void CarCard(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString makeModelText, @org.jetbrains.annotations.NotNull
    java.lang.String priceText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString locationText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString yearText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString kmText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString transText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString fuelTypeText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCarClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(widthDp = 392, heightDp = 411)
    @androidx.compose.runtime.Composable
    private static final void CarCardPreview() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FrameImage(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Line1(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MakeModelText(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString makeModelText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Line2(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void LocationText(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString locationText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void YearText(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString yearText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Frame1(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void KMText(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString kmText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Frame2(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TransType(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString transText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Frame4(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FuelTypeText(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.AnnotatedString fuelTypeText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Frame3(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Line3(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void PriceText(@org.jetbrains.annotations.NotNull
    java.lang.String priceText, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TopLevel(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCarClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
}