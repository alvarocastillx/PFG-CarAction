package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carLocationScreen;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModel;
import android.Manifest;
import android.annotation.SuppressLint;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.location.FusedLocationProviderClient;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\"H\u0007J*\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00102\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020)0(J\u001e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010$\u001a\u00020%R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R,\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006-"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/carLocationScreen/carLocationViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "_markerAddressDetail", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/carLocationScreen/ResponseState;", "Landroid/location/Address;", "_userLocation", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "locationService", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "markerAddressDetail", "Lkotlinx/coroutines/flow/StateFlow;", "<set-?>", "", "userAddress", "getUserAddress", "()Ljava/lang/String;", "setUserAddress", "(Ljava/lang/String;)V", "userAddress$delegate", "Landroidx/compose/runtime/MutableState;", "userLocation", "Landroidx/lifecycle/LiveData;", "getUserLocation", "()Landroidx/lifecycle/LiveData;", "setUserLocation", "(Landroidx/lifecycle/LiveData;)V", "getLocation", "", "fusedLocationProviderClient", "failedToGetLocation", "Lkotlin/Function0;", "getLocationPermission", "context", "Landroid/content/Context;", "permission", "launcher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "", "getMarkerAddressDetails", "lat", "long", "app_debug"})
public final class carLocationViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.location.FusedLocationProviderClient locationService;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> _userLocation;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> userLocation;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.acasloa946.pfg_caraction.UserInterface.MainScreens.carLocationScreen.ResponseState<android.location.Address>> _markerAddressDetail = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.acasloa946.pfg_caraction.UserInterface.MainScreens.carLocationScreen.ResponseState<android.location.Address>> markerAddressDetail = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState userAddress$delegate = null;
    
    public carLocationViewmodel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> getUserLocation() {
        return null;
    }
    
    public final void setUserLocation(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserAddress() {
        return null;
    }
    
    public final void setUserAddress(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void getLocationPermission(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String permission, @org.jetbrains.annotations.NotNull
    androidx.activity.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> launcher) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void getLocation(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> failedToGetLocation) {
    }
    
    public final void getMarkerAddressDetails(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}