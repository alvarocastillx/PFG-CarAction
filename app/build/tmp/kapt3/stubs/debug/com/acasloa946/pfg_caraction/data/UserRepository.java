package com.acasloa946.pfg_caraction.data;

import android.content.Context;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel;
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel;
import com.acasloa946.pfg_caraction.data.Entities.CarEntity;
import com.acasloa946.pfg_caraction.data.Entities.MessageEntity;
import com.acasloa946.pfg_caraction.data.Entities.UserEntity;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\'\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J#\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J#\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J/\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J)\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J!\u0010+\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/acasloa946/pfg_caraction/data/UserRepository;", "", "userDao", "Lcom/acasloa946/pfg_caraction/data/UserDao;", "(Lcom/acasloa946/pfg_caraction/data/UserDao;)V", "addCar", "", "carModel", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "context", "Landroid/content/Context;", "(Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCarToFavourites", "email", "", "(Landroid/content/Context;Ljava/lang/String;Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addUser", "userModel", "Lcom/acasloa946/pfg_caraction/UserInterface/models/UserModel;", "(Lcom/acasloa946/pfg_caraction/UserInterface/models/UserModel;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfUserExists", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCarTypes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCars", "Lcom/acasloa946/pfg_caraction/data/Entities/CarEntity;", "fetchCarsUploadedByUser", "fetchChatsOfUser", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/MessageModel;", "userReading", "fetchFavCars", "fetchUser", "Lcom/acasloa946/pfg_caraction/data/Entities/UserEntity;", "fetchUserByName", "name", "getMessages", "otherUser", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkCarToProfile", "(Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "messageModel", "(Landroid/content/Context;Lcom/acasloa946/pfg_caraction/UserInterface/models/MessageModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.data.UserDao userDao = null;
    
    @javax.inject.Inject
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addUser(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.models.UserModel userModel, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchUser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.data.Entities.UserEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addCar(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.models.CarModel carModel, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCars(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCarTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object linkCarToProfile(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.models.CarModel carModel, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCarsUploadedByUser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchUserByName(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.data.Entities.UserEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.models.MessageModel messageModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMessages(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String userReading, @org.jetbrains.annotations.NotNull
    java.lang.String otherUser, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.MessageModel>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchChatsOfUser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String userReading, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.MessageModel>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addCarToFavourites(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.models.CarModel carModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchFavCars(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object checkIfUserExists(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}