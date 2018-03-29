package com.habitos.luis.habitossaludables

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class LogActivity : AppCompatActivity() {

    val TAG = "LOG_ACTIVITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "ON_PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "ON_STOP")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "ON_START")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "ON_RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "ON_DESTROY")
    }
}
