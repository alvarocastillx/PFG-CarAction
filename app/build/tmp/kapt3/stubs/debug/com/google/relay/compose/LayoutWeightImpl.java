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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000b\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/google/relay/compose/LayoutWeightImpl;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "weight", "", "fill", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FZLkotlin/jvm/functions/Function1;)V", "getFill", "()Z", "getWeight", "()F", "equals", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Lcom/google/relay/compose/RowColumnParentData;", "Landroidx/compose/ui/unit/Density;", "parentData", "app_debug"})
public final class LayoutWeightImpl extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.layout.ParentDataModifier {
    private final float weight = 0.0F;
    private final boolean fill = false;
    
    public LayoutWeightImpl(float weight, boolean fill, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> inspectorInfo) {
        super(null);
    }
    
    public final float getWeight() {
        return 0.0F;
    }
    
    public final boolean getFill() {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.google.relay.compose.RowColumnParentData modifyParentData(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.unit.Density $this$modifyParentData, @org.jetbrains.annotations.Nullable
    java.lang.Object parentData) {
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