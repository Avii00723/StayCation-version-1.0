package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h13Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h13price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h13);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h13price=findViewById(R.id.price_h13);
        String h13_price=h13price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h13Activity.this, Pay1Activity.class);
            intent.putExtra("price",h13_price);
            startActivity(intent);
        });
    }
}