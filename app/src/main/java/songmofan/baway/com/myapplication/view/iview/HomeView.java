package songmofan.baway.com.myapplication.view.iview;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 10
 */

public interface HomeView<T> extends BaseView{
    abstract void callBack(T t);
    abstract void callBackErro(int code,String msg);

}
