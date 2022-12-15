package com.example.yourdestiny

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
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
        val buttonClickEnd: Button = findViewById(R.id.buttonClickEndGame)
        val buttonClickNext:Button = findViewById(R.id.buttonClickContinueGame)
        val buttonClickNextAC:Button=findViewById(R.id.buttonClickContinueGame1)
        val layoutGame: View? = findViewById(R.id.LayoutGame)
        val karma:Int=0
        if (textViewText.text==getString(R.string.text_Narrator))
        {
            newDialogue(getString(R.string.text_Ghost),getString(R.string.name_unknown),R.drawable.ghost)
            buttonClickNext.setText(R.string.text_Choice1)
            buttonClickNextAC.setText(R.string.text_AlternativeChoice)
            buttonClickNextAC.visibility=View.VISIBLE
            buttonClickEnd.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Ghost))
        {
            newDialogue(getString(R.string.text_Ghost1),getString(R.string.name_Ghost),R.drawable.ghost)
            buttonClickNext.setText(R.string.text_Choice2)
            buttonClickEnd.visibility = View.INVISIBLE
            buttonClickNextAC.visibility=View.INVISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Ghost1))
        {
            buttonClickNext.setText(R.string.text_Choice)
            buttonClickNextAC.setText(R.string.text_Choice)
            newDialogue(getString(R.string.text_SignGuardian),getString(R.string.name_Guardian),R.drawable.gwardian)
        }
        else if (textViewText.text==getString(R.string.text_SignGuardian))
        {
            buttonClickNext.setText(R.string.text_Choice3)
            newDialogue(getString(R.string.text_Ghost2),getString(R.string.name_Ghost),R.drawable.ghost)
        }
        else if (textViewText.text==getString(R.string.text_Ghost2))
        {
            buttonClickNext.setText(R.string.text_Choice)
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
            buttonClickNext.setText(R.string.Text_Choice4)
            buttonClickEnd.setText(R.string.text_choiceEndGame2)
            buttonClickEnd.visibility = View.VISIBLE
            buttonClickNext.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Narrator5))
        {
            newDialogue(getString(R.string.text_Narrator6),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickNext.setText(R.string.text_Choice)
            buttonClickEnd.visibility = View.INVISIBLE
            buttonClickNextAC.visibility = View.INVISIBLE
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
            buttonClickNext.setText(R.string.Text_Choice6)
            buttonClickEnd.setText(R.string.text_choiceEndGame3)
            buttonClickNextAC.setText(R.string.text_AlternativeChoice1)
            buttonClickNextAC.visibility = View.VISIBLE
            buttonClickEnd.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_UldrenSov))
        {
            newDialogue(getString(R.string.text_Narrator8),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickNext.setText(R.string.text_Choice)
            buttonClickEnd.visibility = View.INVISIBLE
            buttonClickNextAC.visibility = View.INVISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Narrator8) || textViewText.text==getString(R.string.text_Narrator8_1))
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
            buttonClickEnd.setText(R.string.text_choiceEndGame4)
            buttonClickEnd.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Zavala1))
        {
            newDialogue(getString(R.string.text_Narrator13_1),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickEnd.visibility = View.INVISIBLE
            buttonClickNextAC.visibility=View.VISIBLE
            buttonClickNext.setText(R.string.Text_Choice5)
            buttonClickNextAC.setText(R.string.text_AlternativeChoice2)
        }
        else if (buttonClickNext.text==getString(R.string.Text_Choice5))
        {
            newDialogue(getString(R.string.text_Narrator14),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickNext.setText(R.string.Text_Choice7)
            buttonClickEnd.setText(R.string.text_choiceEndGame5)
            buttonClickEnd.visibility = View.VISIBLE
            buttonClickNextAC.visibility = View.INVISIBLE
            layoutGame?.setBackgroundResource(R.drawable.korabl)
        }
        else if (textViewText.text==getString(R.string.text_Narrator14))
        {
            newDialogue(getString(R.string.text_Narrator15),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickNext.setText(R.string.text_Choice)
            buttonClickEnd.visibility = View.INVISIBLE
            buttonClickNext.setText(R.string.text_Choice)
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
            buttonClickEnd.setText(R.string.text_choiceEndGame6)
            buttonClickEnd.visibility = View.VISIBLE
        }
        else if (textViewText.text==getString(R.string.text_Osiris2))
        {
            newDialogue(getString(R.string.text_Narrator22),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickEnd.visibility = View.INVISIBLE
            layoutGame?.setBackgroundResource(R.drawable.korabl)
        }
        else if (textViewText.text==getString(R.string.text_Narrator22))
        {
            newDialogue(getString(R.string.text_Narrator23),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.gorod)
        }
        else if (textViewText.text==getString(R.string.text_Narrator23) || textViewText.text==getString(R.string.text_NarratorAC5))
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
        val buttonClickNextAC:Button=findViewById(R.id.buttonClickContinueGame1)
        val layoutGame: View? = findViewById(R.id.LayoutGame)
        if (buttonClickEnd.text == getString(R.string.text_choiceEndGame1))
        {
            buttonClick.visibility = View.INVISIBLE
            buttonClickNextAC.visibility=View.INVISIBLE
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
            buttonClickNextAC.visibility=View.INVISIBLE
            newDialogue(getString(R.string.text_TextEndGame2),getString(R.string.name_Narrator),R.drawable.deadghost)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame3))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            buttonClickNextAC.visibility=View.INVISIBLE
            newDialogue(getString(R.string.text_TextEndGame3),getString(R.string.name_Narrator),R.drawable.deadghost)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame4))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            buttonClickNextAC.visibility=View.INVISIBLE
            newDialogue(getString(R.string.text_TextEndGame4),getString(R.string.name_Narrator),R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame5))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            buttonClickNextAC.visibility=View.INVISIBLE
            newDialogue(getString(R.string.text_TextEndGame5),getString(R.string.name_Narrator),R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_choiceEndGame6))
        {
            buttonClickEnd.setText(R.string.text_BackToMenu)
            buttonClickNextAC.visibility=View.INVISIBLE
            newDialogue(getString(R.string.text_TextEndGame6),getString(R.string.name_Narrator),R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == getString(R.string.text_password1false))
            {
                newDialogue(getString(R.string.text_TextEndGame7),getString(R.string.name_Narrator),R.drawable.deadghost)
                layoutGame?.setBackgroundResource(R.drawable.night)
                buttonClickEnd.setText(R.string.text_BackToMenu)
                buttonClickNextAC.visibility=View.INVISIBLE
            }
    }

    fun clickOnNextTextAC(view: View) {
        val buttonClickEnd: Button = findViewById(R.id.buttonClickEndGame)
        val buttonClickNextAC:Button=findViewById(R.id.buttonClickContinueGame1)
        val buttonClickNext: Button = findViewById(R.id.buttonClickContinueGame)
        val textDialog:TextView=findViewById(R.id.textViewDialogues)
        val layoutGame: View? = findViewById(R.id.LayoutGame)
        if (buttonClickNextAC.text==getString(R.string.text_AlternativeChoice))
        {
            newDialogue(getString(R.string.text_Ghost1),getString(R.string.name_Ghost),R.drawable.ghost)
            buttonClickNext.setText(R.string.text_Choice2)
            buttonClickEnd.visibility = View.INVISIBLE
            buttonClickNextAC.visibility=View.INVISIBLE
        }
        else if (buttonClickNextAC.text==getString(R.string.text_AlternativeChoice1))
        {
            newDialogue(getString(R.string.text_Narrator8_1),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickNext.setText(R.string.text_Choice)
            buttonClickEnd.visibility=View.INVISIBLE
            buttonClickNextAC.visibility = View.INVISIBLE
        }
        else if (buttonClickNextAC.text==getString(R.string.text_AlternativeChoice2))
        {
            buttonClickNextAC.setText(R.string.text_Choice)
            buttonClickNext.visibility=View.INVISIBLE
            newDialogue(getString(R.string.text_NarratorAC),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.korabl)
        }
        else if (textDialog.text==getString(R.string.text_NarratorAC))
        {
            newDialogue(getString(R.string.text_NarratorAC1),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.bunker)
        }
        else if (textDialog.text==getString(R.string.text_NarratorAC1))
        {
            newDialogue(getString(R.string.text_NarratorAC2),getString(R.string.name_Narrator),R.drawable.author)
            layoutGame?.setBackgroundResource(R.drawable.inrasputin)
        }
        else if (textDialog.text==getString(R.string.text_NarratorAC2))
        {
            newDialogue(getString(R.string.text_NarratorAC3),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickEnd.visibility=View.VISIBLE
            buttonClickEnd.setText(R.string.text_password1false)
            buttonClickNextAC.setText(R.string.text_password1true)
        }
        else if (buttonClickNextAC.text==getString(R.string.text_password1true))
        {
            newDialogue(getString(R.string.text_NarratorAC4),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickEnd.visibility=View.INVISIBLE
            buttonClickNextAC.setText(R.string.text_Choice)
        }
        else if (textDialog.text==getString(R.string.text_NarratorAC4))
        {
            newDialogue(getString(R.string.text_NarratorAC5),getString(R.string.name_Narrator),R.drawable.author)
            buttonClickNext.visibility=View.VISIBLE
            buttonClickNextAC.visibility=View.INVISIBLE
            buttonClickNext.setText(R.string.text_Choice)
            layoutGame?.setBackgroundResource(R.drawable.gorod)
        }
    }

}