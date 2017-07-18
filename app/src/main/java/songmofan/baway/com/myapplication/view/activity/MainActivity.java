package songmofan.baway.com.myapplication.view.activity;

import android.widget.Toast;

import java.util.List;

import songmofan.baway.com.myapplication.R;
import songmofan.baway.com.myapplication.model.bean.HomeBean;
import songmofan.baway.com.myapplication.presenter.HomePresenter;
import songmofan.baway.com.myapplication.view.iview.HomeView;

public class MainActivity extends BaseActivity implements HomeView<HomeBean> {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
  ;
    }

    @Override
    protected void initData() {
        //实例化Presenter实例
        HomePresenter presenter = new HomePresenter();
             presenter.attach(this);
             presenter.getDatas();

    }

    @Override
    public void callBack(HomeBean homeBean) {
        List<HomeBean.ResultBean.DataBean> data = homeBean.getResult().getData();

        Toast.makeText(this, "data"+data, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void callBackErro(int code, String msg) {

    }
}
