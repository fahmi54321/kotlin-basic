package com.example.kotlinbasic

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.ListView
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var arrayAdapter: ArrayAdapter<String>
    private var worldCups: ArrayList<String> = arrayListOf(
        "Indonesia",
        "Malaysia",
        "Thailand",
        "Vietnam"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            worldCups,
        )

        listView.adapter = arrayAdapter

    }
}