package com.android.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String text = "";
    String r = "";
    TextView textView;
    Calc c = new Calc();
    String text2 = ""; // 텍스트를 리플레이스 한 값
    String tmp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        Button btn_0 = findViewById(R.id.btn_0);
        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);

        Button btn_Point = findViewById(R.id.btn_Point);
        Button btn_Equal = findViewById(R.id.btn_Equal);

        Button btn_Plus = findViewById(R.id.btn_Plus);
        Button btn_Sub = findViewById(R.id.btn_Sub);
        Button btn_Mul = findViewById(R.id.btn_Mul);
        Button btn_Div = findViewById(R.id.btn_Div);

        Button btn_Ac = findViewById(R.id.btn_Ac);
        Button btn_C = findViewById(R.id.btn_C);

        Btninner btninner = new Btninner();
        btn_0.setOnClickListener(btninner);
        btn_1.setOnClickListener(btninner);
        btn_2.setOnClickListener(btninner);
        btn_3.setOnClickListener(btninner);
        btn_4.setOnClickListener(btninner);
        btn_5.setOnClickListener(btninner);
        btn_6.setOnClickListener(btninner);
        btn_7.setOnClickListener(btninner);
        btn_8.setOnClickListener(btninner);
        btn_9.setOnClickListener(btninner);

        btn_Point.setOnClickListener(btninner);
        btn_Equal.setOnClickListener(btninner);

        btn_Plus.setOnClickListener(btninner);
        btn_Sub.setOnClickListener(btninner);
        btn_Mul.setOnClickListener(btninner);
        btn_Div.setOnClickListener(btninner);

        btn_Ac.setOnClickListener(btninner);
        btn_C.setOnClickListener(btninner);
    }

    private class Btninner implements Button.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_0:
                    text += "0";
                    tmp += "0";
                    textView.setText(text); // 00

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("00")) {
                        tmp = "0";
                        text = text.substring(0, text.length() - 2); // 00
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_1:
                    text += "1";
                    tmp += "1";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("01")) {
                        tmp = "1";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_2:
                    text += "2";
                    tmp += "2";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("02")) {
                        tmp = "2";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_3:
                    text += "3";
                    tmp += "3";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("03")) {
                        tmp = "3";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_4:
                    text += "4";
                    tmp += "4";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("04")) {
                        tmp = "4";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_5:
                    text += "5";
                    tmp += "5";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("05")) {
                        tmp = "5";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_6:
                    text += "6";
                    tmp += "6";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("06")) {
                        tmp = "6";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_7:
                    text += "7";
                    tmp += "7";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("07")) {
                        tmp = "7";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_8:
                    text += "8";
                    tmp += "8";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("08")) {
                        tmp = "8";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_9:
                    text += "9";
                    tmp += "9";
                    textView.setText(text);

                    if (tmp.length() > 1 && tmp.substring(0, 2).equals("09")) {
                        tmp = "9";
                        text = text.substring(0, text.length() - 2);
                        text = text + tmp;
                        textView.setText(text);
                    }
                    break;

                case R.id.btn_Point:
                    if(tmp.equals("")){
                        break;
                    }

                    if(tmp.contains(".")){
                        break;
                    }

                    text += ".";
                    tmp += ".";
                    textView.setText(text);
                    break;

                case R.id.btn_Equal:
                    if (!((text.contains("+")) || (text.contains("-")) || (text.contains("×")) || (text.contains("÷"))) && !(text.charAt(text.length() - 1) == '.')) {
                    break;
                }

                if (text.equals("")) {
                    break;
                }

                if ((text.charAt(text.length() - 1) == '×') || (text.charAt(text.length() - 1) == '÷') || (text.charAt(text.length() - 1) == '+') || (text.charAt(text.length() - 1) == '-') || (text.charAt(text.length() - 1) == '.')) {
                    Toast.makeText(getApplicationContext(), "식은 숫자로 끝나야 합니다", Toast.LENGTH_SHORT).show();
                    break;
                }

                if (!c.bracketsBalance(text)) {
                    break;
                }

                text2 = text.replace("×", "*");
                text2 = text2.replace("÷", "/");

                // 중위 표기법을 후위 표기법으로 바꾸기
                String postfixExp = c.postfix(text2);

                // 후위 표기법을 이용하여 수식 계산
                Double result = c.result(postfixExp);
                r = String.valueOf(result);

                text = text + "=" + r;
                textView.setText(text);
                text = "";
                break;

                case R.id.btn_Plus:
                    if (text.equals("")) {
                        break;
                    }

                    if ((text.charAt(text.length() - 1) == '×') || (text.charAt(text.length() - 1) == '÷') || (text.charAt(text.length() - 1) == '+') || (text.charAt(text.length() - 1) == '-')) {
                        text = text.substring(0, text.length() - 1);
                    }
                    text += "+";
                    textView.setText(text);
                    tmp = "";
                    break;

                case R.id.btn_Sub:
                    if (text.equals("")) {
                        break;
                    }

                    if ((text.charAt(text.length() - 1) == '×') || (text.charAt(text.length() - 1) == '÷') || (text.charAt(text.length() - 1) == '+') || (text.charAt(text.length() - 1) == '-')) {
                        text = text.substring(0, text.length() - 1);
                    }
                    text += "-";
                    textView.setText(text);
                    tmp = "";
                    break;

                case R.id.btn_Mul:
                    if (text.equals("")) {
                        break;
                    }

                    if ((text.charAt(text.length() - 1) == '×') || (text.charAt(text.length() - 1) == '÷') || (text.charAt(text.length() - 1) == '+') || (text.charAt(text.length() - 1) == '-')) {
                        text = text.substring(0, text.length() - 1);
                    }
                    text += "×";
                    textView.setText(text);
                    tmp = "";
                    break;

                case R.id.btn_Div:
                    if (text.equals("")) {
                        break;
                    }

                    if ((text.charAt(text.length() - 1) == '×') || (text.charAt(text.length() - 1) == '÷') || (text.charAt(text.length() - 1) == '+') || (text.charAt(text.length() - 1) == '-')) {
                        text = text.substring(0, text.length() - 1);
                    }
                    text += "÷";
                    textView.setText(text);
                    tmp = "";
                    break;

                case R.id.btn_Ac:
                    text = "";
                    tmp = "";
                    textView.setText(text);
                    break;

                case R.id.btn_C:
                    if (text.length() > 0) {
                        text = text.substring(0, text.length() - 1);
                        textView.setText(text);
                    }
                    break;
            }
        }
    }
}

