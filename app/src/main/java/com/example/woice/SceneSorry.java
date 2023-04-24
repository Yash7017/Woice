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

public class SceneSorry extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_sorry);
        mVideoView = (VideoView) findViewById(R.id.videoView);
        mypop = findViewById(R.id.pop);
        play = (Button) findViewById(R.id.im1);
        Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/ladkisesorry1.mp4?alt=media&token=a206e837-cf68-4ed8-9cde-cc971c8ce8d5");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();

       /* mVideoView.setVideoPath("https://vc513.pcloud.com/dpZ4ymlFBZsqSGLsZvipp7ZZpDkm37ZQ5ZZgUHZZaPOzG4iOeUj7HfVSw5x3JJfE6Nsk/ladkisesorry1.mp4");
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

    public void onyesyes(View view) {
        Intent intent=new Intent(this,Sceneyesyes1.class);
        startActivity(intent);
    }

    public void onYesNo(View view) {
        Intent intent=new Intent(this,SceneYesNo11.class);
        startActivity(intent);
    }
}
