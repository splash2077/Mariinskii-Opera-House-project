package com.example.forevergame;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;

public class MainActivity extends Activity {
    MediaPlayer mediaPlayer1;
    MediaPlayer mediaPlayer2;
    MediaPlayer mediaPlayer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.kick);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.guitars);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.highbvs);
    }
    public void playAll(View view) {
        if(!mediaPlayer1.isPlaying()) {
            mediaPlayer1.start();
        }
        else {
            mediaPlayer1.pause();
        }
        if(!mediaPlayer2.isPlaying()) {
            mediaPlayer2.start();
        }
        else {
            mediaPlayer2.pause();
        }
        if(!mediaPlayer3.isPlaying()) {
            mediaPlayer3.start();
        }
        else {
            mediaPlayer3.pause();
        }
    }
    public void playGuitar(View view) {
        if(!mediaPlayer2.isPlaying()) {
            mediaPlayer2.seekTo(mediaPlayer1.getCurrentPosition());
            mediaPlayer2.start();
        }
        else {
            mediaPlayer2.pause();
        }
    }
    public void playHighBvs(View view) {
        if(!mediaPlayer3.isPlaying()) {
            mediaPlayer3.seekTo(mediaPlayer1.getCurrentPosition());
            mediaPlayer3.start();
        }
        else {
            mediaPlayer3.pause();
        }
    }
    public void toSecondActivity (View view) {
        Intent changeActivity = new Intent(this, secondActivity.class);
        startActivity(changeActivity);
    }
    @Override
    protected void onDestroy() {
        mediaPlayer1.release();
        mediaPlayer2.release();
        mediaPlayer3.release();
        super.onDestroy();

    }
}
