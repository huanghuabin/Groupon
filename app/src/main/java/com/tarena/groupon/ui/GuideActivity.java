package com.tarena.groupon.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tarena.groupon.R;
import com.tarena.groupon.adapter.MyPagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;


public class GuideActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyPagerAdapter adapter;

    CirclePageIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        viewPager = (ViewPager) findViewById(R.id.vp_main);
        indicator = (CirclePageIndicator) findViewById(R.id.indicator);
        initViewPager();

    }

    private void initViewPager() {
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

}
