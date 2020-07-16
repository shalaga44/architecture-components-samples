package com.shalaga44.hiltsample.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvideGsonBuilderFactory implements Factory<Gson> {
  @Override
  public Gson get() {
    return provideGsonBuilder();
  }

  public static RetrofitModule_ProvideGsonBuilderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Gson provideGsonBuilder() {
    return Preconditions.checkNotNull(RetrofitModule.INSTANCE.provideGsonBuilder(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final RetrofitModule_ProvideGsonBuilderFactory INSTANCE = new RetrofitModule_ProvideGsonBuilderFactory();
  }
}
