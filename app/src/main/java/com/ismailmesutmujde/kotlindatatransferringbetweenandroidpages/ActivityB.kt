package com.ismailmesutmujde.kotlindatatransferringbetweenandroidpages

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val incomingMessage = intent.getStringExtra("message")
        val incomingAge = intent.getIntExtra("age", 0)
        val incomingHeight = intent.getDoubleExtra("height", 0.0)

        Log.e("MESSAGE", incomingMessage.toString())
        Log.e("AGE", incomingAge.toString())
        Log.e("HEIGHT", incomingHeight.toString())
    }
}