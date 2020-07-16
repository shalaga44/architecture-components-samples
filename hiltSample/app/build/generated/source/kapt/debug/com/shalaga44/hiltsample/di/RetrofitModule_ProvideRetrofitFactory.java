package com.shalaga44.hiltsample.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvideRetrofitFactory implements Factory<Retrofit.Builder> {
  private final Provider<Gson> gsonProvider;

  public RetrofitModule_ProvideRetrofitFactory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit.Builder get() {
    return provideRetrofit(gsonProvider.get());
  }

  public static RetrofitModule_ProvideRetrofitFactory create(Provider<Gson> gsonProvider) {
    return new RetrofitModule_ProvideRetrofitFactory(gsonProvider);
  }

  public static Retrofit.Builder provideRetrofit(Gson gson) {
    return Preconditions.checkNotNull(RetrofitModule.INSTANCE.provideRetrofit(gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
