package com.huatec.hiot_cloud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.huatec.hiot_cloud.Model.User;

public class MainActivity extends AppCompatActivity implements testView{

    testPresenter testPresenter =new testPresenter(MainActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et_username = findViewById(R.id.tf_user);
        final EditText et_passwd = findViewById(R.id.tf_passwd);
        Button button = findViewById(R.id.bt_login);
        final User user = new User();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setUsrname(et_username.getText().toString());
                user.setPasswd(et_passwd.getText().toString());
                testPresenter.login(user,MainActivity.this);
            }
        });


    }

    @Override
    public void showMessage(String message,Intent intent) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }

}
