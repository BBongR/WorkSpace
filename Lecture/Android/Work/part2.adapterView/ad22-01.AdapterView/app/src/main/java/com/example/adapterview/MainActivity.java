package com.example.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 위젯 선언
    private TextView textView1;
    private Spinner spinner1;
    private AutoCompleteTextView autocomplete1;
    private ListView listView1;
    private String[] items = {"1", "2", "3", "4", "5"};
    private String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯 찾기
        textView1 = findViewById(R.id.textview1);
        spinner1 = findViewById(R.id.spinner1);
        autocomplete1 = findViewById(R.id.autocomplete1);
        listView1 = findViewById(R.id.listview1);

        // adapter 생성
        ArrayAdapter<String> adapterSpinner = new ArrayAdapter<String>(MainActivity.this
                , android.R.layout.simple_spinner_item
                , items);
        // spinner 와 adapter 연결
        spinner1.setAdapter(adapterSpinner);
        // spinner 리스너 설정
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // position : 현재 선택된 배열의 방번호.
                String selecteditem = items[position];
                textView1.setText(selecteditem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        AutoCompleteTextView 와 adapter 연동
//        1. 데이터 만들기
//        2. adapter 생성
//        3. AutoCompleteTextView 와 adapter 연결
//        4. 리스너 설정
        ArrayAdapter<String> adapterMonth = new ArrayAdapter<String>(MainActivity.this
                , android.R.layout.simple_list_item_1
                , months);

        autocomplete1.setAdapter(adapterMonth);
        autocomplete1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position : 현재 선택된 배열의 방번호.
                String selectedmonth = ((TextView) view).getText().toString();
                textView1.setText(selectedmonth);
            }
        });

//        ListView 와 ArrayAdapter 연동
//        1. 데이터 만들기
//        2. adapter 생성
//        3. ListView 와 adapter 연결
//        4. 리스너 설정
        String[] itemsLV = {"a", "b", "c", "d", "e"};
        ArrayAdapter<String> adapterlist = new ArrayAdapter<String>(MainActivity.this
                , android.R.layout.simple_list_item_1
                , itemsLV);
        listView1.setAdapter(adapterlist);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position : 현재 선택된 배열의 방번호.
                String selecteditemsLV = ((TextView) view).getText().toString();
                textView1.setText(selecteditemsLV);
            }
        });

    }
}
