package com.android.senddata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 1. 위젯 선언
    private EditText edt_name = null;
    private Button btn_send = null;
    private TextView txt_msg = null;

    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. 위젯 찾기
        edt_name = findViewById(R.id.edt_name);
        btn_send = findViewById(R.id.btn_send);
        txt_msg = findViewById(R.id.txt_msg);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);

        // 3. 위젯 핸들러 설정
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 1.edt_name 에서 값을 가져오기
                String tmp = edt_name.getText().toString();

                // 2. txtMsg 에 값을 가져오기
                txt_msg.setText(tmp);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
