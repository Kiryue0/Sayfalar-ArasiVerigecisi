package com.melih.sayfalararasiveri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)


        val gelen_mesaj = intent.getStringExtra("mesaj")
        val gelen_yas = intent.getIntExtra("yas",0)
        val gelen_boy = intent.getIntExtra("boy",0)

        Log.e("Mesaj",gelen_mesaj.toString())
        Log.e("Yas",gelen_yas.toString())
        Log.e("Boy",gelen_boy.toString())
    }
}