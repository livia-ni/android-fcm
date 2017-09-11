package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by livia on 9/11/17.
 */

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private static String TAG = SquawkFirebaseInstanceIdService.class.getName();
    @Override
    public void onTokenRefresh(){
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "token: " + refreshedToken);
    }
}
