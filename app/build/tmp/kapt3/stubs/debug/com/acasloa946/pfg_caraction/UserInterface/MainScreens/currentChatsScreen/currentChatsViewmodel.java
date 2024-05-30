package com.acasloa946.pfg_caraction.UserInterface.MainScreens.currentChatsScreen;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats;
import com.acasloa946.pfg_caraction.UserInterface.models.UserModel;
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase;
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase;
import com.google.firebase.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006&"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/currentChatsScreen/currentChatsViewmodel;", "Landroidx/lifecycle/ViewModel;", "fetchChatsOfUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchChatsOfUserUseCase;", "fetchUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchUserUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchChatsOfUserUseCase;Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchUserUseCase;)V", "_userCurrentChatsState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/acasloa946/pfg_caraction/UserInterface/States/ResultStateCurrentChats;", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/UserModel;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "<set-?>", "", "clickedUserToChat", "getClickedUserToChat", "()Ljava/lang/String;", "setClickedUserToChat", "(Ljava/lang/String;)V", "clickedUserToChat$delegate", "Landroidx/compose/runtime/MutableState;", "userChats", "", "getUserChats", "()Ljava/util/List;", "userChats$delegate", "userCurrentChatsState", "Landroidx/lifecycle/LiveData;", "getUserCurrentChatsState", "()Landroidx/lifecycle/LiveData;", "fetchChats", "", "context", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class currentChatsViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase fetchChatsOfUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase fetchUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.UserModel>>> _userCurrentChatsState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.UserModel>>> userCurrentChatsState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState clickedUserToChat$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState userChats$delegate = null;
    
    @javax.inject.Inject
    public currentChatsViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchChatsOfUserUseCase fetchChatsOfUserUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserUseCase fetchUserUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.ResultStateCurrentChats<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.UserModel>>> getUserCurrentChatsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClickedUserToChat() {
        return null;
    }
    
    public final void setClickedUserToChat(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.UserModel> getUserChats() {
        return null;
    }
    
    public final void fetchChats(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}