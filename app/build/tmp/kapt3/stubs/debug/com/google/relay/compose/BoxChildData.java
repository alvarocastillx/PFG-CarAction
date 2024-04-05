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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000b\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u0000*\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/google/relay/compose/BoxChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "alignment", "Landroidx/compose/ui/Alignment;", "matchParentSize", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getMatchParentSize", "()Z", "setMatchParentSize", "(Z)V", "equals", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "app_debug"})
@kotlin.Suppress(names = {"ModifierFactoryReturnType", "ModifierFactoryExtensionFunction"})
public final class BoxChildData extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.layout.ParentDataModifier {
    @org.jetbrains.annotations.NotNull
    private androidx.compose.ui.Alignment alignment;
    private boolean matchParentSize;
    
    public BoxChildData(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment alignment, boolean matchParentSize, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> inspectorInfo) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.ui.Alignment getAlignment() {
        return null;
    }
    
    public final void setAlignment(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Alignment p0) {
    }
    
    public final boolean getMatchParentSize() {
        return false;
    }
    
    public final void setMatchParentSize(boolean p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.google.relay.compose.BoxChildData modifyParentData(@org.jetbrains.annotations.NotNull
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