package com.example.staycation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
public class SplashActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        videoView = findViewById(R.id.videoview);

        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.staycation11);

        videoView.setVideoURI(video);

        videoView.setOnCompletionListener(mp -> startNextActivity());

        videoView.start();
    }
    private void startNextActivity() {
        if (isFinishing())
            return;
        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        finish();
    }
}