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
 * Used to specify the alignment of a layout's children, in cross axis direction.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\u00020\u0001:\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH \u00a2\u0006\u0002\b\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00048PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f\u00a8\u0006 "}, d2 = {"Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "", "()V", "isRelative", "", "isRelative$app_debug", "()Z", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$app_debug", "calculateAlignmentLinePosition", "calculateAlignmentLinePosition$app_debug", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "AlignmentLineCrossAxisAlignmentImpl", "CenterCrossAxisAlignmentImpl", "Companion", "EndCrossAxisAlignmentImpl", "HorizontalCrossAxisAlignmentImpl", "StartCrossAxisAlignmentImpl", "VerticalCrossAxisAlignmentImpl", "Lcom/google/relay/compose/CrossAxisAlignmentImpl$AlignmentLineCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl$CenterCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl$EndCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl$HorizontalCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl$StartCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl$VerticalCrossAxisAlignmentImpl;", "app_debug"})
@androidx.compose.runtime.Immutable
public abstract class CrossAxisAlignmentImpl {
    
    /**
     * Place children such that their center is in the middle of the cross axis.
     */
    @org.jetbrains.annotations.NotNull
    private static final com.google.relay.compose.CrossAxisAlignmentImpl Center = null;
    
    /**
     * Place children such that their start edge is aligned to the start edge of the cross
     * axis. TODO(popam): Consider rtl directionality.
     */
    @org.jetbrains.annotations.NotNull
    private static final com.google.relay.compose.CrossAxisAlignmentImpl Start = null;
    
    /**
     * Place children such that their end edge is aligned to the end edge of the cross
     * axis. TODO(popam): Consider rtl directionality.
     */
    @org.jetbrains.annotations.NotNull
    private static final com.google.relay.compose.CrossAxisAlignmentImpl End = null;
    @org.jetbrains.annotations.NotNull
    public static final com.google.relay.compose.CrossAxisAlignmentImpl.Companion Companion = null;
    
    private CrossAxisAlignmentImpl() {
        super();
    }
    
    /**
     * Aligns to [size]. If this is a vertical alignment, [layoutDirection] should be
     * [LayoutDirection.Ltr].
     *
     * @param size The remaining space (total size - content size) in the container.
     * @param layoutDirection The layout direction of the content if horizontal or
     * [LayoutDirection.Ltr] if vertical.
     * @param placeable The item being aligned.
     * @param beforeCrossAxisAlignmentLine The space before the cross-axis alignment line if
     * an alignment line is being used or 0 if no alignment line is being used.
     */
    public abstract int align$app_debug(int size, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.unit.LayoutDirection layoutDirection, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine);
    
    public boolean isRelative$app_debug() {
        return false;
    }
    
    /**
     * Returns the alignment line position relative to the left/top of the space or `null` if
     * this alignment doesn't rely on alignment lines.
     */
    @org.jetbrains.annotations.Nullable
    public java.lang.Integer calculateAlignmentLinePosition$app_debug(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.layout.Placeable placeable) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0010\u00a2\u0006\u0002\b\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0010\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/google/relay/compose/CrossAxisAlignmentImpl$AlignmentLineCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "alignmentLineProvider", "Lcom/google/relay/compose/AlignmentLineProvider;", "(Lcom/google/relay/compose/AlignmentLineProvider;)V", "getAlignmentLineProvider", "()Lcom/google/relay/compose/AlignmentLineProvider;", "isRelative", "", "isRelative$app_debug", "()Z", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$app_debug", "calculateAlignmentLinePosition", "calculateAlignmentLinePosition$app_debug", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "app_debug"})
    static final class AlignmentLineCrossAxisAlignmentImpl extends com.google.relay.compose.CrossAxisAlignmentImpl {
        @org.jetbrains.annotations.NotNull
        private final com.google.relay.compose.AlignmentLineProvider alignmentLineProvider = null;
        
        public AlignmentLineCrossAxisAlignmentImpl(@org.jetbrains.annotations.NotNull
        com.google.relay.compose.AlignmentLineProvider alignmentLineProvider) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.google.relay.compose.AlignmentLineProvider getAlignmentLineProvider() {
            return null;
        }
        
