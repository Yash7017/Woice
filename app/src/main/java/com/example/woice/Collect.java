package com.example.woice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Collect extends AppCompatActivity {
    Animation topanim,bottomanim;
    Button collect;
    ImageView star1,star2,star3;
    TextView staronetxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        collect=(Button)findViewById(R.id.collectbutton);
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottomanime);
        star1=(ImageView)findViewById(R.id.starone);
        staronetxt=(TextView)findViewById(R.id.staronetxt);


        star1.setVisibility(View.GONE);
        staronetxt.setVisibility(View.GONE);


    }

    public void oncollectbutton(View view) {
        collect.setVisibility(View.GONE);
        star1.setVisibility(View.VISIBLE);
        star1.setAnimation(bottomanim);
        staronetxt.setVisibility(View.VISIBLE);
        staronetxt.setAnimation(bottomanim);


    }
}
