package com.enet.myfirstapp.Presener;


import android.util.Log;

import com.enet.myfirstapp.Bean.Data;
import com.enet.myfirstapp.Ui.MainActivity;
import com.enet.myfirstapp.Net.NetWorks;

import java.util.List;

import rx.Observer;

/**
 * Created by zhouqiang on 2017/2/13.
 */

public class MainPresenter implements Presenter {




    private List<Data.DataEntity.InfoEntity.CarouselEntity> carousel;


    private  MainActivity view;

    public MainPresenter(MainActivity view) {
        this.view=view;
    }

    //请求网络
    @Override
    public void GetNetwork() {
        NetWorks.verfacationCodeGet("Applist.index", new Observer<Data>() {

            @Override
            public void onCompleted() {
                Log.e("zq","请求成功");

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Data data) {
                Log.e("zq","请求也成功");
                carousel =  data.getData().getInfo().getCarousel();
                view.showBanner(carousel);

            }
        });

    }




}
