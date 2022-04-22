package com.example.paint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myView:MyView = findViewById(R.id.myView)
        val btnReset:Button = findViewById(R.id.btnReset)

        btnReset.setOnClickListener {
            myView.clearCanvas()
        }
    }
}