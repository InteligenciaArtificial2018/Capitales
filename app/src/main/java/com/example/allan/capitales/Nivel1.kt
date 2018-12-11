package com.example.allan.capitales

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button

class Nivel1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel1)
        actionbar()

        val TAG = "com.example.allan.Nive1.MULTIPLE"

        var btnMultiple = findViewById<Button>(R.id.btnMultiple2)
        var btnSeis = findViewById<Button>(R.id.btnSeis)
        var btnTiempo = findViewById<Button>(R.id.btnTiempo)
        var btnMapa = findViewById<Button>(R.id.btnMapa)


        btnMultiple.setOnClickListener {
            val intent = Intent(this, Multiple::class.java)
            startActivity(intent)
        }
        btnSeis.setOnClickListener {
            val intent = Intent(this, SeisNivel1::class.java)
            startActivity(intent)
        }
        btnTiempo.setOnClickListener {
            val intent = Intent(this, JuegoTiempoNivel1::class.java)
            startActivity(intent)
        }
        btnMapa.setOnClickListener {
            val intent = Intent(this, MapaNivel1::class.java)
            startActivity(intent)
        }
    }

    @SuppressLint("RestrictedApi")
    fun actionbar()
    {
        val barra = supportActionBar
        if (barra != null)
        {
            barra.setDefaultDisplayHomeAsUpEnabled(true)
            barra.setTitle("Atras")
        }
    }
}

