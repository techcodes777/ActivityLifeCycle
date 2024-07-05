package com.eclatsol.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtSecondActivity = findViewById<TextView>(R.id.txtSecondActivity)
        txtSecondActivity.setOnClickListener {
            startActivity(Intent(this,ThirdActivity::class.java))
        }

        Log.e("SecondMain", "onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.e("SecondMain", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.e("SecondMain", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SecondMain", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SecondMain", "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("SecondMain", "onRestart: ")
    }

//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e("SecondMain", "onDestroy: ")
//    }

}