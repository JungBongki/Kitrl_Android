package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016-07-18.
 */
public class PaintEx02 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaintEx02V makeLayout = new PaintEx02V(this);
        setContentView(makeLayout);
    }
}
