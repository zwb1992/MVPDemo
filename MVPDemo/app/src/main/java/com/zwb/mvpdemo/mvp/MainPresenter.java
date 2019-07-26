package com.zwb.mvpdemo.mvp;

import android.content.Intent;
import android.util.Log;

import com.zwb.mvpdemo.base.IPresenter;

/**
 * @ author : zhouweibin
 * @ time: 2019/7/25 20:17.
 * @ desc:
 **/
public class MainPresenter extends IPresenter<MainActivity> {

    @Override
    public void initData(Intent intent) {
        super.initData(intent);
        Log.e("info","---------initData--------");
        if(isActive()){
            getView().onSuccess();
        }
    }
}
