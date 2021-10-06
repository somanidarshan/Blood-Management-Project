package com.example.bloodbankmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {
    private ImageView logo;
    private TextView title,slogan;
    Animation topAnimation, bottomAnimation,bottom_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        logo = findViewById(R.id.logo);
        title = findViewById(R.id.title);
        slogan = findViewById(R.id.slogan);

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        bottom_2=AnimationUtils.loadAnimation(this,R.anim.bottom_2);

        logo.setAnimation(topAnimation);
        title.setAnimation(bottomAnimation);
        slogan.setAnimation(bottom_2);

        int SPLASH_SCREEN=4300;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreenActivity.this,loginActivity.class);
                startActivity(intent);
                finish();
            }

        },SPLASH_SCREEN);
    }
}