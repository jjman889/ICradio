package com.forfun.qp.icradio;

import android.content.Context;
import android.webkit.JavascriptInterface;

/**
 * Created by qp on 1/23/15.
 */
public class JavasciptInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    JavasciptInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        //Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}
