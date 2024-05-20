// Generated by Dagger (https://dagger.dev).
package com.acasloa946.pfg_caraction.Hilt;

import com.acasloa946.pfg_caraction.data.UserRepository;
import com.acasloa946.pfg_caraction.domain.getMessagesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HiltModule_ProvidegetMessageUseCaseFactory implements Factory<getMessagesUseCase> {
  private final HiltModule module;

  private final Provider<UserRepository> userRepositoryProvider;

  public HiltModule_ProvidegetMessageUseCaseFactory(HiltModule module,
      Provider<UserRepository> userRepositoryProvider) {
    this.module = module;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public getMessagesUseCase get() {
    return providegetMessageUseCase(module, userRepositoryProvider.get());
  }

  public static HiltModule_ProvidegetMessageUseCaseFactory create(HiltModule module,
      Provider<UserRepository> userRepositoryProvider) {
    return new HiltModule_ProvidegetMessageUseCaseFactory(module, userRepositoryProvider);
  }

  public static getMessagesUseCase providegetMessageUseCase(HiltModule instance,
      UserRepository userRepository) {
    return Preconditions.checkNotNullFromProvides(instance.providegetMessageUseCase(userRepository));
  }
}