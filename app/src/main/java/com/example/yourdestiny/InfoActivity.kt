package com.example.yourdestiny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        title = "Информация о программе"
    }
}