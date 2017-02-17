package com.enet.myfirstapp.Views;

import com.enet.myfirstapp.Bean.Data;
import com.enet.myfirstapp.Bean.gankBean;

import java.util.List;

/**
 * Created by zhouqiang on 2017/2/13.
 */

public interface Views {


    void showData( List<Data.DataEntity.InfoEntity.CarouselEntity> list);

    //  展示轮播图
    void showBanner( List<Data.DataEntity.InfoEntity.CarouselEntity> list);






}
