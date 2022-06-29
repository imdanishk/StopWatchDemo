package com.example.stopwatchdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stopwatchdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isStarted = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}