package com.example.yourdestiny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun clickOnNextText(view: View) {
        val textViewRole: TextView = findViewById(R.id.textViewRole)
        val textViewText: TextView = findViewById(R.id.textViewDialogues)
        val imageViewRole: ImageView = findViewById(R.id.imageViewRole)
        val buttonClick: Button = findViewById(R.id.buttonClickEndGame)
        val buttonClickNext:Button = findViewById(R.id.buttonClickContinueGame)
        val layoutGame: View? = findViewById(R.id.LayoutGame)
        if (textViewText.text == "Наша история начинается с молодого Стража на космодроме в России в космическом костюме с небольшим вооружением.\nК нему подлетает призрак и воскрешает.") {
            imageViewRole.setImageResource(R.drawable.ghost)
            textViewText.text = "Привет, я твой компаньон и я тебя воскресил по воле Странника. Странник посчитал что ты достоин его силы за твою прошлую жизнь. За твою храбрость, жертвенность."
            textViewRole.text = "Призрак:"
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text == "Привет, я твой компаньон и я тебя воскресил по воле Странника. Странник посчитал что ты достоин его силы за твою прошлую жизнь. За твою храбрость, жертвенность.") {
            imageViewRole.setImageResource(R.drawable.ghost)
            textViewText.text = "Можешь называть меня призрак"
            textViewRole.text = "Призрак:"
            buttonClick.visibility = View.INVISIBLE
        }
        else if (textViewText.text == "Можешь называть меня призрак") {
            imageViewRole.setImageResource(R.drawable.gwardian)
            textViewText.text = "Кивает головой"
            textViewRole.text = "Страж:"
        }
        else if (textViewText.text == "Кивает головой") {
            imageViewRole.setImageResource(R.drawable.ghost)
            textViewText.text = "Ну тогда в добрый путь"
            textViewRole.text = "Призрак:"
        }
        else if (textViewText.text == "Ну тогда в добрый путь") {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Пройдя по космодрому они наткнулись на ловушку, в которой их застали падшие."
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.cosmodrome2)
        }
        else if (textViewText.text == "Пройдя по космодрому они наткнулись на ловушку, в которой их застали падшие.") {
            imageViewRole.setImageResource(R.drawable.gvardianark)
            textViewText.text = "И в этот момент у нашего стража проявляются силы, которые помогли им отбиться от нападения. И он узнаёт, что обладает силами стихий и это - сила солнца, электричества и безгранной пустоты."
            textViewRole.text = "Диктор:"
        }
        else if (textViewText.text == "И в этот момент у нашего стража проявляются силы, которые помогли им отбиться от нападения. И он узнаёт, что обладает силами стихий и это - сила солнца, электричества и безгранной пустоты.")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Призрак объяснил, как ему пользоваться силой, когда необходимо и одну деталь, что если тот погибнет, то он сможет нашего стража воскресить и без еды ему будет тяжко, поэтому нужно находить еду, так как после воскрешения голод не заканчивается."
            textViewRole.text = "Диктор:"
        }
        else if (textViewText.text == "Призрак объяснил, как ему пользоваться силой, когда необходимо и одну деталь, что если тот погибнет, то он сможет нашего стража воскресить и без еды ему будет тяжко, поэтому нужно находить еду, так как после воскрешения голод не заканчивается.")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Пробираясь по местности они ходили скрытно, так как при выстрелах сбегутся много кто и умирать стражу не нравилось. И спустя месяц скитания по космодрому они нашли достаточно нужных предметов для выживания и обнаружили вокруг космодрома только лес и пройдя по нему набрели на ферму."
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.menu)
        }
        else if (textViewText.text == "Пробираясь по местности они ходили скрытно, так как при выстрелах сбегутся много кто и умирать стражу не нравилось. И спустя месяц скитания по космодрому они нашли достаточно нужных предметов для выживания и обнаружили вокруг космодрома только лес и пройдя по нему набрели на ферму.")
        {
            imageViewRole.setImageResource(R.drawable.ghost)
            textViewText.text = "Это похоже ферма людей, думаю нам там будут рады"
            textViewRole.text = "Призрак:"
        }
        else if (textViewText.text == "Это похоже ферма людей, думаю нам там будут рады") {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Зайдя на ферму они ощутили пристальное внимание, что мы одеты в космический костюм, с вооружением и потребовали снять его"
            textViewRole.text = "Диктор:"
            buttonClick.text = "Отказаться"
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text == "Зайдя на ферму они ощутили пристальное внимание, что мы одеты в космический костюм, с вооружением и потребовали снять его")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Он, кивнув головой снял костюм"
            textViewRole.text = "Диктор:"
            buttonClick.visibility = View.INVISIBLE
        }
        else if (textViewText.text =="Он, кивнув головой снял костюм")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "После снятия костюма их осмотрели и оставили в покое. И они заприметили висящий в складе корабль."
            textViewRole.text = "Диктор:"
        }
        else if (textViewText.text =="После снятия костюма их осмотрели и оставили в покое. И они заприметили висящий в складе корабль.")
        {
            imageViewRole.setImageResource(R.drawable.ghost)
            textViewText.text = "Сколько тот корабль стоит?"
            textViewRole.text = "Призрак:"
        }
        else if (textViewText.text =="Сколько тот корабль стоит?")
        {
            imageViewRole.setImageResource(R.drawable.uldransov)
            textViewText.text = "Он практически нечего не стоит, а что нужно для него и как починить уже другой разговор. Если вы нам поможете, то я готов предоставить нужные детали и починить его."
            textViewRole.text = "Незнакомец:"
            buttonClick.text="Пригрозить"
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text =="Он практически нечего не стоит, а что нужно для него и как починить уже другой разговор. Если вы нам поможете, то я готов предоставить нужные детали и починить его.")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Они согласились и спустя многие приключения начинавшихся на складах, заканчивающихся на освобождение территорий, они получили заслуженное и улетели. А человек, который был в капюшоне, был сам Ульдран Сов, который отправился к своей сестре Маре Сов с докладом."
            textViewRole.text = "Диктор:"
            buttonClick.visibility = View.INVISIBLE
        }
        else if (textViewText.text =="Они согласились и спустя многие приключения начинавшихся на складах, заканчивающихся на освобождение территорий, они получили заслуженное и улетели. А человек, который был в капюшоне, был сам Ульдран Сов, который отправился к своей сестре Маре Сов с докладом.")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Полетав на космическом корабле вокруг планеты, призрак указал на бога, что его сотворил и одарил силами. А также он рассказал, что помимо людей существуют: Падшие – раннее это были Эликсни, поклонявшиеся Страннику пока тот не отступил, когда боролся с тьмой. Кабал – высокие грозные воители, покорители миров. Вексы - роботизированные машины с целью найти превосходство над всеми..."
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.stranik)
        }
        else if (textViewText.text == "Полетав на космическом корабле вокруг планеты, призрак указал на бога, что его сотворил и одарил силами. А также он рассказал, что помимо людей существуют: Падшие – раннее это были Эликсни, поклонявшиеся Страннику пока тот не отступил, когда боролся с тьмой. Кабал – высокие грозные воители, покорители миров. Вексы - роботизированные машины с целью найти превосходство над всеми...")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "И спустя время они приземлились на ферму, и повстречали таких персонажей как: Шакс,Сейнт-14 и лидер их Завала. Они были единственные кто обладал светом среди всех на ферме и им доверяли. Отметили за встречу и остались жить у них, под великой машиной"
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.menu)
        }
        else if (textViewText.text == "И спустя время они приземлились на ферму, и повстречали таких персонажей как: Шакс,Сейнт-14 и лидер их Завала. Они были единственные кто обладал светом среди всех на ферме и им доверяли. Отметили за встречу и остались жить у них, под великой машиной")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Однако ничто не вечно. В один ясный солнечный день, солнце стал закрывать большой космический корабль, который спустя время стал стремиться к Страннику на таран."
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.drednout)
        }
        else if (textViewText.text == "Однако ничто не вечно. В один ясный солнечный день, солнце стал закрывать большой космический корабль, который спустя время стал стремиться к Страннику на таран.")
        {
            imageViewRole.setImageResource(R.drawable.zavala)
            textViewText.text = "ВСЕМ ПО МЕСТАМ! \nЗА ОРУДИЯ! \nБУДЕМ ГОТОВИТЬСЯ К БИТВЕ!"
            textViewRole.text = "Завала:"
            layoutGame?.setBackgroundResource(R.drawable.menu)
        }
        else if (textViewText.text =="ВСЕМ ПО МЕСТАМ! \nЗА ОРУДИЯ! \nБУДЕМ ГОТОВИТЬСЯ К БИТВЕ!")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Но как все не старались, они не могли остановить столкновение…"
            textViewRole.text = "Диктор:"
        }
        else if (textViewText.text =="Но как все не старались, они не могли остановить столкновение…")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Но при встрече угрозы на себя странник выпустил огромную волну света, которая отбросила корабль обратно в космос и тот остановился. Странник немного погас, показав, что он не сможет отбить 2 удар."
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.stranik)
        }
        else if (textViewText.text == "Но при встрече угрозы на себя странник выпустил огромную волну света, которая отбросила корабль обратно в космос и тот остановился. Странник немного погас, показав, что он не сможет отбить 2 удар.")
        {
            imageViewRole.setImageResource(R.drawable.ghost)
            textViewText.text = "Нам нужно что-то делать! Иначе странник не сможет отбиться и всему конец. Нас окутает тьма."
            textViewRole.text = "Призрак:"
            layoutGame?.setBackgroundResource(R.drawable.menu)
        }
        else if (textViewText.text == "Нам нужно что-то делать! Иначе странник не сможет отбиться и всему конец. Нас окутает тьма.")
        {
            imageViewRole.setImageResource(R.drawable.zavala)
            textViewText.text = "Я знаю ещё воителей света, которые смогут нам помочь, но так как у нас корабль один, полетишь ты страж, мы будем отбивать ферму от всякой нечисти."
            textViewRole.text = "Завала:"
            buttonClick.text="Убежать"
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text == "Я знаю ещё воителей света, которые смогут нам помочь, но так как у нас корабль один, полетишь ты страж, мы будем отбивать ферму от всякой нечисти.")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Дав координаты планет на которых находятся воители света Завала пожелал им удачи и те отправились на планету Ио. По пути были Корабль Кабал. "
            textViewRole.text = "Диктор:"
            buttonClick.text="В бой!"
            layoutGame?.setBackgroundResource(R.drawable.korabl)
        }
        else if (textViewText.text == "Дав координаты планет на которых находятся воители света Завала пожелал им удачи и те отправились на планету Ио. По пути были Корабль Кабал. ")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Успешно миновав корабль Кабал, они по координатам обнаружили воителя света – Икора Рей. Она наблюдала за таинственным местом, в котором странник и Ио общались. Рассказав ситуацию, они быстро собрались на корабль и полетели к последнему воителю света."
            textViewRole.text = "Диктор:"
            buttonClick.visibility = View.INVISIBLE
            layoutGame?.setBackgroundResource(R.drawable.io)
        }
        else if (textViewText.text == "Успешно миновав корабль Кабал, они по координатам обнаружили воителя света – Икора Рей. Она наблюдала за таинственным местом, в котором странник и Ио общались. Рассказав ситуацию, они быстро собрались на корабль и полетели к последнему воителю света.")
        {
            imageViewRole.setImageResource(R.drawable.author)
            textViewText.text = "Этим воителем света был Осирис. И он был на меркурии в Бесконечном лесе. Они высадились и Икора Рей сказала: "
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.endlessforest)
        }
        else if (textViewText.text == "Этим воителем света был Осирис. И он был на меркурии в Бесконечном лесе. Они высадились и Икора Рей сказала: ")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.ikorarey)
            textViewText.text = "Я была ученицей Осириса, и он рассказывал, что должен быть в Бесконечном лесу – это временной портал, который показывает разные варианты нашей вселенной и Вексы пробравшись сюда пытаются найти то будущее, в которой есть только они - завоеватели. И зайдя в портал главное не потеряться!"
            textViewRole.text = "Икора Рей:"
        }
        else if (textViewText.text == "Я была ученицей Осириса, и он рассказывал, что должен быть в Бесконечном лесу – это временной портал, который показывает разные варианты нашей вселенной и Вексы пробравшись сюда пытаются найти то будущее, в которой есть только они - завоеватели. И зайдя в портал главное не потеряться!")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "Зайдя в портал пройдя мимо разных вариантов вселенной, они ужаснулись от одного, что наша земля была окутана тьмой и был таинственный голос, который говорил: “Свет — это угроза, а тьма – это спасение!”. "
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.forestin)
        }
        else if (textViewText.text == "Зайдя в портал пройдя мимо разных вариантов вселенной, они ужаснулись от одного, что наша земля была окутана тьмой и был таинственный голос, который говорил: “Свет — это угроза, а тьма – это спасение!”. ")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "Ужаснувшись, побежав вперёд они наткнулись на человека"
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.forestin)
        }
        else if (textViewText.text == "Ужаснувшись, побежав вперёд они наткнулись на человека")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.ikorarey)
            textViewText.text = "Осирис, как давно не виделись."
            textViewRole.text = "Икора Рей:"
        }
        else if (textViewText.text == "Осирис, как давно не виделись.")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.osiris)
            textViewText.text = "И я рад тебя видеть, моя ученица!"
            textViewRole.text = "Осирис:"
        }
        else if (textViewText.text == "И я рад тебя видеть, моя ученица!")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "После объяснения Осирис, догадываясь кто нападал, зашёл в корабль, и они полетели к земле. Прилетев к нашей земле обнаружили что корабль как бы заряжается и быстро направились на землю."
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.stranik)
        }
        else if (textViewText.text == "После объяснения Осирис, догадываясь кто нападал, зашёл в корабль, и они полетели к земле. Прилетев к нашей земле обнаружили что корабль как бы заряжается и быстро направились на землю.")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "Подобрав нашу команду, они полетели на корабль врага и высадились. Высадившись они осмотрели корабль, на наличие угроз и искали захватчиков. И они их нашли и это был улей, грозная толпа начала атаку на нашу команду. Наша команда прорвалась до большой комнаты, где был Крота - один из сыновей главнокомандующего. Он их заметил, прокричал злобный рёв и отправился в битву. "
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.crota)
        }
        else if (textViewText.text == "Подобрав нашу команду, они полетели на корабль врага и высадились. Высадившись они осмотрели корабль, на наличие угроз и искали захватчиков. И они их нашли и это был улей, грозная толпа начала атаку на нашу команду. Наша команда прорвалась до большой комнаты, где был Крота - один из сыновей главнокомандующего. Он их заметил, прокричал злобный рёв и отправился в битву. ")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "Наша команда, победив его отправилась дальше, сквозь врагов, которых всё больше и больше было. И выйдя на палубу закрыв двери, увидели его, того кто стоял за этим нападением."
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.drednoutin)
        }
        else if (textViewText.text == "Наша команда, победив его отправилась дальше, сквозь врагов, которых всё больше и больше было. И выйдя на палубу закрыв двери, увидели его, того кто стоял за этим нападением.")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.osiris)
            textViewText.text = "Я так и знал. Это был ты – Орикс, Бог улья и один из троицы богов Улья. Я видел тебя в бесконечном лесу, где ты захватил землю."
            textViewRole.text = "Осирис:"
            layoutGame?.setBackgroundResource(R.drawable.orix)
        }
        else if (textViewText.text == "Я так и знал. Это был ты – Орикс, Бог улья и один из троицы богов Улья. Я видел тебя в бесконечном лесу, где ты захватил землю.")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.osiris)
            textViewText.text = "Но этому не бывать! Мы остановим твоё существования раз и навсегда! ."
            textViewRole.text = "Осирис:"
            buttonClick.text="Стратегия одиночек"
            buttonClick.visibility = View.VISIBLE
        }
        else if (textViewText.text == "Но этому не бывать! Мы остановим твоё существования раз и навсегда! .")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "Вы выбрали командную работу и спустя долгое время смогли победить угрозу человечества. И победив Одержимого короля, одного из 3 богов они увидели, как стал разрушаться корабль и из него вышли, ранее не известные, одержимые, которые были сотворены Ориксом. Побежав к кораблю, сквозь их толпу и запрыгнув в него они быстро улетели и увидели взрыв корабля."
            textViewRole.text = "Диктор:"
            buttonClick.visibility = View.INVISIBLE
            layoutGame?.setBackgroundResource(R.drawable.korabl)
        }
        else if (textViewText.text == "Вы выбрали командную работу и спустя долгое время смогли победить угрозу человечества. И победив Одержимого короля, одного из 3 богов они увидели, как стал разрушаться корабль и из него вышли, ранее не известные, одержимые, которые были сотворены Ориксом. Побежав к кораблю, сквозь их толпу и запрыгнув в него они быстро улетели и увидели взрыв корабля.")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "После приземления они отметили победу. Осирис, взял ученицу и полетели обратно в Бесконечный лес. Оставшиеся вместе с остальными стали строить у Странника город и стены вокруг него. После постройки города и стены, стали хорошо жить, и ещё безопасней. "
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.gorod)
        }
        else if (textViewText.text == "После приземления они отметили победу. Осирис, взял ученицу и полетели обратно в Бесконечный лес. Оставшиеся вместе с остальными стали строить у Странника город и стены вокруг него. После постройки города и стены, стали хорошо жить, и ещё безопасней. ")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "Однако, ничто не вечно. В космосе появился флот пирамид и вещали они одно и тоже. “Свет — это угроза, а тьма спасение”."
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.darkwill)
        }
        else if (textViewText.text == "Однако, ничто не вечно. В космосе появился флот пирамид и вещали они одно и тоже. “Свет — это угроза, а тьма спасение”.")
        {
            imageViewRole.setImageResource(com.example.yourdestiny.R.drawable.author)
            textViewText.text = "На этом заканчивается 1 часть. Если есть первая часть, так почему бы и не быть второй части?"
            textViewRole.text = "Диктор:"
            layoutGame?.setBackgroundResource(R.drawable.svidetel)
            buttonClickNext.text="Конец"
        }
        else if (textViewText.text == "На этом заканчивается 1 часть. Если есть первая часть, так почему бы и не быть второй части?")
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
        if (buttonClickEnd.text == "Выстрелить в") {
            buttonClick.visibility = View.INVISIBLE
            imageViewRole.setImageResource(R.drawable.deadghost)
            buttonClickEnd.text = "Вернуться в меню"
            textViewRole.text = "Диктор:"
            textViewText.text = "Вы стреляете в летающую сферу и уничтожив её, вы теряете силы света, ваш призрак запомнился как самый неудачный в истории и на выстрелы приходят падшие, которые от вас оставляют только костюм…"
        }
        else if (buttonClickEnd.text == "Вернуться в меню")
        {
            val startMenu: Intent = Intent(this@GameActivity, MainActivity::class.java)
            startActivity(startMenu)
        }
        else if (buttonClickEnd.text == "Отказаться")
        {
            buttonClickEnd.text = "Вернуться в меню"
            textViewRole.text = "Диктор:"
            textViewText.text = "Вы отказались и по вам стали стрелять. Вы воскресали и воскресали, но кто-то догадался выстрелить по призраку и вас окончательно добили."
            imageViewRole.setImageResource(R.drawable.deadghost)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text=="Пригрозить")
        {
            buttonClickEnd.text = "Вернуться в меню"
            textViewRole.text = "Диктор:"
            textViewText.text = "Вы пригрозили оружием. Человек в капюшоне не медлил, сначала выстрелил в призрака, а после добил вас."
            imageViewRole.setImageResource(R.drawable.deadghost)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text=="Убежать")
        {
            buttonClickEnd.text = "Вернуться в меню"
            textViewRole.text = "Диктор:"
            textViewText.text = "Вы убежали и бросили их. Они не смогли одолеть корабль, корабль врезался в странника, отключив его свет и пришла тьма на нашу землю"
            imageViewRole.setImageResource(R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text=="В бой!")
        {
            buttonClickEnd.text = "Вернуться в меню"
            textViewRole.text = "Диктор:"
            textViewText.text = "Вы подумали, что у вас хватит боевой мощности. Но это не так и вас уничтожили... Люди не смогли одолеть корабль на земле, корабль врезался в странника, отключив его свет и пришла тьма на нашу землю"
            imageViewRole.setImageResource(R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
        else if (buttonClickEnd.text == "Стратегия одиночек")
        {
            buttonClickEnd.text = "Вернуться в меню"
            textViewRole.text = "Диктор:"
            textViewText.text = "Вы выбрали каждый сам за себя, погибли, оставив человечество на вымирание"
            imageViewRole.setImageResource(R.drawable.deadghost)
            layoutGame?.setBackgroundResource(R.drawable.night)
            buttonClick.visibility = View.INVISIBLE
        }
    }
}