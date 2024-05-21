package com.acasloa946.pfg_caraction.UserInterface.Main.favouritesScreen;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.acasloa946.pfg_caraction.UserInterface.States.ChatScreenStates;
import com.acasloa946.pfg_caraction.UserInterface.States.FavouriteCarStates;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.UserInterface.models.MessageModel;
import com.acasloa946.pfg_caraction.domain.fetchFavouriteCarsUseCase;
import com.google.firebase.Firebase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/acasloa946/pfg_caraction/UserInterface/Main/favouritesScreen/favouritesViewmodel;", "Landroidx/lifecycle/ViewModel;", "fetchFavouriteCarsUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchFavouriteCarsUseCase;", "(Lcom/acasloa946/pfg_caraction/domain/fetchFavouriteCarsUseCase;)V", "_favouriteCarStates", "Landroidx/lifecycle/MutableLiveData;", "Lcom/acasloa946/pfg_caraction/UserInterface/States/FavouriteCarStates;", "", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "favouriteCarStates", "Landroidx/lifecycle/LiveData;", "getFavouriteCarStates", "()Landroidx/lifecycle/LiveData;", "fetchedFavCars", "Lkotlinx/coroutines/flow/MutableStateFlow;", "fetchFavCars", "", "context", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class favouritesViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.domain.fetchFavouriteCarsUseCase fetchFavouriteCarsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>> fetchedFavCars = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.acasloa946.pfg_caraction.UserInterface.States.FavouriteCarStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>>> _favouriteCarStates = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.FavouriteCarStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>>> favouriteCarStates = null;
    
    @javax.inject.Inject
    public favouritesViewmodel(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.domain.fetchFavouriteCarsUseCase fetchFavouriteCarsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.acasloa946.pfg_caraction.UserInterface.States.FavouriteCarStates<java.util.List<com.acasloa946.pfg_caraction.UserInterface.models.CarModel>>> getFavouriteCarStates() {
        return null;
    }
    
    public final void fetchFavCars(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}