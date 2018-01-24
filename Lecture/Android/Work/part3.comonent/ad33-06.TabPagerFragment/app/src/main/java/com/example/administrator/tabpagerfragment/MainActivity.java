package com.example.administrator.tabpagerfragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewpager;
    private TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // TabLayout 설정
        tablayout = findViewById(R.id.tab_layout);
        tablayout.addTab(tablayout.newTab().setText("Tab One"));
        tablayout.addTab(tablayout.newTab().setIcon(android.R.drawable.ic_dialog_email));
        tablayout.addTab(tablayout.newTab().setText("Tab Three"));
        tablayout.addTab(tablayout.newTab().setIcon(android.R.drawable.ic_dialog_map));
        tablayout.setTabGravity(Gravity.FILL);
        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        // ViewPager 설정
        viewpager = findViewById(R.id.view_pager);
        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager(), tablayout.getTabCount());
        viewpager.setAdapter(adapter); // TabPagerAdapter 와 ViewPager 연결

        // TabLayout 와 ViewPager 연결
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

        // 화면에서 tab 을 클릭했을때
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private class TabPagerAdapter extends FragmentPagerAdapter {
        private final int tabCount;

        public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
            super(fm);
            this.tabCount = numberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FragmentTab1.newInstance("one", "one");
                case 1:
                    return FragmentTab2.newInstance("two", "two");
                case 2:
                    return FragmentTab3.newInstance("three", "three");
                case 3:
                    return FragmentTab4.newInstance("four", "four");
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return this.tabCount;
        }
    }
}
