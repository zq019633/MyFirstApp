package com.enet.myfirstapp.Presener;

import android.support.v4.app.FragmentActivity;
import android.util.Log;


import com.enet.myfirstapp.Ui.Fragment.CeoFragment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by zhouqiang on 2017/2/17.
 */

public class CeoPresenter implements Presenter
{
    private final FragmentActivity activity;
    private  CeoFragment cepFragment;

    public CeoPresenter(CeoFragment ceoFragment, FragmentActivity activity) {

        this.cepFragment=ceoFragment;
        this.activity=activity;
    }

    @Override
    public void GetNetwork() {


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                   /* Document doc= Jsoup.connect("http://www.enet.com.cn/tag/ceotalk").get();
                    Elements elements = doc.select("div.con-left");
                    Log.e("zq22","="+elements.select("img"));*/

/*
                    Document document = Jsoup.connect("http://www.enet.com.cn/category/ai").get();
                    Elements select = document.select("div.conart");
                    final Elements a = select.select("a");
                    Log.e("zq22","="+a);*/



                    Document doc = Jsoup.connect("http://home.meishichina.com/show-top-type-recipe.html").get();
                    //选择“美食天下”所在节点
                    final Elements elements = doc.select("div.top-bar");
                    //打印 <a>标签里面的title
                    Log.i("mytag",elements.select("a").attr("title"));

                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            cepFragment.showData(elements);
                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        Log.e("zq22","我进来了");


    }
}
