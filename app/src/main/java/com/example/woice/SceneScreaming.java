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

public class SceneScreaming extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_screaming);
        mVideoView = (VideoView) findViewById(R.id.videoView);
        mypop = findViewById(R.id.pop);
        play = (Button) findViewById(R.id.im1);
        Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/unclechillana1.mp4?alt=media&token=c583b7b7-c008-4d6b-9f42-369e575fbec4");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();
       /* mVideoView.setVideoPath("https://vc513.pcloud.com/dpZ4ymlFBZsqSGLsZvipp7ZZIDHm37ZQ5ZZf4XZZluCtqXycxa4B1YslYIQOvkQNnB3y/ladkisesorry1.mp4");
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


    public void onbta(View view) {
        Intent intent=new Intent(this,SceneBta.class);
        startActivity(intent);

    }

    public void onmatbta(View view) {
        Intent intent=new Intent(this,SceneMatBta.class);
        startActivity(intent);

    }
}
