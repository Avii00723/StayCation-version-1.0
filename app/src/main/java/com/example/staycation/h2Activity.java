package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h2Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h2price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h2);
        button = findViewById(R.id.button);

        hname = findViewById(R.id.textView);
        h2price=findViewById(R.id.price_h2);
        String h2_price=h2price.getText().toString();

        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h2Activity.this, Pay1Activity.class);
            intent.putExtra("price",h2_price);
            startActivity(intent);
        });
    }
}