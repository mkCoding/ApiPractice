package com.example.apipractice.data.api

import com.example.apipractice.data.model.UsersModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiEndpoints {

    //method for making call to api endpoint
    @GET(ApiDetails.ENDPOINT_USERS)
    suspend fun getAllUsers(): Response<UsersModel>



}