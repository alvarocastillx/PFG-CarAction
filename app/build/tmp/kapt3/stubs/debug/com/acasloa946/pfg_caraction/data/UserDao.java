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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J#\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ)\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J!\u0010!\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/acasloa946/pfg_caraction/data/UserDao;", "", "createUserInDatabase", "", "userEntity", "Lcom/acasloa946/pfg_caraction/data/Entities/UserEntity;", "context", "Landroid/content/Context;", "(Lcom/acasloa946/pfg_caraction/data/Entities/UserEntity;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCarTypes", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCars", "Lcom/acasloa946/pfg_caraction/data/Entities/CarEntity;", "fetchCarsUploadedByUser", "email", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUser", "fetchUserByName", "name", "getMessages", "", "Lcom/acasloa946/pfg_caraction/data/Entities/MessageEntity;", "userReading", "otherUser", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkCarToProfile", "carEntity", "(Lcom/acasloa946/pfg_caraction/data/Entities/CarEntity;Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "messageEntity", "(Landroid/content/Context;Lcom/acasloa946/pfg_caraction/data/Entities/MessageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadCarToDatabase", "(Lcom/acasloa946/pfg_caraction/data/Entities/CarEntity;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    }
}