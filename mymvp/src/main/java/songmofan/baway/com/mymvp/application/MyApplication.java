package songmofan.baway.com.mymvp.application;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 21
 */

public class MyApplication extends Application {

    private ArrayList<Activity> activities;
    private static MyApplication mApplication;

    public static synchronized MyApplication getInstance() {
        return mApplication;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        activities = new ArrayList<>();

    }
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void delActicity(Activity activity) {
        activities.remove(activity);
    }

    public void exitSys() {
        for (Activity act : activities) {
            delActicity(act);
            act.finish();
        }
        System.exit(0);//强制退出
    }

}