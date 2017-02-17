package com.enet.myfirstapp.Presener;


import android.util.Log;

import com.enet.myfirstapp.Bean.Data;
import com.enet.myfirstapp.Bean.gankBean;
import com.enet.myfirstapp.Net.NetWorks;
import com.enet.myfirstapp.Ui.Fragment.AFragment;

import rx.Observer;

/**
 * Created by zhouqiang on 2017/2/14.
 */

public class AFragmentPresenter implements Presenter {


    private final AFragment fragment;

    public AFragmentPresenter(AFragment fragment) {
        this.fragment=fragment;
    }

    @Override
    public void GetNetwork() {
        NetWorks.verfacationCodeGet("Applist.index",new Observer<Data>() {
            @Override
            public void onCompleted() {
                Log.e("zq22","我是onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.e("zq","我请求失败了"+e);
            }

            @Override
            public void onNext(Data gankBean) {
                Log.e("zq22","我是fragment里的shuju");

                Log.e("zq22","="+gankBean.getData().getInfo().getNews());
                fragment.showGank(gankBean.getData().getInfo().getNews());
                Log.e("zq22","="+gankBean.getData().getInfo().getNews().get(1).getCatid());
            }
        });
    }
}
