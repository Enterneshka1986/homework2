package com.example.dz2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    override: fun onCreate(savedInstanseState: Bundle?) {
        super.onCreate(savedInstanseState: Bundle?)
        setContentView(R.layout.activity_main)
        Log.d(TAG, msg: "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, msg: "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, msg: "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, msg: "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, msg: "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, msg: "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, msg: "onDestroy")
    }
}