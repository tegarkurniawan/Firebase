package com.tegar.cobafirebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by tegar on 05/08/16.
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseIDService";

    @Override
    public void onTokenRefresh(){

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("token Firebase", refreshedToken);
        kirimRegistrasi(refreshedToken);
    }

    private void kirimRegistrasi(String token){

    }
}
