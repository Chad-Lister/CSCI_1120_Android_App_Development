package com.example.foodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ItalianCuisine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_cuisine);

        // Buttons
        ImageButton chefAlf = findViewById(R.id.chefAlfredos);
        ImageButton hub = findViewById(R.id.theHub);
        ImageButton pizzaHut = findViewById(R.id.pizzahut);

        TextView chefAlfText = findViewById(R.id.chefAlfredostxt);
        TextView hubText = findViewById(R.id.theHubtxt);
        TextView pizzaText = findViewById(R.id.pizzaHuttxt);

        // Button Listeners
        chefAlf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianCuisine.this, ChefAlredos.class));
            }
        });

        hub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianCuisine.this, TheHub.class));
            }
        });

        pizzaHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianCuisine.this, PizzaHut.class));
            }
        });

        // Text Listeners
        chefAlfText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianCuisine.this, ChefAlredos.class));
            }
        });

        hubText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianCuisine.this, TheHub.class));
            }
        });

        pizzaText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianCuisine.this, PizzaHut.class));
            }
        });
    }
}
