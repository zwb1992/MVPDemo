package com.zwb.mvpdemo.base;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import java.lang.ref.WeakReference;

/**
 * @ author : zhouweibin
 * @ time: 2019/7/25 19:21.
 * @ desc:
 **/
public abstract class IPresenter<V extends IView> {
    private static final String TAG = IPresenter.class.getName();

    private WeakReference<V> mView = null;

    public void bindView(@NonNull V v) {
        mView = new WeakReference<>(v);
    }

    protected V getView() {
        if (mView != null) {
            return mView.get();
        }
        return null;
    }

    /**
     * view 是否有效状态
     *
     * @return true
     */
    protected boolean isActive() {
        return getView() != null;
    }

    public void initData(Intent intent){
        Log.e(TAG,"==========initData===========");
    }

    public void onCreate(Bundle savedInstanceState) {
        Log.e(TAG,"==========onCreate===========");
    }

    public void onStart() {
        Log.e(TAG,"==========onStart===========");
    }

    public void onResume() {
        Log.e(TAG,"==========onResume===========");
    }

    public void onStop() {
        Log.e(TAG,"==========onStop===========");
    }

    public void onRestart() {
        Log.e(TAG,"==========onRestart===========");
    }

    public void onPause() {
        Log.e(TAG,"==========onPause===========");
    }

    public void onDestroy() {
        Log.e(TAG,"==========onDestroy===========");
        if (isActive()) {
            mView.clear();
        }
        mView = null;
    }
}
