package com.programming.android.viewpagger;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById(R.id.viewpagger);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(),getApplicationContext()));




    }

    private class CustomAdapter extends FragmentPagerAdapter {
        private String fragment[]={"TAB1","TAB2","TAB3"};
        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext){
            super(supportFragmentManager);

        }

        @Override
        public int getCount() {
            return fragment.length;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Fragment1();
                case 1:
                    return new Fragment2();
                case 2:
                    return new Fragment3();

                default:
                    return null;
            }

        }

        @Override
        public CharSequence getPageTitle(int position){
            return fragment[position];
        }
    }
}
