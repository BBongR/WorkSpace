package com.example.administrator.asynctask;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
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
                    new BarAsyncTask().execute(pb1.getProgress(), pb2.getProgress());
                    button1.setClickable(false);

                    break;
            }
        }
    }

    // 3
    private class BarAsyncTask extends AsyncTask<Integer, Integer, Boolean> {

        @Override
        protected Boolean doInBackground(Integer... integers) {
            for (int i = pb1.getProgress(), j = pb2.getProgress(); i <= pb1.getMax() || j <= pb2.getMax(); i = i + 2, j = j + 1) {

                if (i > 100) i = 100;
                if (j > 100) j = 100;
                publishProgress(i, j);

                SystemClock.sleep(200);
            }
            return true;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            pb1.setProgress(values[0]);
            tv1.setText("1번 진행률: " + values[0] + " %");
            pb2.setProgress(values[1]);
            tv2.setText("2번 진행률: " + values[1] + " %");
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
        }
    }
}
