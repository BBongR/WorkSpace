package com.example.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 1. 선언
    TextView textView;
    EditText editText;
    Button button_add;
    ListView listView;
    String[] items;
    ArrayAdapter adapter;
    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. 찾기
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button_add = findViewById(R.id.button_add);
        listView = findViewById(R.id.listView);

        // 3. 위젯 리스너 설정
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();

                if (!(TextUtils.isEmpty(text))) {
                    // 데이터 추가
                    list.add(text);
                    adapter.notifyDataSetChanged(); // ListView 새로고침 통보
                    listView.smoothScrollToPosition(list.size() - 1); // ListView 위치를 마지막 데이터로 이동
                }
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = ((TextView) view).getText().toString();
                textView.setText(selectedItem);
            }
        });

        // 4.데이터 만들기
        items = getResources().getStringArray(R.array.items);
        list = new ArrayList<String>(Arrays.asList(items));  // 배열을 리스트로 변환

        // 5.어댑터 생성 & 6. 데이터 추가
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, list);

        // 7. 어댑터 연결
//        adapter.addAll(list); // 배열일때
        listView.setAdapter(adapter);
    }
}
