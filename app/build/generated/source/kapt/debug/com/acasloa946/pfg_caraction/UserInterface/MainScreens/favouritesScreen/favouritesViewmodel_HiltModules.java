package com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;

@OriginatingElement(
    topLevelClass = favouritesViewmodel.class
)
public final class favouritesViewmodel_HiltModules {
  private favouritesViewmodel_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen.favouritesViewmodel")
    @HiltViewModelMap
    public abstract ViewModel binds(favouritesViewmodel vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "com.acasloa946.pfg_caraction.UserInterface.MainScreens.favouritesScreen.favouritesViewmodel";
    }
  }
}
