package songmofan.baway.com.myapplication.model.http;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 15
 */

public class MyHttpClients {

    //私有构造
    private MyHttpClients() {
    }
    public static class Instance {
        //实例化Retrofit对象
        private static Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contents.BACE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
    //获得接口的实例
  public static ApiServers getApiServer(){
      return  Instance.retrofit.create(ApiServers.class);

  }
}
