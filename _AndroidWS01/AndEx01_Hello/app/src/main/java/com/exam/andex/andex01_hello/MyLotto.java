package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016-07-14.
 */
public class MyLotto extends Activity{

    int id_img[] = {R.drawable.b01, R.drawable.b02, R.drawable.b03, R.drawable.b04, R.drawable.b05, R.drawable.b06, R.drawable.b07, R.drawable.b08, R.drawable.b09, R.drawable.b10,
            R.drawable.b11, R.drawable.b12, R.drawable.b13, R.drawable.b14, R.drawable.b15, R.drawable.b16, R.drawable.b17, R.drawable.b18, R.drawable.b19, R.drawable.b20,
            R.drawable.b21, R.drawable.b22, R.drawable.b23, R.drawable.b24, R.drawable.b25, R.drawable.b26, R.drawable.b27, R.drawable.b28, R.drawable.b29, R.drawable.b30,
            R.drawable.b31, R.drawable.b32, R.drawable.b33, R.drawable.b34, R.drawable.b35, R.drawable.b36, R.drawable.b37, R.drawable.b38, R.drawable.b39, R.drawable.b40,
            R.drawable.b41, R.drawable.b42, R.drawable.b43, R.drawable.b44, R.drawable.b45};

    int img_view[] = {R.id.first_num, R.id.secand_num, R.id.third_num, R.id.fourth_num, R.id.fiveth_num, R.id.sixth_num, R.id.bonus_num};
    ImageView img_button[] = new ImageView[img_view.length];
    int random[]= new int[img_view.length];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylotto);

        for(int i=0; i<img_view.length; i++){
            img_button[i] = (ImageView) findViewById(img_view[i]);
        }

    }


    public void imgClick(View v){
        for(int i=0; i<random.length; i++){
            int random_num = UserObj.getRandom(45) - 1; // 번호할당
            random[i] = random_num; // 번호 배열에 저장
            if(i >= 1){
                for(int j=0; j<i; j++){
                    if(random[j] == random[i]){
                        random[i] = 0;
                        i--; // 재배치
                    }
                }
            }
        }
        for(int i=0; i<random.length; i++){
            img_button[i].setImageResource(id_img[random[i]]);
        }

    }
    public void back(View v){
        finish();
    }
}
