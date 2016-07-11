package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class UserInterface02 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout01 = new LinearLayout(this);
        layout01.setOrientation(LinearLayout.VERTICAL);

        Button btn01 = new Button(this);
        btn01.setText("버튼 01");
        btn01.setTextSize(20);
        btn01.setTextColor(Color.BLUE);
        layout01.addView(btn01);
        /*---------------------------------*/
        btn01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"nice", Toast.LENGTH_SHORT).show();
            }
        });
        ////////////////////////////////////////////////////////// btn1 삽입

        Button btn02 = new Button(this);
        btn02.setText("버튼 02");
        btn02.setTextSize(20);
        btn02.setTextColor(Color.rgb(0,255,0));
        layout01.addView(btn02);
        ////////////////////////////////////////////////////////// btn2 삽입

        setContentView(layout01);
    }
}
