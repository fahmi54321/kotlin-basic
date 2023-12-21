package com.example.kotlinbasic

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CountryAdapter(private var activity: Activity, private var list: ArrayList<Country>): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(i: Int): Any {
        return list[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder

        if(p1 == null){
            val inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.item,null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = p1
            viewHolder = view.tag as ViewHolder
        }

        var data = list[position]
        viewHolder.txtName?.text = data.name
        viewHolder.txtWin?.text = data.cupWins

        return view as View
    }

    private class ViewHolder(row: View?){
        var txtName: TextView? = null
        var txtWin: TextView? = null

        init {
            txtName = row?.findViewById(R.id.txtName)
            txtWin = row?.findViewById(R.id.txtWin)

        }
    }
}