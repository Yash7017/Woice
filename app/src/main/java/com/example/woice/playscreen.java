package com.example.woice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class playscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playscreen);

    }
    @Override
    public void onBackPressed() {
        finish();
        finishAffinity();
    }

   

    public void onaddstory(View view) {
        Intent intent=new Intent(this,AddStory.class);
        startActivity(intent);
    }

    public void ontorch(View view) {
        Intent intent=new Intent(this,TorchBearers.class);
        startActivity(intent);
    }

    public void onPlay(View view) {
        Intent intent=new Intent(this,Play.class);
        startActivity(intent);
    }
}
