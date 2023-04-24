package com.example.woice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class NNoNo extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_no_no);
        mVideoView = (VideoView) findViewById(R.id.videoView);

        play = (Button) findViewById(R.id.im1);
        Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/nono1.mp4?alt=media&token=bdce4e9a-7478-454d-9002-a52189775222");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();

        /*mVideoView.setVideoPath("https://c403.pcloud.com/dpZGrWlFBZAv1GLsZvipp7ZZFQHm37ZQ5ZZhqJZZRtC9hmx8RFmPIczGLdBXCQIFr7NV/nono1.mp4");
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
}
