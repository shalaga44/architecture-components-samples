package com.shalaga44.hiltsample.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.*
import com.shalaga44.hiltsample.model.Blog
import com.shalaga44.hiltsample.retrofit.BlogNetworkEntity
import com.shalaga44.hiltsample.retrofit.BlogRetrofit
import com.shalaga44.hiltsample.retrofit.NetworkMapper
import com.shalaga44.hiltsample.util.EntityMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RetrofitModule {

    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()
    }
    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson): Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl("https://open-api.xyz/placeholder/")
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Singleton
    @Provides
    fun provideBlogService(retrofit: Retrofit.Builder):BlogRetrofit{
        return retrofit
            .build()
            .create(BlogRetrofit::class.java)    }
}