package com.example.foodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AmericanCuisine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american_cuisine);

        // Buttons
        ImageButton allAmerican = findViewById(R.id.allAmerican);
        ImageButton brickHouse = findViewById(R.id.brickHouse);
        ImageButton dennys = findViewById(R.id.dennys);

        TextView allAmer = findViewById(R.id.allAmericantxt);
        TextView brick = findViewById(R.id.brickHousetxt);
        TextView diner = findViewById(R.id.dennystxt);

        // Button Listeners
        allAmerican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AmericanCuisine.this, AllAmericanDiner.class));
            }
        });

        brickHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AmericanCuisine.this, BrickHouseCafe.class));
            }
        });

        dennys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AmericanCuisine.this, Dennys.class));
            }
        });

        // Text Listeners
        allAmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AmericanCuisine.this, AllAmericanDiner.class));
            }
        });

        brick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AmericanCuisine.this, BrickHouseCafe.class));
            }
        });

        diner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AmericanCuisine.this, Dennys.class));
            }
        });

    }
}