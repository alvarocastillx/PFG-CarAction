package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen;

import android.content.Context;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel;
import com.acasloa946.pfg_caraction.domain.checkIfUserExistsUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.ktx.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J@\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/AuthScreens/InitScreen/InitScreenViewmodel;", "Landroidx/lifecycle/ViewModel;", "checkIfUserExistsUseCase", "Lcom/acasloa946/pfg_caraction/domain/checkIfUserExistsUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/checkIfUserExistsUseCase;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "googleAuth", "", "activityResult", "Landroidx/activity/result/ActivityResult;", "onFailure", "Lkotlin/Function0;", "onSuccessCreateAccount", "onSuccessSignIn", "context", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class InitScreenViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.checkIfUserExistsUseCase checkIfUserExistsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    @javax.inject.Inject
    public InitScreenViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.checkIfUserExistsUseCase checkIfUserExistsUseCase) {
        super();
    }
    
    public final void googleAuth(@org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResult activityResult, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFailure, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccessCreateAccount, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccessSignIn, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}