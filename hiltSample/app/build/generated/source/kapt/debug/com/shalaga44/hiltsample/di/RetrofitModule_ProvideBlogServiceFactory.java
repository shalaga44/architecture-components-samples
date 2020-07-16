package com.shalaga44.hiltsample.di;

import com.shalaga44.hiltsample.retrofit.BlogRetrofit;
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
public final class RetrofitModule_ProvideBlogServiceFactory implements Factory<BlogRetrofit> {
  private final Provider<Retrofit.Builder> retrofitProvider;

  public RetrofitModule_ProvideBlogServiceFactory(Provider<Retrofit.Builder> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public BlogRetrofit get() {
    return provideBlogService(retrofitProvider.get());
  }

  public static RetrofitModule_ProvideBlogServiceFactory create(
      Provider<Retrofit.Builder> retrofitProvider) {
    return new RetrofitModule_ProvideBlogServiceFactory(retrofitProvider);
  }

  public static BlogRetrofit provideBlogService(Retrofit.Builder retrofit) {
    return Preconditions.checkNotNull(RetrofitModule.INSTANCE.provideBlogService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
