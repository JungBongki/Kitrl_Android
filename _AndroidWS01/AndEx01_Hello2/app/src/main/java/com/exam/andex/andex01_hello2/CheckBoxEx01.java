package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-15.
 */
public class CheckBoxEx01 extends Activity implements View.OnClickListener {

    int row = 5;
    int col = 3;

    int chkboxs[][] = {{R.id.chk00, R.id.chk01, R.id.chk02},
            {R.id.chk10, R.id.chk11, R.id.chk12},
            {R.id.chk20, R.id.chk21, R.id.chk22},
            {R.id.chk30, R.id.chk31, R.id.chk32},
            {R.id.chk40, R.id.chk41, R.id.chk42}};

    CheckBox object_chkboxs[][] = new CheckBox[row][col];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box_exam01);

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                object_chkboxs[i][j] = (CheckBox) findViewById(chkboxs[i][j]);
                object_chkboxs[i][j].setOnClickListener(this);
            }
        }
    }

    public void dup_chk(int row){
        for(int j =0; j< col; j++){
            if(object_chkboxs[row][j].isChecked()){
                object_chkboxs[row][j].setChecked(false);
            }
        }
    }

    @Override
    public void onClick(View view) {
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(view.getId() == chkboxs[i][j]){
                    if(!object_chkboxs[i][j].isChecked()){
                        object_chkboxs[i][j].setChecked(false);
                    } else {
                        int select_row = i;
                        dup_chk(select_row);
                        object_chkboxs[i][j].setChecked(true);
                    }
                }
            }
        }
    }

    public void calcu(View v){
        TextView textView = (TextView) findViewById(R.id.calcuBtn);
        double sum = 0;
        double avg;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(object_chkboxs[i][j].isChecked()){
                    if(j==2){
                        sum += 0.0;
                    } else if(j == 1) {
                        sum += 1.0;
                    } else {
                        sum += 2.0;
                    }
                }
            }
        }
        avg = sum / row;
        textView.setText("총 평점은 " +  avg + " 입니다.");
    }
}
