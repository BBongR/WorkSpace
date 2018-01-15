package com.example.st2intro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // 3초 동안 기다렸다 실행하라
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                IntroActivity.this.finish();
            }
        };
        handler.postDelayed(runnable, 3000);

//        new IntentTask().execute();
    }

//    private class IntentTask extends AsyncTask {
//        @Override
//        protected Object doInBackground(Object[] objects) {
//            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//            SystemClock.sleep(3000);
//            startActivity(intent);
//            return true;
//        }
//    }
}
