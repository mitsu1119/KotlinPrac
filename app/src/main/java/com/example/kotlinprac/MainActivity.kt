package com.example.kotlinprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tx:TextView = findViewById(R.id.tv)
        val btn1:Button = findViewById(R.id.btnDog)
        val btn2:Button = findViewById(R.id.btnCat)
        val btn3:Button = findViewById(R.id.btnClear)

        btn1.setOnClickListener {
            tx.text = "いぬ"
        }

        btn2.setOnClickListener {
            tx.text = "ねこ"
        }

        btn3.setOnClickListener {
            tx.text = "..."
        }
    }
}