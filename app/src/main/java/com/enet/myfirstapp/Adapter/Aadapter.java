package com.enet.myfirstapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.enet.myfirstapp.Bean.Data;
import com.enet.myfirstapp.R;
import com.enet.myfirstapp.Ui.NewActivity;
import com.yuyh.easyadapter.recyclerview.*;
import com.yuyh.easyadapter.recyclerview.EasyRVHolder;

import java.util.List;

/**
 * Created by zhouqiang on 2017/2/14.
 */

public class Aadapter extends EasyRVAdapter{

    private  List<Data.DataEntity.InfoEntity.NewsEntity> list;
    private TextView tv;
    private ImageView imageView;
    private TextView textView;

    public Aadapter(Context context, List list, int... layoutIds) {
        super(context, list, layoutIds);
        this.list=list;
    }

    @Override
    public void add(Object data) {
        super.add(data);

    }

    @Override
    protected void onBindData(EasyRVHolder viewHolder, final int position, Object item) {

        viewHolder.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"我被点击了"+position,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(mContext,NewActivity.class);
               // intent.putExtra("data", (Serializable) list);

                mContext.startActivity(intent);
            }
        });

        tv = viewHolder.getView(R.id.tv);
        tv.setText(list.get(position).getName());
        Log.e("zq",list.get(position).getImagepath());

        imageView = viewHolder.getView(R.id.iv);

        Glide.with(mContext).load(list.get(position).getImagepath()).into(imageView);

        textView = viewHolder.getView(R.id.tvShortIntro);

        textView.setText(list.get(position).getImagepath());

    }



}