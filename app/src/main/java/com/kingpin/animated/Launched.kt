package com.kingpin.animated

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_launched.*

class Launched : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launched)
        myBtn.setOnClickListener {
            Toast.makeText(applicationContext,"SHORT CLICK",Toast.LENGTH_LONG).show()
        }

    }
}