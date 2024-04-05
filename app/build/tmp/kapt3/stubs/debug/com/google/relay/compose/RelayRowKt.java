package com.google.relay.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\u0002\b\u0011\u00a2\u0006\u0002\b\u0012H\u0087\b\u00f8\u0001\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0014"}, d2 = {"DefaultRowMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy$annotations", "()V", "getDefaultRowMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "RelayRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "content", "Lkotlin/Function1;", "Lcom/google/relay/compose/RelayContainerScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "rowMeasurePolicy", "app_debug"})
public final class RelayRowKt {
    
    /**
     * MeasureBlocks to use when horizontalArrangement and verticalAlignment are not provided.
     */
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.ui.layout.MeasurePolicy DefaultRowMeasurePolicy = null;
    
    /**
     * A layout composable that places its children in a horizontal sequence. For a layout composable
     * that places its children in a vertical sequence, see [RelayColumnolumn]. For a layout that places children
     * in a horizontal sequence and is also scrollable, see `ScrollableRow`. For a horizontally
     * scrollable list that only composes and lays out the currently visible items see `LazyRow`.
     *
     * The [RelayRow] layout is able to assign children widths according to their weights provided
     * using the [RowScope.weight] modifier. If a child is not provided a weight, it will be
     * asked for its preferred width before the sizes of the children with weights are calculated
     * proportionally to their weight based on the remaining available space.
     *
     * When none of its children have weights, a [RelayRow] will be as small as possible to fit its
     * children one next to the other. In order to change the width of the [RelayRow], use the
     * [Modifier.requiredWidth] modifiers; e.g. to make it fill the available width [Modifier.fillMaxWidth]
     * can be used. If at least one child of a [RelayRow] has a [weight][RowScope.weight], the [RelayRow] will
     * fill the available width, so there is no need for [Modifier.fillMaxWidth]. However, if [RelayRow]'s
     * size should be limited, the [Modifier.requiredWidth] or [Modifier.requiredSize] layout modifiers should be
     * applied.
     *
     * When the size of the [RelayRow] is larger than the sum of its children sizes, a
     * [horizontalArrangement] can be specified to define the positioning of the children inside
     * the [RelayRow]. See [Arrangement] for available positioning behaviors; a custom arrangement can
     * also be defined using the constructor of [Arrangement].
     *
     * Example usage:
     *
     * @sample androidx.compose.foundation.layout.samples.SimpleRow
     *
     * @param modifier The modifier to be applied to the RelayRow.
     * @param horizontalArrangement The horizontal arrangement of the layout's children.
     * @param verticalAlignment The vertical alignment of the layout's children.
     *
     * @see RelayColumn
     * @see [androidx.compose.foundation.lazy.LazyRow]
     */
    @androidx.compose.runtime.Composable
    public static final void RelayRow(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment.Vertical verticalAlignment, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.relay.compose.RelayContainerScope, kotlin.Unit> content) {
    }
    
    /**
     * MeasureBlocks to use when horizontalArrangement and verticalAlignment are not provided.
     */
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.layout.MeasurePolicy getDefaultRowMeasurePolicy() {
        return null;
    }
    
    /**
     * MeasureBlocks to use when horizontalArrangement and verticalAlignment are not provided.
     */
    @kotlin.PublishedApi
    @java.lang.Deprecated
    public static void getDefaultRowMeasurePolicy$annotations() {
    }
    
    @kotlin.PublishedApi
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy(@org.jetbrains.annotations.NotNull
    androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment.Vertical verticalAlignment) {
        return null;
    }
}