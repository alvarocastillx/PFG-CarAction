package com.acasloa946.pfg_caraction.Hilt;

import com.acasloa946.pfg_caraction.data.UserDao;
import com.acasloa946.pfg_caraction.data.UserRepository;
import com.acasloa946.pfg_caraction.domain.addCarUseCase;
import com.acasloa946.pfg_caraction.domain.addUserUseCase;
import com.acasloa946.pfg_caraction.domain.fetchCarTypesUseCase;
import com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase;
import com.acasloa946.pfg_caraction.domain.fetchCarsUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserByNameUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase;
import com.acasloa946.pfg_caraction.domain.getMessagesUseCase;
import com.acasloa946.pfg_caraction.domain.linkCarToProfileUseCase;
import com.acasloa946.pfg_caraction.domain.sendMessageUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/acasloa946/pfg_caraction/Hilt/HiltModule;", "", "()V", "provideAddCarUseCase", "Lcom/acasloa946/pfg_caraction/domain/addCarUseCase;", "userRepository", "Lcom/acasloa946/pfg_caraction/data/UserRepository;", "provideAddUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/addUserUseCase;", "provideFetchCarsTypeUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchCarTypesUseCase;", "provideFetchCarsUploadedByUserUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchCarsUploadedByUserUseCase;", "provideFetchCarsUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchCarsUseCase;", "provideFetchUserByNameUseCase", "Lcom/acasloa946/pfg_caraction/domain/fetchUserByNameUseCase;", "provideFetchUserCase", "Lcom/acasloa946/pfg_caraction/domain/fetchUserUseCase;", "provideLinkCarToProfileUseCase", "Lcom/acasloa946/pfg_caraction/domain/linkCarToProfileUseCase;", "provideSendMessageUseCase", "Lcom/acasloa946/pfg_caraction/domain/sendMessageUseCase;", "provideUserDao", "Lcom/acasloa946/pfg_caraction/data/UserDao;", "providegetMessageUseCase", "Lcom/acasloa946/pfg_caraction/domain/getMessagesUseCase;", "app_debug"})
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
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.fetchCarsUseCase provideFetchCarsUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.fetchCarTypesUseCase provideFetchCarsTypeUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.linkCarToProfileUseCase provideLinkCarToProfileUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase provideFetchCarsUploadedByUserUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.fetchUserByNameUseCase provideFetchUserByNameUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.sendMessageUseCase provideSendMessageUseCase(@org.jetbrains.annotations.NotNull
    com.acasloa946.pfg_caraction.data.UserRepository userRepository) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.acasloa946.pfg_caraction.domain.getMessagesUseCase providegetMessageUseCase(@org.jetbrains.annotations.NotNull
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