package com.example.tugasanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Button rollBTN;
    private TextView question, textView;

    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.imageview_dice);
        rollBTN = findViewById(R.id.buttonRoll);
        question = findViewById(R.id.question);
        textView = findViewById(R.id.text);

        rollBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    //method rolldice to get random truth or dare
    private void rollDice() {
        int randomNumber = random.nextInt(6) + 1;

        //rotate dice
        Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        imageViewDice.startAnimation(animRotate);

        switch (randomNumber) {
            case 1:
                //show text and dice
                imageViewDice.setImageResource(R.drawable.dice1);
                question.setText(R.string.question1);
                textView.setText(R.string.truth);

                //animation of text
                Animation animFade = AnimationUtils.loadAnimation(this, R.anim.fade);
                question.startAnimation(animFade);
                Animation animZoom = AnimationUtils.loadAnimation(this, R.anim.zoom);
                textView.startAnimation(animZoom);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                question.setText(R.string.dare1);
                textView.setText(R.string.dare);

                Animation animFade2 = AnimationUtils.loadAnimation(this, R.anim.fade);
                question.startAnimation(animFade2);
                Animation animZoom2 = AnimationUtils.loadAnimation(this, R.anim.zoom);
                textView.startAnimation(animZoom2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                question.setText(R.string.question2);
                textView.setText(R.string.truth);

                Animation animFade3 = AnimationUtils.loadAnimation(this, R.anim.fade);
                question.startAnimation(animFade3);
                Animation animZoom3 = AnimationUtils.loadAnimation(this, R.anim.zoom);
                textView.startAnimation(animZoom3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                question.setText(R.string.dare2);
                textView.setText(R.string.dare);

                Animation animFade4 = AnimationUtils.loadAnimation(this, R.anim.fade);
                question.startAnimation(animFade4);
                Animation animZoom4 = AnimationUtils.loadAnimation(this, R.anim.zoom);
                textView.startAnimation(animZoom4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                question.setText(R.string.question3);
                textView.setText(R.string.truth);

                Animation animFade5 = AnimationUtils.loadAnimation(this, R.anim.fade);
                question.startAnimation(animFade5);
                Animation animZoom5 = AnimationUtils.loadAnimation(this, R.anim.zoom);
                textView.startAnimation(animZoom5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                question.setText(R.string.dare3);
                textView.setText(R.string.dare);

                Animation animFade6 = AnimationUtils.loadAnimation(this, R.anim.fade);
                question.startAnimation(animFade6);
                Animation animZoom6 = AnimationUtils.loadAnimation(this, R.anim.zoom);
                textView.startAnimation(animZoom6);
                break;
        }
    }
}