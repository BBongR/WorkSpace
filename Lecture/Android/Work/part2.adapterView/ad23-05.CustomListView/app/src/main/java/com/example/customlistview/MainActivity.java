package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listview1;
    private ArrayAdapter<String> adapter;
    private List<String> data;

    private Button btn_add;
    private Button btn_search;
    private Button btn_sort;
    private Button btn_all_del;
    private Button btn_init;

    private EditText edt_name;
    private EditText edt_number;
    private EditText edt_department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯 찾기
        listview1 = findViewById(R.id.listview1);
        btn_add = findViewById(R.id.btn_add);
        btn_search = findViewById(R.id.btn_search);
        btn_sort = findViewById(R.id.btn_sort);
        btn_all_del = findViewById(R.id.btn_all_del);
        btn_init = findViewById(R.id.btn_init);

        edt_name = findViewById(R.id.edt_name);
        edt_number = findViewById(R.id.edt_number);
        edt_department = findViewById(R.id.edt_department);

        BtnInner btn = new BtnInner();
        btn_add.setOnClickListener(btn);
        btn_search.setOnClickListener(btn);
        btn_sort.setOnClickListener(btn);
        btn_all_del.setOnClickListener(btn);
        btn_init.setOnClickListener(btn);

        // 위젯 리스너 설정
        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        listview1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });

        // 데이터 만들기
        data = new ArrayList<>();
        data.add("aaaaaa");
        data.add("bbbbbb");
        data.add("ccccccc");

        // adapter 만들기
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);

        // listview와 adapter 연결
        listview1.setAdapter(adapter);
    }

    private class BtnInner implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_add:

                    edt_name.getText().toString();
                    edt_number.getText().toString();
                    edt_department.getText().toString();

                    break;

                case R.id.btn_search:

                    break;

                case R.id.btn_sort:

                    break;

                case R.id.btn_all_del:

                    break;

                case R.id.btn_init:

                    break;
            }
        }
    }
}
