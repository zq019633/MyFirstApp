package com.enet.myfirstapp.Net;

import com.enet.myfirstapp.Bean.Data;
import com.enet.myfirstapp.Bean.gankBean;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by zhouqiang on 2017/2/13.
 */

public class NetWorks extends RetrofitUtils {

    //创建实现接口调用
    protected static final NetService service = getRetrofit().create(NetService.class);
    protected static final NetService service2 = getRetrofit2().create(NetService.class);





    //设缓存有效期为1天
    protected static final long CACHE_STALE_SEC = 60 * 60 * 24 * 1;
    //查询缓存的Cache-Control设置，使用缓存
    protected static final String CACHE_CONTROL_CACHE = "only-if-cached, max-stale=" + CACHE_STALE_SEC;
    //查询网络的Cache-Control设置。不使用缓存
    protected static final String CACHE_CONTROL_NETWORK = "max-age=0";




    //http://api.enet.com.cn/provider/Public/Cms/index.php?service=Applist.index
    private interface NetService {



        //GET请求
        @GET("index.php")
        Observable<Data> getVerfcationGet(@Query("service") String service);



        //干活集中营的bean     http://gank.io/api/data/Android/10/1
        @GET("api/data/Android/10/1")
        Observable<gankBean> getVerfactionGet();


    }



   /* //这个请求是干货集中营的数据
    public static void verfacationCodeGet(Observer<gankBean> observer) {
        setSubscribe(service2.getVerfactionGet(),observer);
    }*/


    //这个请求是西南角接口里的数据
    public static void verfacationCodeGet(String a,Observer<Data> observer) {
        setSubscribe(service.getVerfcationGet(a),observer);
    }



    public static <T> void setSubscribe(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回调到主线程
                .subscribe(observer);
    }

}