package com.clintonsoares.roomdb.demouserapp.bindings

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("onClick")
fun onClick(view: View, onClick: () -> Unit) {
    view.setOnClickListener {
        onClick()
    }
}