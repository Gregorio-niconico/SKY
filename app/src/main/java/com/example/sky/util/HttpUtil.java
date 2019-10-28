package com.example.sky.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 调用sendOkHttpRequest()来完成Http请求
 * 传入请求地址，并注册一个回调来处理服务器响应
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
