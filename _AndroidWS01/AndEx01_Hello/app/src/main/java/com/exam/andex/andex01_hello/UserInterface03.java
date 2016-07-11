package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class UserInterface03 extends Activity {
    ImageButton ibtn01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout01 = new LinearLayout(this);
        layout01.setOrientation(LinearLayout.VERTICAL);

        Button btn01 = new Button(this);
        btn01.setText("이미지를 클릭하세요.");
        btn01.setTextSize(20);
        btn01.setTextColor(Color.BLUE);
        layout01.addView(btn01);
        /*---------------------------------*/
        ////////////////////////////////////////////////////////// btn1 삽입
        ibtn01 = new ImageButton(this);
        ibtn01.setImageResource(R.drawable.dog1);
        layout01.addView(ibtn01, 500, 500);
        layout01.setGravity(Gravity.CENTER);
        ibtn01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Drawable tempImg = ibtn01.getDrawable();
                Drawable tempRes = UserInterface03.this.getResources().getDrawable(R.drawable.dog1);
                Bitmap tmpBitmap = ((BitmapDrawable)tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable)tempRes).getBitmap();
                if(tmpBitmap == tmpBitmapRes)
                    ibtn01.setImageResource(R.drawable.dog2);
                else
                    ibtn01.setImageResource(R.drawable.dog1);
            }
        });



        //////////////////////////////////////////////////////////imgFrame삽입
        Button btn02 = new Button(this);
        btn02.setText("버튼 02");
        btn02.setTextSize(20);
        btn02.setTextColor(Color.rgb(0,255,0));
        layout01.addView(btn02);
        ////////////////////////////////////////////////////////// btn2 삽입

        setContentView(layout01);
    }
}
