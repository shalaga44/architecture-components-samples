package com.shalaga44.hiltsample.di;

import com.shalaga44.hiltsample.repository.MainRepository;
import com.shalaga44.hiltsample.retrofit.BlogRetrofit;
import com.shalaga44.hiltsample.retrofit.NetworkMapper;
import com.shalaga44.hiltsample.room.BlogDao;
import com.shalaga44.hiltsample.room.CacheMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoryModule_ProvideMainRepositoryFactory implements Factory<MainRepository> {
  private final RepositoryModule module;

  private final Provider<BlogDao> blogDaoProvider;

  private final Provider<BlogRetrofit> blogRetrofitProvider;

  private final Provider<CacheMapper> cacheMapperProvider;

  private final Provider<NetworkMapper> networkMapperProvider;

  public RepositoryModule_ProvideMainRepositoryFactory(RepositoryModule module,
      Provider<BlogDao> blogDaoProvider, Provider<BlogRetrofit> blogRetrofitProvider,
      Provider<CacheMapper> cacheMapperProvider, Provider<NetworkMapper> networkMapperProvider) {
    this.module = module;
    this.blogDaoProvider = blogDaoProvider;
    this.blogRetrofitProvider = blogRetrofitProvider;
    this.cacheMapperProvider = cacheMapperProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public MainRepository get() {
    return provideMainRepository(module, blogDaoProvider.get(), blogRetrofitProvider.get(), cacheMapperProvider.get(), networkMapperProvider.get());
  }

  public static RepositoryModule_ProvideMainRepositoryFactory create(RepositoryModule module,
      Provider<BlogDao> blogDaoProvider, Provider<BlogRetrofit> blogRetrofitProvider,
      Provider<CacheMapper> cacheMapperProvider, Provider<NetworkMapper> networkMapperProvider) {
    return new RepositoryModule_ProvideMainRepositoryFactory(module, blogDaoProvider, blogRetrofitProvider, cacheMapperProvider, networkMapperProvider);
  }

  public static MainRepository provideMainRepository(RepositoryModule instance, BlogDao blogDao,
      BlogRetrofit blogRetrofit, CacheMapper cacheMapper, NetworkMapper networkMapper) {
    return Preconditions.checkNotNull(instance.provideMainRepository(blogDao, blogRetrofit, cacheMapper, networkMapper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
