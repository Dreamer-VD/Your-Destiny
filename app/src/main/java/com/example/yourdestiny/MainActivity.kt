package com.example.yourdestiny

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaPlayer:MediaPlayer=MediaPlayer.create(applicationContext,R.raw.music)
        mediaPlayer.start()
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