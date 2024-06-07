package com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUploadedByUserUseCase;
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserByNameUseCase;
import com.google.firebase.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011H\u0002R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00110\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR+\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016\u00a8\u0006*"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/profileScreen/profileViewmodel;", "Landroidx/lifecycle/ViewModel;", "fetchCarsUploadedByUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/CarsUseCases/fetchCarsUploadedByUserUseCase;", "fetchUserByNameUseCase", "Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchUserByNameUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/CarsUseCases/fetchCarsUploadedByUserUseCase;Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchUserByNameUseCase;)V", "_profileStates", "Landroidx/lifecycle/MutableLiveData;", "Lcom/acasloa946/pfg_caraction/UserInterface/States/ProfileScreenStates;", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "fetchedCarsUploadedByUser", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getFetchedCarsUploadedByUser", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "<set-?>", "", "memberSince", "getMemberSince", "()Ljava/lang/String;", "setMemberSince", "(Ljava/lang/String;)V", "memberSince$delegate", "Landroidx/compose/runtime/MutableState;", "monthMap", "", "", "profileStates", "Landroidx/lifecycle/LiveData;", "getProfileStates", "()Landroidx/lifecycle/LiveData;", "userName", "getUserName", "setUserName", "userName$delegate", "fetchCarsUploadedByUser", "", "context", "Landroid/content/Context;", "formatDate", "date", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class profileViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUploadedByUserUseCase fetchCarsUploadedByUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserByNameUseCase fetchUserByNameUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> fetchedCarsUploadedByUser = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState userName$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState memberSince$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, java.lang.String> monthMap = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>>> _profileStates = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>>> profileStates = null;
    
    @javax.inject.Inject
    public profileViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.CarsUseCases.fetchCarsUploadedByUserUseCase fetchCarsUploadedByUserUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserByNameUseCase fetchUserByNameUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> getFetchedCarsUploadedByUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMemberSince() {
        return null;
    }
    
    public final void setMemberSince(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>>> getProfileStates() {
        return null;
    }
    
    private final java.lang.String formatDate(java.lang.String date) {
        return null;
    }
    
    public final void fetchCarsUploadedByUser(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}