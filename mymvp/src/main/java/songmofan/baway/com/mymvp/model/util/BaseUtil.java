package songmofan.baway.com.mymvp.model.util;


import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import songmofan.baway.com.mymvp.http.MyHttpClients;
import songmofan.baway.com.mymvp.http.MyOberser;
import songmofan.baway.com.mymvp.model.bean.BaseBean;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 11
 */

public abstract class BaseUtil {

    public static void getTextFromeServer(final GetTexts getTexts) {
        MyHttpClients.getApiServer().getData()
                .subscribeOn(Schedulers.io())               //在IO线程进行网络请求
                .observeOn(AndroidSchedulers.mainThread())  //回到主线程去处理请求结果
                .subscribe(new MyOberser<BaseBean>() {
                    @Override
                    public void onsucces(BaseBean baseBean) {
                           getTexts.takeBack(baseBean);
                    }

                    @Override
                    public void fild() {

                    }
                });

    }

    public interface  GetTexts{
        <T>void  takeBack(T t);

    }

}


