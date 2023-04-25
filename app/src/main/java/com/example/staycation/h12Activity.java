package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h12Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h12price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h12);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h12price=findViewById(R.id.price_h12);
        String h12_price=h12price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h12Activity.this, Pay1Activity.class);
            intent.putExtra("price",h12_price);
            startActivity(intent);
        });
    }
}