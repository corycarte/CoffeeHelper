package com.example.coffeehelper

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        val btnGo = findViewById<View>(R.id.go_button) as Button
        btnGo.setOnClickListener { v ->
            val mine = Intent(v.context, BrewSelectorActivitiy::class.java)
            startActivityForResult(mine, 0)
        }
    }
}