package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h5Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h5price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h5);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h5price=findViewById(R.id.price_h5);
        String h5_price=h5price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h5Activity.this, Pay1Activity.class);
            intent.putExtra("price",h5_price);
            startActivity(intent);
        });
    }
}