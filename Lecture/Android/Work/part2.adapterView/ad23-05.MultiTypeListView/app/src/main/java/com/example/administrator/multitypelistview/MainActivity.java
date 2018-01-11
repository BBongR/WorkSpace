package com.example.administrator.multitypelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.multitypelistview.model.ModelActor;
import com.example.administrator.multitypelistview.model.ModelComment;
import com.example.administrator.multitypelistview.model.ModelDrama;
import com.example.administrator.multitypelistview.model.ModelMovie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 위젯 선언
    ListView listView;
    private AdapterActor adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯 찾기
        listView = findViewById(R.id.listView);

        // 위젯 설정. 리스너 포함. 생략.

        // 데이터 만들기
        ModelActor datas = makeData();

        // 아답터 만들기
        adapter = new AdapterActor( MainActivity.this, datas );

        // 리스트뷰와 아답터 연결하기
        listView.setAdapter( adapter );
    }

    private ModelActor makeData() {
        ModelActor actor = new ModelActor();
        actor.setImagePhoto( getResources().getDrawable( R.drawable.sample_0, null ) );
        actor.setTextAge( "42" );
        actor.setTextName( "ysi" );
        actor.setTextDescription( "desc..." );

        List<ModelMovie>   movies   = new ArrayList<>();
        movies.add( new ModelMovie( getResources().getDrawable( R.drawable.sample_1 ), "movie title1", "2015" ) );
        movies.add( new ModelMovie( getResources().getDrawable( R.drawable.sample_2 ), "movie title2", "2016" ) );
        movies.add( new ModelMovie( getResources().getDrawable( R.drawable.sample_3 ), "movie title3", "2017" ) );
        // actor 에 movies 추가
        actor.setMovies( movies );

        List<ModelDrama>   dramas   = new ArrayList<>();
        dramas.add( new ModelDrama( getResources().getDrawable( R.drawable.sample_4 ), "drama title1", "1-3" ) );
        dramas.add( new ModelDrama( getResources().getDrawable( R.drawable.sample_5 ), "drama title2", "4-6" ) );
        // actor 에 movies 추가
        actor.setDramas( dramas );

        List<ModelComment> comments = new ArrayList<>();
        comments.add( new ModelComment( "comments ... 1", "writer1" ) );
        comments.add( new ModelComment( "comments ... 2", "writer2" ) );
        // actor 에 movies 추가
        actor.setComments( comments );

        return actor;
    }
}
