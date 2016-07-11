package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UserInterface04 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinearLayout mainlayout = new LinearLayout(this);
        mainlayout.setLayoutParams
                (new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
        mainlayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout layout01 = new LinearLayout(this);
        layout01.setLayoutParams
                (new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT, 150));

        LinearLayout layout02 = new LinearLayout(this);
        layout02.setLayoutParams
                (new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT, 110));
        layout02.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout layout03 = new LinearLayout(this);
        layout03.setLayoutParams
                (new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT, 150));

        LinearLayout layout04 = new LinearLayout(this);
        layout04.setLayoutParams
                (new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT, 70));

        mainlayout.addView(layout01);
        mainlayout.addView(layout02);
        mainlayout.addView(layout03);
        mainlayout.addView(layout04);

        TextView mainText = new TextView(this);
        mainText.setText("이미지 버튼 바꾸기");
        mainText.setTextSize(20);
        mainText.setBackgroundColor(0xFFEEEEEE);
        layout01.setGravity(Gravity.CENTER);
        layout01.addView(mainText);

        TextView subText = new TextView(this);
        subText.setText("기본이미지");
        subText.setTextSize(20);
        subText.setBackgroundColor(0xFFEEAAAA);
        layout03.setGravity(Gravity.CENTER);
        layout03.addView(subText);

        /*ImageButton ibtn[] = new ImageButton[5];
        int drawable[] = {R.drawable.dog1, R.drawable.dog2, R.drawable.dog3,R.drawable.dog4,R.drawable.dog5};
        for(int i=0; i<ibtn.length; i++){
            ibtn[i].setImageResource(drawable[i]);
            layout02.addView(ibtn[i]);
        }*/
        final ImageButton ibtn01 = new ImageButton(this);
        ibtn01.setImageResource(R.drawable.dog1);
        ibtn01.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT, 1));
        ibtn01.setScaleType(ImageButton.ScaleType.CENTER_CROP);


        ImageButton ibtn02 = new ImageButton(this);
        ibtn02.setImageResource(R.drawable.dog2);
        ibtn02.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT, 1));
        ibtn02.setScaleType(ImageButton.ScaleType.CENTER_CROP);


        ImageButton ibtn03 = new ImageButton(this);
        ibtn03.setImageResource(R.drawable.dog3);
        ibtn03.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT, 1));
        ibtn03.setScaleType(ImageButton.ScaleType.CENTER_CROP);

        ImageButton ibtn04 = new ImageButton(this);
        ibtn04.setImageResource(R.drawable.dog4);
        ibtn04.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT, 1));
        ibtn04.setScaleType(ImageButton.ScaleType.CENTER_CROP);

        ImageButton ibtn05 = new ImageButton(this);
        ibtn05.setImageResource(R.drawable.dog5);
        ibtn05.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT, 1));
        ibtn05.setScaleType(ImageButton.ScaleType.CENTER_CROP);

        LinearLayout.LayoutParams position;
        position = new LinearLayout.LayoutParams(300, 300, 1);
        layout02.addView(ibtn01, position);
        layout02.addView(ibtn02, position);
        layout02.addView(ibtn03, position);
        layout02.addView(ibtn04, position);
        layout02.addView(ibtn05, position);


        final ImageButton ibtnView = new ImageButton(this);
        layout04.addView(ibtnView, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        ibtnView.setScaleType(ImageButton.ScaleType.CENTER_CROP);

        ibtn01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ibtnView.setImageResource(R.drawable.dog1);
            }
        });
        ibtn02.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ibtnView.setImageResource(R.drawable.dog2);
            }
        });
        ibtn03.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ibtnView.setImageResource(R.drawable.dog3);
            }
        });
        ibtn04.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ibtnView.setImageResource(R.drawable.dog4);
            }
        });
        ibtn05.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ibtnView.setImageResource(R.drawable.dog5);
            }
        });
        setContentView(mainlayout);
    }
}
