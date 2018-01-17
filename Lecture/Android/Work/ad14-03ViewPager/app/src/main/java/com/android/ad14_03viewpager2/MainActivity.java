package com.android.ad14_03viewpager2;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        ClickHandler handler = new ClickHandler();
        btn1.setOnClickListener(handler);
        btn2.setOnClickListener(handler);
        btn3.setOnClickListener(handler);

        pager = findViewById(R.id.pager);
        MyPagerAdapter adapter = new MyPagerAdapter(getApplicationContext());
        pager.setAdapter(adapter);
    }

    private class ClickHandler implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.btn1:
                    pager.setCurrentItem(0, true);
                    break;

                case R.id.btn2:
                    pager.setCurrentItem(1, true);
                    break;

                case R.id.btn3:
                    pager.setCurrentItem(2, true);
                    break;
            }
        }
    }

    private class MyPagerAdapter extends PagerAdapter {

        private LayoutInflater inflater;

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
}
