package com.example.pagerfragmenttransaction;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        pager = findViewById(R.id.pager);

        BgPagerAdapter adapter = new BgPagerAdapter(MainActivity.this);
        pager.setAdapter(adapter);
        pager.setOffscreenPageLimit(2);
    }

    private class BgPagerAdapter extends PagerAdapter {

        LayoutInflater inflater = null;

        public BgPagerAdapter(Context context) {
            this.inflater = LayoutInflater.from(context);
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
        public Object instantiateItem(ViewGroup container, int position) {
            View v = null;

            switch (position) {
                case 0:
                    v=inflater.inflate(R.layout.layout0,null, false);
                    break;

                case 1:
                    v=inflater.inflate(R.layout.layout1,null, false);
                    break;

                case 2:
                    v=inflater.inflate(R.layout.layout2,null, false);
                    break;
            }

            container.addView(v);

            return v;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
