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

/**
 * Scope for the children of [RelayRow].
 */
@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J \u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\'J\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\f\u0010\r\u001a\u00020\u0003*\u00020\u0003H\'J\u001e\u0010\u000e\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/google/relay/compose/RowScope;", "", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", "fill", "", "app_debug"})
@androidx.compose.runtime.Immutable
public abstract interface RowScope {
    
    /**
     * Size the element's width proportional to its [weight] relative to other weighted sibling
     * elements in the [RelayRow]. The parent will divide the horizontal space remaining after measuring
     * unweighted child elements and distribute it according to this weight.
     * When [fill] is true, the element will be forced to occupy the whole width allocated to it.
     * Otherwise, the element is allowed to be smaller - this will result in [RelayRow] being smaller,
     * as the unused allocated width will not be redistributed to other siblings.
     *
     * @param weight The proportional width to give to this element, as related to the total of
     * all weighted siblings. Must be positive.
     * @param fill When `true`, the element will occupy the whole width allocated.
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier weight(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier weight, float fill, boolean p2);
    
    /**
     * Align the element vertically within the [RelayRow]. This alignment will have priority over the
     * [RelayRow]'s `verticalAlignment` parameter.
     *
     * Example usage:
     * @sample androidx.compose.foundation.layout.samples.SimpleAlignInRow
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier align(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier alignment, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment.Vertical p1);
    
    /**
     * Position the element vertically such that its [alignmentLine] aligns with sibling elements
     * also configured to [alignBy]. [alignBy] is a form of [align],
     * so both modifiers will not work together if specified for the same layout.
     * [alignBy] can be used to align two layouts by baseline inside a [RelayRow],
     * using `alignBy(FirstBaseline)`.
     * Within a [RelayRow], all components with [alignBy] will align vertically using
     * the specified [HorizontalAlignmentLine]s or values provided using the other
     * [alignBy] overload, forming a sibling group.
     * At least one element of the sibling group will be placed as it had [Alignment.Top] align
     * in [RelayRow], and the alignment of the other siblings will be then determined such that
     * the alignment lines coincide. Note that if only one element in a [RelayRow] has the
     * [alignBy] modifier specified the element will be positioned
     * as if it had [Alignment.Top] align.
     *
     * @see alignByBaseline
     *
     * Example usage:
     * @sample androidx.compose.foundation.layout.samples.SimpleAlignByInRow
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier alignBy(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier alignmentLine, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.layout.HorizontalAlignmentLine p1);
    
    /**
     * Position the element vertically such that its first baseline aligns with sibling elements
     * also configured to [alignByBaseline] or [alignBy]. This modifier is a form
     * of [align], so both modifiers will not work together if specified for the same layout.
     * [alignByBaseline] is a particular case of [alignBy]. See [alignBy] for
     * more details.
     *
     * @see alignBy
     *
     * Example usage:
     * @sample androidx.compose.foundation.layout.samples.SimpleAlignByInRow
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier alignByBaseline(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier p0);
    
    /**
     * Position the element vertically such that the alignment line for the content as
     * determined by [alignmentLineBlock] aligns with sibling elements also configured to
     * [alignBy]. [alignBy] is a form of [align], so both modifiers
     * will not work together if specified for the same layout.
     * Within a [RelayRow], all components with [alignBy] will align vertically using
     * the specified [HorizontalAlignmentLine]s or values obtained from [alignmentLineBlock],
     * forming a sibling group.
     * At least one element of the sibling group will be placed as it had [Alignment.Top] align
     * in [RelayRow], and the alignment of the other siblings will be then determined such that
     * the alignment lines coincide. Note that if only one element in a [RelayRow] has the
     * [alignBy] modifier specified the element will be positioned
     * as if it had [Alignment.Top] align.
     *
     * Example usage:
     * @sample androidx.compose.foundation.layout.samples.SimpleAlignByInRow
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier alignBy(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier alignmentLineBlock, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> p1);
    
    /**
     * Scope for the children of [RelayRow].
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}