package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016-07-12.
 */
public class FrameLay03 extends Activity implements View.OnClickListener {

    int btns[] = {R.id.FrameDog1, R.id.FrameDog2, R.id.FrameDog3, R.id.FrameDog4, R.id.FrameDog5};
    int views[] = {R.id.resultView1, R.id.resultView2, R.id.resultView3, R.id.resultView4, R.id.resultView5};
    ImageView iviews[] = new ImageView[views.length];
    ImageButton ibtns[] = new ImageButton[btns.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_lay03);
        for(int i=0; i<btns.length; i++){
            ibtns[i] = (ImageButton) findViewById(btns[i]);
            iviews[i] = (ImageView) findViewById(views[i]);
            ibtns[i].setOnClickListener(this);
            iviews[i].setVisibility(ImageView.INVISIBLE);
        }
    }

    @Override
    public void onClick(View view) {
        for(int j=0; j<btns.length; j++){
            iviews[j].setVisibility(ImageView.INVISIBLE);
        }
        for (int i = 0; i < btns.length; i++) {
            if(view.getId()==btns[i]){
                iviews[i].setVisibility(ImageView.VISIBLE);
            }
        }
    }
}
