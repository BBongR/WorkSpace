package com.example.st4startactivityforeresult;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1004;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = findViewById(R.id.btnBack);

//        StringBuilder sb = new StringBuilder();
//        sb.append("p1: " + p1);
//        sb.append("\n");
//        sb.append("p2: " + p2);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int p1 = intent.getIntExtra("p1", 0);
                int p2 = intent.getIntExtra("p2", 0);

                int result = p1 + p2;
                intent.putExtra("result",result);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
