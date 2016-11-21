package com.bei.fornetworkers.di.module;

import com.bei.fornetworkers.mvp.model.api.service.CommonService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import retrofit2.Retrofit;

/**
 * Created by zhiyicx on 2016/3/30.
 */
@Module
public class ServiceModule {

    @Singleton
    @Provides CommonService provideCommonService(Retrofit retrofit) {
        return retrofit.create(CommonService.class);
    }

}
