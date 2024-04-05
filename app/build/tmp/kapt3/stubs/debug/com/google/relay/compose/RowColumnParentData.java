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
 * Parent data associated with children.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/google/relay/compose/RowColumnParentData;", "", "weight", "", "fill", "", "crossAxisAlignmentImpl", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "(FZLcom/google/relay/compose/CrossAxisAlignmentImpl;)V", "getCrossAxisAlignmentImpl", "()Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "setCrossAxisAlignmentImpl", "(Lcom/google/relay/compose/CrossAxisAlignmentImpl;)V", "getFill", "()Z", "setFill", "(Z)V", "getWeight", "()F", "setWeight", "(F)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class RowColumnParentData {
    private float weight;
    private boolean fill;
    @org.jetbrains.annotations.Nullable
    private com.google.relay.compose.CrossAxisAlignmentImpl crossAxisAlignmentImpl;
    
    public RowColumnParentData(float weight, boolean fill, @org.jetbrains.annotations.Nullable
    com.google.relay.compose.CrossAxisAlignmentImpl crossAxisAlignmentImpl) {
        super();
    }
    
    public final float getWeight() {
        return 0.0F;
    }
    
    public final void setWeight(float p0) {
    }
    
    public final boolean getFill() {
        return false;
    }
    
    public final void setFill(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.relay.compose.CrossAxisAlignmentImpl getCrossAxisAlignmentImpl() {
        return null;
    }
    
    public final void setCrossAxisAlignmentImpl(@org.jetbrains.annotations.Nullable
    com.google.relay.compose.CrossAxisAlignmentImpl p0) {
    }
    
    public RowColumnParentData() {
        super();
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.relay.compose.CrossAxisAlignmentImpl component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.relay.compose.RowColumnParentData copy(float weight, boolean fill, @org.jetbrains.annotations.Nullable
    com.google.relay.compose.CrossAxisAlignmentImpl crossAxisAlignmentImpl) {
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