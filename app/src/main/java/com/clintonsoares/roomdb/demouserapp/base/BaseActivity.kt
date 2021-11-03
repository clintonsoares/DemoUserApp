package com.clintonsoares.roomdb.demouserapp.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<out T : ViewDataBinding>(@LayoutRes val layoutId: Int) :
    AppCompatActivity() {

    val binding: T by lazy {
        DataBindingUtil.inflate(layoutInflater, layoutId, null, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        init()
    }

    open fun init() {
        setupViewModel()
        attachBinding()
    }


    open fun attachBinding() {}
    open fun setupViewModel() {}
}