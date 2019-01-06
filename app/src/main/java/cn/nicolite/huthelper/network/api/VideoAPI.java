package cn.nicolite.huthelper.network.api;

import cn.nicolite.huthelper.model.bean.Video;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * 视频API
 * Created by nicolite on 17-12-2.
 */

public interface VideoAPI {
    @GET("opensource/staticAPI/video.json")
    Observable<Video> getVideoData();
}
