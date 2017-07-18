package songmofan.baway.com.myapplication.model.util;

import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import songmofan.baway.com.myapplication.model.bean.HomeBean;
import songmofan.baway.com.myapplication.model.http.MyHttpClients;
import songmofan.baway.com.myapplication.model.http.MyOberser;

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
                .subscribe(new MyOberser<HomeBean>() {
                    @Override
                    public void onsucces(HomeBean homeBean) {
                        Log.e("massage","homeBean"+homeBean.getResult().getData());
                        getTexts.takeBack(homeBean);
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


