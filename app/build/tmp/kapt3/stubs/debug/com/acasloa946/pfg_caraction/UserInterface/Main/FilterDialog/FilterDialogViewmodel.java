package com.acasloa946.pfg_caraction.UserInterface.Main.FilterDialog;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u001a\u0010#\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0!0%J\u001a\u0010\u0015\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0!0%R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\t\u00a8\u0006\'"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/FilterDialog/FilterDialogViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "", "kmFilter", "getKmFilter", "()F", "setKmFilter", "(F)V", "kmFilter$delegate", "Landroidx/compose/runtime/MutableState;", "", "maxKm", "getMaxKm", "()I", "setMaxKm", "(I)V", "maxKm$delegate", "Landroidx/compose/runtime/MutableIntState;", "maxPrice", "getMaxPrice", "setMaxPrice", "maxPrice$delegate", "priceFilter", "getPriceFilter", "setPriceFilter", "priceFilter$delegate", "changeKMFilter", "", "it", "changePriceFilter", "filterObjectMaker", "", "", "getMaxKM", "fetchedCars", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "app_debug"})
public final class FilterDialogViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState maxKm$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState kmFilter$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState maxPrice$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState priceFilter$delegate = null;
    
    public FilterDialogViewmodel() {
        super();
    }
    
    public final int getMaxKm() {
        return 0;
    }
    
    public final void setMaxKm(int p0) {
    }
    
    public final float getKmFilter() {
        return 0.0F;
    }
    
    public final void setKmFilter(float p0) {
    }
    
    public final void changeKMFilter(float it) {
    }
    
    public final void getMaxKM(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> fetchedCars) {
    }
    
    public final int getMaxPrice() {
        return 0;
    }
    
    public final void setMaxPrice(int p0) {
    }
    
    public final float getPriceFilter() {
        return 0.0F;
    }
    
    public final void setPriceFilter(float p0) {
    }
    
    public final void changePriceFilter(float it) {
    }
    
    public final void getMaxPrice(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> fetchedCars) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> filterObjectMaker() {
        return null;
    }
}