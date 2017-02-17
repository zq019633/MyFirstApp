package com.enet.myfirstapp.Ui.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.enet.myfirstapp.Adapter.Badapter;
import com.enet.myfirstapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by zhouqiang on 2017/2/14.
 */
public class BFragment extends android.support.v4.app.Fragment {

    private TextView tv_b;
    private View view;
    private RecyclerView brv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.b, null);
        initView();
        initData();
        return view;
    }

    private void initView() {
        tv_b = (TextView) view.findViewById(R.id.tv_b);
        brv = (RecyclerView) view.findViewById(R.id.brv);
        brv.setLayoutManager(new GridLayoutManager(getActivity(),4));

    }

    private void initData() {
        ArrayList<String> list=new ArrayList<>();
        list.add("员工手册");
        list.add("企业文化");
        list.add("行业详情");
        list.add("优秀文章");
        list.add("员工手册");
        list.add("企业文化");
        list.add("行业详情");
        list.add("优秀文章");
        list.add("员工手册");
        list.add("企业文化");
        list.add("行业详情");
        list.add("优秀文章");
        brv.setAdapter(new Badapter(list,getContext(),R.layout.itemb,R.layout.itemb2));

    }
}
