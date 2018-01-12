package com.example.countdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private Thread thread;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById( R.id.textView1 );

        thread = new Thread() {

            @Override
            public void run() {
                for ( int i = 20; i >= 0; i-- ) {
                    count = i;
                    // main thread 로 보낼 message 작성
                    // message 작성 방법
                    // 1. Runnable 를 이용 하는 방법 : 실행 코드를 전달 할 때
                    // 2. Handler 를 이용 하는 방법 : 문자열이나 값을 전달 할 때

                    Runnable message = new Runnable() {
                        @Override
                        public void run() {
                            textView1.setText( count +"" );
                        }
                    };

                    // work thread 에서 main thread 로 메세지 발송
                    MainActivity.this.runOnUiThread( message );

                    // time delay : 1초 동안
                    try {
                        Thread.sleep( 1000 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start(); // work thread 작동 시작
    }
}
