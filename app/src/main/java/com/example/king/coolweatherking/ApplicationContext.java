package com.example.king.coolweatherking;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by King on 5/19/2018.
 */

public class ApplicationContext extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
