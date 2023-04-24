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

public class NMomStory extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_mom_story);
        mVideoView = (VideoView) findViewById(R.id.videoView);
        mypop = findViewById(R.id.pop);
        play = (Button) findViewById(R.id.im1);
        Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/mummystory111.mp4?alt=media&token=8c873f49-991d-46f2-99d8-3894ca22c5eb");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();

        /*mVideoView.setVideoPath("https://p-def4.pcloud.com/cfZddulFBZS9sGLsZvipp7ZZvRHm37ZQ5ZZhqJZZTqxbZG0ZpFZSpZI7Z95ZoJZnJZUJZ45ZtFZ6Zn0ZDXZNFZIqSlw9YNdIQE02kOV6IaWVidPHjy/mummystory111.mp4");
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

    public void onnsorry(View view) {
        Intent intent=new Intent(this,NSorry.class);
        startActivity(intent);
    }
}
