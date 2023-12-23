package com.example.kotlinbasic

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(private var activity: Activity, private var list: ArrayList<Country>): RecyclerView.Adapter<CountryAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var nama: TextView
        var wins: TextView

        init {
            nama = itemView.findViewById(R.id.txtName)
            wins = itemView.findViewById(R.id.txtWin)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item,parent,false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nama.text = list[position].name
        holder.wins.text = list[position].cupWins
    }
}