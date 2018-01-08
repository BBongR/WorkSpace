package com.example.checkablelistview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // 위젯 선언
    ListView listView3;

    EditText edit_input;
    Button btn_search;

    // Adapter 선언
    AdapterPerson adapter;
    private List<ModelPerson> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯 찾기
        listView3 = findViewById(R.id.listView3);
        listView3.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //  header_list_item inflation
        View headerView = LayoutInflater.from( MainActivity.this)
                                        .inflate(R.layout.header_list_item, null);
        edit_input = headerView.findViewById(R.id.edit_input );
        btn_search = headerView.findViewById(R.id.btn_search );

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edit_input.getText().toString();
                if( !text.isEmpty() ) {
                    Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 데이터 만들기
        lists = initData();

        // adapter 생성
        adapter = new AdapterPerson(MainActivity.this, R.layout.view_person, lists);

        // adapter 연결
        listView3.setAdapter( adapter );

        // headerview 추가
        listView3.addHeaderView( headerView );

        // adapter 리스너 설정

    }

    private List<ModelPerson> initData() {
        lists = new ArrayList<ModelPerson>();

        Random r = new Random();
        for(int i=0; i<20; i++){
            ModelPerson person = new ModelPerson();
            person.setName( "name " + i );
            person.setAge( 20 + r.nextInt( 30) );
            person.setPhoto( getResources().getDrawable( imageIds[ i % imageIds.length ] , null) );

            lists.add( person );
        }

        return lists;
    }


    private int [] imageIds = {
            R.drawable.sample_0
            , R.drawable.sample_1
            , R.drawable.sample_2
            , R.drawable.sample_3
            , R.drawable.sample_4
            , R.drawable.sample_5
            , R.drawable.sample_6
            , R.drawable.sample_7
    };
}
