package songmofan.baway.com.mymvp.presenter;

import songmofan.baway.com.mymvp.model.util.BaseUtil;
import songmofan.baway.com.mymvp.view.iview.HomeView;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 21
 */

public class HomePresenter extends BasePresenter<HomeView> {

    @Override
    public void getDatas() {
        BaseUtil.getTextFromeServer(new BaseUtil.GetTexts() {
            @Override
            public <T> void takeBack(T t) {
                 getBaseView().callBack(t);
            }
        });
    }
}
