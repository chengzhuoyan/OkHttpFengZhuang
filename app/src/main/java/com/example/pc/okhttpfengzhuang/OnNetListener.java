package com.example.pc.okhttpfengzhuang;


import java.io.IOException;

import okhttp3.Response;

/**
 * Desc
 * Author 程茁燕
 * Time 2017/9/21.
 */
public interface OnNetListener {
    public void onSuccess(Response response);
    public void onSuccess(BaseBean baseBean);
    public void onError(IOException e);
}
