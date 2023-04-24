package com.example.woice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Sign extends AppCompatActivity {
    MyDBHandler db;
    EditText musername;
    EditText mage;
    Button mregister;
    HomeWatcher mHomeWatcher;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        db=new MyDBHandler(this);
        musername=(EditText)findViewById(R.id.name);
        mage=(EditText)findViewById(R.id.age);
        mregister= (Button) findViewById(R.id.register);
        musername.addTextChangedListener(signtextwatcher);
        mage.addTextChangedListener(signtextwatcher);

        mregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = musername.getText().toString().trim();
                String age = mage.getText().toString().trim();
                long val = db.adduser(user, age);
                 if(val>0)
                 {
                     Intent i=new Intent(Sign.this,playscreen.class);
                     startActivity(i);
                 }
                else
                    Toast.makeText(Sign.this, "error", Toast.LENGTH_SHORT).show();
            }
        });


        //Music
     /*  doBindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        startService(music);
        mHomeWatcher = new HomeWatcher(this);
        mHomeWatcher.setOnHomePressedListener(new HomeWatcher.OnHomePressedListener() {
            @Override
            public void onHomePressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
            @Override
            public void onHomeLongPressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
        });
         */

    }
    private TextWatcher signtextwatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String usernameInput=musername.getText().toString().trim();
            String userageInput=mage.getText().toString().trim();
            mregister.setEnabled(!usernameInput.isEmpty() && !userageInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

   /* private boolean mIsBound = false;
    private MusicService mServ;
    private ServiceConnection Scon =new ServiceConnection(){

        public void onServiceConnected(ComponentName name, IBinder
                binder) {
            mServ = ((MusicService.ServiceBinder)binder).getService();
        }

        public void onServiceDisconnected(ComponentName name) {
            mServ = null;
        }
    };

    void doBindService(){
        bindService(new Intent(this,MusicService.class),
                Scon, Context.BIND_AUTO_CREATE);
        mIsBound = true;
    }

    void doUnbindService()
    {
        if(mIsBound)
        {
            unbindService(Scon);
            mIsBound = false;
        }
    }
    @Override
    protected void onResume() {
        super.onResume();

        if (mServ != null) {
            mServ.resumeMusic();
        }

    }
    @Override
    protected void onPause() {
        super.onPause();

        PowerManager pm = (PowerManager)
                getSystemService(Context.POWER_SERVICE);
        boolean isScreenOn = false;
        if (pm != null) {
            isScreenOn = pm.isScreenOn();
        }

        if (!isScreenOn) {
            if (mServ != null) {
                mServ.pauseMusic();
            }
        }

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        doUnbindService();
        Intent music = new Intent();
        music.setClass(this,MusicService.class);
        stopService(music);

    }*/

    @Override
    public void onBackPressed() {
        finish();
       finishAffinity();
    }



    public void onskip(View view) {
        Intent intent=new Intent(this,playscreen.class);
        startActivity(intent);
    }


}
