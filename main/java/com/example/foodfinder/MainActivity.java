package com.example.foodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons
        ImageButton btnAmerican;
        btnAmerican = findViewById(R.id.btnAmerican);
        ImageButton btnChinese = findViewById(R.id.btnAsian);
        ImageButton btnItalian = findViewById(R.id.btnItalian);
        ImageButton btnMexican = findViewById(R.id.btnMexican);

        // Listeners
        btnAmerican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AmericanCuisine.class));
            }
        });

        btnChinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AsianCuisine.class));
            }
        });

        btnItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ItalianCuisine.class));
            }
        });

        btnMexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LatinoCuisine.class));
            }
        });
    }
}
