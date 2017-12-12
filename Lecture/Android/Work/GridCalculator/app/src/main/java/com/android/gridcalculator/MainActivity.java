package com.android.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_Div;
    private Button btn_Mul;
    private Button btn_Sub;
    private Button btn_Plus;
    private Button btn_Equal;
    private Button btn_Ac;
    private Button btn_C;

    private String text = "";
    private String result = "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_Div = findViewById(R.id.btn_Div);
        btn_Mul = findViewById(R.id.btn_Mul);
        btn_Sub = findViewById(R.id.btn_Sub);
        btn_Plus = findViewById(R.id.btn_Plus);
        btn_Equal = findViewById(R.id.btn_Equal);
        btn_Ac = findViewById(R.id.btn_Ac);
        btn_C = findViewById(R.id.btn_C);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "0";
                textView.setText(text);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "1";
                textView.setText(text);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "2";
                textView.setText(text);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "3";
                textView.setText(text);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "4";
                textView.setText(text);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "5";
                textView.setText(text);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "6";
                textView.setText(text);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "7";
                textView.setText(text);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "8";
                textView.setText(text);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "9";
                textView.setText(text);
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "÷";
                textView.setText(text);
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "×";
                textView.setText(text);
            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "-";
                textView.setText(text);
            }
        });

        btn_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += "+";
                textView.setText(text);
            }
        });

        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = text;
                textView.setText(result);
            }
        });

        btn_Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.length() > 0) {
                    text = text.substring(0, text.length() - 1);
                    textView.setText(text);
                }
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = "";
                textView.setText(text);
            }
        });
    }
}
