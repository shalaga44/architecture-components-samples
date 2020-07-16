package com.shalaga44.hiltsample.room

import androidx.room.*
@Database(entities = [BlogCacheEntity::class], version = 1)
abstract class BlogsDatabase:RoomDatabase() {
    abstract fun blogDoa(): BlogDao
    companion object{
        const val DATABASE_NAME: String = "blog_db"
    }
}