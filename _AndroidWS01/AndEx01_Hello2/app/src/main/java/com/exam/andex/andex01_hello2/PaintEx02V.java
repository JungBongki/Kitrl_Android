package com.exam.andex.andex01_hello2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016-07-18.
 */
public class PaintEx02V extends View {
    int x = 100, y = 100;
    int p = 0, q = 0;

    public PaintEx02V(Context context){
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(100f);
        canvas.drawRect(x-100, y-100, x+100, y+100, paint);
        canvas.drawText("Nice x축 : " + x  + " y축 : "+ y, 0, 300, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_UP:
                x = (int)event.getX();
                y = (int)event.getY();
                invalidate();
        }
        return super.onTouchEvent(event);
    }
}

