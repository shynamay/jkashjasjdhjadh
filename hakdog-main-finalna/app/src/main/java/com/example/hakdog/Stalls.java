package com.example.hakdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Stalls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stalls);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Set the GIF as the background
            getWindow().setBackgroundDrawableResource(R.drawable.stalls);

            ImageView imageView = findViewById(R.id.imageView3);

            Glide.with(this)
                    .load(R.drawable.stalls)
                    .into(imageView);

        }

        // Find the imageButton10
        ImageButton imageButton10 = findViewById(R.id.imageButton10);

// Set click listener to imageButton10
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to howtoplay activity with fade transition
                Intent intent = new Intent(Stalls.this, howtoplay.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

// Find the imageButton4
        ImageButton imageButton4 = findViewById(R.id.imageButton4);

// Set click listener to imageButton4
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to map2 activity with fade transition
                Intent intent = new Intent(Stalls.this, map2.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }
}