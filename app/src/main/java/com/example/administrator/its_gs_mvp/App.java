package com.example.administrator.its_gs_mvp;

import android.app.Application;
import android.content.Context;

/**
 * Created by xww on 2018/4/9 0009.
 */

public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}