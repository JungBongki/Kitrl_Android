package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityEx01 extends Activity implements View.OnClickListener{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex01);

        button = (Button) findViewById(R.id.ntView2);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.ntView2) {

            Toast.makeText(this, "이벤트 확인!!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), ActivityEx02.class);
            startActivity(intent);
        }
    }
}
