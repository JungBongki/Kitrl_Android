package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016-07-14.
 */
public class LayoutByCode01 extends Activity {
    LinearLayout LL;
    int sw = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_by_code01);

        LL = (LinearLayout) findViewById(R.id.layoutManager);
    }

    public void cngLay(View v){
        if(sw == 0){
            LL.setOrientation(LinearLayout.HORIZONTAL);
            sw = 1;
        } else if( sw == 1){
            LL.setOrientation(LinearLayout.VERTICAL);
            sw = 0;
        }
    }
}
