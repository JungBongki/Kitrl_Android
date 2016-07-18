package com.exam.andex.andex01_hello2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016-07-18.
 */
public class PaintEx01V extends View {


    public PaintEx01V(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        paint.setColor(Color.BLUE);
        canvas.drawRect(300, 500, 800, 800, paint);

        paint.setColor(Color.rgb(255,255,168));
        canvas.drawCircle(550, 350, 150, paint);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10f);
        canvas.drawLine(550, 330, 550, 380, paint);
        canvas.drawLine(450, 330, 555, 330, paint);
        canvas.drawLine(600, 330, 650, 330, paint);

        paint.setColor(Color.RED);
        paint.setStrokeWidth(10f);
        canvas.drawLine(500, 430, 600, 430, paint);

        paint.setColor(Color.rgb(85,29,185));
        canvas.drawRect(400, 800, 500, 1200, paint);
        canvas.drawRect(600, 800, 700, 1200, paint);
        super.onDraw(canvas);
    }
}
