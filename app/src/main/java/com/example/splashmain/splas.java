package com.example.splashmain;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splas extends AppCompatActivity {
    private ImageView logo;
    private static int splashTimeout= 5000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mysplash);
        logo = (ImageView)findViewById(R.id.logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splas.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, splashTimeout);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mysplash);
        logo.startAnimation(myanim);
    }
}
