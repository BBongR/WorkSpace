package com.android.scrollview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class AddButton5Activity extends AppCompatActivity {

    private Button btn_one;
    private Button btn_five;
    private LinearLayout sub;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_button5);

        btn_one = findViewById(R.id.btn_one);
        btn_five = findViewById(R.id.btn_five);
        sub = findViewById(R.id.sub);

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(10, 10, 10, 10);

                btnClick(lp);
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(10, 10, 10, 10);


                Button btn = null;
                for (int i = 0; i < 5; i++) {
                    btnClick(lp);
                }

            }
        });
    }

    private void btnClick(LinearLayout.LayoutParams lp) {
        Button btn;
        btn = new Button(getApplicationContext());
        btn.setText("button5" + count);
        btn.setLayoutParams(lp);
        btn.setBackgroundColor(Color.BLUE);
        sub.addView(btn);
        count++;
    }
}
