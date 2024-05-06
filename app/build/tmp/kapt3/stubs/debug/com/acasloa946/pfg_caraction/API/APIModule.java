package com.acasloa946.pfg_caraction.API;

import androidx.compose.runtime.MutableState;
import com.acasloa946.pfg_caraction.API.Models.CarTypes.APITypeResult;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel;
import kotlinx.coroutines.Dispatchers;
import retrofit2.HttpException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/acasloa946/pfg_caraction/API/APIModule;", "", "()V", "apiServiceMakes", "Lcom/acasloa946/pfg_caraction/API/ApiService;", "apiServiceType", "getCarMakes", "", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMake;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCarModels", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModel;", "make", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCarType", "Lcom/acasloa946/pfg_caraction/API/Models/CarTypes/APITypeResult;", "model", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class APIModule {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.API.ApiService apiServiceMakes = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.API.ApiService apiServiceType = null;
    
    public APIModule() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCarMakes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMake>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCarModels(@org.jetbrains.annotations.NotNull
    java.lang.String make, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModel>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCarType(@org.jetbrains.annotations.NotNull
    java.lang.String make, @org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.API.Models.CarTypes.APITypeResult> $completion) {
        return null;
    }
}