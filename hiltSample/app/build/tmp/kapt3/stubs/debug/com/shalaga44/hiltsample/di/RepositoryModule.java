package com.shalaga44.hiltsample.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/shalaga44/hiltsample/di/RepositoryModule;", "", "()V", "provideMainRepository", "Lcom/shalaga44/hiltsample/repository/MainRepository;", "blogDao", "Lcom/shalaga44/hiltsample/room/BlogDao;", "blogRetrofit", "Lcom/shalaga44/hiltsample/retrofit/BlogRetrofit;", "cacheMapper", "Lcom/shalaga44/hiltsample/room/CacheMapper;", "networkMapper", "Lcom/shalaga44/hiltsample/retrofit/NetworkMapper;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.shalaga44.hiltsample.repository.MainRepository provideMainRepository(@org.jetbrains.annotations.NotNull()
    com.shalaga44.hiltsample.room.BlogDao blogDao, @org.jetbrains.annotations.NotNull()
    com.shalaga44.hiltsample.retrofit.BlogRetrofit blogRetrofit, @org.jetbrains.annotations.NotNull()
    com.shalaga44.hiltsample.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.shalaga44.hiltsample.retrofit.NetworkMapper networkMapper) {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}