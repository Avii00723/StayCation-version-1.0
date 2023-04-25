package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h3Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h3price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h3);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h3price=findViewById(R.id.price_h3);
        String h3_price=h3price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h3Activity.this, Pay1Activity.class);
            intent.putExtra("price",h3_price);
            startActivity(intent);
        });
    }
}