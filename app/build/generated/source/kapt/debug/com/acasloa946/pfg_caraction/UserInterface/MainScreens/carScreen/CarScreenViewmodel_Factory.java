// Generated by Dagger (https://dagger.dev).
package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen;

import com.acasloa946.pfg_caraction.domain.addCarToFavouritesUseCase;
import com.acasloa946.pfg_caraction.domain.deleteCarUseCase;
import com.acasloa946.pfg_caraction.domain.fetchUserUseCase;
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

  private final Provider<fetchUserUseCase> fetchUserUseCaseProvider;

  private final Provider<deleteCarUseCase> deleteCarUseCaseProvider;

  public CarScreenViewmodel_Factory(
      Provider<addCarToFavouritesUseCase> addCarToFavouritesUseCaseProvider,
      Provider<fetchUserUseCase> fetchUserUseCaseProvider,
      Provider<deleteCarUseCase> deleteCarUseCaseProvider) {
    this.addCarToFavouritesUseCaseProvider = addCarToFavouritesUseCaseProvider;
    this.fetchUserUseCaseProvider = fetchUserUseCaseProvider;
    this.deleteCarUseCaseProvider = deleteCarUseCaseProvider;
  }

  @Override
  public CarScreenViewmodel get() {
    return newInstance(addCarToFavouritesUseCaseProvider.get(), fetchUserUseCaseProvider.get(), deleteCarUseCaseProvider.get());
  }

  public static CarScreenViewmodel_Factory create(
      Provider<addCarToFavouritesUseCase> addCarToFavouritesUseCaseProvider,
      Provider<fetchUserUseCase> fetchUserUseCaseProvider,
      Provider<deleteCarUseCase> deleteCarUseCaseProvider) {
    return new CarScreenViewmodel_Factory(addCarToFavouritesUseCaseProvider, fetchUserUseCaseProvider, deleteCarUseCaseProvider);
  }

  public static CarScreenViewmodel newInstance(addCarToFavouritesUseCase addCarToFavouritesUseCase,
      fetchUserUseCase fetchUserUseCase, deleteCarUseCase deleteCarUseCase) {
    return new CarScreenViewmodel(addCarToFavouritesUseCase, fetchUserUseCase, deleteCarUseCase);
  }
}