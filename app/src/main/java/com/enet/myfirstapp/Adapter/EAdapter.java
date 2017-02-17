package com.enet.myfirstapp.Adapter;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.enet.myfirstapp.R;

import java.util.ArrayList;

/**
 * Created by zhouqiang on 2017/2/14.
 */
public class EAdapter extends BaseAdapter {
    private final ArrayList list1;
    private final FragmentActivity activity;

    public EAdapter(FragmentActivity activity, ArrayList list1) {
        this.activity=activity;
        this.list1=list1;

    }

    @Override
    public int getCount() {
        return list1.size();
    }

    @Override
    public Object getItem(int position) {
        return list1.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){

            convertView= View.inflate(activity, R.layout.item, null);
            TextView tv = (TextView) convertView.findViewById(R.id.tv);

            tv.setText(list1.get(position)+"");

        }
        return convertView;
    }
}
