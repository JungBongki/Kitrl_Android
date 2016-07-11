package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-11.
 */
public class OutlineV01 extends Activity implements View.OnClickListener {

    int select[] = {R.id.gugudanSelect, R.id.calculateSelect, R.id.imageChangeSelect,
            R.id.TaroSelect, R.id.GawiBawiBoSelect};

    Button buttons[] = new Button[select.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outlinev01);

        for(int i =0; i<select.length; i++){
            buttons[i] = (Button) findViewById(select[i]);
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        for(int i=0; i<select.length; i++){
            if(view.getId() == select[i]){
                switch (i) {
                    case 0:
                        Intent intent1 = new Intent(getApplicationContext(), GUGUDan01.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(getApplicationContext(), Calculator01.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(getApplicationContext(), ImageViewEx02.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(getApplicationContext(), TarotV01.class);
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(getApplicationContext(), GaWiBaWiBoV01.class);
                        startActivity(intent5);
                        break;
                    default:
                        Toast.makeText(this, "경로확인 요망", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        }
    }
}
