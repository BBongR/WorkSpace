package com.android.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Double first = 0.0;
    Double end = 0.0;

    private EditText Edit1 = null;
    private EditText Edit2 = null;

    private Button BtnAdd = null;
    private Button BtnSub = null;
    private Button BtnMul = null;
    private Button BtnDiv = null;
    private Button BtnRem = null;

    private TextView TextResult = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edit1 = findViewById(R.id.Edit1);
        Edit2 = findViewById(R.id.Edit2);

        BtnAdd = findViewById(R.id.BtnAdd);
        BtnSub = findViewById(R.id.BtnSub);
        BtnMul = findViewById(R.id.BtnMul);
        BtnDiv = findViewById(R.id.BtnDiv);
        BtnRem = findViewById(R.id.BtnRem);

        TextResult = findViewById(R.id.TextResult);

        Innerclass inner = new Innerclass();

        BtnAdd.setOnClickListener(inner);
        BtnSub.setOnClickListener(inner);
        BtnMul.setOnClickListener(inner);
        BtnDiv.setOnClickListener(inner);
        BtnRem.setOnClickListener(inner);

    }

    private class Innerclass implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            first = Double.valueOf(Edit1.getText().toString());
            end = Double.valueOf(Edit2.getText().toString());
            String result = "";

            switch (view.getId()) {
                case R.id.BtnAdd:
                    result = String.valueOf(first + end);
                    TextResult.setText(result);
                    break;

                case R.id.BtnSub:
                    result = String.valueOf(first - end);
                    TextResult.setText(result);
                    break;

                case R.id.BtnMul:
                    result = String.valueOf(first * end);
                    TextResult.setText(result);
                    break;

                case R.id.BtnDiv:
                    if (end == 0) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌수 없습니다.", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        result = String.valueOf(first / end);
                        TextResult.setText(result);
                        break;
                    }

                case R.id.BtnRem:
                    result = String.valueOf(first % end);
                    TextResult.setText(result);
                    break;

                default:
                    Toast.makeText(getApplicationContext(), "숫자를 입력해라", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
