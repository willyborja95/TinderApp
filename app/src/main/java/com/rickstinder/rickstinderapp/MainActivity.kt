package com.rickstinder.rickstinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent

        val message = intent.getStringExtra("fcm_message")
        if(!message.isNullOrEmpty()){
            AlertDialog.Builder(this)
                .setTitle("Firebase alert")
                .setMessage(message)
                .setPositiveButton("ok", {dialog, wich -> }).show()
        }


    }
}
