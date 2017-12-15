package com.android.scrollview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class AddButtonActivity extends AppCompatActivity {

    private int count = 1;
    private Button btnAdd;
    private LinearLayout scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_button);

        btnAdd = findViewById(R.id.btnAdd);
        scroll = findViewById(R.id.scroll);

        // 설정
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // step1. 추가되는 버튼에 대한 LayoutParam 설정. 뷰 영역 생성.
                // step2. 버튼 생성과 뷰영역 설정
                // step3. 생성된 버튼을 LinearLayout 에 추가. View.add() 한다 이용. (뷰클래스에 있는 애드메서드)

                // 1.
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

                // 마진 추가
                lp.setMargins(10, 10, 10, 10);

                // 2.
                Button btn = new Button(getApplicationContext());
                btn.setText(R.string.app_name);
                btn.setText("Push me " + count);
                btn.setLayoutParams(lp); //생성된 버튼의 뷰영역 설정
                btn.setBackgroundColor(Color.DKGRAY);

                // 3.
                scroll.addView(btn);
                count++;
            }
        });
    }
}
