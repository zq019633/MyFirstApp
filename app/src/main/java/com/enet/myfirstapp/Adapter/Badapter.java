package com.enet.myfirstapp.Adapter;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.enet.myfirstapp.R;
import com.enet.myfirstapp.Ui.SecACtivity;
import com.yuyh.easyadapter.recyclerview.*;
import com.yuyh.easyadapter.recyclerview.EasyRVHolder;
import java.util.ArrayList;
/**
 * Created by zhouqiang on 2017/2/16.
 */
public class Badapter extends EasyRVAdapter {

    private TextView btv;
    private ImageView imageView;

    public Badapter(ArrayList<String> list, Context context, int... layoutIds) {
        super(context, list, layoutIds);
    }

    @Override
    protected void onBindData(EasyRVHolder viewHolder, final int position, Object item) {


            imageView = viewHolder.getView(R.id.biv);
           Glide.with(mContext).load("http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg").into(imageView);

            viewHolder.getItemView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "我被点击了" + position + mList.get(position).toString(), Toast.LENGTH_SHORT).show();

                    mContext.startActivity(new Intent(mContext,SecACtivity.class));



                }
            });

            btv = viewHolder.getView(R.id.btv);
            btv.setText(mList.get(position).toString());


    }

}
