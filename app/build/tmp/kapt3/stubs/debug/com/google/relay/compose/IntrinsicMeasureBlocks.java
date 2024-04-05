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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R/\u0010\u0003\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR/\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR/\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR/\u0010\u000e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR/\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR/\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR/\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR/\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/google/relay/compose/IntrinsicMeasureBlocks;", "", "()V", "HorizontalMaxHeight", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getHorizontalMaxHeight", "()Lkotlin/jvm/functions/Function3;", "HorizontalMaxWidth", "getHorizontalMaxWidth", "HorizontalMinHeight", "getHorizontalMinHeight", "HorizontalMinWidth", "getHorizontalMinWidth", "VerticalMaxHeight", "getVerticalMaxHeight", "VerticalMaxWidth", "getVerticalMaxWidth", "VerticalMinHeight", "getVerticalMinHeight", "VerticalMinWidth", "getVerticalMinWidth", "app_debug"})
final class IntrinsicMeasureBlocks {
    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> HorizontalMinWidth = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> VerticalMinWidth = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> HorizontalMinHeight = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> VerticalMinHeight = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> HorizontalMaxWidth = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> VerticalMaxWidth = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> HorizontalMaxHeight = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> VerticalMaxHeight = null;
    @org.jetbrains.annotations.NotNull
    public static final com.google.relay.compose.IntrinsicMeasureBlocks INSTANCE = null;
    
    private IntrinsicMeasureBlocks() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getHorizontalMinWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getVerticalMinWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getHorizontalMinHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getVerticalMinHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getHorizontalMaxWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getVerticalMaxWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getHorizontalMaxHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getVerticalMaxHeight() {
        return null;
    }
}