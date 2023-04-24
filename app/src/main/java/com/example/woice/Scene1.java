package com.example.woice;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import java.net.URI;


import android.os.Bundle;

import com.example.woice.ui.home.HomeFragment;

public class Scene1 extends AppCompatActivity {

    private VideoView mVideoView;
    Button play;
    LinearLayout mypop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene1);
        mVideoView=(VideoView)findViewById(R.id.videoView);



        mypop=findViewById(R.id.pop);
        play=(Button)findViewById(R.id.im1);
        Uri videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/woice-95389.appspot.com/o/start.mp4?alt=media&token=b38bad89-2b64-4e16-92bb-40730dc20776");
        mVideoView.setVideoURI(videouri);
        mVideoView.requestFocus();
        mVideoView.start();
        mypop.setVisibility(View.GONE);
        /*mVideoView.setVideoPath("https://c182.pcloud.com/dpZ4YqwFBZke9GLsZvipp7ZZC6Bm37ZQ5ZZf4XZZR4m1c2ChGJuvqdWAbzD5u7lkuFp7/start.mp4");
        mVideoView.start();*/

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mVideoView.isPlaying()){
                    mVideoView.pause();
                    play.setBackgroundResource(R.drawable.playicon);
                }
                else{
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
        //Music
       /* Intent music =new Intent(this,MusicService.class);
        stopService(music);*/
    }

    @Override
    public void onBackPressed() {
        finish();
        Intent intent=new Intent(this, Play.class);
        startActivity(intent);
    }

    public void onq1y(View view) {
        Intent intent=new Intent(this,Scene2.class);
        startActivity(intent);
    }

    public void onq1n(View view) {
        Intent intent=new Intent(this,Scene2.class);
        startActivity(intent);
    }
}
