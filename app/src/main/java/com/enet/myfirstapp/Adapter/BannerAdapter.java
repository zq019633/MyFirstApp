package com.enet.myfirstapp.Adapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.enet.myfirstapp.Bean.Data;
import com.enet.myfirstapp.Ui.MainActivity;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import java.util.List;

/**
 * Created by zhouqiang on 2017/2/14.
 */
public class BannerAdapter extends StaticPagerAdapter {
    private final List<Data.DataEntity.InfoEntity.CarouselEntity> list;
    private final MainActivity context;

    public BannerAdapter(List<Data.DataEntity.InfoEntity.CarouselEntity> list, MainActivity mainActivity) {
        this.list=list;
        this.context=mainActivity;

    }

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        Glide.with(context).load(list.get(position).getImagepath()).into(view);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
