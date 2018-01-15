package com.example.st3startactivityforresult;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

public class BActivity extends AppCompatActivity {

    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        textView1 = findViewById(R.id.textView1);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView1.setText(name);
    }
}
