package com.example.yourdestiny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
        title="Подборная информация"
    }

    fun clickInfoVex(view: View) {
        val textView:TextView=findViewById(R.id.textViewInfo)
        val imageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            textView.text="Вексы — это кибер-органический вид, такой же древний, как сама Вселенная. По внешнему виду вексов можно решить, что они являются роботами, но на самом деле они являются просто ходячими инструментами для радиолярий, микроскопических организмов, взвешенных в молоке вексов, которое содержит коллективный разум всего вида.Вексы способны на великие инженерные подвиги, такие как реконструкция в машинные миры целых планет (таких как Меркурий или Несс), космические путешествия на основе порталов, обработка огромных массивов данных и манипулирование временем."
            imageViewInfo.setImageResource(R.drawable.vexx)
    }
    fun clickInfoCabal(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Кабал - это милитаристская раса гигантских двуногих гуманоидов с грузным внешним видом, напоминающим носорогов. Постоянно расширяющаяся межзвездная Империя Кабал разрастается за счет организованности, эффективности и коррупции"
            ImageViewInfo.setImageResource(R.drawable.kabal)
    }
    fun clickInfoFallen(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Падшие — разумная раса четырехруких гуманоидов-кочевников, промышляющих пиратством. Они сражаются против остатков человечества, а также других рас, враждующих за контроль над Солнечной системой. Печально известные падальщики и рейдеры, Падшие стремятся вернуть себе славу, любой ценой взяв под свой контроль Странника."
            ImageViewInfo.setImageResource(R.drawable.fallen)
    }
    fun clickInfoGhost(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Призрак — это разумный робот-беспилотник, созданный Странником вскоре после Коллапса с целью обнаружения, воскрешения и поддержки человека, способного владеть Светом. После Коллапса раненый Странник сознательно потерял много частиц себя. Эти частицы интуитивно поняли, что у них появилась миссия поднять спутника из мертвых, их Избранных, и создали для себя механические оболочки. Каждый существующий ныне Призрак был создан в тот момент; и таким образом, они незаменимы. Каждый Призрак обладает уникальной личностью и индивидуальностью, хотя именем - не обязательно. Эта личность может быть предназначена дополнять Избранных, которых они должны возрождать, и часто у них есть имя, придуманное их Избранными, в то время как другие могут принимать имена, которые им дают другие."
            ImageViewInfo.setImageResource(R.drawable.ghost)
    }
    fun clickInfoTaken(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Одержимые — Cущества, которые являются модификацией порабощённых падших, улья, вексов, и кабал, которые были испорчены Тьмой и изменены, чтобы служить ее целям. Впервые были использованы Ориксом, Одержимым королем, как его личная армия, и далее использовались другими могущественными сторонниками Тьмы после поражения Орикса"
            ImageViewInfo.setImageResource(R.drawable.taken)
    }
    fun clickInfoHive(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Улей — невероятно древняя раса, которая выступила против человечества в конце их Золотого Века. В своем большинстве в данный момент они проживают на Луне, где они раскопали безжизненные недра спутника, превратив их в свои угодья. Они безмолвно находились под землей среди невообразимого множества ужасающих секретов в течение веков, набирая силы и манипулируя физическим миром способами, о которых нам остается лишь гадать. Они служат живым напоминанием той кошмарной силы, что привела к Коллапсу."
            ImageViewInfo.setImageResource(R.drawable.hive)
    }
    fun clickInfoCosmodrome(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Космодром — древний аэрокосмический комплекс России, с которого корабли во времена Золотого века отправлялись в космос. Он расположен в Старой России и располагается один из бункеров военного разума Распутина и репликационная камера SIVA."
            ImageViewInfo.setImageResource(R.drawable.cosmodrom)
        }

    fun clickInfoExo(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Экзо - это гуманоидные машины с самосознанием, построенные человечеством в Золотом веке. В отличие от серийных роботизированных фреймов, Экзо - это человеческие разумы, загруженные в искусственные тела; таким образом, каждый экзо раньше был человеком."
            ImageViewInfo.setImageResource(R.drawable.exo)
    }
    fun clickInfoIo(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Ио - один из четырех главных спутников Юпитера. В последние дни Золотого Века Странник был в процессе терраформирования Ио, и когда он обнаружил приближающуюся Тьму, он был вынужден покинуть его и сбежать на Землю. В результате этого климат и география Ио остались не приспособлены для традиционного сельского хозяйства, а это означает, что некоторые остатки первоначального состава атмосферы спутника препятствуют нормальному росту растений. Спутник все еще заряжен чистой энергией Странника, которая задерживается в атмосфере, видимой с орбиты."
            ImageViewInfo.setImageResource(R.drawable.io)
    }
    fun clickInfoMercury(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Меркурий - первая планета Солнечной системы, ближайшая к Солнцу. Это мир Вексов. Есть теория, что Меркурий также может быть живым сознанием и одним из Девяти. После того, как Странник превратил Меркурий в мир-сад, планета была заселена человечеством во времена Золотого века. В это время планета была покрыта цветущими лугами и деревьями с розовыми листьями. После Коллапса Вексы повернули вспять эту трансформацию и полностью превратили Меркурий в Мир Машин в течение нескольких дней после их прибытия, используя «Маяки», чтобы затопить планету Радиоляриями и облегчить ее трансформацию. Дендрон, Корневой Разум, прибыл на планету на одном из «Маяков» чтобы усеять Меркурий постройками Вексов и отравлять жизнь на нем радиолярной жидкостью. В конце концов был создан Бесконечный Лес, служащий симуляционной площадкой Вексов, в самом сердце которого располагался Паноптес, Бесконечный Разум."
            ImageViewInfo.setImageResource(R.drawable.mercury)
    }
    fun clickInfoGuardian(view: View) {
        val TextView:TextView=findViewById(R.id.textViewInfo)
        val ImageViewInfo=findViewById<ImageView>(R.id.imageViewInfo)
            TextView.text="Страж - это персонаж за которого мы делаем выбор. На момент происходящей истории не мог говорить и после [Данные удалены] смог заговорить."
            ImageViewInfo.setImageResource(R.drawable.guardians)
    }
}