package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carMakesScreen;

import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.API.APIModule;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018J\u0014\u0010#\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0%R7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00188F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006&"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/carMakesScreen/carMakesViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMake;", "carMakes", "getCarMakes", "()Ljava/util/List;", "setCarMakes", "(Ljava/util/List;)V", "carMakes$delegate", "Landroidx/compose/runtime/MutableState;", "", "makesFetched", "getMakesFetched", "()Z", "setMakesFetched", "(Z)V", "makesFetched$delegate", "originalList", "getOriginalList", "setOriginalList", "originalList$delegate", "", "searchBarText", "getSearchBarText", "()Ljava/lang/String;", "setSearchBarText", "(Ljava/lang/String;)V", "searchBarText$delegate", "changeSearchBarText", "", "input", "filterListBySearchbar", "getMakes", "failed", "Lkotlin/Function0;", "app_debug"})
public final class carMakesViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState carMakes$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState makesFetched$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState searchBarText$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState originalList$delegate = null;
    
    public carMakesViewmodel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake> getCarMakes() {
        return null;
    }
    
    public final void setCarMakes(@org.jetbrains.annotations.NotNull
    java.util.List<com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake> p0) {
    }
    
    private final boolean getMakesFetched() {
        return false;
    }
    
    private final void setMakesFetched(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSearchBarText() {
        return null;
    }
    
    public final void setSearchBarText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final java.util.List<com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake> getOriginalList() {
        return null;
    }
    
    private final void setOriginalList(java.util.List<com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake> p0) {
    }
    
    public final void getMakes(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> failed) {
    }
    
    public final void changeSearchBarText(@org.jetbrains.annotations.NotNull
    java.lang.String input) {
    }
    
    public final void filterListBySearchbar(@org.jetbrains.annotations.NotNull
    java.lang.String searchBarText) {
    }
}