package com.bei.fornetworkers.mvp.ui.common;

import com.bei.fornetworkers.app.WEApplication;
import com.bei.fornetworkers.di.component.AppComponent;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.mvp.BasePresenter;

/**
 * Created by jess on 8/5/16 13:13
 * contact with jess.yan.effort@gmail.com
 */
public abstract class WEActivity<P extends BasePresenter> extends BaseActivity<P> {
    protected WEApplication mWeApplication;
    @Override
    protected void ComponentInject() {
        mWeApplication = (WEApplication) getApplication();
        setupActivityComponent(mWeApplication.getAppComponent());
    }

    //提供AppComponent(提供所有的单例对象)给子类，进行Component依赖
    protected abstract void setupActivityComponent(AppComponent appComponent);
}
