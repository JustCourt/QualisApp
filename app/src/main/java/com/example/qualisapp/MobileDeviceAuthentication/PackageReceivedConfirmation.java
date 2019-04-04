package com.example.qualisapp.MobileDeviceAuthentication;

import android.support.annotation.Nullable;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

public class PackageReceivedConfirmation extends Request<String> {

    public PackageReceivedConfirmation(int method, String url, @Nullable Response.ErrorListener listener) {
        super(method, url, listener);
    }

    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    @Override
    protected void deliverResponse(String response) {

    }
}
