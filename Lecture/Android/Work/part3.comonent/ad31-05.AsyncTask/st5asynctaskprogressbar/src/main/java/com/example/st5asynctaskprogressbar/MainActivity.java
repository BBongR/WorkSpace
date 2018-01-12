package com.example.st5asynctaskprogressbar;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar1;
    private Button btnInc, btnDec, button1;
    private TextView tvSeek, tv1, tv2;
    private SeekBar seekBar1, pb1, pb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar1 = findViewById(R.id.progressBar1);
        btnInc = findViewById(R.id.btnInc);
        btnDec = findViewById(R.id.btnDec);
        button1 = findViewById(R.id.button1);
        tvSeek = findViewById(R.id.tvSeek);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        seekBar1 = findViewById(R.id.seekBar1);
        pb1 = findViewById(R.id.pb1);
        pb2 = findViewById(R.id.pb2);

        ButtonListener btnListener = new ButtonListener();
        btnInc.setOnClickListener(btnListener);
        btnDec.setOnClickListener(btnListener);
        button1.setOnClickListener(btnListener);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSeek.setText("진행률 " + progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private class ProgressTask extends AsyncTask<Integer, Integer, Boolean> {

        ProgressDialog pldg;

        @Override
        protected void onPreExecute() {
            pldg = new ProgressDialog(MainActivity.this);
            pldg.setMessage("처리중");
            pldg.getWindow().setGravity(Gravity.TOP);
            pldg.show();
        }

        @Override
        protected Boolean doInBackground(Integer... integers) {

            int i = pb1.getProgress();
            int j = pb2.getProgress();
            for (; i <= pb1.getMax(); i = i + integers[0]) {
                for (; j <= pb2.getMax(); j = j + integers[1]) {
                    publishProgress(integers[0], integers[1]);

                    // 1초 딜레이
                    SystemClock.sleep(100);
                }
            }
            return true;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            pb1.setProgress(pb1.getProgress() + values[0]);
            tv1.setText("1번 진행률: " + pb1.getProgress() + "");
            pb2.setProgress(pb2.getProgress() + values[1]);
            tv2.setText("2번 진행률: " + pb2.getProgress() + "");
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            if (pldg != null) {
                pldg.dismiss();
                pldg = null;
            }
        }
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                // 1
                case R.id.btnInc:

                    progressBar1.incrementProgressBy(10);

                    break;

                // 1
                case R.id.btnDec:

                    progressBar1.incrementProgressBy(-10);

                    break;

                // 3
                case R.id.button1:

                    new ProgressTask().execute(2, 1);

                    break;
            }
        }
    }

}
