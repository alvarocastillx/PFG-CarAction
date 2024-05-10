package com.acasloa946.pfg_caraction.UserInterface.Main.profileScreen;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase;
import com.google.firebase.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/profileScreen/profileViewmodel;", "Landroidx/lifecycle/ViewModel;", "fetchCarsUploadedByUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchCarsUploadedByUserUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/fetchCarsUploadedByUserUseCase;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "fetchedCarsUploadedByUser", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "getFetchedCarsUploadedByUser", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fetchCarsUploadedByUser", "", "context", "Landroid/content/Context;", "formatLocationString", "", "locationString", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class profileViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase fetchCarsUploadedByUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> fetchedCarsUploadedByUser = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    @javax.inject.Inject
    public profileViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase fetchCarsUploadedByUserUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> getFetchedCarsUploadedByUser() {
        return null;
    }
    
    public final void fetchCarsUploadedByUser(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatLocationString(@org.jetbrains.annotations.NotNull
    java.lang.String locationString) {
        return null;
    }
}