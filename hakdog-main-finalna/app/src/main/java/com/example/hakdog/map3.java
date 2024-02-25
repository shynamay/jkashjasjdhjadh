package com.example.hakdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class map3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map3);

            // Find the imageButton14
            ImageButton imageButton14 = findViewById(R.id.imageButton14);

// Set click listener to imageButton14
            imageButton14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Navigate to jumpscare activity with fade out transition
                    Intent intent = new Intent(map3.this, jumpscare.class);
                    startActivity(intent);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
            });

// Find the imageButton8
            ImageButton imageButton8 = findViewById(R.id.imageButton8);

// Set click listener to imageButton8
            imageButton8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Navigate to youfoundhim activity
                    Intent intent = new Intent(map3.this, youfoundhim.class);
                    startActivity(intent);
                }
            });
        }
    }
