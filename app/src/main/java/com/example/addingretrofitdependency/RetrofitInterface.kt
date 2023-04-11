package com.example.addingretrofitdependency

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {
    @GET("api/{path}}")
    fun getUsers(
        @Query("path") path: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): Call<Person>
}