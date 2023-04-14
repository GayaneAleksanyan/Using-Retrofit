package com.example.addingretrofitdependency

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("api/users?page=2}")
    fun getUsers(
    ): Call<UsersData>
}