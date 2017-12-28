package com.example.radiolistviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText editText;
    Button btn_add, btn_mod, btn_del;

    ArrayAdapter adapter;
    ArrayList<String> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        editText = findViewById(R.id.editText);
        btn_add = findViewById(R.id.btn_add);
        btn_mod = findViewById(R.id.btn_mod);
        btn_del = findViewById(R.id.btn_del);

        // 데이터 만들기
        String[] item = getResources().getStringArray(R.array.items);
        items = new ArrayList<String>(Arrays.asList(item));

        // 어댑터 생성 & 데이터 추가
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_multiple_choice, items);
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        BtnInner inner = new BtnInner();
        btn_add.setOnClickListener(inner);
        btn_mod.setOnClickListener(inner);
        btn_del.setOnClickListener(inner);
    }

    private class BtnInner implements View.OnClickListener {

        SparseBooleanArray check;

        @Override
        public void onClick(View v) {

            // 추가 //
            switch (v.getId()) {
                case R.id.btn_add:

                    String input = editText.getText().toString();

                    items.add(input);

                    adapter.notifyDataSetChanged();

                    listView.clearChoices();

                    listView.smoothScrollToPosition(items.size() - 1);

                    break;

                // 수정 //
                case R.id.btn_mod:

                    check = listView.getCheckedItemPositions();

                    if (!editText.getText().toString().equals(""))
                        for (int i = 0; i < items.size(); i++) {
                            if (check.get(i) == true)
                                items.set(i, editText.getText().toString());
                        }

                    adapter.notifyDataSetChanged();

                    listView.clearChoices();

                    break;

                // 삭제 //
                case R.id.btn_del:

                    check = listView.getCheckedItemPositions();

                    if (!items.isEmpty())
                        for (int i = items.size(); i >= 0; i--) {
                            if (check.get(i) == true) {
                                items.remove(i);
                            }
                        }

                    adapter.notifyDataSetChanged(); // 변경사항 적용

                    listView.clearChoices(); // 체크 푸는 용도

                    break;
            }
        }
    }
}
