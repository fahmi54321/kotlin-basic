package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var fragmentHome: Fragment
    private lateinit var fragmentProfile: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btnDisplay1)
        btn2 = findViewById(R.id.btnDisplay2)
        fragmentHome = HomeFragment()
        fragmentProfile = ProfileFragment()

        btn1.setOnClickListener {
            var fragmentTrns: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTrns.replace(R.id.fl1,fragmentHome).commit()
        }

        btn2.setOnClickListener {
            var fragmentTrns: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTrns.replace(R.id.fl2,fragmentProfile).commit()
        }



    }
}