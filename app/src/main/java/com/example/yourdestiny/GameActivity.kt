package com.example.yourdestiny

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun newDialogue(text:String, name:String, imageViewGetRole: Int)
    {
        val textDialog:TextView=findViewById(R.id.textViewDialogues)
        val textName:TextView=findViewById(R.id.textViewRole)
        var imageViewRole:ImageView=findViewById(R.id.imageViewRole)
        textDialog.text=text
        textName.text=name
        imageViewRole.setImageResource(imageViewGetRole)
    }
    fun clickOnNextText(view: View) {
        val textViewText: TextView = findViewById(R.id.textViewDialogues)
        val buttonClick: Button = findViewById(R.id.buttonClickEndGame)
        val buttonClickNext:Button = findViewById(R.id.buttonClickContinueGame)
        val layoutGame: View? = findViewById(R.id.LayoutGame)
        if (textViewText.text==getString(R.string.text_Narrator))
        {
            newDialogue(getString(R.string.text_Ghost),getString(R.string.name_unknown),R.drawable.ghost)
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Ghost))
        {
            newDialogue(getString(R.string.text_Ghost1),getString(R.string.name_Ghost),R.drawable.ghost)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Ghost1))
        {
            newDialogue(getString(R.string.text_SignGuardian),getString(R.string.name_Guardian),R.drawable.gwardian)
        }
        else if (textViewText.text==getString(R.string.text_SignGuardian))
        {
            newDialogue(getString(R.string.text_Ghost2),getString(R.string.name_Ghost),R.drawable.ghost)
        }
        else if (textViewText.text==getString(R.string.text_Ghost2))
        {
            newDialogue(getString(R.string.text_Narrator1),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.cosmodrome2)
        }
        else if (textViewText.text==getString(R.string.text_Narrator1))
        {
            newDialogue(getString(R.string.text_Narrator2),getString(R.string.name_Narrator),R.drawable.author)
        }
        else if (textViewText.text==getString(R.string.text_Narrator2))
        {
            newDialogue(getString(R.string.text_Narrator3),getString(R.string.name_Narrator),R.drawable.author)
        }
        else if (textViewText.text==getString(R.string.text_Narrator3))
        {
            newDialogue(getString(R.string.text_Narrator4),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.menu)
        }
        else if (textViewText.text==getString(R.string.text_Narrator4))
        {
            newDialogue(getString(R.string.text_Ghost3),getString(R.string.name_Ghost),R.drawable.ghost)
        }
        else if (textViewText.text==getString(R.string.text_Ghost3))
        {
            newDialogue(getString(R.string.text_Narrator5),getString(R.string.name_Narrator),R.drawable.author)
            buttonClick.setText(R.string.text_choiceEndGame2)
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Narrator5))
        {
            newDialogue(getString(R.string.text_Narrator6),getString(R.string.name_Narrator),R.drawable.author)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Narrator6))
        {
            newDialogue(getString(R.string.text_Narrator7),getString(R.string.name_Narrator),R.drawable.author)
        }
        else if (textViewText.text==getString(R.string.text_Narrator7))
        {
            newDialogue(getString(R.string.text_Ghost4),getString(R.string.name_Ghost),R.drawable.ghost)
        }
        else if (textViewText.text==getString(R.string.text_Ghost4))
        {
            newDialogue(getString(R.string.text_UldrenSov),getString(R.string.name_unknown),R.drawable.uldransov)
            buttonClick.setText(R.string.text_choiceEndGame3)
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_UldrenSov))
        {
            newDialogue(getString(R.string.text_Narrator8),getString(R.string.name_Narrator),R.drawable.author)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Narrator8))
        {
            newDialogue(getString(R.string.text_Narrator9),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.stranik)
        }
        else if (textViewText.text==getString(R.string.text_Narrator9))
        {
            newDialogue(getString(R.string.text_Narrator10),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.menu)
        }
        else if (textViewText.text==getString(R.string.text_Narrator10))
        {
            newDialogue(getString(R.string.text_Narrator11),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.dreadnaught)
        }
        else if (textViewText.text==getString(R.string.text_Narrator11))
        {
            newDialogue(getString(R.string.text_Zavala),getString(R.string.name_Zavala),R.drawable.zavala)
            layoutGame?.setBackgroundResource(R.drawable.menu)
        }
        else if (textViewText.text==getString(R.string.text_Zavala))
        {
            newDialogue(getString(R.string.text_Narrator12),getString(R.string.name_Narrator),R.drawable.author)
        }
        else if (textViewText.text==getString(R.string.text_Narrator12))
        {
            newDialogue(getString(R.string.text_Narrator13),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.stranik)
        }
        else if (textViewText.text==getString(R.string.text_Narrator13))
        {
            newDialogue(getString(R.string.text_Ghost5),getString(R.string.name_Ghost),R.drawable.ghost)
            layoutGame?.setBackgroundResource(R.drawable.menu)
        }
        else if (textViewText.text==getString(R.string.text_Ghost5))
        {
            newDialogue(getString(R.string.text_Zavala1),getString(R.string.name_Zavala),R.drawable.zavala)
            buttonClick.setText(R.string.text_choiceEndGame4)
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Zavala1))
        {
            newDialogue(getString(R.string.text_Narrator14),getString(R.string.name_Narrator),R.drawable.author)
            buttonClick.setText(R.string.text_choiceEndGame5)
            layoutGame?.setBackgroundResource(R.drawable.korabl)
        }
        else if (textViewText.text==getString(R.string.text_Narrator14))
        {
            newDialogue(getString(R.string.text_Narrator15),getString(R.string.name_Narrator),R.drawable.author)
            buttonClick.visibility = View.INVISIBLE
            layoutGame?.setBackgroundResource(R.drawable.io)
        }
        else if (textViewText.text==getString(R.string.text_Narrator15))
        {
            newDialogue(getString(R.string.text_Narrator16),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.endlessforest)
        }
        else if (textViewText.text==getString(R.string.text_Narrator16))
        {
            newDialogue(getString(R.string.text_IkoraRey),getString(R.string.name_IkoraRey),R.drawable.ikorarey)
        }
        else if (textViewText.text==getString(R.string.text_IkoraRey))
        {
            newDialogue(getString(R.string.text_Narrator17),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.forestin)
        }
        else if (textViewText.text==getString(R.string.text_Narrator17))
        {
            newDialogue(getString(R.string.text_Narrator18),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.forestin)
        }
        else if (textViewText.text==getString(R.string.text_Narrator18))
        {
            newDialogue(getString(R.string.text_IkoraRey1),getString(R.string.name_IkoraRey),R.drawable.ikorarey)
        }
        else if (textViewText.text==getString(R.string.text_IkoraRey1))
        {
            newDialogue(getString(R.string.text_Osiris),getString(R.string.name_Osiris),R.drawable.osiris)
        }
        else if (textViewText.text==getString(R.string.text_Osiris))
        {
            newDialogue(getString(R.string.text_Narrator19),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.stranik)
        }
        else if (textViewText.text==getString(R.string.text_Narrator19))
        {
            newDialogue(getString(R.string.text_Narrator20),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.crota)
        }
        else if (textViewText.text==getString(R.string.text_Narrator20))
        {
            newDialogue(getString(R.string.text_Narrator21),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.drednoutin)
        }
        else if (textViewText.text==getString(R.string.text_Narrator21))
        {
            newDialogue(getString(R.string.text_Osiris1),getString(R.string.name_Osiris),R.drawable.osiris)
            layoutGame?.setBackgroundResource(R.drawable.orix)
        }
        else if (textViewText.text==getString(R.string.text_Osiris1))
        {
            newDialogue(getString(R.string.text_Osiris2),getString(R.string.name_Osiris),R.drawable.osiris)
            buttonClick.setText(R.string.text_choiceEndGame6)
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Osiris2))
        {
            newDialogue(getString(R.string.text_Narrator22),getString(R.string.name_Narrator),R.drawable.author)
            buttonClick.visibility = View.INVISIBLE
            layoutGame?.setBackgroundResource(R.drawable.korabl)
        }
        else if (textViewText.text==getString(R.string.text_Narrator22))
        {
            newDialogue(getString(R.string.text_Narrator23),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.gorod)
        }
        else if (textViewText.text==getString(R.string.text_Narrator23))
        {
            newDialogue(getString(R.string.text_Narrator24),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.darkwill)
        }
        else if (textViewText.text==getString(R.string.text_Narrator24))
        {
            newDialogue(getString(R.string.text_Narrator25),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.svidetel)
            buttonClickNext.setText(R.string.text_EndGame)
        }
        else if (textViewText.text ==getString(R.string.text_continuation))
        {
            val menu:Intent=Intent(this@GameActivity,MainActivity::class.java)
            startActivity(menu)
        }
    }

    fun clickOnClickEndGame(view: View) {
        val buttonClickEnd: Button = findViewById(R.id.buttonClickEndGame)
        val buttonClick: Button = findViewById(R.id.buttonClickContinueGame)
        val textViewRole: TextView = findViewById(R.id.textViewRole)
        val textViewText: TextView = findViewById(R.id.textViewDialogues)
        val imageViewRole: ImageView = findViewById(R.id.imageViewRole)
        val layoutGame: View? = findViewById(R.id.LayoutGame)
        if (buttonClickEnd.text == getString(R.string.text_choiceEndGame1))
        {
            buttonClick.visibility = View.INVISIBLE
            newDialogue(getString(R.string.text_TextEndGame1),getString(R.string.name_Narrator),R.drawable.deadghost)
            buttonClickEnd.setText(R.string.text_BackToMenu)
        }
        else if (buttonClickEnd.text == getString(R.string.text_BackToMenu))
        {
            val startMenu: Intent = Intent(this@GameActivity, MainActivity::class.java)
            startActivity(startMenu)
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame2))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            newDialogue(getString(R.string.text_TextEndGame2),getString(R.string.name_Narrator),R.drawable.deadghost)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame3))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            newDialogue(getString(R.string.text_TextEndGame3),getString(R.string.name_Narrator),R.drawable.deadghost)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame4))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            newDialogue(getString(R.string.text_TextEndGame4),getString(R.string.name_Narrator),R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame5))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            newDialogue(getString(R.string.text_TextEndGame5),getString(R.string.name_Narrator),R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame6))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            newDialogue(getString(R.string.text_TextEndGame6),getString(R.string.name_Narrator),R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
    }
}