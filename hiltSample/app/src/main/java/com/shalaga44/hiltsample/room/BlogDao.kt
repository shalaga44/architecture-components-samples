package com.shalaga44.hiltsample.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.*

@Dao
interface BlogDao {
    @Insert(onConflict =OnConflictStrategy.REPLACE )
    suspend fun insert(blogEntity: BlogCacheEntity): Long

    @Query("SELECT * FROM blogs")
    suspend fun getList():List<BlogCacheEntity>

}