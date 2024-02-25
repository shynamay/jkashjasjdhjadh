package com.example.hakdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class map1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map1);

        // Find the imageButton12
        ImageButton imageButton12 = findViewById(R.id.imageButton12);

// Set click listener to imageButton12
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to jumpscare activity with fade out transition
                Intent intent = new Intent(map1.this, jumpscare.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

// Find the imageButton9
        ImageButton imageButton9 = findViewById(R.id.imageButton9);

// Set click listener to imageButton9
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Stalls activity
                Intent intent = new Intent(map1.this, Stalls.class);
                startActivity(intent);
            }
        });
    }
}