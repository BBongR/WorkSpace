package com.example.administrator.countup;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);

        new CounterTask().execute(20);

    }

    private class CounterTask extends AsyncTask<Integer, Integer, Boolean> {

        ProgressDialog pdlg;

        @Override
        protected void onPreExecute() {
            pdlg = new ProgressDialog(MainActivity.this);
            pdlg.setMessage("처리중");
            pdlg.getWindow().setGravity(Gravity.TOP);
            pdlg.show();
        }

        @Override
        protected Boolean doInBackground(Integer... integers) {
            int count = 0;
            for (int i = 0; i < integers[0]; i++) {
                publishProgress(count++);

                // 1초 딜레이
                SystemClock.sleep(1000);
            }
            return true;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            textView1.setText(values[0] + "");
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            if (pdlg != null) {
                pdlg.dismiss();
                pdlg = null;
            }
        }
    }
}
