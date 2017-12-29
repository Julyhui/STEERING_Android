package com.example.judyhui.myapplication.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Judyhui on 2017/12/28.
 * 该类用于进行网络请求，使用的网络请求框架上Okhttp
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}