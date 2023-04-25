package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h6Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h6price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h6);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h6price=findViewById(R.id.price_h6);
        String h6_price=h6price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();

            Intent intent = new Intent(h6Activity.this, Pay1Activity.class);
            intent.putExtra("price",h6_price);
            startActivity(intent);
        });
    }
}