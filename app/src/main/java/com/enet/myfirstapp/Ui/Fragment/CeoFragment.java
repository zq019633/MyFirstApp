package com.enet.myfirstapp.Ui.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.enet.myfirstapp.Presener.CeoPresenter;
import com.enet.myfirstapp.R;
import com.enet.myfirstapp.Views.ceoView;


import org.jsoup.select.Elements;



/**
 * Created by zhouqiang on 2017/2/17.
 */

public class CeoFragment extends Fragment implements ceoView {


    private Button bt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ceo, null);

        bt = (Button) view.findViewById(R.id.bt);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("zq22","我被点击了");
                CeoPresenter ceoPresenter=new CeoPresenter(CeoFragment.this,getActivity());

                ceoPresenter.GetNetwork();
                Log.e("zq22","我再次被点击了");

            }
        });

        return view;
    }

    @Override
    public void showData(Elements a) {
        Log.e("zq","="+a.size());
    }
}
