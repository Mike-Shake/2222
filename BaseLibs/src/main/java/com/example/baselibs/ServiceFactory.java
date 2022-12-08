package com.example.baselibs;

public class ServiceFactory {
    private LoginService loginService;
    private ServiceFactory(){

    }

    public static ServiceFactory getInstance(){
        return Inner.serviceFactory;
    }
    public static class Inner{
        private static ServiceFactory serviceFactory=new ServiceFactory();
    }

    //获取对应数据的实现类以及上传实现类
    public void setLoginService(LoginService loginService){
        this.loginService=loginService;
    }
    public LoginService getLoginService(){
        //如果login组件并没有上传实现类
        if(loginService==null){
            return new EmptyService();
        }else{
            return loginService;
        }
    }
}
