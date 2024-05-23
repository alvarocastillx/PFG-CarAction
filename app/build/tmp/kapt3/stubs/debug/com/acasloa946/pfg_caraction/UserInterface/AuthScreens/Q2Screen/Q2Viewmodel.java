package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.Q2Screen;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel;
import com.acasloa946.pfg_caraction.data.Entities.UserType;
import com.acasloa946.pfg_caraction.domain.addUserUseCase;
import com.google.firebase.ktx.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.time.LocalDate;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/AuthScreens/Q2Screen/Q2Viewmodel;", "Landroidx/lifecycle/ViewModel;", "addUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/addUserUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/addUserUseCase;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "createUserAcc", "", "name", "", "userType", "Lcom/acasloa946/pfg_caraction/data/Entities/UserType;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class Q2Viewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.addUserUseCase addUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    @javax.inject.Inject
    public Q2Viewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.addUserUseCase addUserUseCase) {
        super();
    }
    
    public final void createUserAcc(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.Entities.UserType userType, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}