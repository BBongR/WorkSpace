package com.example.inflation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 위젯 선언
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private LinearLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯 찾기
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent = findViewById(R.id.container);
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

                // inflater.inflate(R.layout.layout_sub1) == inflater.inflate(R.layout.layout_sub1,parent,true)
                // 인자 2개 짜리는 3개짜리의 위와 같음
                inflater.inflate(R.layout.layout_sub1, parent, true);

                // checkbox 찾기
                CheckBox chk = parent.findViewById(R.id.checkBox);
                chk.setText("getSystemService infation 완료");

                // 버튼 찾기
                Button btn = findViewById(R.id.button);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TextView textView = findViewById(R.id.textView);
                        TextView textView = parent.findViewById(R.id.textView);

                        textView.setText("btn 눌림");
                    }
                });
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent = findViewById(R.id.container);
                LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_sub1, parent, true);

                CheckBox chk = parent.findViewById(R.id.checkBox);
                chk.setText("LayoutInflater infation 완료");

                Button btn = findViewById(R.id.button);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TextView textView = findViewById(R.id.textView);
                        TextView textView = parent.findViewById(R.id.textView);

                        textView.setText("btn 눌림");
                    }
                });
            }
        });


        // btn2와 같은 기능이지만
        // btn3은 버튼을 눌렀을때 계속 생김
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent = findViewById(R.id.container);
                View child = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_sub1, null); // parent를 뺀다. 부모가 없어지므로 새 레이아웃으로 추가한다.
//                LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_sub1, parent, true);    btn2와 차이점

                parent.addView(child); // 추가 (btn2와 차이점)

                CheckBox chk = parent.findViewById(R.id.checkBox);
                chk.setText("LayoutInflater infation 완료");

                Button btn = findViewById(R.id.button);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TextView textView = findViewById(R.id.textView);
                        TextView textView = parent.findViewById(R.id.textView);

                        textView.setText("btn 눌림");
                    }
                });
            }
        });
    }
}