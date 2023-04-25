package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class ProfileActivity extends AppCompatActivity {
    public TextView text11, text12, text13, text14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        text11 = findViewById(R.id.textView7);
        text12 = findViewById(R.id.textView6);
        text13 = findViewById(R.id.textView4);
        text14 = findViewById(R.id.text7);

        text14.setText(Alldetails.fname_det);

        text11.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this,HelpActivity.class)));

        text12.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this,FeedbackActivity.class)));

        text13.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this,PinfoActivity.class)));

    }

    public void home1(View view) {
        Intent intent = new Intent(ProfileActivity.this , HomeActivity.class);
        startActivity(intent);
    }
    public void home2(View view) {
        Intent intent = new Intent(ProfileActivity.this , ConfirmActivity.class);
        startActivity(intent);
    }
    public void home3(View view) {
        Intent intent = new Intent(ProfileActivity.this , ProfileActivity.class);
        startActivity(intent);
    }

    public void home4(View view) {
        Intent intent = new Intent(ProfileActivity.this , LoginActivity.class);
        startActivity(intent);
    }
}