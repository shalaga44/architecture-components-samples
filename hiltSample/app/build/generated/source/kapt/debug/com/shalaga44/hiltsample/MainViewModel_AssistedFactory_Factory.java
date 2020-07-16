package com.shalaga44.hiltsample;

import com.shalaga44.hiltsample.repository.MainRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<MainRepository> mainRepositoryProvider;

  public MainViewModel_AssistedFactory_Factory(Provider<MainRepository> mainRepositoryProvider) {
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(mainRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<MainRepository> mainRepositoryProvider) {
    return new MainViewModel_AssistedFactory_Factory(mainRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(Provider<MainRepository> mainRepository) {
    return new MainViewModel_AssistedFactory(mainRepository);
  }
}
