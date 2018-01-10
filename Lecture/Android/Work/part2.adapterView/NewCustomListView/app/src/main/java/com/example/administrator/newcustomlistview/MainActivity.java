package com.example.administrator.newcustomlistview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 5. 위젯 선언
    private ListView listView3 = null;
    private List<ModelPerson> lists = null;

    // 9-2
    //    9-2 하고 AdapterPerson 9-3 으로 이동
    private AdapterPerson adapter;

    // 8-4
    private int[] images = {
              R.drawable.sample_0
            , R.drawable.sample_1
            , R.drawable.sample_2
            , R.drawable.sample_3
            , R.drawable.sample_4
            , R.drawable.sample_5
            , R.drawable.sample_6
            , R.drawable.sample_7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 6. 위젯 추가
        listView3 = findViewById(R.id.listView3);

        // 7. 위젯설정, 리스너. 생략

        // 8. 데이터 만들기
        //    8-1 lists 필드 변수 만들기
        //    8-2 makeData() 메서드 만들기
        lists = makeData();

        // 9. adapter 생성
        //    9-1 adapter 필드 변수 만들기
        adapter = new AdapterPerson(MainActivity.this, R.layout.view_person, lists);

        // 10. ListView 와 adapter 연결
        listView3.setAdapter(adapter);


    }

    // 8-3
    private List<ModelPerson> makeData() {
        List<ModelPerson> items = new ArrayList<>();
        ModelPerson person;
        for (int i = 0; i < 20; i++) {
            person = new ModelPerson();
            person.setImage_check(false);
            person.setText_age(i + "");
            person.setText_name("name " + i);
            Drawable d = getResources().getDrawable(images[i% images.length], null);
            person.setImage_photo(d);

            items.add(person);
        }
        return items;
    }
}
