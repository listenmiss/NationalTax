package com.visioncatcher.tax.nationaltax.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.visioncatcher.tax.nationaltax.R;

import java.util.List;

/**
 * Created by sky-mxc
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments ;
    private String[] titles = new String[]{"首页","办税","查询","我的"};
    public FragmentAdapter(FragmentManager fm,List<Fragment> fragments) {
        super(fm);
        this.fragments =fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments ==null ?0:fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
