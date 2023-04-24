package com.example.woice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class Scene3 extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene3);
        mVideoView = (VideoView) findViewById(R.id.videoView);
        mypop = findViewById(R.id.pop);
        play = (Button) findViewById(R.id.im1);
       Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/enter.mp4?alt=media&token=d315afec-a2bb-4fb4-92b0-a35a92a3e001");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();

        /*mVideoView.setVideoPath("https://vc543.pcloud.com/dpZftklFBZUQ4GLsZvipp7ZZEOBm37ZQ5ZZf4XZZFvhU7XD7lPbkRXqDXRaNo7PzIuVV/enter.mp4");
        mVideoView.start();*/

        mypop.setVisibility(View.GONE);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mVideoView.isPlaying()) {
                    mVideoView.pause();
                    play.setBackgroundResource(R.drawable.playicon);
                } else {
                    mVideoView.start();
                    play.setBackgroundResource(R.drawable.pauseicon);
                }

            }
        });
        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                play.setVisibility(View.GONE);
                mypop.setVisibility(View.VISIBLE);

            }
        });
    }
    @Override
    public void onBackPressed() {
        finish();
        Intent intent=new Intent(this, Play.class);
        startActivity(intent);
    }

    public void onq3y(View view) {
        Intent intent=new Intent(this,SceneAsking.class);
        startActivity(intent);
    }

    public void onq3n(View view) {
        Intent intent=new Intent(this,SceneNotAsking.class);
        startActivity(intent);
    }
}

