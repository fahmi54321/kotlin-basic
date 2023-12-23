package com.example.kotlinbasic.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlinbasic.MainActivity
import com.example.kotlinbasic.fragment.FragmentOne
import com.example.kotlinbasic.fragment.FragmentThree
import com.example.kotlinbasic.fragment.FragmentTwo

class MyAdapter(private val mainActivity: MainActivity) : FragmentStateAdapter(mainActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                FragmentOne()
            }

            1 -> {
                FragmentTwo()
            }

            2 -> {
                return FragmentThree()
            }

            else -> {
                FragmentOne()
            }
        }
    }
}