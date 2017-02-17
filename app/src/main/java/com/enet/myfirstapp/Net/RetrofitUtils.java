package com.enet.myfirstapp.Net;





import okhttp3.OkHttpClient;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by zhouqiang on 2017/2/13.
 */

public class RetrofitUtils {

    //服务器路径
    //http://api.enet.com.cn/provider/Public/Cms/index.php?service=Applist.index
    private static final String API_SERVER = "http://api.enet.com.cn/provider/Public/Cms/";
    private static final String API_SERVER2 = "http://gank.io";

    private static Retrofit mRetrofit;
    private static OkHttpClient mOkHttpClient;


    /**
     * 获取Retrofit对象
     *
     * @return
     */
    protected static Retrofit getRetrofit() {




        if (null == mRetrofit) {

            if (null == mOkHttpClient) {
                mOkHttpClient = OkHttp3Utils.getOkHttpClient();
            }
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(API_SERVER + "/")
                    .addConverterFactory(GsonConverterFactory.create())
                    /*.client(mOkHttpClient)*/
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())

                    .build();

        }

        return mRetrofit;
    }


    protected static Retrofit getRetrofit2() {


        if (null == mRetrofit) {

            if (null == mOkHttpClient) {
                mOkHttpClient = OkHttp3Utils.getOkHttpClient();
            }
            mRetrofit = new Retrofit.Builder()

                    .baseUrl(API_SERVER2 + "/")

                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                 //   .client(mOkHttpClient)
                    .build();

        }

        return mRetrofit;
    }

}



