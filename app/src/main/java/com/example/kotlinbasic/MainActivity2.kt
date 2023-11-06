package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var age: Int? = intent.extras?.getInt("age")

        Toast.makeText(this, "age : $age", Toast.LENGTH_SHORT).show()
    }
}