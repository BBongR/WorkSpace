package com.example.administrator.serialization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        BtnListener btnListener = new BtnListener();
        btn1.setOnClickListener(btnListener);
        btn2.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
        btn4.setOnClickListener(btnListener);
        btn5.setOnClickListener(btnListener);
    }

    private class BtnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(getApplicationContext(), SubActivity.class);

            switch (v.getId()) {
                case R.id.btn1:
                    // 기본 타입을 이용한 데이터 전달
                    i.putExtra("data", "test");
                    break;

                case R.id.btn2:
                    // 배열을 이용한 데이터 전달
                    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
                    i.putExtra("data", array);
                    break;

                case R.id.btn3:
                    // serializable 을 이용한 데이터 전달
                    ModelSerial modelSerial = new ModelSerial(10, "serial");
                    i.putExtra("serial", modelSerial);
                    break;

                case R.id.btn4:
                    // parcelable 을 이용한 데이터 전달
                    break;

                case R.id.btn5:
                    // bundle 을 이용한 데이터 전달
                    break;
            }
            startActivity(i);
        }
    }
}
