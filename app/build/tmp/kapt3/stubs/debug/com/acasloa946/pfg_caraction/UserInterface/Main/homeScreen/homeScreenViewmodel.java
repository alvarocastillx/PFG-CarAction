package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.domain.fetchCarTypesUseCase;
import com.acasloa946.pfg_caraction.domain.fetchCarsUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase;
import com.google.firebase.ktx.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0015J\u0011\u0010*\u001a\u00020(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0011\u0010,\u001a\u00020(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u001c\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020(01J\u0010\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020\u0015H\u0002J\u000e\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020\u0015J\u000e\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0015R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/homeScreen/homeScreenViewmodel;", "Landroidx/lifecycle/ViewModel;", "fetchUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchUserUseCase;", "fetchCarsUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchCarsUseCase;", "fetchCarTypesUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchCarTypesUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/fetchUserUseCase;Lcom/acasloa946/pfg_caraction/domain/fetchCarsUseCase;Lcom/acasloa946/pfg_caraction/domain/fetchCarTypesUseCase;)V", "_originalCarList", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "_typeSortedList", "alreadyFetchedCars", "", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "fetched", "fetchedCarTypes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "getFetchedCarTypes", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fetchedCars", "getFetchedCars", "previousType", "<set-?>", "searchBarText", "getSearchBarText", "()Ljava/lang/String;", "setSearchBarText", "(Ljava/lang/String;)V", "searchBarText$delegate", "Landroidx/compose/runtime/MutableState;", "userName", "getUserName", "setUserName", "userName$delegate", "changeSearchBarText", "", "input", "fetchCarTypes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCars", "fetchUserName", "context", "Landroid/content/Context;", "onError", "Lkotlin/Function0;", "filterListBySearchbar", "userInput", "filterListByTypeButton", "typeToSearch", "formatLocationString", "locationString", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class homeScreenViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.fetchUserUseCase fetchUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.fetchCarsUseCase fetchCarsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.fetchCarTypesUseCase fetchCarTypesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private boolean fetched = false;
    private boolean alreadyFetchedCars = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState searchBarText$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel> _originalCarList;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState userName$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> fetchedCars = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> fetchedCarTypes = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel> _typeSortedList;
    @org.jetbrains.annotations.NotNull
    private java.lang.String previousType = "";
    
    @javax.inject.Inject
    public homeScreenViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.fetchUserUseCase fetchUserUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.fetchCarsUseCase fetchCarsUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.fetchCarTypesUseCase fetchCarTypesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSearchBarText() {
        return null;
    }
    
    public final void setSearchBarText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> getFetchedCars() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> getFetchedCarTypes() {
        return null;
    }
    
    public final void fetchUserName(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onError) {
    }
    
    public final void changeSearchBarText(@org.jetbrains.annotations.NotNull
    java.lang.String input) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCars(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void filterListBySearchbar(java.lang.String userInput) {
    }
    
    public final void filterListByTypeButton(@org.jetbrains.annotations.NotNull
    java.lang.String typeToSearch) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatLocationString(@org.jetbrains.annotations.NotNull
    java.lang.String locationString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCarTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}