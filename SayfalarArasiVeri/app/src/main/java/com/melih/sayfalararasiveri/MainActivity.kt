package com.melih.sayfalararasiveri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.melih.sayfalararasiveri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonGonder.setOnClickListener {

            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)
            yeniIntent.putExtra("mesaj","merhaba")
            yeniIntent.putExtra("yas",23)
            yeniIntent.putExtra("boy",178)
            startActivity(yeniIntent)
        }
    }
}