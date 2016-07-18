package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016-07-18.
 */
public class InflaterEx00 extends Activity implements View.OnClickListener {

    ImageButton imgbtn;
    EditText edit;
    LinearLayout container;
    int sw = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_inflater00);
        container = (LinearLayout) findViewById(R.id.under_layout);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.imageview_t01,container,true);
        imgbtn = (ImageButton) findViewById(R.id.imgbtn01);
        edit = (EditText) findViewById(R.id.edit);

        imgbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.imgbtn01){
            if(sw == 0){
                imgbtn.setImageResource(R.drawable.aba_tau);
                edit.setText("아바투르와 정예타우렌족장");
                sw = 1;
            } else if(sw == 1){
                imgbtn.setImageResource(R.drawable.pama);
                edit.setText("파마기사");
                sw = 0;
            }
        }
    }
}
