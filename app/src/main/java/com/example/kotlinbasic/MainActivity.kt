package com.example.kotlinbasic

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var edtUsername: EditText
    private lateinit var txtUsername: TextView
    private lateinit var btnSimpan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsername = findViewById(R.id.edtUsername)
        txtUsername = findViewById(R.id.txtLastUserName)
        btnSimpan = findViewById(R.id.btnSimpan)

        displayName()

        btnSimpan.setOnClickListener {
            val edtName = edtUsername.text.toString()

            saveNameInSharedPref(edtName)
        }

    }

    private fun saveNameInSharedPref(edtName: String){
        val sharedPreferences: SharedPreferences = getSharedPreferences("username", MODE_PRIVATE)

        val editor: SharedPreferences.Editor = sharedPreferences.edit()

        editor.putString("name",edtName)
        editor.commit()
    }

    private fun displayName(){
        val sharedPreferences: SharedPreferences = getSharedPreferences("username", MODE_PRIVATE)
        val data = sharedPreferences.getString("name","")

        txtUsername.text = data
    }
}