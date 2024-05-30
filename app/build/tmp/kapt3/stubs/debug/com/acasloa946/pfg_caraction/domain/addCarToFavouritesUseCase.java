package com.acasloa946.pfg_caraction.domain;

import android.content.Context;
import com.acasloa946.pfg_caraction.UserInterface.models.CarModel;
import com.acasloa946.pfg_caraction.data.UserRepository;
import javax.inject.Inject;

/**
 * Caso de uso para añadir coche a favoritos
 * @param context: Contexto de la aplicación
 * @param email: Email del usuario que va a agregar el coche a favoritos
 * @param carModel: coche que se desea agregar a favoritos
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/acasloa946/pfg_caraction/domain/addCarToFavouritesUseCase;", "", "userRepository", "Lcom/acasloa946/pfg_caraction/data/UserRepository;", "(Lcom/acasloa946/pfg_caraction/data/UserRepository;)V", "invoke", "", "context", "Landroid/content/Context;", "email", "", "carModel", "Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;", "(Landroid/content/Context;Ljava/lang/String;Lcom/acasloa946/pfg_caraction/UserInterface/models/CarModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class addCarToFavouritesUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.acasloa946.pfg_caraction.data.UserRepository userRepository = null;
    
    @javax.inject.Inject
    public addCarToFavouritesUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.UserInterface.models.CarModel carModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}