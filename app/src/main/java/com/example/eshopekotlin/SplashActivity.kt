package com.example.eshopekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import android.widget.Toast

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        Looper.myLooper()?.let{
        Handler(it).postDelayed(
            {
            //Toast.makeText(this,"Hendler",Toast.LENGTH_SHORT).show()
                val intent =  Intent (this, MainActivity ::class.java)
                startActivity(intent)
                finish()
            }, 1000)

    }
    }

}