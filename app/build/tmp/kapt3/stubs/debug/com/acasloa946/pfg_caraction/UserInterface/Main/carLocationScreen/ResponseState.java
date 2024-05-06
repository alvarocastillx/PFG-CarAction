package com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModel;
import android.Manifest;
import android.annotation.SuppressLint;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import android.util.Log;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState;", "T", "", "()V", "Error", "Idle", "Loading", "Success", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Error;", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Idle;", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Loading;", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Success;", "app_debug"})
public abstract class ResponseState<T extends java.lang.Object> {
    
    private ResponseState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Error;", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState;", "", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Error extends com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.ResponseState {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Throwable error = null;
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.Throwable error) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.ResponseState.Error copy(@org.jetbrains.annotations.NotNull
        java.lang.Throwable error) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Idle;", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState;", "", "()V", "app_debug"})
    public static final class Idle extends com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.ResponseState {
        @org.jetbrains.annotations.NotNull
        public static final com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.ResponseState.Idle INSTANCE = null;
        
        private Idle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Loading;", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState;", "", "()V", "app_debug"})
    public static final class Loading extends com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.ResponseState {
        @org.jetbrains.annotations.NotNull
        public static final com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.ResponseState.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Success;", "R", "Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/acasloa946/pfg_caraction/UserInterface/Main/carLocationScreen/ResponseState$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<R extends java.lang.Object> extends com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.ResponseState<R> {
        private final R data = null;
        
        public Success(R data) {
        }
        
        public final R getData() {
            return null;
        }
        
        public final R component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.acasloa946.pfg_caraction.UserInterface.Main.carLocationScreen.ResponseState.Success<R> copy(R data) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}