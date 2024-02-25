package com.example.hakdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class youfoundhim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youfoundhim);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Set the GIF as the background
            getWindow().setBackgroundDrawableResource(R.drawable.youfoundhim);

            ImageView imageView = findViewById(R.id.imageView11);

            Glide.with(this)
                    .load(R.drawable.youfoundhim)
                    .into(imageView);
        }

        // Find the imageButton16
        ImageButton imageButton16 = findViewById(R.id.imageButton16);

// Set click listener to imageButton16
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivity with fade transition
                Intent intent = new Intent(youfoundhim.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }
}