package com.google.relay.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

/**
 * Box [Constraints], but which abstract away width and height in favor of main axis and cross axis.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0000J\u001e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006#"}, d2 = {"Lcom/google/relay/compose/OrientationIndependentConstraints;", "", "c", "Landroidx/compose/ui/unit/Constraints;", "orientation", "Lcom/google/relay/compose/LayoutOrientation;", "(JLcom/google/relay/compose/LayoutOrientation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "(IIII)V", "getCrossAxisMax", "()I", "getCrossAxisMin", "getMainAxisMax", "getMainAxisMin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "maxHeight", "maxWidth", "stretchCrossAxis", "toBoxConstraints", "toBoxConstraints-OenEA2s", "(Lcom/google/relay/compose/LayoutOrientation;)J", "toString", "", "app_debug"})
public final class OrientationIndependentConstraints {
    private final int mainAxisMin = 0;
    private final int mainAxisMax = 0;
    private final int crossAxisMin = 0;
    private final int crossAxisMax = 0;
    
    public OrientationIndependentConstraints(int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
        super();
    }
    
    public final int getMainAxisMin() {
        return 0;
    }
    
    public final int getMainAxisMax() {
        return 0;
    }
    
    public final int getCrossAxisMin() {
        return 0;
    }
    
    public final int getCrossAxisMax() {
        return 0;
    }
    
    private OrientationIndependentConstraints(long c, com.google.relay.compose.LayoutOrientation orientation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.relay.compose.OrientationIndependentConstraints stretchCrossAxis() {
        return null;
    }
    
    public final int maxWidth(@org.jetbrains.annotations.NotNull
    com.google.relay.compose.LayoutOrientation orientation) {
        return 0;
    }
    
    public final int maxHeight(@org.jetbrains.annotations.NotNull
    com.google.relay.compose.LayoutOrientation orientation) {
        return 0;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.relay.compose.OrientationIndependentConstraints copy(int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}