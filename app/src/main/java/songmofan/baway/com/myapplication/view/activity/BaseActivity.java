package songmofan.baway.com.myapplication.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 10
 */

public abstract class BaseActivity extends AppCompatActivity {
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

    //上下文
    private void init() {
        context= getApplicationContext();
        activity=this;

    }
    //获得布局
    protected abstract int getLayoutId();

    //获得控件
    protected abstract void initView();

    //获得数据
    protected abstract void initData();


    //生命周期
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
