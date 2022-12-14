package com.mahmoudhamdyae.daggerhilt.data.api

import com.mahmoudhamdyae.daggerhilt.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}