package com.android.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtFirst = null;
    private EditText edtEnd = null;

    private Button btnAdd = null;
    private Button btnSub = null;
    private Button btnMul = null;
    private Button btnDiv = null;
    private Button btnRem = null;

    private TextView txtResult = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirst = findViewById(R.id.edtFirst);
        edtEnd = findViewById(R.id.edtEnd);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnRem = findViewById(R.id.btnRem);

        txtResult = findViewById(R.id.txtResult);

        calculator cal = new calculator();
        btnAdd.setOnClickListener(cal);
        btnSub.setOnClickListener(cal);
        btnMul.setOnClickListener(cal);
        btnDiv.setOnClickListener(cal);
        btnRem.setOnClickListener(cal);

        setTitle(R.string.title);
    }

    private class calculator implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            Double first = null;
            Double end = null;
            String result = "";
            int id = view.getId();

            if (!(edtFirst.getText().toString().equals("") || edtEnd.getText().toString().equals(""))) {
                first = Double.valueOf(edtFirst.getText().toString());
                end = Double.valueOf(edtEnd.getText().toString());
            }

            if (first == null || end == null) {
                Toast.makeText(getApplicationContext(), "두 값을 입력하세요", Toast.LENGTH_SHORT).show();
                return;
            }

            switch (id) {
                case R.id.btnAdd:
                    result = String.valueOf(first + end);
                    txtResult.setText(result);
                    break;

                case R.id.btnSub:
                    result = String.valueOf(first - end);
                    txtResult.setText(result);
                    break;
                case R.id.btnMul:
                    result = String.valueOf(first * end);
                    txtResult.setText(result);
                    break;
                case R.id.btnDiv:
                    if (end == 0) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌수 없습니다.", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        result = String.valueOf(first / end);
                        txtResult.setText(result);
                        break;
                    }
                case R.id.btnRem:
                    result = String.valueOf(first % end);
                    txtResult.setText(result);
                    break;
            }
        }
    }
}
