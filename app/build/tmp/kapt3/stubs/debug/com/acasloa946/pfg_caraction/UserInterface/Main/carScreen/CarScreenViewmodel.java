package com.acasloa946.pfg_caraction.UserInterface.Main.carScreen;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.domain.addCarToFavouritesUseCase;
import com.google.firebase.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/carScreen/CarScreenViewmodel;", "Landroidx/lifecycle/ViewModel;", "addCarToFavouritesUseCase", "Lcom/acasloa946/pfg_caraction/domain/addCarToFavouritesUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/addCarToFavouritesUseCase;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "<set-?>", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "clickedCar", "getClickedCar", "()Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "setClickedCar", "(Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;)V", "clickedCar$delegate", "Landroidx/compose/runtime/MutableState;", "addCarToFavourites", "", "context", "Landroid/content/Context;", "onSuccess", "Lkotlin/Function0;", "onError", "formatLocationString", "", "locationString", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CarScreenViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.addCarToFavouritesUseCase addCarToFavouritesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState clickedCar$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    @javax.inject.Inject
    public CarScreenViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.addCarToFavouritesUseCase addCarToFavouritesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.UserInterface.models.CarModel getClickedCar() {
        return null;
    }
    
    public final void setClickedCar(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.models.CarModel p0) {
    }
    
    public final void addCarToFavourites(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onError) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatLocationString(@org.jetbrains.annotations.NotNull
    java.lang.String locationString) {
        return null;
    }
}