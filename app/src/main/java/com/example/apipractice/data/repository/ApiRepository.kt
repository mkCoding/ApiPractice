package com.example.apipractice.data.repository

import com.example.apipractice.data.model.UsersModel

interface ApiRepository {
    suspend fun getAllUsers(): UsersModel
}
