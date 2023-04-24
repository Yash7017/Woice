package com.example.woice;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class Hindi extends AppCompatTextView {

    public Hindi(Context context) {
        super(context);
        initTypeFace(context);
    }

    public Hindi(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTypeFace(context);
    }

    public Hindi(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTypeFace(context);
    }
    private void initTypeFace(Context context){
        Typeface typeface=Typeface.createFromAsset(context.getAssets(),"NotoSansDevanagari-Regular.ttf");
        this.setTypeface(typeface);
    }
}