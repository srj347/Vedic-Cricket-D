package com.epizy.learnitapp.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import com.airbnb.lottie.LottieAnimationView;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
     LottieAnimationView cursor ;
     Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cursor = findViewById(R.id.cursor);
        play = findViewById(R.id.button);

        cursor.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                long totaltime = animation.getDuration();
                float time =animation.getAnimatedFraction();
                play.setText(time+"");
            }
        });

        AlertDialog.Builder dialog = new AlertDialog.Builder(this).setPositiveButton("4 Runs", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })   .setNegativeButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })      ;

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cursor.pauseAnimation();
            }
        });

    }

}