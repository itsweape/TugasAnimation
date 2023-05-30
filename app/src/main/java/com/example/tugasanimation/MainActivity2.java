package com.example.tugasanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    private ImageView imageViewDice;
    private TextView textview, textview2;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageViewDice = findViewById(R.id.imageview);
        textview = findViewById(R.id.tod);
        textview2 = findViewById(R.id.text2);

        //animation zoom on splash screen
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.zoom);
        imageViewDice.startAnimation(anim);
        textview.startAnimation(anim);
        textview2.startAnimation(anim);

        //splash screen
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}