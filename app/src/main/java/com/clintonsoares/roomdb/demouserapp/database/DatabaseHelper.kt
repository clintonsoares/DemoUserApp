package com.clintonsoares.roomdb.demouserapp.database

import com.clintonsoares.roomdb.demouserapp.database.entity.User

interface DatabaseHelper {

    suspend fun getUsers(): List<User>

    suspend fun insertAll(users: List<User>)

}