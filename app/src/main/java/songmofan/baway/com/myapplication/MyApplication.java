package songmofan.baway.com.myapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 10
 */
public class MyApplication extends Application {
    private Context context;
    private ArrayList<Activity> activities;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        activities = new ArrayList<>();
        context = getApplicationContext();

    }

    //将创建的Activity存入一个集合
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    //删除结合中的Activity的方法
    public void delActivity(Activity activity) {
        activities.remove(activity);

    }

    public void exitActivity() {
        for (Activity act : activities) {
            delActivity(act);
            act.finish();
        }
        System.exit(0);//强制退出
    }
}
