package com.city.demo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by admin on 2016/8/12.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
