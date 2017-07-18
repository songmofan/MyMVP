package songmofan.baway.com.mymvp.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import songmofan.baway.com.mymvp.application.MyApplication;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 21
 */

public abstract class BaseAcyivity extends AppCompatActivity {

    private Context context;
    private Activity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        init();
        initView();
        initData();

    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutId();


    private void init() {
        context= getApplicationContext();
        activity=this;
        MyApplication.getInstance().addActivity(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyApplication.getInstance().delActicity(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


}
