package com.enet.myfirstapp.Ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.enet.myfirstapp.Adapter.secAdapter;
import com.enet.myfirstapp.R;
import com.enet.myfirstapp.Ui.Fragment.CFragment;
import com.enet.myfirstapp.Ui.Fragment.CeoFragment;
import com.enet.myfirstapp.Weight.NoScrollViewPager;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;

import java.util.ArrayList;

/**
 * Created by zhouqiang on 2017/2/17.
 */
public class SecACtivity  extends AppCompatActivity{

    private ArrayList<String> listtitle;
    private MagicIndicator magic;
    private NoScrollViewPager mViewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
            listtitle=new ArrayList<>();
        listtitle.add("ceo访谈");
        listtitle.add("人物汇");
        listtitle.add("专题");
        listtitle.add("美丽中国");
        listtitle.add("健康中国");
        listtitle.add("一带一路");
        listtitle.add("人工智能");
        listtitle.add("生活服务");
        listtitle.add("企业服务");
        listtitle.add("金融");
        listtitle.add("3c产品");
        listtitle.add("互联网经济论坛");


        initView();
        initData();
    }

    private void initView() {
        magic = (MagicIndicator) findViewById(R.id.magic_indicator);
        mViewPager = (NoScrollViewPager) findViewById(R.id.view_pager);

        ArrayList<Fragment> list=new ArrayList<>();
        list.add(new CeoFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());
        list.add(new CFragment());


        mViewPager.setAdapter(new secAdapter(getSupportFragmentManager(),list));

        CommonNavigator commonNavigator = new CommonNavigator(this);





        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
            @Override
            public int getCount() {

                return listtitle == null ? 0 : listtitle.size();
            }

            @Override
            public IPagerTitleView getItemView(Context context, final int index) {
                ColorTransitionPagerTitleView colorTransitionPagerTitleView = new ColorTransitionPagerTitleView(SecACtivity.this);
                colorTransitionPagerTitleView.setNormalColor(Color.GRAY);
                colorTransitionPagerTitleView.setSelectedColor(Color.BLACK);
                colorTransitionPagerTitleView.setText(listtitle.get(index));

                colorTransitionPagerTitleView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mViewPager.setCurrentItem(index);
                    }
                });


                return colorTransitionPagerTitleView;
            }

            @Override
            public IPagerIndicator getIndicator(Context context) {
                LinePagerIndicator linePagerIndicator = new LinePagerIndicator(SecACtivity.this);

                return linePagerIndicator;
            }
        });

        magic.setNavigator(commonNavigator);


        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Toast.makeText(SecACtivity.this,"我是第"+position+"页",Toast.LENGTH_SHORT).show();


                magic.onPageScrolled(position, positionOffset, positionOffsetPixels);


            }

            @Override
            public void onPageSelected(int position) {
                magic.onPageSelected(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

                magic.onPageScrollStateChanged(state);
            }
        });



    }


    private void initData() {

    }
}
