package com.clintonsoares.roomdb.demouserapp.api

import com.clintonsoares.roomdb.demouserapp.model.ApiUser

interface ApiHelper {

    suspend fun getUsers(): List<ApiUser>

    suspend fun getMoreUsers(): List<ApiUser>

    suspend fun getUsersWithError(): List<ApiUser>

}