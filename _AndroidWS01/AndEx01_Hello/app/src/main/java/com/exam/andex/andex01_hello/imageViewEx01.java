package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class imageViewEx01 extends Activity implements View.OnClickListener {


    private ImageView imgView;
    int sm = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview_ex01);

        imgView = (ImageView) findViewById(R.id.img01);
        imgView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (sm == 0) {
            sm = 1;
            imgView.setImageResource(R.drawable.dog2);
        } else if (sm == 1) {
            sm = 0;
            imgView.setImageResource(R.drawable.dog1);
        }
    }
}
