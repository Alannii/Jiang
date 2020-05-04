package com.huatec.hiot_cloud.test.mvptest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.huatec.hiot_cloud.R;
import com.huatec.hiot_cloud.ui.base.BaseActivity;
import com.huatec.hiot_cloud.ui.main.MainActivity;
import com.huatec.hiot_cloud.model.User;


import javax.inject.Inject;


public class TestMVPActivity extends BaseActivity<TestView, TestPresent> implements TestView {

    @Inject
    TestPresent testPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_m_v_p);




        testPresent.setTestView(this);

        final TextView user = findViewById(R.id.tf_user);
        final TextView passwd = findViewById(R.id.tf_passwd);
        Button bt = findViewById(R.id.bt_login);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user1 = new User();
                user1.setUsername(user.getText().toString());
                user1.setPasswd(passwd.getText().toString());
                Intent intent = new Intent(TestMVPActivity.this,MainActivity.class);
                testPresent.hasLogin(user1,intent);
            }
        });
    }

    @Override
    public void injectIndependies() {
        getActivityComponent().inject(this);
    }

    @Override
    public TestPresent createPresent() {
        return testPresent;
    }

    @Override
    public void sendMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void openActivity(Intent intent) {
        startActivity(intent);
    }
}
