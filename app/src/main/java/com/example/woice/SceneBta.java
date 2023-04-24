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

public class SceneBta extends AppCompatActivity {
    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_bta);
        mVideoView = (VideoView) findViewById(R.id.videoView);
        mypop = findViewById(R.id.pop);
        play = (Button) findViewById(R.id.im1);
        Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/mummykoBtaa1.mp4?alt=media&token=0e2f7ada-1afe-426e-956f-4cd1138ac359");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();
        /*mVideoView.setVideoPath("https://p-def5.pcloud.com/cfZ3cjlFBZUWBGLsZvipp7ZZ1sHm37ZQ5ZZf4XZZugUmZL5ZkVZ6VZ0ZNkZXFZvFZI5Z6ZgFZs5ZE0ZmJZBpZ2LbpTJo8pKbVUXOIAfU2jXdEbsTk/mummykoBtaa1.mp4");
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

    public void onldkimolest(View view) {
        Intent intent=new Intent(this,SceneMolest.class);
        startActivity(intent);
    }
}
