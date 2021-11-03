package com.clintonsoares.roomdb.demouserapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.clintonsoares.roomdb.demouserapp.R
import com.clintonsoares.roomdb.demouserapp.database.entity.User

class UserAdapter(private val users: ArrayList<User>): RecyclerView.Adapter<UserAdapter.DataViewHolder>() {
    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            // do something
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_room_user, parent, false
            )
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}