package com.huatec.hiot_cloud.test.dagger2;

import com.huatec.hiot_cloud.test.mvptest.TestPresent;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {

    @Provides
    public TestPresent getPresenter(){return new TestPresent();}
}
