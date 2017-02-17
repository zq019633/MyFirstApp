package com.enet.myfirstapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by zhouqiang on 2017/2/15.
 */
public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> list;
    private final ArrayList<String> titles;

    public TabFragmentPagerAdapter(FragmentManager supportFragmentManager, ArrayList<Fragment> listFragment, ArrayList<String> listtitle) {
        super(supportFragmentManager);
        this.titles = listtitle;
        this.list = listFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);

    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
