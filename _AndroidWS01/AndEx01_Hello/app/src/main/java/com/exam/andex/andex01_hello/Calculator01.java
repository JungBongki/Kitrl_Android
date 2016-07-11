package com.exam.andex.andex01_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator01 extends Activity implements View.OnClickListener {

    int btns[] = {R.id.bC, R.id.b1, R.id.b2, R.id.b3, R.id.b4, R.id.b5, R.id.b6, R.id.b7,
            R.id.b8, R.id.b9, R.id.b0, R.id.bPlus, R.id.bMinus, R.id.bMulti, R.id.bDiv,
            R.id.bEqual, R.id.bUndo, R.id.bPoint};

    Button btn[] = new Button[btns.length];
    private EditText editText;
    private Button finishButton;
    String op = "";
    String num1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator01);
        editText = (EditText)findViewById(R.id.resultView);
        for(int i=0; i<btn.length; i++) {
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }
        finishButton = (Button) findViewById(R.id.backButton);
        finishButton.setOnClickListener(this);
    }

    public void reset(){
        editText.setText("");
    }

    public void undo(){
        String bf_String = "";
        String af_String = "";

        bf_String = editText.getText().toString();
        af_String = bf_String.substring(0, bf_String.length() - 1);
        editText.setText(af_String);

    }

    public String calculate(double a, double b){
        double result = 0;
        if(op.equals("+")){
            result = a + b;
        } else if(op.equals("-")){
            result = a - b;
        } else if(op.equals("*")){
            result = a * b;
        } else if(op.equals("/")){
            result = a / b;
        }
        String value = String.valueOf(result);
        return value;
    }

    public void save_data(View view){
        num1 = editText.getText().toString();
        if(view.getId()==btns[11]){
            op = "+";
        } else if (view.getId()==btns[12]){
            op = "-";
        } else if(view.getId()==btns[13]){
            op = "*";
        } else if(view.getId()==btns[14]){
            op = "/";
        }
        editText.setText("");
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == btns[11] || view.getId() == btns[12] || view.getId() == btns[13] || view.getId() == btns[14]) {
            if (!editText.getText().toString().isEmpty()) { // 아무값도 없을때 사칙연산을하면 예외발생 ~> 예외처리
                save_data(view);
            }
        } else if (view.getId() == btns[0]) {
            reset();
        } else if (view.getId() == btns[16]) { // undo
            if (!editText.getText().toString().isEmpty()) { // 아무값도 없을때 뒤로가기하면 예외발생 ~> 예외처리
                undo();
            }
        } else if (view.getId() == btns[15]) { // 등호
            if (!editText.getText().toString().isEmpty()) { // 아무값도 없을때 사칙연산을하면 예외발생 ~> 예외처리
                String result = calculate(Double.parseDouble(num1), Double.parseDouble(editText.getText().toString()));
                editText.setText(result);
            }
        } else if (view.getId() == R.id.backButton) {
            finish();
        } else { // 나머지
            for (int i = 0; i < btn.length; i++) {
                if (view.getId() == btns[i]) {
                    editText.setText(editText.getText() + btn[i].getText().toString());
                }
            }
        }
    }
}