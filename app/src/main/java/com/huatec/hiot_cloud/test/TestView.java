package com.huatec.hiot_cloud.test;

import android.content.Intent;

import com.huatec.hiot_cloud.base.BaseView;

public interface TestView extends BaseView {
    void sendMessage(String msg);
    void openActivity(Intent intent);
}
