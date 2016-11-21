package com.bei.fornetworkers.di.module;

import com.bei.fornetworkers.mvp.model.api.cache.CommonCache;
import dagger.Module;
import dagger.Provides;
import io.rx_cache.internal.RxCache;
import javax.inject.Singleton;

/**
 * Created by zhiyicx on 2016/3/30.
 */
@Module
public class CacheModule {

    @Singleton
    @Provides CommonCache provideCommonService(RxCache rxCache) {
        return rxCache.using(CommonCache.class);
    }


}
