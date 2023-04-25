package com.example.staycation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class PinfoActivity extends AppCompatActivity {
    TextView o1, o2, o3, o4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinfo);

        o1 = findViewById(R.id.textView25);
        o2 = findViewById(R.id.textView33);
        o3 = findViewById(R.id.textView29);
        o4 = findViewById(R.id.textView30);

        o1.setText(Alldetails.fname_det);
        o2.setText(Alldetails.addr_det);
        o3.setText(Alldetails.email_det);
        o4.setText(Alldetails.number_det);
    }
}