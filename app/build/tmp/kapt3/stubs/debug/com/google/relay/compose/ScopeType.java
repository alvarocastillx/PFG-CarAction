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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/google/relay/compose/ScopeType;", "", "(Ljava/lang/String;I)V", "Row", "Column", "Box", "app_debug"})
public enum ScopeType {
    /*public static final*/ Row /* = new Row() */,
    /*public static final*/ Column /* = new Column() */,
    /*public static final*/ Box /* = new Box() */;
    
    ScopeType() {
    }
    
    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.EnumEntries<com.google.relay.compose.ScopeType> getEntries() {
        return null;
    }
}