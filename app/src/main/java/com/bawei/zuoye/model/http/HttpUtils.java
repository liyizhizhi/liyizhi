package com.bawei.zuoye.model.http;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.zuoye.model.app.App;
import com.bawei.zuoye.model.bean.DataBean;
import com.google.gson.Gson;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/5<p>
 * <p>更改时间：2019/8/5<p>
 */
public class HttpUtils {
    private static final HttpUtils ourInstance = new HttpUtils();

    public static HttpUtils getInstance() {
        return ourInstance;
    }

    private HttpUtils() {
    }


    public void getdata(String path, final CallBackData callBackData) {
        RequestQueue requestQueue = Volley.newRequestQueue(App.context);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, path, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                DataBean dataBean = gson.fromJson(response, DataBean.class);
                callBackData.ok(dataBean);
            }
        }, null);
        requestQueue.add(stringRequest);

    }

    public interface CallBackData {
        void ok(DataBean dataBean);
    }
}
