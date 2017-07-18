package songmofan.baway.com.myapplication.presenter;

import songmofan.baway.com.myapplication.model.util.BaseUtil;
import songmofan.baway.com.myapplication.view.iview.HomeView;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 11
 */

public class HomePresenter extends BasePresenter<HomeView> {
        //调用M层的网络请求
    public void getDatas() {

        BaseUtil.getTextFromeServer(new BaseUtil.GetTexts() {
            @Override
            public <T> void takeBack(T t) {
                //获得 activity实现的接口 为了接口回调
                HomeView homeView = getBaseView();
                //接口回调方法
                homeView.callBack(t);
            }
        });



    }
}
