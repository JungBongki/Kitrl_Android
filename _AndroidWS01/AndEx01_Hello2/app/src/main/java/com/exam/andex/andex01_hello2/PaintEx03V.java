package com.exam.andex.andex01_hello2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016-07-18.
 */
public class PaintEx03V extends View {

    public PaintEx03V(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {


        String[] args = {"국어", "영어", "수학"};
        Paint paint = new Paint();

        paint.setTextSize(25f);
        for(int i = 0; i < 10; i++){
            canvas.drawText(String.valueOf(10+(i * 10)), 50, 1110 - (100*i), paint);
        }
        for(int i = 0; i < 3; i++){
            canvas.drawText(args[i], 225 + (200 * i), 1250, paint);
        }

        paint.setStrokeWidth(5f);
        for(int i = 0; i <=10; i++){
            canvas.drawLine(100, 1200 - (100 * i), 800, 1200 - (100 * i), paint);
        }
        canvas.drawLine(100, 1200, 100, 100, paint);

        paint.setColor(Color.argb(100, 255, 201, 238));
        canvas.drawRect(50, 100, 800, 1270, paint);


        super.onDraw(canvas);
    }
}
