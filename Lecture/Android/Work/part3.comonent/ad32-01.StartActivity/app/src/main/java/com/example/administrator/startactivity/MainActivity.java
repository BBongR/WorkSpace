package com.example.administrator.startactivity;

import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        ButtonListener bListener = new ButtonListener();
        btn1.setOnClickListener(bListener);
        btn2.setOnClickListener(bListener);
        btn3.setOnClickListener(bListener);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            Intent intent = null;

            switch (v.getId()) {
                case R.id.btn1:
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("val","1");
                    startActivity(intent);
                    break;

                case R.id.btn2:
                    intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("val","2");
                    startActivity(intent);
                    break;

                case R.id.btn3:
                    ComponentName componentName = new ComponentName("com.example.administrator.startactivity",
                                                                    "com.example.administrator.startactivity.SecondActivity");
                    intent = new Intent();
                    intent.setComponent(componentName);
                    intent.putExtra("val","3");
                    startActivity(intent);
                    break;
            }
        }
    }
}
