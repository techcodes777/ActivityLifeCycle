package com.eclatsol.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Log.e("ThirdScreen", "onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.e("ThirdScreen", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ThirdScreen", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ThirdScreen", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ThirdScreen", "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ThirdScreen", "onRestart:")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ThirdScreen", "onDestroy:")
    }
}