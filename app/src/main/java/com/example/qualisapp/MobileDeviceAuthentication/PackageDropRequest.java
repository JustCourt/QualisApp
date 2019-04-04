package com.example.qualisapp.MobileDeviceAuthentication;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

public class PackageDropRequest extends Request<String> {

    public PackageDropRequest(String url, Response.ErrorListener listener) {
        super(url, listener);
    }

    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    @Override
    protected void deliverResponse(String response) {

    }
}
