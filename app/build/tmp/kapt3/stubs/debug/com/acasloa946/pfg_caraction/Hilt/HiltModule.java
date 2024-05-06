package com.acasloa946.pfg_caraction.Hilt;

import com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen.homeScreenViewmodel;
import com.acasloa946.pfg_caraction.UserInterface.Start.RegisterScreen.RegisterViewmodel;
import com.acasloa946.pfg_caraction.data.UserDao;
import com.acasloa946.pfg_caraction.data.UserRepository;
import com.acasloa946.pfg_caraction.domain.addCarUseCase;
import com.acasloa946.pfg_caraction.domain.addUserUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/acasloa946/pfg_caraction/Hilt/HiltModule;", "", "()V", "provideAddCarUseCase", "Lcom/acasloa946/pfg_caraction/domain/addCarUseCase;", "userRepository", "Lcom/acasloa946/pfg_caraction/data/UserRepository;", "provideAddUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/addUserUseCase;", "provideFetchUserCase", "Lcom/acasloa946/pfg_caraction/domain/fetchUserUseCase;", "provideUserDao", "Lcom/acasloa946/pfg_caraction/data/UserDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class HiltModule {
    
    public HiltModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.addUserUseCase provideAddUserUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.fetchUserUseCase provideFetchUserCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.addCarUseCase provideAddCarUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.data.UserDao provideUserDao() {
        return null;
    }
}