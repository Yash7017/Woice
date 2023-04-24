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

public class Sceneyesyes1 extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sceneyesyes1);
        mVideoView = (VideoView) findViewById(R.id.videoView);

        play = (Button) findViewById(R.id.im1);
       Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/yesyes1.mp4?alt=media&token=41bd9fa7-81bd-4791-b56e-652a117febe5");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();

        /*mVideoView.setVideoPath("https://vc563.pcloud.com/dpZEuTlFBZ4hgGLsZvipp7ZZfDHm37ZQ5ZZf4XZZ0yMjtzyMhULHJyhO1p745hLAICkk/yesyes1.mp4");
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

            }
        });
    }
    @Override
    public void onBackPressed() {
        finish();
        Intent intent=new Intent(this, Play.class);
        startActivity(intent);
    }
}
