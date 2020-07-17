package com.shalaga44.hiltsample.room

import com.shalaga44.hiltsample.model.Blog
<<<<<<< HEAD
import com.shalaga44.hiltsample.retrofit.BlogNetworkEntity
=======
>>>>>>> Dagger-Hilt
import com.shalaga44.hiltsample.util.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject
<<<<<<< HEAD
constructor():EntityMapper<BlogCacheEntity, Blog> {
=======
constructor() : EntityMapper<BlogCacheEntity, Blog> {
>>>>>>> Dagger-Hilt
    override fun mapFromEntity(entity: BlogCacheEntity): Blog {
        return Blog(
            id = entity.id,
            body = entity.body,
            title = entity.title,
            category = entity.category,
            image = entity.image
        )
    }

    override fun mapToEntity(domainModel: Blog): BlogCacheEntity {
        return BlogCacheEntity(
            id = domainModel.id,
            title = domainModel.title,
            body = domainModel.body,
            category = domainModel.category,
            image = domainModel.image
        )
    }
<<<<<<< HEAD
    fun mapFromEntityList(entityList: List<BlogCacheEntity>):List<Blog>{
=======

    fun mapFromEntityList(entityList: List<BlogCacheEntity>): List<Blog> {
>>>>>>> Dagger-Hilt
        return entityList.map { mapFromEntity(it) }
    }
}