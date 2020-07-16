package com.shalaga44.hiltsample.di;

import com.shalaga44.hiltsample.room.BlogDao;
import com.shalaga44.hiltsample.room.BlogsDatabase;
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
public final class RoomModule_ProvideBlogDaoFactory implements Factory<BlogDao> {
  private final RoomModule module;

  private final Provider<BlogsDatabase> blogsDatabaseProvider;

  public RoomModule_ProvideBlogDaoFactory(RoomModule module,
      Provider<BlogsDatabase> blogsDatabaseProvider) {
    this.module = module;
    this.blogsDatabaseProvider = blogsDatabaseProvider;
  }

  @Override
  public BlogDao get() {
    return provideBlogDao(module, blogsDatabaseProvider.get());
  }

  public static RoomModule_ProvideBlogDaoFactory create(RoomModule module,
      Provider<BlogsDatabase> blogsDatabaseProvider) {
    return new RoomModule_ProvideBlogDaoFactory(module, blogsDatabaseProvider);
  }

  public static BlogDao provideBlogDao(RoomModule instance, BlogsDatabase blogsDatabase) {
    return Preconditions.checkNotNull(instance.provideBlogDao(blogsDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
