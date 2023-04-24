package com.example.woice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.woice.ui.home.HomeFragment;

public class Scene2 extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;
    TextView q2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene2);
        mVideoView = (VideoView) findViewById(R.id.videoView);
        mypop = findViewById(R.id.pop);
        play = (Button) findViewById(R.id.im1);
        Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/firstschool.mp4?alt=media&token=afb8fdef-1579-42c5-8c0d-b47c3e7b4707");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();

        mypop.setVisibility(View.GONE);

      /* mVideoView.setVideoPath("https://p-def2.pcloud.com/cfZzgGKFBZpwbGLsZvipp7ZZxEBm37ZQ5ZZf4XZZxWqYZ55ZuJZeFZwFZg0ZQ7ZC7Zb0ZKkZV7ZwXZLFZ37Zh5Zh6kdwYr75QbkiSQ8R1pJopXpf8M7/firstschool.mp4");
        mVideoView.start();*/


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

    public void onq2y(View view) {
        Intent intent=new Intent(this,Scene3.class);
        startActivity(intent);
    }

    public void onq2n(View view) {
        Intent intent=new Intent(this,Scene3.class);
        startActivity(intent);

    }
}






