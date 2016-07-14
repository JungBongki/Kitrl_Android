package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016-07-14.
 */
public class LayoutByCode02 extends Activity{


    Button change_Button;
    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout01 = new LinearLayout(this);
        change_Button = new Button(this);
        change_Button.setText("테스트");
        layout01.addView(change_Button);


    }

}
