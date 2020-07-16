package com.shalaga44.hiltsample.room;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CacheMapper_Factory implements Factory<CacheMapper> {
  @Override
  public CacheMapper get() {
    return newInstance();
  }

  public static CacheMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CacheMapper newInstance() {
    return new CacheMapper();
  }

  private static final class InstanceHolder {
    private static final CacheMapper_Factory INSTANCE = new CacheMapper_Factory();
  }
}
