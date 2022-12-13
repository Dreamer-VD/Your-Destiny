package com.example.yourdestiny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }
    fun clickInfoVex(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoVex)
        imageViewInfo.setImageResource(R.drawable.vexx)
    }
    fun clickInfoCabal(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoCabal)
        imageViewInfo.setImageResource(R.drawable.cabal)
    }
    fun clickInfoFallen(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoFallen)
        imageViewInfo.setImageResource(R.drawable.fallen)
    }
    fun clickInfoGhost(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoGhost)
        imageViewInfo.setImageResource(R.drawable.ghost)
    }
    fun clickInfoTaken(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoTaken)
        imageViewInfo.setImageResource(R.drawable.taken)
    }
    fun clickInfoHive(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoHive)
        imageViewInfo.setImageResource(R.drawable.hive)
    }
    fun clickInfoCosmodrom(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoCosmodrom)
        imageViewInfo.setImageResource(R.drawable.cosmodrom1)
        }

    fun clickInfoExo(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoExo)
        imageViewInfo.setImageResource(R.drawable.exo)
    }
    fun clickInfoIo(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoIo)
        imageViewInfo.setImageResource(R.drawable.io)
    }
    fun clickInfoMercury(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoMercury)
        imageViewInfo.setImageResource(R.drawable.mercury)
    }
    fun clickInfoGuardian(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
        textView.setText(R.string.text_InfoGuardians)
        imageViewInfo.setImageResource(R.drawable.guardians)
    }
}