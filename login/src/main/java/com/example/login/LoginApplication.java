package com.example.login;

import android.app.Application;

import com.example.baselibs.BaseApplication;
import com.example.baselibs.ServiceFactory;

public class LoginApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
        initer(this);
    }

    @Override
    public void init(Application application) {
        ServiceFactory.getInstance().setLoginService(new AccoutService(LoginUtil.islogin, LoginUtil.passwors));
    }

    @Override
    public void initer(Application application) {

    }
}
