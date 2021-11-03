package com.clintonsoares.roomdb.demouserapp.ui.room

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.clintonsoares.roomdb.demouserapp.database.DatabaseHelper
import kotlinx.coroutines.launch

class RoomDBViewModel(private val dbHelper: DatabaseHelper) :
    ViewModel() {
    var userName = String()
    var userEmail = String()

    init {
        fetchUsers()
    }

    fun addUser() {
        viewModelScope.launch {
            try {
                Log.e("TAG", "user: $userName, email: $userEmail")
                // do something
                fetchUsers()
            } catch (e: Exception) {
            }
        }
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            try {
                val usersFromDb = dbHelper.getUsers()
            } catch (e: Exception) {
            }
        }
    }

}