        @java.lang.Override
        public boolean isRelative$app_debug() {
            return false;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.Integer calculateAlignmentLinePosition$app_debug(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.Placeable placeable) {
            return null;
        }
        
        @java.lang.Override
        public int align$app_debug(int size, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.unit.LayoutDirection layoutDirection, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0010\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/google/relay/compose/CrossAxisAlignmentImpl$CenterCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$app_debug", "app_debug"})
    static final class CenterCrossAxisAlignmentImpl extends com.google.relay.compose.CrossAxisAlignmentImpl {
        @org.jetbrains.annotations.NotNull
        public static final com.google.relay.compose.CrossAxisAlignmentImpl.CenterCrossAxisAlignmentImpl INSTANCE = null;
        
        private CenterCrossAxisAlignmentImpl() {
        }
        
        @java.lang.Override
        public int align$app_debug(int size, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.unit.LayoutDirection layoutDirection, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u00a2\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\b\u001aR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/google/relay/compose/CrossAxisAlignmentImpl$Companion;", "", "()V", "Center", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "getCenter$annotations", "getCenter", "()Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "End", "getEnd$annotations", "getEnd", "Start", "getStart$annotations", "getStart", "AlignmentLine", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "Relative", "alignmentLineProvider", "Lcom/google/relay/compose/AlignmentLineProvider;", "Relative$app_debug", "horizontal", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontal$app_debug", "vertical", "Landroidx/compose/ui/Alignment$Vertical;", "vertical$app_debug", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Place children such that their center is in the middle of the cross axis.
         */
        @org.jetbrains.annotations.NotNull
        public final com.google.relay.compose.CrossAxisAlignmentImpl getCenter() {
            return null;
        }
        
        /**
         * Place children such that their center is in the middle of the cross axis.
         */
        @androidx.compose.runtime.Stable
        @java.lang.Deprecated
        public static void getCenter$annotations() {
        }
        
        /**
         * Place children such that their start edge is aligned to the start edge of the cross
         * axis. TODO(popam): Consider rtl directionality.
         */
        @org.jetbrains.annotations.NotNull
        public final com.google.relay.compose.CrossAxisAlignmentImpl getStart() {
            return null;
        }
        
        /**
         * Place children such that their start edge is aligned to the start edge of the cross
         * axis. TODO(popam): Consider rtl directionality.
         */
        @androidx.compose.runtime.Stable
        @java.lang.Deprecated
        public static void getStart$annotations() {
        }
        
        /**
         * Place children such that their end edge is aligned to the end edge of the cross
         * axis. TODO(popam): Consider rtl directionality.
         */
        @org.jetbrains.annotations.NotNull
        public final com.google.relay.compose.CrossAxisAlignmentImpl getEnd() {
            return null;
        }
        
        /**
         * Place children such that their end edge is aligned to the end edge of the cross
         * axis. TODO(popam): Consider rtl directionality.
         */
        @androidx.compose.runtime.Stable
        @java.lang.Deprecated
        public static void getEnd$annotations() {
        }
        
        /**
         * Align children by their baseline.
         */
        @org.jetbrains.annotations.NotNull
        public final com.google.relay.compose.CrossAxisAlignmentImpl AlignmentLine(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            return null;
        }
        
        /**
         * Align children relative to their siblings using the alignment line provided as a
         * parameter using [AlignmentLineProvider].
         */
        @org.jetbrains.annotations.NotNull
        public final com.google.relay.compose.CrossAxisAlignmentImpl Relative$app_debug(@org.jetbrains.annotations.NotNull
        com.google.relay.compose.AlignmentLineProvider alignmentLineProvider) {
            return null;
        }
        
        /**
         * Align children with vertical alignment.
         */
        @org.jetbrains.annotations.NotNull
        public final com.google.relay.compose.CrossAxisAlignmentImpl vertical$app_debug(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.Alignment.Vertical vertical) {
            return null;
        }
        
        /**
         * Align children with horizontal alignment.
         */
        @org.jetbrains.annotations.NotNull
        public final com.google.relay.compose.CrossAxisAlignmentImpl horizontal$app_debug(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.Alignment.Horizontal horizontal) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0010\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/google/relay/compose/CrossAxisAlignmentImpl$EndCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$app_debug", "app_debug"})
    static final class EndCrossAxisAlignmentImpl extends com.google.relay.compose.CrossAxisAlignmentImpl {
        @org.jetbrains.annotations.NotNull
        public static final com.google.relay.compose.CrossAxisAlignmentImpl.EndCrossAxisAlignmentImpl INSTANCE = null;
        
        private EndCrossAxisAlignmentImpl() {
        }
        
        @java.lang.Override
        public int align$app_debug(int size, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.unit.LayoutDirection layoutDirection, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0010\u00a2\u0006\u0002\b\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/google/relay/compose/CrossAxisAlignmentImpl$HorizontalCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "horizontal", "Landroidx/compose/ui/Alignment$Horizontal;", "(Landroidx/compose/ui/Alignment$Horizontal;)V", "getHorizontal", "()Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$app_debug", "app_debug"})
    static final class HorizontalCrossAxisAlignmentImpl extends com.google.relay.compose.CrossAxisAlignmentImpl {
        @org.jetbrains.annotations.NotNull
        private final androidx.compose.ui.Alignment.Horizontal horizontal = null;
        
        public HorizontalCrossAxisAlignmentImpl(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.Alignment.Horizontal horizontal) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.ui.Alignment.Horizontal getHorizontal() {
            return null;
        }
        
        @java.lang.Override
        public int align$app_debug(int size, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.unit.LayoutDirection layoutDirection, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0010\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/google/relay/compose/CrossAxisAlignmentImpl$StartCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$app_debug", "app_debug"})
    static final class StartCrossAxisAlignmentImpl extends com.google.relay.compose.CrossAxisAlignmentImpl {
        @org.jetbrains.annotations.NotNull
        public static final com.google.relay.compose.CrossAxisAlignmentImpl.StartCrossAxisAlignmentImpl INSTANCE = null;
        
        private StartCrossAxisAlignmentImpl() {
        }
        
        @java.lang.Override
        public int align$app_debug(int size, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.unit.LayoutDirection layoutDirection, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0010\u00a2\u0006\u0002\b\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/google/relay/compose/CrossAxisAlignmentImpl$VerticalCrossAxisAlignmentImpl;", "Lcom/google/relay/compose/CrossAxisAlignmentImpl;", "vertical", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Alignment$Vertical;)V", "getVertical", "()Landroidx/compose/ui/Alignment$Vertical;", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$app_debug", "app_debug"})
    static final class VerticalCrossAxisAlignmentImpl extends com.google.relay.compose.CrossAxisAlignmentImpl {
        @org.jetbrains.annotations.NotNull
        private final androidx.compose.ui.Alignment.Vertical vertical = null;
        
        public VerticalCrossAxisAlignmentImpl(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.Alignment.Vertical vertical) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.ui.Alignment.Vertical getVertical() {
            return null;
        }
        
        @java.lang.Override
        public int align$app_debug(int size, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.unit.LayoutDirection layoutDirection, @org.jetbrains.annotations.NotNull
        androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return 0;
        }
    }
}