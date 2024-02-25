package com.example.hakdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Wheel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheel);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Set the GIF as the background
            getWindow().setBackgroundDrawableResource(R.drawable.wheel1);

            ImageView imageView = findViewById(R.id.imageView);

            Glide.with(this)
                    .load(R.drawable.wheel1)
                    .into(imageView);

        }

        // Find the imageButton
        ImageButton imageButton = findViewById(R.id.imageButton);

// Set click listener to imageButton
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to howtoplay activity with fade transition
                Intent intent = new Intent(Wheel.this, howtoplay.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

// Find the imageButton3
        ImageButton imageButton3 = findViewById(R.id.imageButton3);

// Set click listener to imageButton3
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to map1 activity with fade transition
                Intent intent = new Intent(Wheel.this, map1.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }
}