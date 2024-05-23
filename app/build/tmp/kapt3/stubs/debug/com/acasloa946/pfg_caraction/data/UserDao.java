package com.acasloa946.pfg_caraction.data;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.acasloa946.pfg_caraction.data.Entities.CarEntity;
import com.acasloa946.pfg_caraction.data.Entities.MessageEntity;
import com.acasloa946.pfg_caraction.data.Entities.UserEntity;
import com.acasloa946.pfg_caraction.data.Entities.UserType;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ/\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J)\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J!\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J!\u0010\'\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/acasloa946/pfg_caraction/data/UserDao;", "", "addCarToFavourites", "", "context", "Landroid/content/Context;", "email", "", "carEntity", "Lcom/acasloa946/pfg_caraction/data/Entities/CarEntity;", "(Landroid/content/Context;Ljava/lang/String;Lcom/acasloa946/pfg_caraction/data/Entities/CarEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfUserExists", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUserInDatabase", "userEntity", "Lcom/acasloa946/pfg_caraction/data/Entities/UserEntity;", "(Lcom/acasloa946/pfg_caraction/data/Entities/UserEntity;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCarTypes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCars", "fetchCarsUploadedByUser", "fetchChatsOfUser", "Lcom/acasloa946/pfg_caraction/data/Entities/MessageEntity;", "userReading", "fetchFavCars", "fetchUser", "fetchUserByName", "name", "getMessages", "", "otherUser", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkCarToProfile", "(Lcom/acasloa946/pfg_caraction/data/Entities/CarEntity;Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "messageEntity", "(Landroid/content/Context;Lcom/acasloa946/pfg_caraction/data/Entities/MessageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadCarToDatabase", "(Lcom/acasloa946/pfg_caraction/data/Entities/CarEntity;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object createUserInDatabase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.Entities.UserEntity userEntity, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchUser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.data.Entities.UserEntity> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object uploadCarToDatabase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.Entities.CarEntity carEntity, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchCars(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchCarTypes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object linkCarToProfile(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.Entities.CarEntity carEntity, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchCarsUploadedByUser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchUserByName(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.data.Entities.UserEntity> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.Entities.MessageEntity messageEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMessages(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String userReading, @org.jetbrains.annotations.NotNull
    java.lang.String otherUser, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.MessageEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchChatsOfUser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String userReading, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.MessageEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addCarToFavourites(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.Entities.CarEntity carEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchFavCars(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object checkIfUserExists(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object createUserInDatabase(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.Entities.UserEntity userEntity, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object fetchUser(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.data.Entities.UserEntity> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object uploadCarToDatabase(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.Entities.CarEntity carEntity, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object fetchCars(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object fetchCarTypes(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object linkCarToProfile(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.Entities.CarEntity carEntity, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object fetchCarsUploadedByUser(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object fetchUserByName(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super com.acasloa946.pfg_caraction.data.Entities.UserEntity> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.Entities.MessageEntity messageEntity, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object getMessages(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String userReading, @org.jetbrains.annotations.NotNull
        java.lang.String otherUser, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.MessageEntity>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object fetchChatsOfUser(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String userReading, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.MessageEntity>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object addCarToFavourites(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.Entities.CarEntity carEntity, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object fetchFavCars(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.util.List<com.acasloa946.pfg_caraction.data.Entities.CarEntity>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object checkIfUserExists(@org.jetbrains.annotations.NotNull
        com.acasloa946.pfg_caraction.data.UserDao $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
            return null;
        }
    }
}