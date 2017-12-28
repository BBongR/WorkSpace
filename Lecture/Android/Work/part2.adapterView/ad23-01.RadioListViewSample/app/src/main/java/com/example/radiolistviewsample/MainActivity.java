package com.example.radiolistviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    int check = -1;


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
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_single_choice, items);
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        BtnInner inner = new BtnInner();
        btn_add.setOnClickListener(inner);
        btn_mod.setOnClickListener(inner);
        btn_del.setOnClickListener(inner);
    }

    private class BtnInner implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_add:

                    String input = editText.getText().toString();

                    if(!editText.getText().toString().equals(""))
                        items.add(input);

                    adapter.notifyDataSetChanged();

                    listView.clearChoices(); // 체크 푸는 용도

                    listView.smoothScrollToPosition(items.size() - 1);

                    break;

                case R.id.btn_mod:

                    if (listView.getCheckedItemCount() != 0) {
                        check = listView.getCheckedItemPosition(); // 체크 된 방번호 가져오기
                    }

                    if ((!editText.getText().toString().equals("")) && (check != -1)) {
                        items.set(check, editText.getText().toString());
                    }

                    adapter.notifyDataSetChanged();

                    listView.clearChoices(); // 체크 푸는 용도

                    break;

                case R.id.btn_del:

                    if (listView.getCheckedItemCount() != 0) {
                        check = listView.getCheckedItemPosition();
                    }

                    if (!(items.isEmpty()) && (check != -1)) {
                        items.remove(check);
                    }

                    listView.clearChoices(); // 체크 푸는 용도
                    adapter.notifyDataSetChanged();
                    check = -1;

                    break;
            }
        }
    }
}
