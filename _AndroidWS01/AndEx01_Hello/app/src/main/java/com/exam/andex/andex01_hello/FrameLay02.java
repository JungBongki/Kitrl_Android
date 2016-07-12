package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016-07-12.
 */
public class FrameLay02 extends Activity {

    private ImageView imgV02, imgV03;
    int sw = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_lay02);
        imgV02 = (ImageView) findViewById(R.id.FrameDog1);
        imgV03 = (ImageView) findViewById(R.id.FrameDog2);
        imgV03.setVisibility(ImageView.INVISIBLE);
        imgV02.setVisibility(ImageView.VISIBLE);

    }

    public void changeImg(View v){
        if(sw==0){
            imgV03.setVisibility(ImageView.VISIBLE);
            imgV02.setVisibility(ImageView.INVISIBLE);
            sw++;
        } else if(sw == 1){
            imgV03.setVisibility(ImageView.INVISIBLE);
            imgV02.setVisibility(ImageView.VISIBLE);
            sw--;
        }

    }
}
