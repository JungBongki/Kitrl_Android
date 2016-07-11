package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityEx02 extends Activity implements View.OnClickListener{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex02);

        button = (Button) findViewById(R.id.ntView1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.ntView1) {

            Toast.makeText(this, "이벤트 확인!!!", Toast.LENGTH_SHORT).show();
            finish(); // 끝내버리는 부분?
        }
    }
}
