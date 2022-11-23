package com.mahmoudhamdyae.daggerhilt.data.repository

import com.mahmoudhamdyae.daggerhilt.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()
}