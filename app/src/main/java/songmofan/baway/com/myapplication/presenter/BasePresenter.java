package songmofan.baway.com.myapplication.presenter;

import songmofan.baway.com.myapplication.view.iview.BaseView;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 11
 */

public class BasePresenter<T extends BaseView> {

    private T mt;

    public  void  attach(T t){
        this.mt=t;
    }

    public  T getBaseView(){
        return  mt;
    }
}
