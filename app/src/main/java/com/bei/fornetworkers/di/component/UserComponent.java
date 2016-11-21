package com.bei.fornetworkers.di.component;

import com.bei.fornetworkers.di.module.UserModule;
import com.bei.fornetworkers.mvp.ui.activity.UserActivity;
import com.jess.arms.di.scope.ActivityScope;
import dagger.Component;

/**
 * Created by jess on 9/4/16 11:17
 * Contact with jess.yan.effort@gmail.com
 */
@ActivityScope
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface UserComponent {
    void inject(UserActivity activity);
}
