package com.acasloa946.pfg_caraction.UserInterface.Main.uploadCarScreen;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.API.APIModule;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.domain.addCarUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase;
import com.google.firebase.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Calendar;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020\bJ\u000e\u0010q\u001a\u00020o2\u0006\u0010r\u001a\u00020\bJ\u000e\u0010s\u001a\u00020o2\u0006\u0010t\u001a\u00020\bJ\u000e\u0010u\u001a\u00020o2\u0006\u0010v\u001a\u00020\bJ\u0006\u0010w\u001a\u00020oJ\u001c\u0010x\u001a\u00020o2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020o0z2\u0006\u0010{\u001a\u00020|J\u0010\u0010}\u001a\u00020o2\b\u0010~\u001a\u0004\u0018\u00010LJ\u000f\u0010\u007f\u001a\u00020o2\u0007\u0010\u0080\u0001\u001a\u00020SJ\u0010\u0010\u0081\u0001\u001a\u00020o2\u0007\u0010\u0082\u0001\u001a\u00020ZJ\u001f\u0010\u0083\u0001\u001a\u00020o2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020o0z2\u0006\u0010{\u001a\u00020|H\u0002J\u0011\u0010\u0084\u0001\u001a\u00020o2\b\u0010~\u001a\u0004\u0018\u00010LR+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR+\u0010\"\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\u000f\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\rR/\u0010&\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010\u000f\u001a\u0004\b\'\u0010\u0013\"\u0004\b(\u0010\u0015R+\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010\u000f\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00100\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b3\u0010\u000f\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR+\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b7\u0010\u000f\u001a\u0004\b5\u0010\u000b\"\u0004\b6\u0010\rR+\u00108\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b;\u0010\u000f\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\rR+\u0010<\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b?\u0010\u000f\u001a\u0004\b=\u0010\u000b\"\u0004\b>\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010@\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bC\u0010\u000f\u001a\u0004\bA\u0010\u000b\"\u0004\bB\u0010\rR+\u0010D\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bG\u0010\u000f\u001a\u0004\bE\u0010\u000b\"\u0004\bF\u0010\rR+\u0010H\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bK\u0010\u000f\u001a\u0004\bI\u0010\u000b\"\u0004\bJ\u0010\rR/\u0010M\u001a\u0004\u0018\u00010L2\b\u0010\u0007\u001a\u0004\u0018\u00010L8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bR\u0010\u000f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010T\u001a\u00020S2\u0006\u0010\u0007\u001a\u00020S8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bY\u0010\u000f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010[\u001a\u00020Z2\u0006\u0010\u0007\u001a\u00020Z8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b`\u0010\u000f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u000e\u0010a\u001a\u00020bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170e0dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR+\u0010j\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bm\u0010\u000f\u001a\u0004\bk\u0010\u000b\"\u0004\bl\u0010\r\u00a8\u0006\u0085\u0001"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/uploadCarScreen/uploadCarViewmodel;", "Landroidx/lifecycle/ViewModel;", "addCarUseCase", "Lcom/acasloa946/pfg_caraction/domain/addCarUseCase;", "fetchUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchUserUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/addCarUseCase;Lcom/acasloa946/pfg_caraction/domain/fetchUserUseCase;)V", "<set-?>", "", "_carFuelType", "get_carFuelType", "()Ljava/lang/String;", "set_carFuelType", "(Ljava/lang/String;)V", "_carFuelType$delegate", "Landroidx/compose/runtime/MutableState;", "", "_carKM", "get_carKM", "()Ljava/lang/Integer;", "set_carKM", "(Ljava/lang/Integer;)V", "_carKM$delegate", "", "_carPrice", "get_carPrice", "()Ljava/lang/Double;", "set_carPrice", "(Ljava/lang/Double;)V", "_carPrice$delegate", "_carTransmisionType", "get_carTransmisionType", "set_carTransmisionType", "_carTransmisionType$delegate", "_carType", "get_carType", "set_carType", "_carType$delegate", "_carYear", "get_carYear", "set_carYear", "_carYear$delegate", "_userName", "get_userName", "set_userName", "_userName$delegate", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "carKMField", "getCarKMField", "setCarKMField", "carKMField$delegate", "carPlate", "getCarPlate", "setCarPlate", "carPlate$delegate", "carPriceField", "getCarPriceField", "setCarPriceField", "carPriceField$delegate", "carYearField", "getCarYearField", "setCarYearField", "carYearField$delegate", "makeButtonText", "getMakeButtonText", "setMakeButtonText", "makeButtonText$delegate", "modelButtonText", "getModelButtonText", "setModelButtonText", "modelButtonText$delegate", "selectedImageURL", "getSelectedImageURL", "setSelectedImageURL", "selectedImageURL$delegate", "Landroid/net/Uri;", "selectedImageUri", "getSelectedImageUri", "()Landroid/net/Uri;", "setSelectedImageUri", "(Landroid/net/Uri;)V", "selectedImageUri$delegate", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMake;", "selectedMake", "getSelectedMake", "()Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMake;", "setSelectedMake", "(Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMake;)V", "selectedMake$delegate", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModel;", "selectedModel", "getSelectedModel", "()Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModel;", "setSelectedModel", "(Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModel;)V", "selectedModel$delegate", "storageRef", "Lcom/google/firebase/storage/FirebaseStorage;", "userLocation", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "getUserLocation", "()Landroidx/lifecycle/LiveData;", "setUserLocation", "(Landroidx/lifecycle/LiveData;)V", "userLocationString", "getUserLocationString", "setUserLocationString", "userLocationString$delegate", "changeKM", "", "KM", "changePlate", "plate", "changePrice", "price", "changeYear", "year", "clearScreen", "getCarType", "fillData", "Lkotlin/Function0;", "context", "Landroid/content/Context;", "getSelectedImage", "uri", "selectMake", "make", "selectModel", "model", "uploadCar", "uploadImage", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class uploadCarViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.addCarUseCase addCarUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.fetchUserUseCase fetchUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.storage.FirebaseStorage storageRef = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedImageUri$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedImageURL$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedMake$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState makeButtonText$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState modelButtonText$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState carPlate$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState carYearField$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carYear$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState carKMField$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carKM$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState carPriceField$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carPrice$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carType$delegate = null;
    public androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> userLocation;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState userLocationString$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _userName$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carFuelType$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carTransmisionType$delegate = null;
    
    @javax.inject.Inject
    public uploadCarViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.addCarUseCase addCarUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.fetchUserUseCase fetchUserUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getSelectedImageUri() {
        return null;
    }
    
    public final void setSelectedImageUri(@org.jetbrains.annotations.Nullable
    android.net.Uri p0) {
    }
    
    private final java.lang.String getSelectedImageURL() {
        return null;
    }
    
    private final void setSelectedImageURL(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake getSelectedMake() {
        return null;
    }
    
    public final void setSelectedMake(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMakeButtonText() {
        return null;
    }
    
    public final void setMakeButtonText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel getSelectedModel() {
        return null;
    }
    
    private final void setSelectedModel(com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getModelButtonText() {
        return null;
    }
    
    public final void setModelButtonText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCarPlate() {
        return null;
    }
    
    public final void setCarPlate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCarYearField() {
        return null;
    }
    
    public final void setCarYearField(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final java.lang.Integer get_carYear() {
        return null;
    }
    
    private final void set_carYear(java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCarKMField() {
        return null;
    }
    
    public final void setCarKMField(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final java.lang.Integer get_carKM() {
        return null;
    }
    
    private final void set_carKM(java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCarPriceField() {
        return null;
    }
    
    public final void setCarPriceField(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final java.lang.Double get_carPrice() {
        return null;
    }
    
    private final void set_carPrice(java.lang.Double p0) {
    }
    
    private final java.lang.String get_carType() {
        return null;
    }
    
    private final void set_carType(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> getUserLocation() {
        return null;
    }
    
    public final void setUserLocation(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserLocationString() {
        return null;
    }
    
    public final void setUserLocationString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final java.lang.String get_userName() {
        return null;
    }
    
    private final void set_userName(java.lang.String p0) {
    }
    
    private final java.lang.String get_carFuelType() {
        return null;
    }
    
    private final void set_carFuelType(java.lang.String p0) {
    }
    
    private final java.lang.String get_carTransmisionType() {
        return null;
    }
    
    private final void set_carTransmisionType(java.lang.String p0) {
    }
    
    public final void getSelectedImage(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
    }
    
    public final void uploadImage(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
    }
    
    public final void selectMake(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake make) {
    }
    
    public final void selectModel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel model) {
    }
    
    public final void changePlate(@org.jetbrains.annotations.NotNull
    java.lang.String plate) {
    }
    
    public final void changeYear(@org.jetbrains.annotations.NotNull
    java.lang.String year) {
    }
    
    public final void changeKM(@org.jetbrains.annotations.NotNull
    java.lang.String KM) {
    }
    
    public final void changePrice(@org.jetbrains.annotations.NotNull
    java.lang.String price) {
    }
    
    public final void getCarType(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> fillData, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private final void uploadCar(kotlin.jvm.functions.Function0<kotlin.Unit> fillData, android.content.Context context) {
    }
    
    public final void clearScreen() {
    }
}