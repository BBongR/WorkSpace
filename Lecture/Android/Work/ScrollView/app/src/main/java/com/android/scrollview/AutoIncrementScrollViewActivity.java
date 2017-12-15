package com.android.scrollview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class AutoIncrementScrollViewActivity extends AppCompatActivity {

    // 선언.
    private ScrollView scroll;
    private LinearLayout layout;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_increment_scroll_view);

        // 찾기.
        scroll = findViewById(R.id.scroll);
        layout = findViewById(R.id.layout);


        // 설정 ScrollView.OnScrollChangedListener 핸들러 작성.
        scroll.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {
                if (layout.getHeight() == scroll.getScrollY() + scroll.getHeight()) {

                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                    lp.setMargins(10, 10, 10, 10);

                    Button btn = new Button(getApplicationContext());
                    btn.setText("button" + count);
                    btn.setLayoutParams(lp);
                    btn.setBackgroundColor(Color.BLACK);
                    layout.addView(btn);
                    count++;
                }
            }
        });

    }
}
