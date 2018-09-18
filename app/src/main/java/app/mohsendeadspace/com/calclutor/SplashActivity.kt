package app.mohsendeadspace.com.calclutor

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.lang.Exception

@SuppressLint("Registered")
class SplashActivity:AppCompatActivity(){

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_splash)

         var splash=object :Thread(){

             override fun run() {

                 try {

                     Thread.sleep((5*1000).toLong())
                     var intent=Intent(applicationContext,MainActivity::class.java)
                     startActivity(intent)
                     finish()

                 }
                 catch (e:Exception){
                     e.printStackTrace()
                 }

             }

         }
         splash.start()

    }

}