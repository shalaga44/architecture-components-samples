package com.shalaga44.hiltsample.di

import android.content.Context
import androidx.room.Room
import com.shalaga44.hiltsample.room.BlogDao
import com.shalaga44.hiltsample.room.BlogsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RoomModule {

    @Singleton
    @Provides
    fun provideBlogDB(@ApplicationContext context: Context): BlogsDatabase {
        return Room.databaseBuilder(
            context,
            BlogsDatabase::class.java,
            BlogsDatabase.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideBlogDao(blogsDatabase:BlogsDatabase) : BlogDao{
        return blogsDatabase.blogDoa()
    }
}