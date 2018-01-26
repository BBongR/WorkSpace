package com.example.administrator.skipslide;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.content.Intent;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private LinearLayout mLayoutDots;
    private Button mBtnNext;
    private Button mBtnSkip;

    private PrefManager mPref;
    private int[] mLayouts = {
            R.layout.welcome_slide1,
            R.layout.welcome_slide2,
            R.layout.welcome_slide3,
            R.layout.welcome_slide4};

    private SlidePagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        mPref = new PrefManager(IntroActivity.this);

        // SharedPreferences 를 이용하여 FirstLaunch 값 체크
        if (mPref.isFirstTimeLaunch()) {

            // intro 화면, 4개를 모두 본 경우에는 다시 IntroActivity 를 출력되지 않게
            launchMain();
        }

        setContentView(R.layout.activity_intro);

        mViewPager = findViewById(R.id.view_pager);
        mLayoutDots = findViewById(R.id.layout_dots);
        mBtnNext = findViewById(R.id.btn_next);
        mBtnSkip = findViewById(R.id.btn_skip);

        mAdapter = new SlidePagerAdapter(IntroActivity.this);
        mViewPager.setAdapter(mAdapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                addBottomDots(position);

                if (position==mLayouts.length-1){
                    mBtnNext.setVisibility(View.GONE);
                }else{
                    mBtnNext.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ButtonListener blistener = new ButtonListener();
        mBtnNext.setOnClickListener(blistener);
        mBtnSkip.setOnClickListener(blistener);

        // 바닥에 .... 만들기
        addBottomDots(0);
    } // onCreate

    private void addBottomDots(int currentPage) {
        TextView[] dots = new TextView[mLayouts.length];

        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInActive = getResources().getIntArray(R.array.array_dot_inactive);

        // LinearLayout 안의 모든 뷰를 삭제
        mLayoutDots.removeAllViews();

        for (int i = 0; i < mLayouts.length; i = i + 1) {
            dots[i] = new TextView(IntroActivity.this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorsInActive[i]);
            mLayoutDots.addView(dots[i]);
        }
        dots[currentPage].setTextColor(colorsActive[currentPage]);
    }

    private void launchMain() {
        mPref.setFirstTimeLaunch(true);

        Intent i = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(i);

        finish();
    }

    private class SlidePagerAdapter extends PagerAdapter {

        private LayoutInflater inflater;

        public SlidePagerAdapter(Context context) {
            inflater = LayoutInflater.from(context);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = inflater.inflate(mLayouts[position], container, false);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return mLayouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_skip:
                    launchMain();
                    break;

                case R.id.btn_next:
                    int current = mViewPager.getCurrentItem() + 1;
                    if (current < mLayouts.length) {
                        mViewPager.setCurrentItem(current);
                    } else {
                        launchMain();
                    }
                    break;
            }
        }
    }
}
