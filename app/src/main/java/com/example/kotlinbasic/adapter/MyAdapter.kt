package com.example.kotlinbasic.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlinbasic.MainActivity
import com.example.kotlinbasic.fragment.FragmentOne
import com.example.kotlinbasic.fragment.FragmentThree
import com.example.kotlinbasic.fragment.FragmentTwo

class MyAdapter(private val fragmentManager: FragmentManager,lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
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