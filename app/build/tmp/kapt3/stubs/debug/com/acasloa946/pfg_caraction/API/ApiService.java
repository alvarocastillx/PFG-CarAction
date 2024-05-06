package com.acasloa946.pfg_caraction.API;

import com.acasloa946.pfg_caraction.API.Models.CarTypes.APITypeResponse;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMakeResponse;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModelResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJC\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\n2\b\b\u0003\u0010\u0011\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/acasloa946/pfg_caraction/API/ApiService;", "", "getMakes", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMakeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getModels", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModelResponse;", "year", "", "make", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getType", "Lcom/acasloa946/pfg_caraction/API/Models/CarTypes/APITypeResponse;", "select", "model", "where", "limit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "makes")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMakes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMakeResponse> $completion);
    
    @retrofit2.http.GET(value = "models")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getModels(@retrofit2.http.Query(value = "year")
    int year, @retrofit2.http.Query(value = "make")
    @org.jetbrains.annotations.NotNull
    java.lang.String make, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModelResponse> $completion);
    
    @retrofit2.http.GET(value = "records")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getType(@retrofit2.http.Query(value = "select")
    @org.jetbrains.annotations.NotNull
    java.lang.String select, @retrofit2.http.Query(value = "")
    @org.jetbrains.annotations.NotNull
    java.lang.String make, @retrofit2.http.Query(value = "")
    @org.jetbrains.annotations.NotNull
    java.lang.String model, @retrofit2.http.Query(value = "where")
    @org.jetbrains.annotations.NotNull
    java.lang.String where, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.API.Models.CarTypes.APITypeResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}