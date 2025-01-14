package com.android.myparcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Intent passedIntent = getIntent();
        processIntent(passedIntent);
    }

    private void processIntent(Intent intent) {
        if (intent != null) {
            ArrayList<String> names = (ArrayList<String>) intent.getSerializableExtra("names");
            if (intent != null){
                Toast.makeText(getApplicationContext(), "전달받은 이름 리스트 갯수: " + names.size(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
