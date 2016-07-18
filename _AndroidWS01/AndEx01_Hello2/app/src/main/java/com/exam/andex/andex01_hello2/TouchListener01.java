package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-15.
 */
public class TouchListener01 extends Activity implements View.OnClickListener, View.OnTouchListener{

    int Btns[] = {R.id.onClick, R.id.onTouch};
    Button btn[] = new Button[Btns.length];
    TextView res_count1, res_count2;
    int count1, count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_listener01);

        btn[0] = (Button) findViewById(Btns[0]);
        btn[0].setOnClickListener(this);
        btn[1] = (Button) findViewById(Btns[1]);
        btn[1].setOnTouchListener(this);
        res_count1 = (TextView) findViewById(R.id.count1);
        res_count2 = (TextView) findViewById(R.id.count2);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == Btns[0]){
            count1++;
            res_count1.setText(String.valueOf(count1));
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() == Btns[1]) {
            motionEvent.getAction();
            count2++;
            res_count2.setText(Integer.toString(count2));
        }
        return false;
    }
}
