package com.acasloa946.pfg_caraction.UserInterface.MainScreens.homeScreen;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import com.acasloa946.pfg_caraction.Navigation.Routes;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarTypesUseCase;
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUseCase;
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase;
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.ktx.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u001fJ\u001c\u00106\u001a\u0002032\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u0002030:J\u0006\u0010;\u001a\u000203J\u0011\u0010<\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u0011\u0010>\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u001c\u0010?\u001a\u0002032\u0006\u00107\u001a\u0002082\f\u0010@\u001a\b\u0012\u0004\u0012\u0002030:J\u0014\u0010A\u001a\u0002032\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u001eJ\u0010\u0010D\u001a\u0002032\u0006\u0010E\u001a\u00020\u001fH\u0002J\u000e\u0010F\u001a\u0002032\u0006\u0010G\u001a\u00020\u001fJ\u000e\u0010H\u001a\u0002032\u0006\u0010I\u001a\u00020JR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R+\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u000e\u0010\'\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010(\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u001f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010\u0018\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010.\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u001f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b1\u0010\u0018\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006K"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/homeScreen/homeScreenViewmodel;", "Landroidx/lifecycle/ViewModel;", "fetchUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchUserUseCase;", "fetchCarsUseCase", "Lcom/acasloa946/pfg_caraction/domain/CarsUseCases/fetchCarsUseCase;", "fetchCarTypesUseCase", "Lcom/acasloa946/pfg_caraction/domain/CarsUseCases/fetchCarTypesUseCase;", "fetchChatsOfUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchChatsOfUserUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchUserUseCase;Lcom/acasloa946/pfg_caraction/domain/CarsUseCases/fetchCarsUseCase;Lcom/acasloa946/pfg_caraction/domain/CarsUseCases/fetchCarTypesUseCase;Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchChatsOfUserUseCase;)V", "_originalCarList", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "_typeSortedList", "alreadyFetchedCars", "", "<set-?>", "alreadyFetchedChats", "getAlreadyFetchedChats", "()Z", "setAlreadyFetchedChats", "(Z)V", "alreadyFetchedChats$delegate", "Landroidx/compose/runtime/MutableState;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "fetched", "fetchedCarTypes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "getFetchedCarTypes", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fetchedCars", "getFetchedCars", "isDialogOpened", "setDialogOpened", "isDialogOpened$delegate", "previousType", "searchBarText", "getSearchBarText", "()Ljava/lang/String;", "setSearchBarText", "(Ljava/lang/String;)V", "searchBarText$delegate", "userName", "getUserName", "setUserName", "userName$delegate", "changeDialog", "", "changeSearchBarText", "input", "checkChatsForNotif", "context", "Landroid/content/Context;", "sendNotification", "Lkotlin/Function0;", "clearScreen", "fetchCarTypes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCars", "fetchUserName", "onError", "filterArea", "filterList", "", "filterListBySearchbar", "userInput", "filterListByTypeButton", "typeToSearch", "signOut", "navController", "Landroidx/navigation/NavController;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class homeScreenViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase fetchUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUseCase fetchCarsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarTypesUseCase fetchCarTypesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase fetchChatsOfUserUseCase = null;
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
    private final androidx.compose.runtime.MutableState isDialogOpened$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState alreadyFetchedChats$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String previousType = "";
    
    @javax.inject.Inject
    public homeScreenViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase fetchUserUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUseCase fetchCarsUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarTypesUseCase fetchCarTypesUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase fetchChatsOfUserUseCase) {
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
    
    public final boolean isDialogOpened() {
        return false;
    }
    
    public final void setDialogOpened(boolean p0) {
    }
    
    private final boolean getAlreadyFetchedChats() {
        return false;
    }
    
    private final void setAlreadyFetchedChats(boolean p0) {
    }
    
    public final void changeDialog() {
    }
    
    public final void clearScreen() {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCarTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void filterArea(@org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> filterList) {
    }
    
    public final void signOut(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    public final void checkChatsForNotif(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> sendNotification) {
    }
}