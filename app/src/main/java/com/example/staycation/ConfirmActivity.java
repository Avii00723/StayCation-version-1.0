package com.example.staycation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {

    TextView o1, o2, o3, o4, o5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        o1 = findViewById(R.id.textView48);
        o2 = findViewById(R.id.textView49);
        o3 = findViewById(R.id.textView46);
        o4 = findViewById(R.id.textView47);
        o5 = findViewById(R.id.pricepay1);

        o1.setText(Alldetails.hname_det);
        o2.setText(Alldetails.date_det);
        o3.setText(Alldetails.night_det);
        o4.setText(Alldetails.guest_det);
        o5.setText(Alldetails.price_det);
    }

    public void button4(View view) {
        Intent intent = new Intent(ConfirmActivity.this , HomeActivity.class);
        startActivity(intent);
    }
}