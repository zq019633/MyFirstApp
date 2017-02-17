package com.enet.myfirstapp.Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import android.widget.Toast;

import com.enet.myfirstapp.Adapter.TabFragmentPagerAdapter;
import com.enet.myfirstapp.R;
import com.enet.myfirstapp.Ui.Fragment.AFragment;
import com.enet.myfirstapp.Ui.Fragment.BFragment;
import com.enet.myfirstapp.Ui.Fragment.CFragment;
import com.enet.myfirstapp.Weight.NoScrollViewPager;

import java.util.ArrayList;

/**
 * Created by zhouqiang on 2017/2/15.
 */
public class NewActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ArrayList<String> list;
    private NoScrollViewPager viewPager;
    private TabFragmentPagerAdapter tabFragmentPageAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Toast.makeText(this, "我到了", Toast.LENGTH_SHORT).show();

        initViewpager();
        initData();

    }
    //http://blog.csdn.net/figo0423/article/details/47700415

    private void initData() {

        list = new ArrayList();
        list.add("eNets");
        list.add("人工智能");
        list.add("生活服务");
        list.add("企业服务");
        list.add("金融");
        tabLayout.addTab(tabLayout.newTab().setText(list.get(0)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(3)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(4)));


        ArrayList<Fragment> listFragment = new ArrayList<>();
        listFragment.add(new AFragment());
        listFragment.add(new BFragment());
        listFragment.add(new CFragment());
        listFragment.add(new BFragment());
        listFragment.add(new CFragment());


        tabFragmentPageAdapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), listFragment, list);


        viewPager.setAdapter(tabFragmentPageAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initViewpager() {
        viewPager = (NoScrollViewPager) findViewById(R.id.vp_body);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

    }
}
