package com.shalaga44.hiltsample.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "blogs")
data class BlogCacheEntity(
    @PrimaryKey(autoGenerate = false)
    var id: Int,
    var title: String,
    var body: String,
    var image: String,
    var category: String


) {
}