package com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.API.APIModule;
import com.acasloa946.pfg_caraction.API.Models.AIModels.ChatRequest;
import com.acasloa946.pfg_caraction.API.Models.AIModels.Message;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel;
import com.acasloa946.pfg_caraction.UserInterface.States.ProfileScreenStates;
import com.acasloa946.pfg_caraction.UserInterface.States.UploadCarStates;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.domain.addCarUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase;
import com.acasloa946.pfg_caraction.domain.linkCarToProfileUseCase;
import com.google.firebase.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020\nJ\u000e\u0010|\u001a\u00020z2\u0006\u0010}\u001a\u00020\nJ\u000e\u0010~\u001a\u00020z2\u0006\u0010\u007f\u001a\u00020\nJ\u0010\u0010\u0080\u0001\u001a\u00020z2\u0007\u0010\u0081\u0001\u001a\u00020\nJ\u0007\u0010\u0082\u0001\u001a\u00020zJ\u001c\u0010\u0083\u0001\u001a\u00020z2\u0007\u0010\u0084\u0001\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J1\u0010\u0086\u0001\u001a\u00020z2\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u000e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u0088\u0001J\u0012\u0010\u008c\u0001\u001a\u00020z2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010SJ\u0010\u0010\u008e\u0001\u001a\u00020z2\u0007\u0010\u008f\u0001\u001a\u00020ZJ\u0010\u0010\u0090\u0001\u001a\u00020z2\u0007\u0010\u0091\u0001\u001a\u00020aJ3\u0010\u0092\u0001\u001a\u00020z2\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u000e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u0088\u0001H\u0002J\u0014\u0010\u0093\u0001\u001a\u00020z2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010SH\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\t\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR/\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR+\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b$\u0010\u0011\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000fR+\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\u0011\u001a\u0004\b&\u0010\r\"\u0004\b\'\u0010\u000fR/\u0010)\u001a\u0004\u0018\u00010\u00162\b\u0010\t\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\u0011\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00101\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b4\u0010\u0011\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00107\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b:\u0010\u0011\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010\u000fR+\u0010;\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b>\u0010\u0011\u001a\u0004\b<\u0010\r\"\u0004\b=\u0010\u000fR+\u0010?\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bB\u0010\u0011\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010\u000fR+\u0010C\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bF\u0010\u0011\u001a\u0004\bD\u0010\r\"\u0004\bE\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010G\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bJ\u0010\u0011\u001a\u0004\bH\u0010\r\"\u0004\bI\u0010\u000fR+\u0010K\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bN\u0010\u0011\u001a\u0004\bL\u0010\r\"\u0004\bM\u0010\u000fR+\u0010O\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bR\u0010\u0011\u001a\u0004\bP\u0010\r\"\u0004\bQ\u0010\u000fR/\u0010T\u001a\u0004\u0018\u00010S2\b\u0010\t\u001a\u0004\u0018\u00010S8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bY\u0010\u0011\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010[\u001a\u00020Z2\u0006\u0010\t\u001a\u00020Z8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b`\u0010\u0011\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R+\u0010b\u001a\u00020a2\u0006\u0010\t\u001a\u00020a8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bg\u0010\u0011\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u000e\u0010h\u001a\u00020iX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0k\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010mR,\u0010n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020p0o0.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR+\u0010u\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bx\u0010\u0011\u001a\u0004\bv\u0010\r\"\u0004\bw\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0094\u0001"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/uploadCarScreen/uploadCarViewmodel;", "Landroidx/lifecycle/ViewModel;", "addCarUseCase", "Lcom/acasloa946/pfg_caraction/domain/addCarUseCase;", "fetchUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchUserUseCase;", "linkCarToProfileUseCase", "Lcom/acasloa946/pfg_caraction/domain/linkCarToProfileUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/addCarUseCase;Lcom/acasloa946/pfg_caraction/domain/fetchUserUseCase;Lcom/acasloa946/pfg_caraction/domain/linkCarToProfileUseCase;)V", "<set-?>", "", "_carFuelType", "get_carFuelType", "()Ljava/lang/String;", "set_carFuelType", "(Ljava/lang/String;)V", "_carFuelType$delegate", "Landroidx/compose/runtime/MutableState;", "_carInfo", "get_carInfo", "set_carInfo", "_carInfo$delegate", "", "_carKM", "get_carKM", "()Ljava/lang/Integer;", "set_carKM", "(Ljava/lang/Integer;)V", "_carKM$delegate", "_carPrice", "get_carPrice", "set_carPrice", "_carPrice$delegate", "_carTransmisionType", "get_carTransmisionType", "set_carTransmisionType", "_carTransmisionType$delegate", "_carType", "get_carType", "set_carType", "_carType$delegate", "_carYear", "get_carYear", "set_carYear", "_carYear$delegate", "_uploadCarStates", "Landroidx/lifecycle/MutableLiveData;", "Lcom/acasloa946/pfg_caraction/UserInterface/States/UploadCarStates;", "", "_userName", "get_userName", "set_userName", "_userName$delegate", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "carKMField", "getCarKMField", "setCarKMField", "carKMField$delegate", "carPlate", "getCarPlate", "setCarPlate", "carPlate$delegate", "carPriceField", "getCarPriceField", "setCarPriceField", "carPriceField$delegate", "carYearField", "getCarYearField", "setCarYearField", "carYearField$delegate", "makeButtonText", "getMakeButtonText", "setMakeButtonText", "makeButtonText$delegate", "modelButtonText", "getModelButtonText", "setModelButtonText", "modelButtonText$delegate", "selectedImageURL", "getSelectedImageURL", "setSelectedImageURL", "selectedImageURL$delegate", "Landroid/net/Uri;", "selectedImageUri", "getSelectedImageUri", "()Landroid/net/Uri;", "setSelectedImageUri", "(Landroid/net/Uri;)V", "selectedImageUri$delegate", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMake;", "selectedMake", "getSelectedMake", "()Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMake;", "setSelectedMake", "(Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMake;)V", "selectedMake$delegate", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModel;", "selectedModel", "getSelectedModel", "()Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModel;", "setSelectedModel", "(Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModel;)V", "selectedModel$delegate", "storageRef", "Lcom/google/firebase/storage/FirebaseStorage;", "uploadCarStates", "Landroidx/lifecycle/LiveData;", "getUploadCarStates", "()Landroidx/lifecycle/LiveData;", "userLocation", "Lkotlin/Pair;", "", "getUserLocation", "()Landroidx/lifecycle/MutableLiveData;", "setUserLocation", "(Landroidx/lifecycle/MutableLiveData;)V", "userLocationString", "getUserLocationString", "setUserLocationString", "userLocationString$delegate", "changeKM", "", "KM", "changePlate", "plate", "changePrice", "price", "changeYear", "year", "clearScreen", "getAIInfo", "makeModel", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCarType", "fillData", "Lkotlin/Function0;", "context", "Landroid/content/Context;", "uploadedSuccessfuly", "getSelectedImage", "uri", "selectMake", "make", "selectModel", "model", "uploadCar", "uploadImage", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class uploadCarViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.addCarUseCase addCarUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.fetchUserUseCase fetchUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.linkCarToProfileUseCase linkCarToProfileUseCase = null;
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
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> userLocation;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState userLocationString$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _userName$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carFuelType$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carTransmisionType$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _carInfo$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.acasloa946.pfg_caraction.UserInterface.States.UploadCarStates> _uploadCarStates = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.UploadCarStates> uploadCarStates = null;
    
    @javax.inject.Inject
    public uploadCarViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.addCarUseCase addCarUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.fetchUserUseCase fetchUserUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.linkCarToProfileUseCase linkCarToProfileUseCase) {
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
    
    private final java.lang.String get_carPrice() {
        return null;
    }
    
    private final void set_carPrice(java.lang.String p0) {
    }
    
    private final java.lang.String get_carType() {
        return null;
    }
    
    private final void set_carType(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> getUserLocation() {
        return null;
    }
    
    public final void setUserLocation(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> p0) {
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
    
    private final java.lang.String get_carInfo() {
        return null;
    }
    
    private final void set_carInfo(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.UploadCarStates> getUploadCarStates() {
        return null;
    }
    
    public final void getSelectedImage(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
    }
    
    private final void uploadImage(android.net.Uri uri) {
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
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> uploadedSuccessfuly) {
    }
    
    private final void uploadCar(kotlin.jvm.functions.Function0<kotlin.Unit> fillData, android.content.Context context, kotlin.jvm.functions.Function0<kotlin.Unit> uploadedSuccessfuly) {
    }
    
    public final void clearScreen() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAIInfo(@org.jetbrains.annotations.NotNull
    java.lang.String makeModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}