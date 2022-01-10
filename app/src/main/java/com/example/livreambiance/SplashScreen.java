package com.example.livreambiance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView splashScreenTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: 10-01-2022  Starts (Fullscreen and No Title)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // TODO: 10-01-2022 Ends (Fullscreen and No Title)
        setContentView(R.layout.activity_splash_screen);

        // TODO: 10-01-2022  Starts (Splashscreen with animation)
        splashScreenTv = findViewById(R.id.tVSplashScreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        },3000);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.side_side);
        splashScreenTv.startAnimation(animation);

        // TODO: 10-01-2022 Ends (Splashscreen with animation)
    }
}