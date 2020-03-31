package com.rickstinder.rickstinderapp

import android.content.Intent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService : FirebaseMessagingService() {

    val TAG = "FCM Service"

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        super.onMessageReceived(remoteMessage)

        Log.d(TAG, "from: "+remoteMessage!!.from);
        Log.d(TAG, "Message: "+remoteMessage.notification?.body);

        val intent = Intent(this@MyFirebaseMessagingService, MainActivity::class.java);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.putExtra("fcm_message", remoteMessage.notification?.body)
        startActivity(intent)


    }
}