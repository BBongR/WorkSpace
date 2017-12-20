package com.example.menuwidget;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

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

                // 로그인 처리
                if (edtID.getText().toString().trim().equals("111") && edtPW.getText().toString().trim().equals("111")) {

                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString(CommonCode.LOGIN_ID, edtID.getText().toString());
//                    editor.putString("LOGIN_PW", edtPW.getText().toString());
                    editor.putBoolean(CommonCode.LOGIN_STATUS, true);
                    editor.apply(); // 저장
                    // 결과 반환 코드 작성.
                    Intent data = new Intent();

                    // Intent 에 반환값 저장
                    data.putExtra(CommonCode.LOGIN_STATUS,true);

                    // 결과 반환
                    setResult(RESULT_OK, data);

                    // 실행되고 있는 activity(화면) 종료

                    finish();

                } else {
                    // 로그인 실패
                    Toast.makeText(getApplicationContext(), R.string.login_fail, Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Preference 객체 얻기. 파일이름은 settings.xml
        pref = getSharedPreferences(CommonCode.FILE_PREFERENCE, MODE_PRIVATE);
        String id = pref.getString(CommonCode.LOGIN_ID, "");
        String pw = pref.getString(CommonCode.LOGIN_PW, "");

        edtID.setText(id);
        edtPW.setText(pw);
    }
}
