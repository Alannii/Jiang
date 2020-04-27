package com.huatec.hiot_cloud.test.dagger2;

import com.huatec.hiot_cloud.test.TestMVPActivity;

import dagger.Component;

@Component(modules = TestModule.class)
public interface PresenterConponent {
    void inject(TestMVPActivity testMVPActivity);
}
