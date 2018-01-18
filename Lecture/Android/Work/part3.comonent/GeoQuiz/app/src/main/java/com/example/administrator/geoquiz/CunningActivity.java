package com.example.administrator.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class CunningActivity extends AppCompatActivity {

    public static final String EXTRA_ANSWER_CODE = "com.example.administrator.geoquiz.answer_code";

    private TextView txt_cunning;
    private Button btn_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cunning);

        btn_answer = findViewById(R.id.btn_answer);
        btn_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getIntent();
                boolean ansewr = i.getBooleanExtra(EXTRA_ANSWER_CODE, false);
                txt_cunning = findViewById(R.id.txt_cunning);
                txt_cunning.setText(String.valueOf(ansewr).toUpperCase());

                i.putExtra( EXTRA_ANSWER_CODE, true);
                setResult(RESULT_OK, i);
            }
        });
    }
}
