package com.shalaga44.hiltsample.di;

import android.content.Context;
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
public final class RoomModule_ProvideBlogDBFactory implements Factory<BlogsDatabase> {
  private final RoomModule module;

  private final Provider<Context> contextProvider;

  public RoomModule_ProvideBlogDBFactory(RoomModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public BlogsDatabase get() {
    return provideBlogDB(module, contextProvider.get());
  }

  public static RoomModule_ProvideBlogDBFactory create(RoomModule module,
      Provider<Context> contextProvider) {
    return new RoomModule_ProvideBlogDBFactory(module, contextProvider);
  }

  public static BlogsDatabase provideBlogDB(RoomModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideBlogDB(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
