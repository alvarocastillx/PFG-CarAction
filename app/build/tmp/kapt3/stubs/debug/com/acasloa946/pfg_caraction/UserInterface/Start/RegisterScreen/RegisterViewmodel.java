package com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen;

import android.content.Context;
import android.health.connect.datatypes.units.Length;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel;
import com.acasloa946.pfg_caraction.data.Entities.UserType;
import com.acasloa946.pfg_caraction.domain.addUserUseCase;
import com.google.firebase.ktx.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010J\u0014\u0010\u001f\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!J\"\u0010\"\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0!JT\u0010%\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0!2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001c0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u001cR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015\u00a8\u0006+"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Start/RegisterScreen/RegisterViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "<set-?>", "", "passWordVisible", "getPassWordVisible", "()Z", "setPassWordVisible", "(Z)V", "passWordVisible$delegate", "Landroidx/compose/runtime/MutableState;", "", "textFieldEmail", "getTextFieldEmail", "()Ljava/lang/String;", "setTextFieldEmail", "(Ljava/lang/String;)V", "textFieldEmail$delegate", "textFieldPassword", "getTextFieldPassword", "setTextFieldPassword", "textFieldPassword$delegate", "changeTextFieldMail", "", "input", "changeTextFieldPassword", "checkMail", "failedMail", "Lkotlin/Function0;", "checkPassword", "onShortLength", "onNoDigit", "registerAuth", "onSuccess", "onFailure", "context", "Landroid/content/Context;", "setPasswordVisibility", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RegisterViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState textFieldEmail$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState textFieldPassword$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState passWordVisible$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    @javax.inject.Inject
    public RegisterViewmodel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTextFieldEmail() {
        return null;
    }
    
    private final void setTextFieldEmail(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTextFieldPassword() {
        return null;
    }
    
    private final void setTextFieldPassword(java.lang.String p0) {
    }
    
    public final boolean getPassWordVisible() {
        return false;
    }
    
    private final void setPassWordVisible(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    public final void setPasswordVisibility() {
    }
    
    public final void changeTextFieldPassword(@org.jetbrains.annotations.NotNull
    java.lang.String input) {
    }
    
    public final void changeTextFieldMail(@org.jetbrains.annotations.NotNull
    java.lang.String input) {
    }
    
    public final void registerAuth(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFailure, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onShortLength, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNoDigit, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> failedMail, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final boolean checkPassword(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onShortLength, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNoDigit) {
        return false;
    }
    
    public final boolean checkMail(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> failedMail) {
        return false;
    }
}