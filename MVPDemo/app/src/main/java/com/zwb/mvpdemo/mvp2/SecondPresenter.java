package com.zwb.mvpdemo.mvp2;

import android.util.Log;

/**
 * @ author : zhouweibin
 * @ time: 2019/7/26 10:07.
 * @ desc:
 **/
public class SecondPresenter extends SecondContract.SecondPresenter {

    @Override
    public void getData() {
        Log.e("info", "=====getData======");
        if (isActive()) {
            getView().onSuccess();
        }
    }
}
