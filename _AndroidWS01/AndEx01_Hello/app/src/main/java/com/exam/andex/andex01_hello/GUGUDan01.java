package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-06.
 */
public class GUGUDan01 extends Activity implements View.OnClickListener{

    private EditText vdan;
    private TextView vresult;
    String msg = "";
    int result = 0;
    int btns[] = {R.id.danBtn, R.id.rsetBtn, R.id.backButton};
    Button btn[] = new Button[btns.length];

    int dan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gugudan01);
        vdan = (EditText)findViewById(R.id.vdan);
        vresult = (TextView)findViewById(R.id.vresult);

        for(int i=0; i<btn.length; i++) {
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
            /*danBtn = (Button) findViewById(R.id.danBtn);
            danBtn.setOnClickListener(this);*/
        }
    }


    public void danClear(View v){
        msg = "";
        vresult.setText(msg);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == btns[0]){
            Log.i("GUGUguResult",vdan.getText().toString()); // 실수한부분, danBtn(x) vdan(o)
            danClear(view);
            String pass = vdan.getText().toString();
            boolean flag = pass.isEmpty();
            if(!flag){
                dan = Integer.parseInt(vdan.getText().toString());
                for(int i=1; i<10 ; i++){
                    result = dan * i;
                    msg += dan + " * " + i + " = " + result + "\n";
                }
                vresult.setText(msg);
            } else {
                Toast.makeText(getApplicationContext(),"is not vaild",Toast.LENGTH_SHORT).show();
            }
        } else if (view.getId() == btns[1]){
            danClear(view);
        } else if (view.getId() == btns[2]){
            finish();
        }
    }
}

/*

    public void danResult(View v){
        danClear(v);
        String pass = vdan.getText().toString();
        boolean flag = pass.isEmpty();
        if(!flag){
            dan = Integer.parseInt(vdan.getText().toString());
            for(int i=1; i<10 ; i++){
                result = dan * i;
                msg += dan + " * " + i + " = " + result + "\n";
            }
            vresult.setText(msg);
        } else {
            Toast.makeText(getApplicationContext(),"is not vaild",Toast.LENGTH_SHORT).show();
        }
    }
*/
