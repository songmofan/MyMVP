package songmofan.baway.com.mymvp.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import songmofan.baway.com.mymvp.R;
import songmofan.baway.com.mymvp.model.bean.HomeBean;
import songmofan.baway.com.mymvp.presenter.HomePresenter;
import songmofan.baway.com.mymvp.view.iview.HomeView;

public class MainActivity extends BaseAcyivity implements HomeView<HomeBean> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void initData() {
        HomePresenter presenter = new HomePresenter();
        presenter.attach(this);
        presenter.getDatas();
    }

    @Override
    protected void initView() {

    }


    @Override
    public void callBack(HomeBean homeBean) {

    }

    @Override
    public void callBackErro(int code, String msg) {

    }
}
