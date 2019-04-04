package com.example.qualisapp.MobileDeviceAuthentication;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

/**
 * A message from the server to confirm if a delivery request was scheduled correctly or not.
 */
public class DeliveryRequestConfirmation {

    public String DeliveryAddress;

    public DeliveryRequestConfirmation(String url, Response.ErrorListener listener) {
        super(url, listener);

    }

    @Override
    protected Response parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    @Override
    protected void deliverResponse(String response) {

    }

}
