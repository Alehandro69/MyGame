package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        ImageView splash = findViewById(R.id.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    //user not logged in start login activity
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();

            }
        }, 2000);

        Context context = SplashActivity.this;
        Animation anim;

        anim = AnimationUtils.loadAnimation (context, R.anim.scale);

        // запускаем анимацию компонента
        splash.startAnimation(anim);


    }
}