package com.google.relay.compose;

import androidx.compose.foundation.*;
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.regex.Pattern;
import androidx.compose.foundation.layout.Arrangement;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&J\u001e\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/google/relay/compose/RelayContainerScope;", "", "boxAlign", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "boxAlign-GrvxvIE", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;J)Landroidx/compose/ui/Modifier;", "columnWeight", "weight", "", "fill", "", "rowWeight", "app_debug"})
@androidx.compose.runtime.Immutable
public abstract interface RelayContainerScope {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier columnWeight(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier weight, float fill, boolean p2);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.ui.Modifier rowWeight(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier weight, float fill, boolean p2);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}