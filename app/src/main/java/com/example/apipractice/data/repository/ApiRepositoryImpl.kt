package com.example.apipractice.data.repository

import com.example.apipractice.data.api.ApiEndpoints
import com.example.apipractice.data.model.UsersModel
import javax.inject.Inject

class ApiRepositoryImpl @Inject constructor(
    private val apiEndpoints: ApiEndpoints
) : ApiRepository {
    override suspend fun getAllUsers(): UsersModel {
        val response = apiEndpoints.getAllUsers()
        if (response.isSuccessful) {
            return response.body() ?: throw Exception("Data is null")
        } else {
            throw Exception("API call failed")
        }
    }

}
