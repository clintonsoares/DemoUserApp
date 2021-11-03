package com.clintonsoares.roomdb.demouserapp.ui.room

import androidx.lifecycle.ViewModelProvider
import com.clintonsoares.roomdb.demouserapp.R
import com.clintonsoares.roomdb.demouserapp.base.BaseActivity
import com.clintonsoares.roomdb.demouserapp.database.DatabaseBuilder
import com.clintonsoares.roomdb.demouserapp.database.DatabaseHelperImpl
import com.clintonsoares.roomdb.demouserapp.databinding.ActivityRoomListingBinding
import com.clintonsoares.roomdb.demouserapp.utils.ViewModelFactory

class RoomDBActivity : BaseActivity<ActivityRoomListingBinding>(R.layout.activity_room_listing) {

    private lateinit var model: RoomDBViewModel

    override fun attachBinding() {
        binding.activityHandler = this
        binding.vm = model
    }

    override fun setupViewModel() {
        model = ViewModelProvider(
            this,
            ViewModelFactory(
                DatabaseHelperImpl(DatabaseBuilder.getInstance(applicationContext))
            )
        )[RoomDBViewModel::class.java]
    }

    override fun init() {
        super.init()
        setupRecyclerView()
    }

    private fun setupRecyclerView(){}
}