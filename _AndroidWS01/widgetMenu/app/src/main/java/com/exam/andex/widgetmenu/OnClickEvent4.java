package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OnClickEvent4 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.on_click_event4);

        Button button = (Button) findViewById(R.id.button);
        MyListenerClass buttonListener = new MyListenerClass();
        button.setOnClickListener(buttonListener);
    }

    private class MyListenerClass implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니당", Toast.LENGTH_SHORT).show();
        }
    }
}
