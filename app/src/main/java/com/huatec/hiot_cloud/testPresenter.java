package com.huatec.hiot_cloud;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.huatec.hiot_cloud.Model.User;

public class testPresenter {

    private testView testView;

    public testPresenter(testView testView){
        this.testView = testView;
    }

    public void login(User user,Activity activity){
        if ("abc".equals(user.getUsrname()) && "123".equals(user.getPasswd())){
            testView.showMessage("登录成功",new Intent(activity,testActivity.class));
        }else{
            testView.showMessage("登录失败",new Intent(activity,MainActivity.class));
        }

    }

}
