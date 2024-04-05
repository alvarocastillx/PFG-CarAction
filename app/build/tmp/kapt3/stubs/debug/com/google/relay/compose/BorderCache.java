package com.google.relay.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.*;
import androidx.compose.ui.graphics.drawscope.*;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;

/**
 * Helper object that handles lazily allocating and re-using objects
 * to render the border into an offscreen ImageBitmap
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u00c2\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u00c2\u0003J9\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0006\u0010\u0015\u001a\u00020\tJ\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001JF\u0010\u0018\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f\u00a2\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b#\u0010$R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/google/relay/compose/BorderCache;", "", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "borderPath", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "obtainPath", "toString", "", "drawBorderCache", "Landroidx/compose/ui/draw/CacheDrawScope;", "borderSize", "Landroidx/compose/ui/unit/IntSize;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBorderCache-EMwLDEs", "(Landroidx/compose/ui/draw/CacheDrawScope;JILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/ImageBitmap;", "app_debug"})
final class BorderCache {
    @org.jetbrains.annotations.Nullable
    private androidx.compose.ui.graphics.ImageBitmap imageBitmap;
    @org.jetbrains.annotations.Nullable
    private androidx.compose.ui.graphics.Canvas canvas;
    @org.jetbrains.annotations.Nullable
    private androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope;
    @org.jetbrains.annotations.Nullable
    private androidx.compose.ui.graphics.Path borderPath;
    
    public BorderCache(@org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.ImageBitmap imageBitmap, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.Canvas canvas, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.Path borderPath) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.ui.graphics.Path obtainPath() {
        return null;
    }
    
    public BorderCache() {
        super();
    }
    
    private final androidx.compose.ui.graphics.ImageBitmap component1() {
        return null;
    }
    
    private final androidx.compose.ui.graphics.Canvas component2() {
        return null;
    }
    
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope component3() {
        return null;
    }
    
    private final androidx.compose.ui.graphics.Path component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.relay.compose.BorderCache copy(@org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.ImageBitmap imageBitmap, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.Canvas canvas, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.Path borderPath) {
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