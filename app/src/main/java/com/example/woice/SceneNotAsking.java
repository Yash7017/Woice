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

public class SceneNotAsking extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_not_asking);
        mVideoView = (VideoView) findViewById(R.id.videoView);
        mypop = findViewById(R.id.pop);
        play = (Button) findViewById(R.id.im1);
       Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/nahipoochna111.mp4?alt=media&token=c5af8f40-f0bf-425a-81a7-e59cd857231c");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();

       /*mVideoView.setVideoPath("https://c145.pcloud.com/dpZvdulFBZvNsGLsZvipp7ZZMIBm37ZQ5ZZf4XZZWfKvk0zbmsmQyR5wHH5FiHs7aFyV/nahipoochhna1.mp4");
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

    public void onexcuse(View view) {
        Intent intent=new Intent(this,SceneExcuse.class);
        startActivity(intent);

    }

    public void onscream(View view) {
        Intent intent=new Intent(this,SceneScreaming.class);
        startActivity(intent);
    }
}
