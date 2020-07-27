package com.example.coffeehelper

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BrewSelectorActivitiy : Activity() {
    public override fun onCreate(savedState: Bundle?) {
        super.onCreate(savedState)
        setContentView(R.layout.activity_selector)

        // Set up three buttons for layout
        val btnEspresso = findViewById<View>(R.id.btnEspresso) as Button
        val btnFrenchPress = findViewById<View>(R.id.btnFrenchPress) as Button
        val btnDrip = findViewById<View>(R.id.btnDrip) as Button
        btnEspresso.setOnClickListener { }
        btnFrenchPress.setOnClickListener { }
        btnDrip.setOnClickListener { }
    }
}