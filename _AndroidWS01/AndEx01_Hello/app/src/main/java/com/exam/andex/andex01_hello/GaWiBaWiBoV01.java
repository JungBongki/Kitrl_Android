package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-08.
 */
public class GaWiBaWiBoV01 extends Activity implements View.OnClickListener {

    int gbbs[] = {R.id.gawi, R.id.bawi, R.id.bow};
    int gbb[] = {R.drawable.gawi, R.drawable.bawi, R.drawable.bow};
    ImageView gbb_cnt[] = new ImageView[gbbs.length];

    int youCont, comCont;
    int chkWin = 0;
    int select_num;
    int num = UserObj.getRandom(gbbs.length) - 1;
    String whoWin = "";

    private ImageView computer, user;
    private TextView result_com, result_user, result_view;
    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gawibawibov01);

        computer = (ImageView) findViewById(R.id.computer);
        user = (ImageView) findViewById(R.id.user);
        result_com = (TextView) findViewById(R.id.score_computer);
        result_user = (TextView) findViewById(R.id.score_user);
        result_view = (TextView) findViewById(R.id.gbbResultView);
        finishButton = (Button) findViewById(R.id.backButton);
        finishButton.setOnClickListener(this);
        for (int i = 0; i < gbbs.length; i++) {
            gbb_cnt[i] = (ImageView) findViewById(gbbs[i]);
            gbb_cnt[i].setOnClickListener(this);
        }


    }

    @Override
    public void onClick(View view) {
        boolean flag = true;
        if(view.getId() == R.id.backButton){
            finish();
            flag = false;
        }
        if(flag) {
            for (int i = 0; i < gbbs.length; i++) {
                if (view.getId() == gbbs[i]) {
                    user.setImageResource(gbb[i]);
                    select_num = i;
                }
            }
            computer.setImageResource(gbb[num]);
            gbbCompare(num, select_num);
            result_com.setText(String.valueOf(comCont));
            result_user.setText(String.valueOf(youCont));

            num = UserObj.getRandom(gbbs.length) - 1;

            if (chkWin == 1) { //compare에 합쳐볼것 (flag둬서)
                whoWin = "나의 승";
            } else if (chkWin == 2) {
                whoWin = "컴퓨터 승";
            } else {
                whoWin = "무승부";
            }
            chkWin = 0;
            result_view.setText(whoWin);
        }
    }

    public void gbbstop(View view) {

    }

    public void gbbresult(View view) {
        if(comCont > youCont){
            whoWin = "컴퓨터 승";
        } else if (comCont < youCont){
            whoWin = "사용자 승";
        } else {
            whoWin = "무승부";
        }
        String msg = "컴퓨터 : " + comCont + " 사용자 : " + youCont + " ~~> " + whoWin + " 입니다.";
        result_view.setText(msg);
    }

    private void gbbCompare(int comId, int userId) {
        if(((comId == 0) && (userId == 1)) || ((comId==1) && (userId==2)) || ((comId == 2) && (userId == 0))) { //이겼을경우
            youCont++;
            chkWin = 1;
        } else if (((comId == 0) && (userId == 2)) || ((comId==2) && (userId==1)) || ((comId == 1) && (userId == 0))){ // 졌을경우
            comCont++;
            chkWin = 2;
        } else {
            youCont++;
            comCont++;
            chkWin = 3;
        }
    }
}
