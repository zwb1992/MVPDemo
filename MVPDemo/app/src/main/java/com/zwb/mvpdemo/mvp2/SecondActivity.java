package com.zwb.mvpdemo.mvp2;

import androidx.annotation.Nullable;

import android.os.Bundle;
import android.util.Log;

import com.zwb.mvpdemo.R;

public class SecondActivity extends BaseMvpActivity2<SecondPresenter> implements SecondContract.SecondView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
    }

    @Override
    public void onSuccess() {
        Log.e("info", "=====onSuccess======");
    }

    @Override
    protected int tellMeLayout() {
        return R.layout.activity_seconde;
    }

    @Override
    protected Class<SecondPresenter> getPresenterClass() {
        return SecondPresenter.class;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
        mPresenter.getData();
    }
}
