package songmofan.baway.com.myapplication.model.http;

import io.reactivex.Observable;
import retrofit2.http.GET;
import songmofan.baway.com.myapplication.model.bean.HomeBean;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 16
 */

public interface ApiServers {
    @GET("k2BaduF2a6caa275f395919a66ab1dfe4b584cc60685573?uri=gj")
    Observable<HomeBean> getData();

}
