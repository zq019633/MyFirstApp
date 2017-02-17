package com.enet.myfirstapp.Utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhouqiang on 2017/2/13.
 */

public class MyApplication extends Application {

    private static Context context;

    public static Context getInstance() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }


}
