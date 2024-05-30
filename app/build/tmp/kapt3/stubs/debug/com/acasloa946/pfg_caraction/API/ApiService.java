package com.acasloa946.pfg_caraction.API;

import com.acasloa946.pfg_caraction.API.Models.AIModels.ChatCompletionResponse;
import com.acasloa946.pfg_caraction.API.Models.AIModels.ChatRequest;
import com.acasloa946.pfg_caraction.API.Models.CarTypes.APITypeResponse;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIMakeResponse;
import com.acasloa946.pfg_caraction.API.Models.makesAndModels.APIModelResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010JC\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0003\u0010\u0015\u001a\u00020\u000f2\b\b\u0003\u0010\u0016\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/acasloa946/pfg_caraction/API/ApiService;", "", "AIGetInfo", "Lcom/acasloa946/pfg_caraction/API/Models/AIModels/ChatCompletionResponse;", "chatRequest", "Lcom/acasloa946/pfg_caraction/API/Models/AIModels/ChatRequest;", "(Lcom/acasloa946/pfg_caraction/API/Models/AIModels/ChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMakes", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIMakeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getModels", "Lcom/acasloa946/pfg_caraction/API/Models/makesAndModels/APIModelResponse;", "year", "", "make", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getType", "Lcom/acasloa946/pfg_caraction/API/Models/CarTypes/APITypeResponse;", "select", "model", "where", "limit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    
    @retrofit2.http.Headers(value = {"Content-Type:application/json", "Authorization: Bearer StRJc1zVGAfQ44uoE883F6Eb341448E583141151D338438c"})
    @retrofit2.http.POST(value = "https://api.acloudapp.com/v1/chat/completions/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object AIGetInfo(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.API.Models.AIModels.ChatRequest chatRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.API.Models.AIModels.ChatCompletionResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}