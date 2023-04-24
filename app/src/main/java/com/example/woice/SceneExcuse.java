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

public class SceneExcuse extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_excuse);
        mVideoView = (VideoView) findViewById(R.id.videoView);
        mypop = findViewById(R.id.pop);
        play = (Button) findViewById(R.id.im1);
        Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/excux.mp4?alt=media&token=06486790-ee6c-4094-83fb-b948354504d1");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();
     /*   mVideoView.setVideoPath("https://p-def6.pcloud.com/cfZhb5nFBZvvQGLsZvipp7ZZuDHm37ZQ5ZZf4XZZCzEV7ZoJZj0ZKZp0Z7JZM5Zm0ZG5ZS7ZaFZpVZvFZ0pZfpZtzgSSUMJvmJ03kerg3FKaJpPi8HX/excux.mp4");
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
