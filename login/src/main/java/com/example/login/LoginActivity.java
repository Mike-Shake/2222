package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.baselibs.ServiceFactory;

import EventBus.EventMessage;
import org.greenrobot.eventbus.EventBus;


@Route(path="/login/login1")
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.Login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginUtil.islogin=true;
                LoginUtil.passwors="admin";
                ServiceFactory.getInstance().setLoginService(new AccoutService(LoginUtil.islogin, LoginUtil.passwors));

                EventBus.getDefault().postSticky(new EventMessage(LoginUtil.passwors));
            }
        });
    }
}