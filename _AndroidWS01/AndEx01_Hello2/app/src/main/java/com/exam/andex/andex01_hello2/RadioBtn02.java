package com.exam.andex.andex01_hello2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-14.
 */
public class RadioBtn02 extends Activity implements View.OnClickListener {

    int rbtn_list[] = {R.id.rb1, R.id.rb2, R.id.rb3, R.id.rb4, R.id.rb5};
    int imgList[] = {R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4, R.drawable.dog5};
    String name_imgList[] = new String[]{"gf1.jpg", "gf2.jpg", "gf3.jpg", "gf4.jpg", "gf5.jpg"};
    RadioButton rbtns[] = new RadioButton[rbtn_list.length];
    TextView resulttxt;
    ImageView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_btn03);

        resulttxt = (TextView) findViewById(R.id.txtresult);
        resultView = (ImageView) findViewById(R.id.imgresult);
        for(int i =0; i<rbtn_list.length; i++){
            rbtns[i] = (RadioButton) findViewById(rbtn_list[i]);
            rbtns[i].setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View view) {
        for(int i =0; i<rbtn_list.length; i++){
            if(view.getId() == rbtn_list[i]){
                if(rbtns[i].isChecked()){
                    resultView.setImageResource(imgList[i]);
                    resulttxt.setText(i+1 + "번째 " + name_imgList[i] + " 아바타 저장됨"); // 어짜피 그룹으로 묶여있기 때문에 따로 할 필요는없을듯?
                }
            }
        }
    }
}
