package com.example.lizhuang.fragment_animation_demo;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

public class MyApplication extends Application {

    public static int out;
    private static Context context;
    private static Toast toast;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
    }

    public static Context getContext() {
        return context;
    }

    public static void showToast(String text) {
        toast.setText(text);
        toast.show();
    }
}
