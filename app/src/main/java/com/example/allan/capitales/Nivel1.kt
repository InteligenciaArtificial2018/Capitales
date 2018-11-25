package com.example.allan.capitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button

class Nivel1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel1)






        val TAG = "com.example.allan.Nive1.MULTIPLE"

        var btnMultiple = findViewById<Button>(R.id.btnMultiple2)


        btnMultiple.setOnClickListener {
            val intent = Intent(this, Multiple::class.java)
            startActivity(intent)
        }
    }
}

