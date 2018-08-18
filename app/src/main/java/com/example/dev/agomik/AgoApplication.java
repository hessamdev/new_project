package com.example.dev.agomik;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class AgoApplication extends Application{
    private RefWatcher refWatcher;

    public static RefWatcher getRefWatcher (Context context){

        AgoApplication application =(AgoApplication)context.getApplicationContext();
        return application.refWatcher;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        refWatcher= LeakCanary.install(this);
    }
}
