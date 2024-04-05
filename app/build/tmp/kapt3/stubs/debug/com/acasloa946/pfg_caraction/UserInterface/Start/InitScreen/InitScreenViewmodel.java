package com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen;

import android.content.Context;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.ktx.Firebase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Start/InitScreen/InitScreenViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "googleAuth", "", "activityResult", "Landroidx/activity/result/ActivityResult;", "onFailure", "Lkotlin/Function0;", "onSuccess", "app_debug"})
public final class InitScreenViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    public InitScreenViewmodel() {
        super();
    }
    
    public final void googleAuth(@org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResult activityResult, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFailure, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
    }
}