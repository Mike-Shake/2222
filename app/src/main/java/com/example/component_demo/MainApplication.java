package com.example.component_demo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.baselibs.AppConfig;
import com.example.baselibs.BaseApplication;
import com.example.baselibs.BuildConfig;

public class MainApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //ARouter后台有ILogger接口，定义了一些输出日志
        if (isDebug()) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }

        ARouter.init(this);
        initer(this);
    }

    @Override
    public void init(Application application) {
        for(String moduleApp: AppConfig.moduleApps){

            try {
                Class classes=Class.forName(moduleApp);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initer(Application application) {

    }

    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

}