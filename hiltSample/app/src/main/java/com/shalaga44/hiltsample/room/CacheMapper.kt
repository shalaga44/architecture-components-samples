package com.shalaga44.hiltsample.room

import com.shalaga44.hiltsample.model.Blog
import com.shalaga44.hiltsample.retrofit.BlogNetworkEntity
import com.shalaga44.hiltsample.util.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject
constructor():EntityMapper<BlogCacheEntity, Blog> {
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
    fun mapFromEntityList(entityList: List<BlogCacheEntity>):List<Blog>{
        return entityList.map { mapFromEntity(it) }
    }
}