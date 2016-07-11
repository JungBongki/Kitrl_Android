package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TarotV01 extends Activity implements View.OnClickListener {

    private ImageView imgView;
    private TextView textView;
    private Button finishButton;
    int picture_jwl[] = {R.drawable.mon1, R.drawable.mon2, R.drawable.mon3, R.drawable.mon4,
            R.drawable.mon5, R.drawable.mon7};
    int desc[] = {R.string.mon1, R.string.mon2, R.string.mon3, R.string.mon4,
            R.string.mon5, R.string.mon6};

    int view_jwl = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarotv01);

        imgView = (ImageView) findViewById(R.id.jwl);
        textView = (TextView) findViewById(R.id.dscText);
        finishButton = (Button) findViewById(R.id.backButton);
        finishButton.setOnClickListener(this);
        imgView.setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        view_jwl = UserObj.getRandom(picture_jwl.length) - 1;
        imgView.setImageResource(picture_jwl[view_jwl]);
        textView.setText(desc[view_jwl]);
        if(view.getId() == R.id.backButton){
            finish();
        }
    }
}
