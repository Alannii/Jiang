package com.huatec.hiot_cloud.test.mvptest;

import android.content.Intent;

import com.huatec.hiot_cloud.ui.base.BasePresenter;
import com.huatec.hiot_cloud.model.User;

public class TestPresent extends BasePresenter<TestView> {

    private TestView testView;

    public TestView getTestView() {
        return testView;
    }

    public void setTestView(TestView testView) {
        this.testView = testView;
    }

    public void hasLogin(User user,Intent intent){
        if ("root".equals(user.getUsername()) && "123".equals(user.getPasswd())) {
            testView.sendMessage("登录成功");
            testView.openActivity(intent);

        }else testView.sendMessage("登陆失败");
    }

    public void destory(){
        if (testView != null){
            testView = null;
        }
    }
}
