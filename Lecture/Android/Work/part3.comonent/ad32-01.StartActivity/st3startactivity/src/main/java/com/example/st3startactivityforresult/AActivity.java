package com.example.st3startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AActivity extends AppCompatActivity {

    private EditText editText1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        editText1 = findViewById(R.id.editText1);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText1.getText().toString();

                Intent intent = new Intent(getApplicationContext(), BActivity.class);
                intent.putExtra("name", input);
                startActivity(intent);
            }
        });
    }
}
