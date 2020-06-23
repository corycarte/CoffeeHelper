package com.example.coffeehelper;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BrewSelectorActivitiy extends Activity {
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_selector);

        // Set up three buttons for layout
        Button btnEspresso = (Button) findViewById(R.id.btnEspresso);
        Button btnFrenchPress = (Button) findViewById(R.id.btnFrenchPress);
        Button btnDrip = (Button) findViewById(R.id.btnDrip);

        btnEspresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnFrenchPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnDrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
