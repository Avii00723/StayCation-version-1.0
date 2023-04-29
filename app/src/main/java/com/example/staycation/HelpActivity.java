package com.example.staycation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    Button button, button1;
    EditText subject, body;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        subject = findViewById(R.id.editTextText);
        body = findViewById(R.id.body1);
        button = findViewById(R.id.registerb2);
        button1 = findViewById(R.id.registerb3);

        button.setOnClickListener(view -> {
            String emailsend = "example@gmail.com";
            String emailsubject = subject.getText().toString();
            String emailbody= body.getText().toString();

            Intent intent = new Intent(Intent.ACTION_SEND);

            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{emailsend});
            intent.putExtra(Intent.EXTRA_SUBJECT, emailsubject);
            intent.putExtra(Intent.EXTRA_TEXT, emailbody);

            intent.setType("message/rfc822");

            startActivity(Intent.createChooser(intent, "Choose an Email client :"));
        });

        button1.setOnClickListener(view -> {

            String phonenumber = "1234567899";

            Intent phone_intent = new Intent(Intent.ACTION_CALL);

            phone_intent.setData(Uri.parse("tel:" + phonenumber));

            startActivity(phone_intent);
        });
    }
}
