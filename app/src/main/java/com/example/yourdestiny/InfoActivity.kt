package com.example.yourdestiny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }

    fun clickGoBack(view: View) {
        val menu: Intent = Intent(this@InfoActivity,MainActivity::class.java)
        menu.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(menu)
    }

}