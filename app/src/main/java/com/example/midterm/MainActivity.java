package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int playing  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon);
        final ImageView image = (ImageView) findViewById(R.id.animal);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.audio);
        final Button x1 = (Button)findViewById(R.id.goto2);
        final Button x2 = (Button)findViewById(R.id.goto2);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing) {
                    case 0:
                    mp.start(); playing = 1;
                    break;
                    case 1:
                        mp.pause(); playing = 0;
                        break;

                }


            }
        });
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class ));
            }
        });
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class ));
            }
        });

    }
}