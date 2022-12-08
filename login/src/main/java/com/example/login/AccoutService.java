package com.example.login;

import com.example.baselibs.LoginService;

public class AccoutService implements LoginService {
    private boolean login;
    private String password;

    public AccoutService(boolean login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean isLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
