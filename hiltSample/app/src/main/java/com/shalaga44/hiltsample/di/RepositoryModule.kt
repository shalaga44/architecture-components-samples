package com.shalaga44.hiltsample.di

import com.shalaga44.hiltsample.repository.MainRepository
import com.shalaga44.hiltsample.retrofit.BlogRetrofit
import com.shalaga44.hiltsample.retrofit.NetworkMapper
import com.shalaga44.hiltsample.room.BlogDao
import com.shalaga44.hiltsample.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kotlinx.coroutines.newFixedThreadPoolContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMainRepository(
        blogDao: BlogDao,
       blogRetrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): MainRepository {
        return MainRepository(blogDao,blogRetrofit,cacheMapper, networkMapper)
    }
}