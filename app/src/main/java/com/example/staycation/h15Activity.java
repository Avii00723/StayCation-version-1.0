package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h15Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h15price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h15);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h15price=findViewById(R.id.price_h15);
        String h15_price=h15price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h15Activity.this, Pay1Activity.class);
            intent.putExtra("price",h15_price);
            startActivity(intent);
        });
    }
}