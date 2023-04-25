package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h14Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h14price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h14);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h14price=findViewById(R.id.price_h14);
        String h14_price=h14price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h14Activity.this, Pay1Activity.class);
            intent.putExtra("price",h14_price);
            startActivity(intent);
        });
    }
}