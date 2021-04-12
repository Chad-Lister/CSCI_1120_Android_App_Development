package com.example.foodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LatinoCuisine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latino_cuisine);

        // Buttons
        ImageButton brody = findViewById(R.id.brodys);
        ImageButton lupita = findViewById(R.id.lupitas);
        ImageButton vallarta = findViewById(R.id.vallarta);

        TextView brodyText = findViewById(R.id.brodystxt);
        TextView lupitaText = findViewById(R.id.lupitastxt);
        TextView vallart = findViewById(R.id.vallartatxt);

        // Button Listeners
        brody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LatinoCuisine.this, Brodys.class));
            }
        });

        lupita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LatinoCuisine.this, Lupitas.class));
            }
        });

        vallarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LatinoCuisine.this, Vallarta.class));
            }
        });

        // Text Listeners
        brodyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LatinoCuisine.this, Brodys.class));
            }
        });

        lupitaText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LatinoCuisine.this, Lupitas.class));
            }
        });

        vallart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LatinoCuisine.this, Vallarta.class));
            }
        });
    }
}
