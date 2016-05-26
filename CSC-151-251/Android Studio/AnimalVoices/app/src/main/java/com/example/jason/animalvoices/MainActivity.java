package com.example.jason.animalvoices;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    MediaPlayer mpCows, mpPigs;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btnCow);
        button2 = (Button) findViewById(R.id.btnPigs);
        button1.setOnClickListener(bCow);
        button2.setOnClickListener(bPig);
        mpCows = new MediaPlayer();
        mpCows = MediaPlayer.create(this, R.raw.cow);
        mpPigs = new MediaPlayer();
        mpPigs = MediaPlayer.create(this, R.raw.pig);
        playing = 0;


    }

    Button.OnClickListener bCow = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(playing) {
                case 0:
                    mpCows.start();
                    playing =1;
                    button1.setText("Pause Cow Sounds");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpCows.pause();
                    playing = 0;
                    button1.setText("LISTEN TO THE COWS");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }

        }
    };

    Button.OnClickListener bPig = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(playing) {
                case 0:
                    mpPigs.start();
                    playing =1;
                    button2.setText("Pause Pig Sounds");
                    button1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpPigs.pause();
                    playing = 0;
                    button2.setText("LISTEN TO THE PIGS");
                    button1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}
