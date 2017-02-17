package com.enet.myfirstapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;

/**
 * Created by zhouqiang on 2017/2/17.
 */
public class secAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> list;

    public secAdapter(FragmentManager supportFragmentManager, ArrayList<Fragment> list) {
        super(supportFragmentManager);
        this.list=list;


    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
