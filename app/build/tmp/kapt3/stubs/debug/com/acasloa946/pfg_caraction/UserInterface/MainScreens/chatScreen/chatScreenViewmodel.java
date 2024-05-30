package com.acasloa946.pfg_caraction.UserInterface.MainScreens.chatScreen;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates;
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel;
import com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserByNameUseCase;
import com.acasloa946.pfg_caraction.domain.UsersUseCases.getMessagesUseCase;
import com.acasloa946.pfg_caraction.domain.UsersUseCases.sendMessageUseCase;
import com.google.firebase.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0019J\u0016\u00106\u001a\u0002042\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0019J$\u0010:\u001a\u0002042\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00192\f\u0010;\u001a\b\u0012\u0004\u0012\u0002040<R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR7\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0 2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0 8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010\'\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010+\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R#\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b00\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102\u00a8\u0006="}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/MainScreens/chatScreen/chatScreenViewmodel;", "Landroidx/lifecycle/ViewModel;", "sendMessageUseCase", "Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/sendMessageUseCase;", "fetchUserByNameUseCase", "Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchUserByNameUseCase;", "getMessagesUseCase", "Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/getMessagesUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/sendMessageUseCase;Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/fetchUserByNameUseCase;Lcom/acasloa946/pfg_caraction/domain/UsersUseCases/getMessagesUseCase;)V", "_userChatsState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/acasloa946/pfg_caraction/UserInterface/States/ChatScreenStates;", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/MessageModel;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "<set-?>", "", "loaded", "getLoaded", "()Z", "setLoaded", "(Z)V", "loaded$delegate", "Landroidx/compose/runtime/MutableState;", "", "messageField", "getMessageField", "()Ljava/lang/String;", "setMessageField", "(Ljava/lang/String;)V", "messageField$delegate", "", "messagesList", "getMessagesList", "()Ljava/util/List;", "setMessagesList", "(Ljava/util/List;)V", "messagesList$delegate", "otherUserMail", "getOtherUserMail", "setOtherUserMail", "otherUserMail$delegate", "sentOnce", "getSentOnce", "setSentOnce", "sentOnce$delegate", "userChatsState", "Landroidx/lifecycle/LiveData;", "getUserChatsState", "()Landroidx/lifecycle/LiveData;", "changeMessageField", "", "message", "getMessages", "context", "Landroid/content/Context;", "sent_to", "sendMessage", "errorSendingMessage", "Lkotlin/Function0;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class chatScreenViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.UsersUseCases.sendMessageUseCase sendMessageUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserByNameUseCase fetchUserByNameUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.UsersUseCases.getMessagesUseCase getMessagesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState messageField$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState messagesList$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState otherUserMail$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.MessageModel>>> _userChatsState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.MessageModel>>> userChatsState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState loaded$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState sentOnce$delegate = null;
    
    @javax.inject.Inject
    public chatScreenViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.UsersUseCases.sendMessageUseCase sendMessageUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.UsersUseCases.fetchUserByNameUseCase fetchUserByNameUseCase, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.UsersUseCases.getMessagesUseCase getMessagesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessageField() {
        return null;
    }
    
    public final void setMessageField(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.MessageModel> getMessagesList() {
        return null;
    }
    
    private final void setMessagesList(java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.MessageModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOtherUserMail() {
        return null;
    }
    
    public final void setOtherUserMail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.MessageModel>>> getUserChatsState() {
        return null;
    }
    
    public final boolean getLoaded() {
        return false;
    }
    
    public final void setLoaded(boolean p0) {
    }
    
    private final boolean getSentOnce() {
        return false;
    }
    
    private final void setSentOnce(boolean p0) {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String sent_to, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> errorSendingMessage) {
    }
    
    public final void changeMessageField(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public final void getMessages(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String sent_to) {
    }
}