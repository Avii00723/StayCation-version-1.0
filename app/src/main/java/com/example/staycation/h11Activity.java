package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h11Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h11price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h11);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h11price=findViewById(R.id.price_h11);
        String h11_price=h11price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h11Activity.this, Pay1Activity.class);
            intent.putExtra("price",h11_price);
            startActivity(intent);
        });
    }
}