package com.example.administrator.mainthread;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Handler handler;
    int mCount = 0;
    TextView mCountTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mCountTextView = (TextView) findViewById(R.id.textView1);

        // Handler
        // Thread
        // Runnable
        handler = new Handler(); // 실행 할 코드를 큐에 던진다

        Thread countThread = new Thread() {
            @Override
            public void run() {

                // ① 10초 동안 1씩 카운트한다.
                for (int i = 0; i < 10; i++) {

                    mCount++;

                    // ② 현재 카운트된 값을 로그로 출력한다.
                    Log.i("superdroid", "Current Count : " + mCount);

                    try {

                        Runnable message = new Runnable() {
                            @Override
                            public void run() {
                                // ③ 텍스트뷰에 현재까지 카운트된 수를 출력한다.
                                mCountTextView.setText("Count : " + mCount);
                            }
                        };

                        handler.post( message );
//                        mCountTextView.post( message) ;
//                        MainActivity.this.runOnUiThread( message );

                        // 1초동안 기다리기
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        countThread.start(); // Thread 시작

    }
}
