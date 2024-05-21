// Generated by Dagger (https://dagger.dev).
package com.acasloa946.pfg_caraction.UserInterface.Main.favouritesScreen;

import com.acasloa946.pfg_caraction.domain.fetchFavouriteCarsUseCase;
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
public final class favouritesViewmodel_Factory implements Factory<favouritesViewmodel> {
  private final Provider<fetchFavouriteCarsUseCase> fetchFavouriteCarsUseCaseProvider;

  public favouritesViewmodel_Factory(
      Provider<fetchFavouriteCarsUseCase> fetchFavouriteCarsUseCaseProvider) {
    this.fetchFavouriteCarsUseCaseProvider = fetchFavouriteCarsUseCaseProvider;
  }

  @Override
  public favouritesViewmodel get() {
    return newInstance(fetchFavouriteCarsUseCaseProvider.get());
  }

  public static favouritesViewmodel_Factory create(
      Provider<fetchFavouriteCarsUseCase> fetchFavouriteCarsUseCaseProvider) {
    return new favouritesViewmodel_Factory(fetchFavouriteCarsUseCaseProvider);
  }

  public static favouritesViewmodel newInstance(
      fetchFavouriteCarsUseCase fetchFavouriteCarsUseCase) {
    return new favouritesViewmodel(fetchFavouriteCarsUseCase);
  }
}
