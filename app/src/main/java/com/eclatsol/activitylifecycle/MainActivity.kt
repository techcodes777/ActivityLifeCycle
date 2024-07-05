package com.eclatsol.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

      var tvShowData: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Widget Toast
        var toast = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()

        Log.e("main", "onCreate: ")

        val second = findViewById<TextView>(R.id.txtSecondActivity)
        second.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }

        val btnChangeData = findViewById<Button>(R.id.btnChangeData)
        tvShowData = findViewById<TextView>(R.id.tvShowData)
        btnChangeData.setOnClickListener{
            tvShowData!!.text = "26"
        }



    }

    override fun onStart() {
        super.onStart()
        Log.e("main", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.e("main", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.e("main", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.e("main", "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("main", "onRestart:")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("main", "onDestroy:")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("data","Jemis Virani")
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle
    ) {
        super.onRestoreInstanceState(savedInstanceState)
        tvShowData!!.text = savedInstanceState!!.getString("data")
    }


    //Activity LifeCycle nu knowledge android developer ne hovu joye
    //Activity LifeCycle samjata pela activity shu che
    //Activity ene kahvay che ke user activity per interact kari shake ,activity per click kari shake
    //Activity ma user interface dekhay che

    //Activity ketla state thi nikale che
    //Activity starting thi end sudhi hay cge close thay
    //Activity notification per click kari particular functionality(Comment,Like,Notification,Chatting Screen) per redirect kare che
    //Koi button per click kari another activity ma jay che (Whatsapp button click whatsapp app ma redirect thay che)

    //App ma ek activity pan hoi multiple activity pan hoi
    //App mathi multiple point thi bar nikali shkay che

    //Activity multiple state mathi pass thay che  //State means onCreate,onStart
    //Activity lifecycle ma use avta badha callback per perform karishu

    //Activity lifecycle ma use avta function ne apde override karvi shavi apne function create karta nathi

    //onCreate call thaya pasi tarat onStart call thay che ,onStart call thaya pasi onResume call thay che then activity display thay //Activity running thay che //UserInterface dekhay che
    //onCreate ni andar activity na coding nu kam karvi shavi
    //onCreate ma variable ne initialize karavi shavi //Detail ma coding karvi shavi

    //onCreate no toast khali show thay che
    //onStart,onResume tene sathe call thay ,onCreate ni pass hide thay gaya  atle toast show nathi thato
    //onCreate,onStart,onResume traney no toast ek second no hato
    //Je toast ne apne pela execute karavo te toast visble thayo
    //onStart,onResume no toast onCreate na bakground ma shupay gayo

    //onCreate,onStart na run sudhi activity display nathi thati
    //onResume call thay jay pasi activity nu interface dekhay che
    //onCreate ma activity ma lakhvama avto bado code execute thay che
    //UerInterface display thay te pela onCreate,onResume call thay che
    //onResume ma activity user interface display thay che //Activity running form ma avi gai

    //Jevu hu mobile ma bottom navigation ma left button per click karu atle onPause call thashe activity background ma chali jay che
    //Bg ma app run thay che ,activity pan bg run thay che
    //Bg ma hoi app ke activity to tenu status onPause hoi che

    //onPause ma app hoi ane app fari open karu to pela onStop Call thashe pasi onStart pasi onRestart call thashe pasi onResume call thashe //User Interface dekhashe //Activity run thashe

    //Ek second ma badhu kam thay che lifecycle mathod ma

    //First Activity mathi apne Second Activity javi ne to onPause pasi onStop pasi second activity ma onCreate pasi onStart pasi onResume call thashe
    //Second Activity mat apne back button click karu atle first activity ma ava onRestart ma gaya pasi onStart ma gaya pasi onResume gaya
    //FirstActivity nu cycle puri thay gai che

    //Biji var second activity ma jasu ne to onCreate ma nahi jay onStart method call thashe kem ke second activity ek call thay gai

    //First Time open karvi ne to j onCreate ma call thay che //Second time tame te app savo to te start method thi call thay che activity

    //Je pan code karvo che onCreate ma karvo kem ke onStart,onResume ma biji var code build thashe app ni perforamnce kharab thahse

    //Second activity ma gaya apne apne app ne bg ma nakhi dith atle onPause call thashe ,pasi app open karvi to second activity open thahe kem app bg ma che
    //Second activity pela onPause call thase pasi onStop pasi call thase onRestart,pasi call thashe onStart,on Resume call thashe -ek activity mathi bji activity ma jsi to mostly aa kam thay che

    //App process kill tyare thay che jayre app crash thay che code erro thi app crash thay che
    //RealLife ma mostly avi app crash thay che je mobile ni andar external and internal memory thodi hoi
    //Memory thi vadhare app open karvi tyare app crash thay b

    //Android os processing mate memory use jyare mobile nu memory full thay processer ni limit load exceed krva mande tyare automatically app ne hange karshe
    //Tyare apni crash thai ne close thay jashe


    //Je external and internal memory vadhre che to app crash nai thay
    // Je external and internal memory thodi che to app crash thashe

    //Tame tamari app interstetial ad lagavi che te pusri screen cover karshe
    //onPause ma ad lagavi deshu jethu user joshe //onCreate ma lagavo shavo

    //OnDestroy ni vat karu tu
    //Activity running state ma che pasi tame activity ne destroy karo shavo to pela onPause ma avhse pasi te onDestroy ma avshe activity shutdown thay jashe
    //Activity destroy direct nathi thati uper na state folloow kare che

    //Destroy function call thay last screen ma baki biji screen ma destroy method call thati nathi
    //Koi pan activity pela launch thay che open thay che first onCreate call thay che pasi biji onCreate call thatu nathi
    //Jo tame app bg ma remove kari desho pasi open karsho app to tyare onCreate call thashe

}