package com.example.simplemultitype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 12. 위젯 선언
    private ListView        listView1;
    private List<ModelItem> list;
    private AdapterItem     adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 13. 위젯 찾기
        listView1 = findViewById( R.id.listView1 );

        // 14. 위젯 설정: 리스너 설정. 없음.

        // 15. 데이터 만들기
        list = makeData();

        // 16. 아답터 만들기
        this.adapter = new AdapterItem( MainActivity.this, -1,list );

        // 17. 리스트뷰 와 아답터 연결
        listView1.setAdapter( this.adapter );
    }

    private List<ModelItem> makeData() {
        List<ModelItem> list = new ArrayList<>();

        list.add( new ModelItem( "title1", "desc1" ) );
        list.add( new ModelItem( getResources().getDrawable( R.drawable.sample_1 ), "name1" ) );
        list.add( new ModelItem( getResources().getDrawable( R.drawable.sample_2 ), "name2" ) );
        list.add( new ModelItem( "title2", "desc2" ) );
        list.add( new ModelItem( getResources().getDrawable( R.drawable.sample_3 ), "name3" ) );
        list.add( new ModelItem( "title3", "desc3" ) );
        list.add( new ModelItem( getResources().getDrawable( R.drawable.sample_4 ), "name4" ) );
        list.add( new ModelItem( getResources().getDrawable( R.drawable.sample_5 ), "name5" ) );
        list.add( new ModelItem( "title4", "desc4" ) );
        list.add( new ModelItem( "title5", "desc5" ) );

        return list;
    }
}
