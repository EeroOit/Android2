package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private  int count = 0;
    private int r1;
    private TextView correctText;
    private TextView wrongText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        correctText = (TextView)findViewById(R.id.correcttext);
        wrongText = (TextView)findViewById(R.id.wrongtext);
        Random rand = new Random();
        r1 = rand.nextInt(4);
        TextView b = (TextView) findViewById(R.id.randomResultText);
        b.setText(Integer.toString(r1));
    }




    public void onClickLowerLeft(View view) {
        if (r1 == 0) {
            count++;
            TextView txt = (TextView) findViewById(R.id.textViewResult);
            txt.setText("Points:"+count);
            ImageButton spaceshipImage = (ImageButton) findViewById(R.id.imageButton1);
            Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.roundanimation);
            spaceshipImage.startAnimation(hyperspaceJumpAnimation);
            wrongText.setVisibility(view.INVISIBLE);
            correctText.setVisibility(View.VISIBLE);
            Random rand = new Random();
            r1 = rand.nextInt(4);
        } else {
            count--;
            correctText.setVisibility(View.INVISIBLE);
            wrongText.setVisibility(View.VISIBLE);
        }
    }

    public void onClickLowerRight(View view) {
        if (r1 == 1){
            count++;
            TextView txt = (TextView) findViewById(R.id.textViewResult);
            txt.setText("Points:"+count);
            ImageButton spaceshipImage = (ImageButton) findViewById(R.id.imageButton2);
            Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.roundanimation);
            spaceshipImage.startAnimation(hyperspaceJumpAnimation);
            wrongText.setVisibility(view.INVISIBLE);
            correctText.setVisibility(View.VISIBLE);
            Random rand = new Random();
            r1 = rand.nextInt(4);

        } else {
            correctText.setVisibility(View.INVISIBLE);
            wrongText.setVisibility(View.VISIBLE);
        }
    }

    public void onClickUpperLeft(View view) {
        if (r1 == 2){
            count++;
            TextView txt = (TextView) findViewById(R.id.textViewResult);
            txt.setText("Points:"+count);
        ImageButton spaceshipImage = (ImageButton) findViewById(R.id.imageButton4);
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.roundanimation);
            spaceshipImage.startAnimation(hyperspaceJumpAnimation);
            wrongText.setVisibility(view.INVISIBLE);
            correctText.setVisibility(View.VISIBLE);
            Random rand = new Random();
            r1 = rand.nextInt(4);
        } else {
            correctText.setVisibility(View.INVISIBLE);
            wrongText.setVisibility(View.VISIBLE);
        }
    }

    public void onClickUpperRight(View view) {
        if (r1 == 3){
            count++;
            TextView txt = (TextView) findViewById(R.id.textViewResult);
            txt.setText("Points:"+count);
            ImageButton spaceshipImage = (ImageButton) findViewById(R.id.imageButton3);
            Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.roundanimation);
            spaceshipImage.startAnimation(hyperspaceJumpAnimation);
            wrongText.setVisibility(view.INVISIBLE);
            correctText.setVisibility(View.VISIBLE);
            Random rand = new Random();
            r1 = rand.nextInt(4);
        } else {
            correctText.setVisibility(View.INVISIBLE);
            wrongText.setVisibility(View.VISIBLE);

        }
    }
}