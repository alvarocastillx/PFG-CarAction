// Generated by Dagger (https://dagger.dev).
package com.acasloa946.pfg_caraction.domain;

import com.acasloa946.pfg_caraction.data.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class fetchChatsOfUserUseCase_Factory implements Factory<fetchChatsOfUserUseCase> {
  private final Provider<UserRepository> userRepositoryProvider;

  public fetchChatsOfUserUseCase_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public fetchChatsOfUserUseCase get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static fetchChatsOfUserUseCase_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new fetchChatsOfUserUseCase_Factory(userRepositoryProvider);
  }

  public static fetchChatsOfUserUseCase newInstance(UserRepository userRepository) {
    return new fetchChatsOfUserUseCase(userRepository);
  }
}
