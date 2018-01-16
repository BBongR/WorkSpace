package com.example.administrator.serialization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        textView1 = findViewById(R.id.textView1);

        // main 액티비티에서 intent 받기
        Intent i = getIntent();
        String d1 = i.getStringExtra("data");
        if (d1 != null && !d1.isEmpty()) {
            textView1.setText(textView1.getText() + d1 + "\n");
        }

        int[] array = i.getIntArrayExtra("data");
        if (array != null) {
            for (int j = 0; j < array.length; j++) {
                textView1.setText(textView1.getText() + String.valueOf(array[j]));
            }
        }

        ModelSerial s1 = (ModelSerial) i.getSerializableExtra("serial");
        if (s1 != null) {
            textView1.setText(textView1.getText() + s1.toString());
        }
    }
}
