package com.zwb.mvpdemo.mvp2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zwb.mvpdemo.base.IPresenter;
import com.zwb.mvpdemo.base.IView;

/**
 * @ author : zhouweibin
 * @ time: 2019/7/25 20:08.
 * @ desc:
 **/
public abstract class BaseMvpActivity2<P extends IPresenter> extends AppCompatActivity implements IView {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tellMeLayout());
        initPresenter();
        initView(savedInstanceState);
        if (mPresenter != null) {
            mPresenter.bindView(this);
            mPresenter.onCreate(savedInstanceState);
            mPresenter.initData(getIntent());
        }
    }

    private void initPresenter() {
        try {
            if (getPresenterClass() != null) {
                mPresenter = getPresenterClass().newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract int tellMeLayout();

    protected abstract Class<P> getPresenterClass();

    protected abstract void initView(@Nullable Bundle savedInstanceState);


    @Override
    protected void onStop() {
        super.onStop();
        if (mPresenter != null) {
            mPresenter.onStop();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mPresenter != null) {
            mPresenter.onStart();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPresenter != null) {
            mPresenter.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.onDestroy();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (mPresenter != null) {
            mPresenter.onRestart();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mPresenter != null) {
            mPresenter.onPause();
        }
    }
}
