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

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u001a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\\\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\u0002\b\u001f2\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\u0002\b\u001f2\u0006\u0010!\u001a\u00020\u0015H\u0002\u001aE\u0010\"\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\u0002\b\u001f2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015H\u0002\u001at\u0010%\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\u0002\b\u001f2\u001d\u0010\'\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\u0002\b\u001f2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002\u001aa\u0010*\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u00172*\u0010,\u001a&\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002010-2\u0006\u00102\u001a\u0002032\u0006\u0010 \u001a\u0002042\u0006\u0010\u0000\u001a\u00020\u0001H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b5\u00106\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\n*\u0004\u0018\u00010\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\f\"\u001a\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"crossAxisAlignmentImpl", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "Lcom/google/relay/compose/RowColumnParentData;", "getCrossAxisAlignmentImpl", "(Lcom/google/relay/compose/RowColumnParentData;)Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "data", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Lcom/google/relay/compose/RowColumnParentData;", "fill", "", "getFill", "(Lcom/google/relay/compose/RowColumnParentData;)Z", "isRelative", "weight", "", "getWeight", "(Lcom/google/relay/compose/RowColumnParentData;)F", "MaxIntrinsicHeightMeasureBlock", "Lkotlin/Function3;", "", "", "orientation", "Lcom/google/relay/compose/LayoutOrientation;", "MaxIntrinsicWidthMeasureBlock", "MinIntrinsicHeightMeasureBlock", "MinIntrinsicWidthMeasureBlock", "intrinsicCrossAxisSize", "children", "mainAxisSize", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "crossAxisSize", "mainAxisAvailable", "intrinsicMainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "intrinsicSize", "intrinsicMainSize", "intrinsicCrossSize", "layoutOrientation", "intrinsicOrientation", "rowColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "arrangement", "Lkotlin/Function5;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "Lcom/google/relay/compose/SizeMode;", "rowColumnMeasurePolicy-TDGSqEk", "(Lcom/google/relay/compose/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLcom/google/relay/compose/SizeMode;Lcom/google/relay/compose/CrossAxisAlignmentImpl;)Landroidx/compose/ui/layout/MeasurePolicy;", "app_debug"})
public final class RelayRowColumnImplKt {
    
    private static final com.google.relay.compose.RowColumnParentData getData(androidx.compose.ui.layout.IntrinsicMeasurable $this$data) {
        return null;
    }
    
    private static final float getWeight(com.google.relay.compose.RowColumnParentData $this$weight) {
        return 0.0F;
    }
    
    private static final boolean getFill(com.google.relay.compose.RowColumnParentData $this$fill) {
        return false;
    }
    
    private static final com.google.relay.compose.CrossAxisAlignmentImpl getCrossAxisAlignmentImpl(com.google.relay.compose.RowColumnParentData $this$crossAxisAlignmentImpl) {
        return null;
    }
    
    private static final boolean isRelative(com.google.relay.compose.RowColumnParentData $this$isRelative) {
        return false;
    }
    
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> MinIntrinsicWidthMeasureBlock(com.google.relay.compose.LayoutOrientation orientation) {
        return null;
    }
    
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> MinIntrinsicHeightMeasureBlock(com.google.relay.compose.LayoutOrientation orientation) {
        return null;
    }
    
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> MaxIntrinsicWidthMeasureBlock(com.google.relay.compose.LayoutOrientation orientation) {
        return null;
    }
    
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> MaxIntrinsicHeightMeasureBlock(com.google.relay.compose.LayoutOrientation orientation) {
        return null;
    }
    
    private static final int intrinsicSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> children, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> intrinsicMainSize, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> intrinsicCrossSize, int crossAxisAvailable, int mainAxisSpacing, com.google.relay.compose.LayoutOrientation layoutOrientation, com.google.relay.compose.LayoutOrientation intrinsicOrientation) {
        return 0;
    }
    
    private static final int intrinsicMainAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> children, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> mainAxisSize, int crossAxisAvailable, int mainAxisSpacing) {
        return 0;
    }
    
    private static final int intrinsicCrossAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> children, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> mainAxisSize, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> crossAxisSize, int mainAxisAvailable) {
        return 0;
    }
}