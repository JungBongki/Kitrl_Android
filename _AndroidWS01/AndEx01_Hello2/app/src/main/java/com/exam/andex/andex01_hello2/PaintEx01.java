package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016-07-18.
 */
public class PaintEx01 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaintEx01V paintEx01V = new PaintEx01V(this);
        setContentView(paintEx01V);
    }

}
