package com.zwb.mvpdemo.mvp;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.zwb.mvpdemo.R;
import com.zwb.mvpdemo.mvp2.SecondActivity;

public class MainActivity extends BaseMvpActivity<MainActivity, MainPresenter> {
    private Button button;

    @Override
    protected int tellMeLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected Class<MainPresenter> getPresenterClass() {
        return MainPresenter.class;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
        button = findViewById(R.id.bt_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onSuccess() {
        Log.e("info","---------onSuccess--------");
        button.setText("onSuccess");
//        mPresenter.getData();
    }


}
