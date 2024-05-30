// Generated by Dagger (https://dagger.dev).
package com.acasloa946.pfg_caraction.UserInterface.MainScreens.uploadCarScreen;

import com.acasloa946.pfg_caraction.domain.addCarUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase;
import com.acasloa946.pfg_caraction.domain.linkCarToProfileUseCase;
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
public final class uploadCarViewmodel_Factory implements Factory<uploadCarViewmodel> {
  private final Provider<addCarUseCase> addCarUseCaseProvider;

  private final Provider<fetchUserUseCase> fetchUserUseCaseProvider;

  private final Provider<linkCarToProfileUseCase> linkCarToProfileUseCaseProvider;

  public uploadCarViewmodel_Factory(Provider<addCarUseCase> addCarUseCaseProvider,
      Provider<fetchUserUseCase> fetchUserUseCaseProvider,
      Provider<linkCarToProfileUseCase> linkCarToProfileUseCaseProvider) {
    this.addCarUseCaseProvider = addCarUseCaseProvider;
    this.fetchUserUseCaseProvider = fetchUserUseCaseProvider;
    this.linkCarToProfileUseCaseProvider = linkCarToProfileUseCaseProvider;
  }

  @Override
  public uploadCarViewmodel get() {
    return newInstance(addCarUseCaseProvider.get(), fetchUserUseCaseProvider.get(), linkCarToProfileUseCaseProvider.get());
  }

  public static uploadCarViewmodel_Factory create(Provider<addCarUseCase> addCarUseCaseProvider,
      Provider<fetchUserUseCase> fetchUserUseCaseProvider,
      Provider<linkCarToProfileUseCase> linkCarToProfileUseCaseProvider) {
    return new uploadCarViewmodel_Factory(addCarUseCaseProvider, fetchUserUseCaseProvider, linkCarToProfileUseCaseProvider);
  }

  public static uploadCarViewmodel newInstance(addCarUseCase addCarUseCase,
      fetchUserUseCase fetchUserUseCase, linkCarToProfileUseCase linkCarToProfileUseCase) {
    return new uploadCarViewmodel(addCarUseCase, fetchUserUseCase, linkCarToProfileUseCase);
  }
}