package com.android.compoundwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    // 선언
    private RadioGroup rgpDirection = null;
    private RadioGroup rgpGravity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 찾기
        rgpDirection = findViewById(R.id.rgpDirection);
        rgpGravity = findViewById(R.id.rgpGravity);

        // 설정
        rgpDirection.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if( checkedId == R.id.RdoH) {
                    rgpDirection.setOrientation(LinearLayout.HORIZONTAL);
                }
                else if(checkedId == R.id.RdoV){
                    rgpDirection.setOrientation(LinearLayout.VERTICAL);
                }
            }
        });

        rgpGravity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.radioLeft){
                    rgpGravity.setGravity(Gravity.LEFT);
                }
                else if(checkedId == R.id.radioRight){
                    rgpGravity.setGravity(Gravity.RIGHT);
                }
                else if(checkedId == R.id.radioCenter){
                    rgpGravity.setGravity(Gravity.CENTER);
                }
            }
        });
    }
}
