package com.example.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button_add;
    ListView listView;
    String[] items;
    ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button_add = findViewById(R.id.button_add);
        listView = findViewById(R.id.listView);

        items = (getResources().getStringArray(R.array.items));
        mAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1);
        mAdapter.addAll(items);
        listView.setAdapter(mAdapter);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String text = editText.getText().toString();
                    mAdapter.add(text);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = ((TextView)view).getText().toString();
                textView.setText(selectedItem);
            }
        });
    }
}
