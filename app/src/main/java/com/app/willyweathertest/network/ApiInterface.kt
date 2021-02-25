package com.app.willyweathertest.network

import com.app.willyweathertest.network.models.Jobs
import io.reactivex.Single
import retrofit2.http.GET

interface ApiInterface {
    @GET("positions.json?description=python&location=new+york")
    fun fetchJobs(): Single<ArrayList<Jobs>>
}