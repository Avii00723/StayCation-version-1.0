package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Homeh1Activity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeh1);
        button = findViewById(R.id.button123);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(Homeh1Activity.this, HomeActivity.class);
            startActivity(intent);
        });
    }
}