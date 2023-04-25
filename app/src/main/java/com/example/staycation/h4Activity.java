package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h4Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h4price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h4);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h4price=findViewById(R.id.price_h4);
        String h4_price=h4price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h4Activity.this, Pay1Activity.class);
            intent.putExtra("price",h4_price);
            startActivity(intent);
        });
    }
}