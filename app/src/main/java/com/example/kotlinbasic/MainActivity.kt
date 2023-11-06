package com.example.kotlinbasic

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn)
        var btn2 = findViewById<Button>(R.id.btn2)

        btn.setOnClickListener {
            // Explicit intent
            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("age",25)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            // Implicit intent
            var intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://www.google.com")
            startActivity(intent)
        }
    }
}