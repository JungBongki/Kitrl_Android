package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;

/**
 * Created by Administrator on 2016-07-15.
 */
public class RatingBar02 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rating_bar01);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingbar);

        ratingBar.setStepSize((float) 0.5);
        ratingBar.setRating((float) 2.5);
        ratingBar.setIsIndicator(true); // 사용자 잠금설정
    }
}
