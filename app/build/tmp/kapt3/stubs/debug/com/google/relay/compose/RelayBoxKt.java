package com.google.relay.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.LayoutDirection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001aH\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\b\u001aH\u0087\b\u00f8\u0001\u0000\u001a\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0001\u001a<\u0010\u001e\u001a\u00020\u0010*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006("}, d2 = {"DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "matchesParentSize", "", "Landroidx/compose/ui/layout/Measurable;", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "variantBoxChildData", "Lcom/google/relay/compose/BoxChildData;", "getVariantBoxChildData", "(Landroidx/compose/ui/layout/Measurable;)Lcom/google/relay/compose/BoxChildData;", "RelayBox", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "content", "Lkotlin/Function1;", "Lcom/google/relay/compose/RelayContainerScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "boxMeasurePolicy", "alignment", "rememberBoxMeasurePolicy", "placeInBox", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "measurable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "boxWidth", "", "boxHeight", "app_debug"})
public final class RelayBoxKt {
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.ui.layout.MeasurePolicy DefaultBoxMeasurePolicy = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.ui.layout.MeasurePolicy EmptyBoxMeasurePolicy = null;
    
    /**
     * A layout composable with [content].
     * The [RelayBox] will size itself to fit the content, subject to the incoming constraints.
     * When children are smaller than the parent, by default they will be positioned inside
     * the [RelayBox] according to the [contentAlignment]. For individually specifying the alignments
     * of the children layouts, use the [BoxScope.align] modifier.
     * By default, the content will be measured without the [RelayBox]'s incoming min constraints,
     * unless [propagateMinConstraints] is `true`.
     * When the content has more than one layout child the layout children will be stacked one
     * on top of the other (positioned as explained above) in the composition order.
     *
     * Example usage:
     * @sample androidx.compose.foundation.layout.samples.SimpleBox
     *
     * @param modifier The modifier to be applied to the layout.
     * @param contentAlignment The default alignment inside the box.
     * @param propagateMinConstraints Whether the incoming min constraints should be passed to content.
     * @param content The content of the [RelayBox].
     */
    @androidx.compose.runtime.Composable
    public static final void RelayBox(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment contentAlignment, boolean propagateMinConstraints, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    @kotlin.PublishedApi
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment alignment, boolean propagateMinConstraints) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.layout.MeasurePolicy getDefaultBoxMeasurePolicy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.layout.MeasurePolicy boxMeasurePolicy(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment alignment, boolean propagateMinConstraints) {
        return null;
    }
    
    private static final void placeInBox(androidx.compose.ui.layout.Placeable.PlacementScope $this$placeInBox, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.LayoutDirection layoutDirection, int boxWidth, int boxHeight, androidx.compose.ui.Alignment alignment) {
    }
    
    /**
     * A box with no content that can participate in layout, drawing, pointer input
     * due to the [modifier] applied to it.
     *
     * Example usage:
     *
     * @param modifier The modifier to be applied to the layout.
     */
    @androidx.compose.runtime.Composable
    public static final void RelayBox(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.layout.MeasurePolicy getEmptyBoxMeasurePolicy() {
        return null;
    }
    
    @kotlin.Suppress(names = {"ModifierFactoryReturnType", "ModifierFactoryExtensionFunction"})
    private static final com.google.relay.compose.BoxChildData getVariantBoxChildData(androidx.compose.ui.layout.Measurable $this$variantBoxChildData) {
        return null;
    }
    
    private static final boolean getMatchesParentSize(androidx.compose.ui.layout.Measurable $this$matchesParentSize) {
        return false;
    }
}