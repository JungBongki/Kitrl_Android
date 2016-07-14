package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBox01 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox01);
    }

    public void onCheckBoxClicked(View v){
        boolean checked = ((CheckBox)v).isChecked();

        switch(v.getId()){
            case R.id.checkbox_meat :
                if(checked){
                    Toast.makeText(getApplicationContext(), "고기 선택", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "고기 선택 취소", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox_cheese :
                if(checked){
                    Toast.makeText(getApplicationContext(), "치즈 선택", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "치즈 선택 취소", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}
