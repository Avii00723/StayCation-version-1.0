package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h1Activity extends AppCompatActivity {

    public TextView hname;
    Button button;

    TextView h1price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h1);

        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h1price=findViewById(R.id.price_h1);
        String h1_price=h1price.getText().toString();

        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h1Activity.this, Pay1Activity.class);
            intent.putExtra("price",h1_price);
            startActivity(intent);
        });
    }
}