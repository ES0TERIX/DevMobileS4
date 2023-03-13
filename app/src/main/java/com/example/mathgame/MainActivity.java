package com.example.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button boutonJeu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boutonJeu = findViewById(R.id.boutonJeu);
        boutonJeu.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Jeu.class);
            startActivity(intent);
        });
    }
}