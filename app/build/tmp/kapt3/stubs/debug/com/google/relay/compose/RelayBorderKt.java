package com.google.relay.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.*;
import androidx.compose.ui.graphics.drawscope.*;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002\u001a:\u0010\u000e\u001a\u00020\f*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001aI\u0010\u0016\u001a\u00020\f*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a_\u0010 \u001a\u00020\f*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\"\u0010#\u001a\u0012\u0010$\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001a&\u0010%\u001a\u00020&*\u00020&2\u0006\u0010\'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u001a9\u0010%\u001a\u00020&*\u00020&2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b-\u0010.\u001a;\u0010%\u001a\u00020&*\u00020&2\u0006\u0010+\u001a\u00020,2\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b1\u00102\u001a!\u00103\u001a\u000204*\u0002042\u0006\u00105\u001a\u00020\u0003H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawGenericBorder", "borderCacheRef", "Landroidx/compose/ui/node/Ref;", "Lcom/google/relay/compose/BorderCache;", "brush", "Landroidx/compose/ui/graphics/Brush;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "alignment", "Lcom/google/relay/compose/BorderAlignment;", "drawRectBorder-wB6dw9o", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZFLcom/google/relay/compose/BorderAlignment;)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "drawRoundRectBorder-mpQjVXM", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZFLcom/google/relay/compose/BorderAlignment;)Landroidx/compose/ui/draw/DrawResult;", "obtain", "relayBorder", "Landroidx/compose/ui/Modifier;", "border", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "relayBorder-rAjV9yQ", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lcom/google/relay/compose/BorderAlignment;)Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "relayBorder-JKjFIXU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;Lcom/google/relay/compose/BorderAlignment;)Landroidx/compose/ui/Modifier;", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "app_debug"})
public final class RelayBorderKt {
    
    /**
     * Modify element to add border with appearance specified with a [border] and a [shape] and clip it.
     *
     * @sample androidx.compose.foundation.samples.BorderSample()
     *
     * @param border [BorderStroke] class that specifies border appearance, such as size and color
     * @param shape shape of the border
     */
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.Modifier relayBorder(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier $this$relayBorder, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.BorderStroke border, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.graphics.Shape shape, @org.jetbrains.annotations.NotNull
    com.google.relay.compose.BorderAlignment alignment) {
        return null;
    }
    
    private static final com.google.relay.compose.BorderCache obtain(androidx.compose.ui.node.Ref<com.google.relay.compose.BorderCache> $this$obtain) {
        return null;
    }
    
    /**
     * Border implementation for invalid parameters that just draws the content
     * as the given border parameters are infeasible (ex. negative border width)
     */
    private static final androidx.compose.ui.draw.DrawResult drawContentWithoutBorder(androidx.compose.ui.draw.CacheDrawScope $this$drawContentWithoutBorder) {
        return null;
    }
    
    /**
     * Border implementation for generic paths. Note it is possible to be given paths
     * that do not make sense in the context of a border (ex. a figure 8 path or a non-enclosed
     * shape) We do not handle that here as we expect developers to give us enclosed, non-overlapping
     * paths
     */
    private static final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope $this$drawGenericBorder, androidx.compose.ui.node.Ref<com.google.relay.compose.BorderCache> borderCacheRef, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Outline.Generic outline, boolean fillArea, float strokeWidth) {
        return null;
    }
    
    /**
     * Helper method that creates a round rect with the inner region removed
     * by the given stroke width
     */
    private static final androidx.compose.ui.graphics.Path createRoundRectPath(androidx.compose.ui.graphics.Path targetPath, androidx.compose.ui.geometry.RoundRect roundedRect, float strokeWidth, boolean fillArea) {
        return null;
    }
    
    private static final androidx.compose.ui.geometry.RoundRect createInsetRoundedRect(float widthPx, androidx.compose.ui.geometry.RoundRect roundedRect) {
        return null;
    }
}