package com.clintonsoares.roomdb.demouserapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.clintonsoares.roomdb.demouserapp.database.dao.UserDao
import com.clintonsoares.roomdb.demouserapp.database.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}