package com.kingpin.animated

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val animm= AnimationUtils.loadAnimation(this,R.anim.top_animation)
        animm.duration = 3000
        val btnanim =AnimationUtils.loadAnimation(this,R.anim.bottom_animation)
        image1.animation = animm
        txt1.animation = btnanim
        btnanim.duration =3000
       Handler(Looper.getMainLooper()).postDelayed({
           startActivity(Intent(this,Launched::class.java))
       },4000)
        finish()


    }
}