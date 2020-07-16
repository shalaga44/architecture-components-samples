package com.shalaga44.hiltsample.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/shalaga44/hiltsample/repository/MainRepository;", "", "blogDao", "Lcom/shalaga44/hiltsample/room/BlogDao;", "blogRetrofit", "Lcom/shalaga44/hiltsample/retrofit/BlogRetrofit;", "cacheMapper", "Lcom/shalaga44/hiltsample/room/CacheMapper;", "networkMapper", "Lcom/shalaga44/hiltsample/retrofit/NetworkMapper;", "(Lcom/shalaga44/hiltsample/room/BlogDao;Lcom/shalaga44/hiltsample/retrofit/BlogRetrofit;Lcom/shalaga44/hiltsample/room/CacheMapper;Lcom/shalaga44/hiltsample/retrofit/NetworkMapper;)V", "getBlogs", "Lkotlinx/coroutines/flow/Flow;", "Lcom/shalaga44/hiltsample/util/DataState;", "", "Lcom/shalaga44/hiltsample/model/Blog;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainRepository {
    private final com.shalaga44.hiltsample.room.BlogDao blogDao = null;
    private final com.shalaga44.hiltsample.retrofit.BlogRetrofit blogRetrofit = null;
    private final com.shalaga44.hiltsample.room.CacheMapper cacheMapper = null;
    private final com.shalaga44.hiltsample.retrofit.NetworkMapper networkMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBlogs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.shalaga44.hiltsample.util.DataState<? extends java.util.List<com.shalaga44.hiltsample.model.Blog>>>> p0) {
        return null;
    }
    
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.shalaga44.hiltsample.room.BlogDao blogDao, @org.jetbrains.annotations.NotNull()
    com.shalaga44.hiltsample.retrofit.BlogRetrofit blogRetrofit, @org.jetbrains.annotations.NotNull()
    com.shalaga44.hiltsample.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.shalaga44.hiltsample.retrofit.NetworkMapper networkMapper) {
        super();
    }
}