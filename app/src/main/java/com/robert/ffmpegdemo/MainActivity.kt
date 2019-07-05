package com.robert.ffmpegdemo

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tv_hello)
        tv.text = FFmpegModule.avFormatInfo()
    }
}
