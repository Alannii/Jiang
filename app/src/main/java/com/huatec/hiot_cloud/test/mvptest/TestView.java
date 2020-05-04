package com.huatec.hiot_cloud.test.mvptest;

import android.content.Intent;

import com.huatec.hiot_cloud.ui.base.BaseView;

public interface TestView extends BaseView {
    void sendMessage(String msg);
    void openActivity(Intent intent);
}
