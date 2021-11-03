package com.clintonsoares.roomdb.demouserapp.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.clintonsoares.roomdb.demouserapp.api.ApiHelper
import com.clintonsoares.roomdb.demouserapp.database.DatabaseHelper
import com.clintonsoares.roomdb.demouserapp.ui.room.RoomDBViewModel

class ViewModelFactory(private val dbHelper: DatabaseHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RoomDBViewModel::class.java)) {
            return RoomDBViewModel(dbHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}