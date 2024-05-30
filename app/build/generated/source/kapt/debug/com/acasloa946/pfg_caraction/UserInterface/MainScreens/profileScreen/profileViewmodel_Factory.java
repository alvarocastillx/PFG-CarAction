// Generated by Dagger (https://dagger.dev).
package com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen;

import com.acasloa946.pfg_caraction.domain.fetchCarsUploadedByUserUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserByNameUseCase;
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
public final class profileViewmodel_Factory implements Factory<profileViewmodel> {
  private final Provider<fetchCarsUploadedByUserUseCase> fetchCarsUploadedByUserUseCaseProvider;

  private final Provider<fetchUserByNameUseCase> fetchUserByNameUseCaseProvider;

  public profileViewmodel_Factory(
      Provider<fetchCarsUploadedByUserUseCase> fetchCarsUploadedByUserUseCaseProvider,
      Provider<fetchUserByNameUseCase> fetchUserByNameUseCaseProvider) {
    this.fetchCarsUploadedByUserUseCaseProvider = fetchCarsUploadedByUserUseCaseProvider;
    this.fetchUserByNameUseCaseProvider = fetchUserByNameUseCaseProvider;
  }

  @Override
  public profileViewmodel get() {
    return newInstance(fetchCarsUploadedByUserUseCaseProvider.get(), fetchUserByNameUseCaseProvider.get());
  }

  public static profileViewmodel_Factory create(
      Provider<fetchCarsUploadedByUserUseCase> fetchCarsUploadedByUserUseCaseProvider,
      Provider<fetchUserByNameUseCase> fetchUserByNameUseCaseProvider) {
    return new profileViewmodel_Factory(fetchCarsUploadedByUserUseCaseProvider, fetchUserByNameUseCaseProvider);
  }

  public static profileViewmodel newInstance(
      fetchCarsUploadedByUserUseCase fetchCarsUploadedByUserUseCase,
      fetchUserByNameUseCase fetchUserByNameUseCase) {
    return new profileViewmodel(fetchCarsUploadedByUserUseCase, fetchUserByNameUseCase);
  }
}