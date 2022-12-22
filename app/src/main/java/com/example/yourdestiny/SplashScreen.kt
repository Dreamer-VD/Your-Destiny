package com.example.yourdestiny

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent:Intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        val mediaPlayer: MediaPlayer = MediaPlayer.create(applicationContext,R.raw.music)
        mediaPlayer.isLooping=true
        mediaPlayer.start()
        finish()
    }
}