package com.acasloa946.pfg_caraction.data;

import android.content.Context;
import android.util.Log;
import com.acasloa946.pfg_caraction.data.Entities.UserEntity;
import com.acasloa946.pfg_caraction.data.Entities.UserType;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/acasloa946/pfg_caraction/data/UserDao;", "", "createUserInDatabase", "", "userEntity", "Lcom/acasloa946/pfg_caraction/data/Entities/UserEntity;", "context", "Landroid/content/Context;", "(Lcom/acasloa946/pfg_caraction/data/Entities/UserEntity;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUser", "email", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    }
}