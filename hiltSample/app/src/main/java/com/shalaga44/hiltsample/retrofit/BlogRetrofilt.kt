package com.shalaga44.hiltsample.retrofit

import retrofit2.http.GET

interface BlogRetrofit {

    @GET("blogs")
    suspend fun getStuff(): List<BlogNetworkEntity>
}