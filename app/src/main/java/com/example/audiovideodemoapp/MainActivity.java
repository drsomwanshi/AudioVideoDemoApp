package com.example.audiovideodemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    MediaPlayer mediaPlayer=null;
    public void playAudio(View view) {
   mediaPlayer=MediaPlayer.create(this,R.raw.test);
   mediaPlayer.start();


    }

    public void StopAudio(View view) {
    mediaPlayer.stop();
    }

    public void StartVideo(View view) {

        VideoView view1=findViewById(R.id.video1);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.samplevideo);
        view1.setVideoURI(uri);
        view1.setMediaController(new MediaController(this));
        view1.requestFocus();
        view1.start();


    }
}