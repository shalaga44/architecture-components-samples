package com.shalaga44.hiltsample.repository

import com.shalaga44.hiltsample.model.Blog
import com.shalaga44.hiltsample.retrofit.BlogRetrofit
import com.shalaga44.hiltsample.retrofit.NetworkMapper
import com.shalaga44.hiltsample.room.BlogDao
import com.shalaga44.hiltsample.room.CacheMapper
import com.shalaga44.hiltsample.util.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainRepository
constructor(
    private val blogDao: BlogDao,
    private val blogRetrofit: BlogRetrofit,
    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
) {
    suspend fun getBlogs(): Flow<DataState<List<Blog>>> = flow {
        emit(DataState.Loading)
        delay(2000)
        try {
            val networkBlogs = blogRetrofit.getStuff()
            val blogs = networkMapper.mapFromEntityList(networkBlogs)
            for (blog in blogs) {
                blogDao.insert(cacheMapper.mapToEntity(blog))
            }
            val cachedBlogs = blogDao.getList()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cachedBlogs)))
        } catch (e: Exception) {
            emit(DataState.Error(e))
        }
    }
}