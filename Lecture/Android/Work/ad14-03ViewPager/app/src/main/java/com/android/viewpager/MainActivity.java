package com.android.viewpager;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 위젯 선언
    private Button button1;
    private Button button2;
    private Button button3;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯 찾기
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        pager = findViewById(R.id.pager);

        // 핸들러 설정
        ClickHandler handler = new ClickHandler();
        button1.setOnClickListener(handler);
        button2.setOnClickListener(handler);
        button3.setOnClickListener(handler);

        // pager 와 adapter 연결.
        pager = findViewById(R.id.pager);
        MyPagerAdapter Adapter = new MyPagerAdapter(getApplicationContext());
        pager.setAdapter(Adapter);
    }

    // 버튼 Click 핸들러.
    private class ClickHandler implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.button1:
                    pager.setCurrentItem(0,true);
                    break;

                case R.id.button2:
                    pager.setCurrentItem(1,true);
                    break;

                case R.id.button3:
                    pager.setCurrentItem(2,true);
                    break;
            }
        }
    }

    // ViewPager adapter 만들기
    private class MyPagerAdapter extends PagerAdapter {

        // 필드 선언
        private LayoutInflater inflater;

        // 디폴트 생성자 : 반드시 Context 생성자의 매개변수로 받아야 한다.
        public MyPagerAdapter(Context c) {
            this.inflater = LayoutInflater.from(c);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(View container, int position) {
            View v = null;

            switch (position) {
                case 0:
                    v = inflater.inflate(R.layout.inflate_one, null, false);
                    break;

                case 1:
                    v = inflater.inflate(R.layout.inflate_two, null, false);
                    break;

                case 2:
                    v = inflater.inflate(R.layout.inflate_three, null, false);
                    break;
            }


            pager.addView(v);
            return v;
        }

        @Override
        public void destroyItem(View container, int position, Object object) {
            pager.removeView((View) object);
        }
    }

    private  class fdsjfdsfdsf extends PagerAdapter{

        private LayoutInflater inflater1;

        public fdsjfdsfdsf(Context c) {
            this.inflater1 = LayoutInflater.from(c);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(View container, int position) {

            View v = null;

            switch (position){
                case 0:
                    v= inflater1.inflate(R.layout.inflate_one,null,false);
                    break;

                case 1:
                    v= inflater1.inflate(R.layout.inflate_two,null,false);
                    break;

                case 2:
                    v= inflater1.inflate(R.layout.inflate_three,null,false);
                    break;

            }

            return v;
        }
    }
}
