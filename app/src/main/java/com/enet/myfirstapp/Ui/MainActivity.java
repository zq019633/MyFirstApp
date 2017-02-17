package com.enet.myfirstapp.Ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioGroup;

import com.enet.myfirstapp.Adapter.BannerAdapter;
import com.enet.myfirstapp.Bean.Data;
import com.enet.myfirstapp.Presener.MainPresenter;
import com.enet.myfirstapp.R;
import com.enet.myfirstapp.Ui.Fragment.AFragment;
import com.enet.myfirstapp.Ui.Fragment.BFragment;
import com.enet.myfirstapp.Ui.Fragment.CFragment;
import com.enet.myfirstapp.Views.Views;
import com.enet.myfirstapp.Weight.NoScrollViewPager;
import com.jude.rollviewpager.RollPagerView;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements Views {

    private Banner banner;
    private RollPagerView rollPagerView;
    private Button bt;
    private NoScrollViewPager viewPager;
    private ArrayList<Fragment> list;
    private RadioGroup radioGroup;
    private Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
        initData();

    }

    private void initData() {
        list = new ArrayList<>();
        list.add(new AFragment());
        list.add(new BFragment());
        list.add(new CFragment());
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }
            @Override
            public int getCount() {
                return list.size();
            }
        });
    }


    private void initView() {

        tb = (Toolbar) findViewById(R.id.tb);

        rollPagerView = (RollPagerView) findViewById(R.id.roll_view_pager);

        radioGroup = (RadioGroup) findViewById(R.id.tab_menu);

        viewPager = (NoScrollViewPager) findViewById(R.id.vp);

    }

    private void initListener() {

        MainPresenter mainPresenter=new MainPresenter(MainActivity.this);
        mainPresenter.GetNetwork();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.home_page:
                        viewPager.setCurrentItem(0, false);
                        break;
                    case R.id.recommend_page:
                        viewPager.setCurrentItem(1, false);
                        break;
                    case R.id.contribute_page:
                        viewPager.setCurrentItem(2, false);
                        break;

                }
            }
        });

    }

    @Override
    public void showData(List<Data.DataEntity.InfoEntity.CarouselEntity> list) {
    }

    @Override
    public void showBanner(List<Data.DataEntity.InfoEntity.CarouselEntity> list) {


        rollPagerView.setAdapter(new BannerAdapter(list,MainActivity.this));

        Log.e("zq",list.get(1).getImagepath());

    }
}