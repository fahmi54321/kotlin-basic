package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var countryAdapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        countryAdapter = CountryAdapter(this,generateData())

        listView.adapter = countryAdapter
        countryAdapter.notifyDataSetChanged()

    }

    private fun generateData(): ArrayList<Country> {

        return arrayListOf(
            Country("Indonesia", "2"),
            Country("Malaysia", "2"),
            Country("Thailand", "2"),
            Country("Vietnam", "2"),
        )
    }
}