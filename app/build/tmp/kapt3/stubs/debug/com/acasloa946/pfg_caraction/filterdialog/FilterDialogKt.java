package com.acasloa946.pfg_caraction.filterdialog;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import com.acasloa946.pfg_caraction.R;
import com.google.relay.compose.RelayContainerArrangement;
import com.google.relay.compose.RelayContainerScope;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a>\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a>\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u0012\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a2\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\b\u0010\u0012\u001a\u00020\u0001H\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a0\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a0\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a\u0012\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006\u001c"}, d2 = {"ApplyText", "", "modifier", "Landroidx/compose/ui/Modifier;", "ButtonApply", "onApplyClick", "Lkotlin/Function0;", "content", "Lkotlin/Function1;", "Lcom/google/relay/compose/RelayContainerScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ButtonApplySynth", "ButtonDeleteFilters", "onDeleteFilterClick", "ButtonDeleteFiltersSynth", "Class1", "FilterDialog", "FilterDialogPreview", "FilterTexx", "KM", "PRECIO", "ReaDeFiltrado", "Rectangle4", "SliderKMFrame", "SliderKMPrice", "TopLevel", "VectorFav", "app_debug"})
public final class FilterDialogKt {
    
    /**
     * This composable was generated from the UI Package 'filter_dialog'.
     * Generated code; do not edit directly
     */
    @androidx.compose.runtime.Composable
    public static final void FilterDialog(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onApplyClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteFilterClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(widthDp = 322, heightDp = 350)
    @androidx.compose.runtime.Composable
    private static final void FilterDialogPreview() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ReaDeFiltrado(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Rectangle4(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SliderKMFrame(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void KM(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SliderKMPrice(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void PRECIO(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ApplyText(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonApplySynth(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void VectorFav(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonApply(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onApplyClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FilterTexx(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonDeleteFiltersSynth(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Class1(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonDeleteFilters(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteFilterClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TopLevel(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
}