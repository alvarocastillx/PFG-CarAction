// Generated by Dagger (https://dagger.dev).
package com.acasloa946.pfg_caraction.UserInterface.Main.carScreen;

import com.acasloa946.pfg_caraction.domain.addCarToFavouritesUseCase;
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
public final class CarScreenViewmodel_Factory implements Factory<CarScreenViewmodel> {
  private final Provider<addCarToFavouritesUseCase> addCarToFavouritesUseCaseProvider;

  public CarScreenViewmodel_Factory(
      Provider<addCarToFavouritesUseCase> addCarToFavouritesUseCaseProvider) {
    this.addCarToFavouritesUseCaseProvider = addCarToFavouritesUseCaseProvider;
  }

  @Override
  public CarScreenViewmodel get() {
    return newInstance(addCarToFavouritesUseCaseProvider.get());
  }

  public static CarScreenViewmodel_Factory create(
      Provider<addCarToFavouritesUseCase> addCarToFavouritesUseCaseProvider) {
    return new CarScreenViewmodel_Factory(addCarToFavouritesUseCaseProvider);
  }

  public static CarScreenViewmodel newInstance(
      addCarToFavouritesUseCase addCarToFavouritesUseCase) {
    return new CarScreenViewmodel(addCarToFavouritesUseCase);
  }
}
