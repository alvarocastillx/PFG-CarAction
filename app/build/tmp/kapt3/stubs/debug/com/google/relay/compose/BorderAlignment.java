package com.google.relay.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.*;
import androidx.compose.ui.graphics.drawscope.*;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;

/**
 * Where to render border stroke relative to the nominal bounds of an element.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/google/relay/compose/BorderAlignment;", "", "(Ljava/lang/String;I)V", "Inside", "Center", "Outside", "app_debug"})
public enum BorderAlignment {
    /*public static final*/ Inside /* = new Inside() */,
    /*public static final*/ Center /* = new Center() */,
    /*public static final*/ Outside /* = new Outside() */;
    
    BorderAlignment() {
    }
    
    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.EnumEntries<com.google.relay.compose.BorderAlignment> getEntries() {
        return null;
    }
}