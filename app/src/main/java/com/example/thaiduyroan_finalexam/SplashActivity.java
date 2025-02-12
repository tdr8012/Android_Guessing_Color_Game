package com.example.thaiduyroan_finalexam;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    private static final int splashDelay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Link to your splash layout

        // Handler to delay and navigate to the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        }, splashDelay);

    }
}