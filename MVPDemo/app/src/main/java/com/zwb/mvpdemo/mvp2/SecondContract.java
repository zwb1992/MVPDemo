package com.zwb.mvpdemo.mvp2;

import com.zwb.mvpdemo.base.IPresenter;
import com.zwb.mvpdemo.base.IView;

/**
 * @ author : zhouweibin
 * @ time: 2019/7/26 10:03.
 * @ desc:
 **/
public interface SecondContract {

    interface SecondView extends IView {
        void onSuccess();
    }

    abstract class SecondPresenter extends IPresenter<SecondView> {
        public abstract void getData();
    }
}
