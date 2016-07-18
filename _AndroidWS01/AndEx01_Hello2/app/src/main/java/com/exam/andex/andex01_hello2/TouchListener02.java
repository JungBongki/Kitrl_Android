package com.exam.andex.andex01_hello2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TouchListener02 extends Activity implements View.OnTouchListener{

    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_listener02);

        imgView = (ImageView) findViewById(R.id.pama);
        LinearLayout LL = (LinearLayout) findViewById(R.id.LL);
        LL.setOnTouchListener(this);

    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_MOVE:
                imgView.setX(motionEvent.getX());
                imgView.setY(motionEvent.getY());
        }
        return true;
    }
}
