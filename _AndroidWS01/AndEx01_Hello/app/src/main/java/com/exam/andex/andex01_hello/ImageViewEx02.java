package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewEx02 extends Activity implements View.OnClickListener {

    int views[] = {R.id.dog1, R.id.dog2, R.id.dog3, R.id.dog4, R.id.dog5, R.id.dog6};
    int drawimg[] = {R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4, R.drawable.dog5, R.drawable.dog6};
    ImageView imgView[] = new ImageView[views.length];
    ImageView Show;
    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview_ex02);
        Show = (ImageView) findViewById(R.id.ShowDetail);
        for (int i = 0; i < views.length; i++) {
            imgView[i] = (ImageView) findViewById(views[i]);
            imgView[i].setOnClickListener(this);
        }
        finishButton = (Button) findViewById(R.id.backButton);
        finishButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.backButton){
            finish();
        } else {
            for(int i =0; i<views.length; i++){
                if (view.getId() == views[i]) {
                    Show.setImageResource(drawimg[i]);
                }
            }
        }
    }
}
