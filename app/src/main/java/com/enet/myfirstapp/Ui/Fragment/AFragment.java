package com.enet.myfirstapp.Ui.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.camnter.easyrecyclerview.widget.EasyRecyclerView;
import com.enet.myfirstapp.Adapter.Aadapter;
import com.enet.myfirstapp.Bean.Data;
import com.enet.myfirstapp.Bean.gankBean;
import com.enet.myfirstapp.Presener.AFragmentPresenter;
import com.enet.myfirstapp.R;
import com.enet.myfirstapp.Views.IFView;
import com.enet.myfirstapp.Views.Views;
import com.yuyh.easyadapter.recyclerview.EasyRVAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouqiang on 2017/2/14.
 */
public class AFragment extends android.support.v4.app.Fragment implements IFView {


    private EasyRecyclerView ery;
    private RecyclerView recyclerView;
    private ArrayList list1;
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.a, null);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        AFragmentPresenter ap=new AFragmentPresenter(AFragment.this);
        ap.GetNetwork();


        Log.e("zq"," ap.GetNetwork()方法走了");

    }


    @Override
    public void showGank(List<Data.DataEntity.InfoEntity.NewsEntity> list) {
        Log.e("zq11111","="+list.size());
        String id = list.get(1).getId();
        Log.e("zq"," showGank走了");

        recyclerView.setAdapter(new Aadapter(getContext(),list,R.layout.item));


    }
}
