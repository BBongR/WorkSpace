package com.example.menuwidget;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    // 위젯 선언
    private Button btnLogin;
    private EditText edtID;
    private EditText edtPW;
    private SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 위젯 찾기
        btnLogin = findViewById(R.id.btnLogin);
        edtID = findViewById(R.id.edtID);
        edtPW = findViewById(R.id.edtPW);

        // 위젯 설정
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = pref.edit();

                editor.putString("ID",edtID.getText().toString());
                editor.putString("PW",edtPW.getText().toString());
                editor.apply();
            }
        });

        pref = getSharedPreferences("setting",MODE_PRIVATE);
        String id = pref.getString("ID","");
        String pw = pref.getString("PW","");

        edtID.setText(id);
        edtPW.setText(pw);
    }
}
