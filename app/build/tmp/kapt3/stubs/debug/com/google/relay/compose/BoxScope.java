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

/**
 * A BoxScope provides a scope for the children of [RelayBox] and [BoxWithConstraints].
 */
@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/google/relay/compose/BoxScope;", "", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "matchParentSize", "app_debug"})
@androidx.compose.runtime.Immutable
public abstract interface BoxScope {
    
    /**
     * Pull the content element to a specific [Alignment] within the [RelayBox]. This alignment will
     * have priority over the [RelayBox]'s `alignment` parameter.
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier align(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier alignment, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment p1);
    
    /**
     * Size the element to match the size of the [RelayBox] after all other content elements have
     * been measured.
     *
     * The element using this modifier does not take part in defining the size of the [RelayBox].
     * Instead, it matches the size of the [RelayBox] after all other children (not using
     * matchParentSize() modifier) have been measured to obtain the [RelayBox]'s size.
     * In contrast, a general-purpose [Modifier.fillMaxSize] modifier, which makes an element
     * occupy all available space, will take part in defining the size of the [RelayBox]. Consequently,
     * using it for an element inside a [RelayBox] will make the [RelayBox] itself always fill the
     * available space.
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier matchParentSize(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier p0);
}