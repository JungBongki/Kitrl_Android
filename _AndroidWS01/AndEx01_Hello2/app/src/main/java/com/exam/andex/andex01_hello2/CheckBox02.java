package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-14.
 */
public class CheckBox02 extends Activity implements View.OnClickListener {

    int F_list[] = {R.id.ChkSF, R.id.ChkR, R.id.ChkL, R.id.ChkWF, R.id.ChkC, R.id.ChkF, R.id.selectAll};
    CheckBox chkF_list[] = new CheckBox[F_list.length];
    int btn_list[] = {R.id.comfirm, R.id.clear};
    Button btnB_list[] = new Button[btn_list.length];
    int count = 0;
    String result = "";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box02);

        textView = (TextView) findViewById(R.id.resultview);
        for (int i = 0; i < F_list.length; i++) {
            chkF_list[i] = (CheckBox) findViewById(F_list[i]);
            chkF_list[i].setOnClickListener(this);
        }
        for(int i = 0; i < btn_list.length; i++){
            btnB_list[i] = (Button) findViewById(btn_list[i]);
            btnB_list[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == F_list[6]){
            if(chkF_list[6].isChecked()){
                for (int i = 0; i < F_list.length; i++) {
                    chkF_list[i].setChecked(true);
                }
            } else {
                for (int i = 0; i < F_list.length; i++) {
                    chkF_list[i].setChecked(false);
                }
            }
        } else {
            for (int i = 0; i < F_list.length; i++) {
                if (view.getId() == F_list[i]) {
                    if(chkF_list[i].isChecked()){
                        chkF_list[i].setChecked(true);
                    } else {
                        chkF_list[i].setChecked(false);
                    }

                }
            }
        }
        if (view.getId() == btn_list[0]) {
            result = "";
            textView.setText("");
            count = 0;
            for (int j = 0; j < F_list.length; j++) {
                if (chkF_list[j].isChecked()) {
                    result += chkF_list[j].getText().toString() + " ";
                    count++;
                }
            }
            if(chkF_list[6].isChecked()){
                count--;
            }
            textView.setText(result + count + "개 선택");
        } else if(view.getId() == btn_list[1]) {
            result = "";
            count = 0;
            textView.setText("");
            for (int j = 0; j < F_list.length; j++){
                chkF_list[j].setChecked(false);
            }
        }
    }
}

/*
        switch (view.getId()){
            case R.id.selectAll :
                if(chk){
                    for(int i =0; i<F_list.length; i++){
                        chkF_list[i].setChecked(true);
                        Final_result = " "
                    }
                } else {
                    for(int i =0; i<F_list.length; i++){
                        chkF_list[i].setChecked(false);
                    }
                }
                break;
            case R.id.ChkSF :
                if(chk){
                    result[0] = "해바라기";
                } else {
                    result[0] = "";
                }
            case R.id.ChkR :
                if(chk){
                    result[1] = "장미";
                } else {
                    result[1] = "";
                }
            case R.id.ChkL :
                if(chk){
                    result[2] = "백합";
                } else {
                    result[2] = "";
                }
            case R.id.ChkWF :
                if(chk){
                    result[3] = "들꽃";
                } else {
                    result[3] = "";
                }
            case R.id.ChkC :
                if(chk){
                    result[4] = "카네이션";
                } else {
                    result[4] = "";
                }
            case R.id.ChkF :
                if(chk){
                    result[5] = "후리지아";
                } else {
                    result[5] = "";
                }

        }*/
        /*for(int i = 0; i <F_list.length; i++){
            if(view.getId() == F_list[i]){
                if(chk){
                    result += chkF_list[i].getText().toString();
                } else {

                }
            }
        }
        for(int i = 0; i <btn_list.length; i++){
            if(view.getId() == btn_list[i]){
                if(chk){
                    result += chkF_list[i]
                }
            }
        }*/
