package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MemExit01 extends Activity implements View.OnClickListener{

    private EditText vid;
    private EditText vpwd;
    String msg;
    private Button memBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text01);
        vid = (EditText)findViewById(R.id.vid);
        vpwd = (EditText)findViewById(R.id.vpwd);
        memBtn = (Button) findViewById(R.id.memBtn);
        vid.setOnClickListener(this);
        vpwd.setOnClickListener(this);
        memBtn.setOnClickListener(this);
    }

    public void memResult(View view){
        msg = "아이디 : " + vid.getText().toString() + "패스워드 : " +  vpwd.getText().toString();
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.memBtn)
        Toast.makeText(this,"event confirm !!!!", Toast.LENGTH_SHORT).show();
    }
}
