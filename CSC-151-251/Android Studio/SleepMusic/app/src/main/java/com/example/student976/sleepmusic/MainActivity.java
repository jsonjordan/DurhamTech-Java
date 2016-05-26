package com.example.student976.sleepmusic;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button b;
    MediaPlayer mp;
    int playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.btnSleep);
        b.setOnClickListener(bSleep);

        mp = new MediaPlayer();
        mp = MediaPlayer.create(this,R.raw.sleepaway);
        playing = 0;

    }



    Button.OnClickListener bSleep = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mp.start();
                    playing = 1;
                    b.setText("Pause");
                    break;
                case 1:
                    mp.pause();
                    playing = 0;
                    b.setText("Play");
                    break;
            }
        }
    };
}
