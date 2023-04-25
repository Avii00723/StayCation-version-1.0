package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h9Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h9price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h9);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h9price=findViewById(R.id.price_h9);
        String h9_price=h9price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h9Activity.this, Pay1Activity.class);
            intent.putExtra("price",h9_price);
            startActivity(intent);
        });
    }
}