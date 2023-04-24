package com.example.woice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class TorchBearers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch_bearers);
    }
    @Override
    public void onBackPressed() {
        finish();
        Intent intent=new Intent(this,playscreen.class);
        startActivity(intent);
    }

    public void onkalpana(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/2aQtLG5U5lI?list=PLr3YI1wJSCPsdh894ZVZaLt5s-hgleuUd"));
        startActivity(intent);

    }

    public void ontanmay(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/_Xs_KerUu1k"));
        startActivity(intent);

    }

    public void onkautilya(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/GOzTYhwiKvk"));
        startActivity(intent);
    }

    public void onrama(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/WyV_5_ylnLc"));
        startActivity(intent);
    }

    public void onjaswal(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S5kH6vSGnCg&feature=youtu.be&t=11"));
        startActivity(intent);
    }

    public void onsushma(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/F0KqHcf4PM0"));
        startActivity(intent);
    }
}
