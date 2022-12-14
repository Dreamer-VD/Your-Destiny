package com.example.yourdestiny

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickOnInfoActivity(view: View) {
        val activityInfo:Intent=Intent(this@MainActivity,HelpActivity::class.java)
        startActivity(activityInfo)
    }
    fun clickOnClickGame(view: View) {
        val activityGame:Intent=Intent(this@MainActivity,GameActivity::class.java)
        startActivity(activityGame)
    }
    fun clickOnInfoGame(view: View) {
        val activityInfo:Intent=Intent(this@MainActivity,InfoActivity::class.java)
        startActivity(activityInfo)
    }
}