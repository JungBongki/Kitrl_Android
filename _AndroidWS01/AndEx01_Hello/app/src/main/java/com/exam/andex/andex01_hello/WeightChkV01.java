package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-11.
 */
public class WeightChkV01 extends Activity implements View.OnClickListener {

    int btns[] = {R.id.b1, R.id.b2, R.id.b3, R.id.b4, R.id.b5, R.id.b6, R.id.b7,
            R.id.b8, R.id.b9, R.id.b0, R.id.bUndo, R.id.bPoint};
    Button Bbtn[] = new Button[btns.length];

    int status = 0;

    private Button finishButton, result_cal;
    private TextView vresult;
    private EditText vweight, vheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_chkv01);

        vresult = (TextView) findViewById(R.id.resultView);
        vheight = (EditText) findViewById(R.id.kiNum);
        vweight = (EditText) findViewById(R.id.mommugeNum);
        for(int i =0; i<btns.length; i++){
            Bbtn[i] = (Button) findViewById(btns[i]);
            Bbtn[i].setOnClickListener(this);
        }
        result_cal = (Button) findViewById(R.id.bimanCal);
        result_cal.setOnClickListener(this);
        finishButton = (Button) findViewById(R.id.backButton);
        finishButton.setOnClickListener(this);

    }
    public void undo(){
        String bf_String = "";
        String af_String = "";
/*
        bf_String = editText.getText().toString();
        af_String = bf_String.substring(0, bf_String.length() - 1);
        editText.setText(af_String);*/

    }

    public void calculate(double a, double b){ // 키와 몸무게
        double normal_weight = (a - 100) * 0.9;
        String n_w_result = "";
        if(normal_weight>59){
            n_w_result =  "비만";
            /*vresult.setText("비만입니다.");
            vresult.setTextColor(Color.parseColor("#FF0000"));*/
        } else if(normal_weight<49) {
            n_w_result = "허약";
            /*vresult.setText("허약입니다.");*/
        } else {
            n_w_result = "정상";
        }
        vresult.setText("당신의 표준 체중은 \n 표준체중 [ " + normal_weight +
                "kg] = 49 ~ 59kg \n 으로 [ " + n_w_result + " 입니다 ]");
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == btns[10]) {
            undo();
        } else {
            for(int i = 0; i < btns.length; i++){
                if(view.getId() == btns[i]){
                    if(vheight.isFocused()){
                        vheight.setText(vheight.getText() + Bbtn[i].getText().toString());
                    } else if (vweight.isFocused()){
                        vweight.setText(vweight.getText() + Bbtn[i].getText().toString());
                    }
                }
            }
        }

        if(view.getId() == R.id.backButton){
            finish();
        } else if(view.getId() == R.id.bimanCal){
            calculate(Double.parseDouble(vheight.getText().toString()),
                    Double.parseDouble(vweight.getText().toString()));
        }
    }
}
