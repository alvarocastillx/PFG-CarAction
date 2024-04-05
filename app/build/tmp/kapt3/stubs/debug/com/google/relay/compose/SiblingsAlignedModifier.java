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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\r\u000eB \b\u0004\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\b\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\nH&\u0082\u0001\u0002\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/google/relay/compose/SiblingsAlignedModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "WithAlignmentLine", "WithAlignmentLineBlock", "Lcom/google/relay/compose/SiblingsAlignedModifier$WithAlignmentLine;", "Lcom/google/relay/compose/SiblingsAlignedModifier$WithAlignmentLineBlock;", "app_debug"})
public abstract class SiblingsAlignedModifier extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.layout.ParentDataModifier {
    
    private SiblingsAlignedModifier(kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> inspectorInfo) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object modifyParentData(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.unit.Density parentData, @org.jetbrains.annotations.Nullable
    java.lang.Object p1);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u000f*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/google/relay/compose/SiblingsAlignedModifier$WithAlignmentLine;", "Lcom/google/relay/compose/SiblingsAlignedModifier;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/layout/AlignmentLine;Lkotlin/jvm/functions/Function1;)V", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "equals", "", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "app_debug"})
    public static final class WithAlignmentLine extends com.google.relay.compose.SiblingsAlignedModifier {
        @org.jetbrains.annotations.NotNull
        private final androidx.compose.ui.layout.AlignmentLine alignmentLine = null;
        
        public WithAlignmentLine(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.AlignmentLine alignmentLine, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> inspectorInfo) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.ui.layout.AlignmentLine getAlignmentLine() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.Object modifyParentData(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B2\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u0010*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/google/relay/compose/SiblingsAlignedModifier$WithAlignmentLineBlock;", "Lcom/google/relay/compose/SiblingsAlignedModifier;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBlock", "()Lkotlin/jvm/functions/Function1;", "equals", "", "other", "", "hashCode", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "app_debug"})
    public static final class WithAlignmentLineBlock extends com.google.relay.compose.SiblingsAlignedModifier {
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Measured, java.lang.Integer> block = null;
        
        public WithAlignmentLineBlock(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> block, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> inspectorInfo) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Measured, java.lang.Integer> getBlock() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.Object modifyParentData(@org.jetbrains.annotations.NotNull
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
}