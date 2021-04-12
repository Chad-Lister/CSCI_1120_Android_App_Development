package com.example.foodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AsianCuisine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asian_cuisine);

        // Buttons
        ImageButton asianBistro = findViewById(R.id.asianBistro);
        ImageButton chinaKitchen = findViewById(R.id.chinaKitchen);
        ImageButton thaiB = findViewById(R.id.thai);

        TextView asBistro = findViewById(R.id.asianBistroTxt);
        TextView chinKitchen = findViewById(R.id.chinaKitchenTxt);
        TextView thaiT = findViewById(R.id.thaiTxt);

        // Button Listeners
        asianBistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AsianCuisine.this, AsianBistro.class));
            }
        });

        chinaKitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AsianCuisine.this, ChinaKitchen.class));
            }
        });

        thaiB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AsianCuisine.this, SweetBasil.class));
            }
        });

        // Text Listeners
        asBistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AsianCuisine.this, AsianBistro.class));
            }
        });

        chinKitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AsianCuisine.this, ChinaKitchen.class));
            }
        });

        thaiT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AsianCuisine.this, SweetBasil.class));
            }
        });
    }
}
