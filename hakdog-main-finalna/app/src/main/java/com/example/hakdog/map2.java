package com.example.hakdog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class map2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);

        // Find the imageButton13
        ImageButton imageButton13 = findViewById(R.id.imageButton13);

// Set click listener to imageButton13
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to jumpscare activity with fade out transition
                Intent intent = new Intent(map2.this, jumpscare.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

// Find the imageButton15
        ImageButton imageButton15 = findViewById(R.id.imageButton15);

// Set click listener to imageButton15
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Funhouse activity
                Intent intent = new Intent(map2.this, Funhouse.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }
}