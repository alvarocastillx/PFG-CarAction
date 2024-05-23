package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.LoginScreen;

import androidx.lifecycle.ViewModel;
import com.google.firebase.ktx.Firebase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u001aJ0\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/AuthScreens/LoginScreen/loginViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "<set-?>", "", "passwordVisible", "getPasswordVisible", "()Z", "setPasswordVisible", "(Z)V", "passwordVisible$delegate", "Landroidx/compose/runtime/MutableState;", "", "textFieldEmail", "getTextFieldEmail", "()Ljava/lang/String;", "setTextFieldEmail", "(Ljava/lang/String;)V", "textFieldEmail$delegate", "textFieldPassw", "getTextFieldPassw", "setTextFieldPassw", "textFieldPassw$delegate", "changeMail", "", "input", "changePassw", "changePasswVisibility", "signIn", "success", "Lkotlin/Function0;", "failure", "emptyTextfield", "app_debug"})
public final class loginViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState textFieldEmail$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState textFieldPassw$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState passwordVisible$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    public loginViewmodel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTextFieldEmail() {
        return null;
    }
    
    public final void setTextFieldEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTextFieldPassw() {
        return null;
    }
    
    public final void setTextFieldPassw(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getPasswordVisible() {
        return false;
    }
    
    public final void setPasswordVisible(boolean p0) {
    }
    
    public final void changeMail(@org.jetbrains.annotations.NotNull
    java.lang.String input) {
    }
    
    public final void changePassw(@org.jetbrains.annotations.NotNull
    java.lang.String input) {
    }
    
    public final void changePasswVisibility() {
    }
    
    public final void signIn(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> success, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> failure, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> emptyTextfield) {
    }
}