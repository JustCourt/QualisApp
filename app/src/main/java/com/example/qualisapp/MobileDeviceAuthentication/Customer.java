package com.example.qualisapp.MobileDeviceAuthentication;
import android.os.AsyncTask;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.*;

/**
 * A customer ordering an item by delivery through this mobile app.
 */
public class Customer {
    private PrivateKey privateKey;
    private PublicKey publicKey;

    String url = "";


    public void SendDeliveryRequest(String requestDetails) {
        JSONObject jsonRequest = new JSONObject();
        try {
            jsonRequest.put("Public Key", publicKey.toString());
            jsonRequest.put("Delivery Request", requestDetails);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, jsonRequest, new Response.Listener<JSONObject>() {

                    // On confirmation of delivery request
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", error.getMessage());
                    }
                });
    }

    public void ConfirmPackageDrop(){

    }

    public void ConfirmPackageReceived(){

    }

    private void GeneratePrivateKey(){
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA", "SUN");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
            keyGen.initialize(1024, random);
            KeyPair pair = keyGen.generateKeyPair();
            privateKey = pair.getPrivate();
            publicKey = pair.getPublic();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
    }

    public class SendDeliveryRequestTask extends AsyncTask<String, Void, DeliveryRequestConfirmation> {

        @Override
        protected DeliveryRequestConfirmation doInBackground(String[] objects) {
            return null;
        }
    }
}
