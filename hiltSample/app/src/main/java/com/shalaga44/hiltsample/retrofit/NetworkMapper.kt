package com.shalaga44.hiltsample.retrofit

import com.shalaga44.hiltsample.model.Blog
import com.shalaga44.hiltsample.util.EntityMapper
import javax.inject.Inject

class NetworkMapper
@Inject
constructor():EntityMapper<BlogNetworkEntity, Blog>
{
    override fun mapFromEntity(entity: BlogNetworkEntity): Blog {
        return Blog(
            id = entity.id,
            body = entity.body,
            title = entity.title,
            category = entity.category,
            image = entity.image
        )
    }

    override fun mapToEntity(model: Blog): BlogNetworkEntity {
        return BlogNetworkEntity(

            id = model.id,
            title = model.title,
            body = model.body,
            category = model.category,
            image = model.image
        )
    }
    fun mapFromEntityList(entityList: List<BlogNetworkEntity>):List<Blog> {
        return entityList.map { mapFromEntity(it) }

    }

}