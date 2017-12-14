package com.android.calc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String text = "";
    String temp = "";
    String r = "";

    Calc c = new Calc();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnEqual = findViewById(R.id.btnEqual);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnAc = findViewById(R.id.btnAc);
        Button btnC = findViewById(R.id.btnC);
        Button btnPoint = findViewById(R.id.btnPoint);

        BtnInner b = new BtnInner();
        btn0.setOnClickListener(b);
        btn1.setOnClickListener(b);
        btn2.setOnClickListener(b);
        btn3.setOnClickListener(b);
        btn4.setOnClickListener(b);
        btn5.setOnClickListener(b);
        btn6.setOnClickListener(b);
        btn7.setOnClickListener(b);
        btn8.setOnClickListener(b);
        btn9.setOnClickListener(b);
        btnEqual.setOnClickListener(b);
        btnPlus.setOnClickListener(b);
        btnSub.setOnClickListener(b);
        btnMul.setOnClickListener(b);
        btnDiv.setOnClickListener(b);
        btnAc.setOnClickListener(b);
        btnC.setOnClickListener(b);
        btnPoint.setOnClickListener(b);

    }

    private class BtnInner implements Button.OnClickListener {

        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.btn0:
                    text += "0";
                    temp += "0";
                    textView.setText(text);
                    break;

                case R.id.btn1:
                    text += "1";
                    temp += "1";
                    textView.setText(text);
                    break;

                case R.id.btn2:
                    text += "2";
                    temp += "2";
                    textView.setText(text);
                    break;

                case R.id.btn3:
                    text += "3";
                    temp += "3";
                    textView.setText(text);
                    break;

                case R.id.btn4:
                    text += "4";
                    temp += "4";
                    textView.setText(text);
                    break;

                case R.id.btn5:
                    text += "5";
                    temp += "5";
                    textView.setText(text);
                    break;

                case R.id.btn6:
                    text += "6";
                    temp += "6";
                    textView.setText(text);
                    break;

                case R.id.btn7:
                    text += "7";
                    temp += "7";
                    textView.setText(text);
                    break;

                case R.id.btn8:
                    text += "8";
                    temp += "8";
                    textView.setText(text);
                    break;

                case R.id.btn9:
                    text += "9";
                    temp += "9";
                    textView.setText(text);
                    break;

                case R.id.btnEqual:
                    if (!c.bracketsBalance(temp)) {
                        System.out.println("괄호를 정확히 하세요~");
                        System.exit(1);
                    }

                    // 중위 표기법을 후위 표기법으로 바꾸기
                    String postfixExp = c.postfix(temp);
                    System.out.println("후위 표기법 : " + postfixExp);

                    // 후위 표기법을 이용하여 수식 계산
                    Double result = c.result(postfixExp);
                    r = String.valueOf(result);

                case R.id.btnPlus:
                    text += "+";
                    textView.setText(text);
                    break;

                case R.id.btnSub:
                    text += "-";
                    textView.setText(text);
                    break;

                case R.id.btnMul:
                    text += "×";
                    textView.setText(text);
                    break;

                case R.id.btnDiv:
                    text += "÷";
                    textView.setText(text);
                    break;

                case R.id.btnAc:
                    text = "";
                    textView.setText(text);
                    break;

                case R.id.btnC:
                    if (text.length() < 1) {
                        break;
                    }
                    text = text.substring(0, text.length() - 1);
                    textView.setText(text);
                    break;

                case R.id.btnPoint:
                   break;
            }
        }
    }
}
