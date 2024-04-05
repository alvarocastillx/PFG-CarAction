package com.acasloa946.pfg_caraction.mainq1;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import com.acasloa946.pfg_caraction.R;
import com.google.relay.compose.CrossAxisAlignment;
import com.google.relay.compose.MainAxisAlignment;
import com.google.relay.compose.RelayContainerArrangement;
import com.google.relay.compose.RelayContainerScope;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a>\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\b\nH\u0007\u001a0\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\b\nH\u0007\u001a\u0012\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\b\nH\u0007\u001a\u0012\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\"\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\b\u0010\u0011\u001a\u00020\u0001H\u0003\u001a\u0012\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0012\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\b\nH\u0007\u001a\u0012\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a0\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\b\nH\u0007\u00a8\u0006\u0019"}, d2 = {"ButtonNext", "", "onNextClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Lcom/google/relay/compose/RelayContainerScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ButtonNextGroup", "Ellipse2", "Ellipse3", "Frame1", "ImageCarAction", "MainQ1", "MainQ1Preview", "Rectangle2", "RectangleButtonSell", "Siguiente", "TexrNext", "TextFieldName", "TextName", "TopLevel", "app_debug"})
public final class MainQ1Kt {
    
    /**
     * This composable was generated from the UI Package 'main_q1'.
     * Generated code; do not edit directly
     */
    @androidx.compose.runtime.Composable
    public static final void MainQ1(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(widthDp = 360, heightDp = 695)
    @androidx.compose.runtime.Composable
    private static final void MainQ1Preview() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ImageCarAction(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TextName(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TextFieldName(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Rectangle2(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TexrNext(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RectangleButtonSell(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Siguiente(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonNextGroup(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonNext(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Ellipse3(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Ellipse2(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Frame1(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TopLevel(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
}