package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h8Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h8price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h8);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h8price=findViewById(R.id.price_h8);
        String h8_price=h8price.getText().toString();

        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h8Activity.this, Pay1Activity.class);
            intent.putExtra("price",h8_price);
            startActivity(intent);
        });
    }
}