package com.example.yourdestiny

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Добро пожаловать"
    }

    fun clickOnInfoActivity(view: View) {
        val activityInfo:Intent=Intent(this@MainActivity,HelpActivity::class.java)
        startActivity(activityInfo)
    }
    fun clickOnClickGame(view: View) {

    }
    fun clickOnInfoGame(view: View) {
        val activityInfo:Intent=Intent(this@MainActivity,InfoActivity::class.java)
        startActivity(activityInfo)
    }
}