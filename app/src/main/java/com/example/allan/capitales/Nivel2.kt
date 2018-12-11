package com.example.allan.capitales

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button

class Nivel2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel2)
        actionbar()

        val TAG = "com.example.allan.Nivel2.MULTIPLE"

        var btnMultiple2 = findViewById<Button>(R.id.btnMultiple2)
        var btnFacil2 = findViewById<Button>(R.id.btnFacil2)
        var btnSeis2 = findViewById<Button>(R.id.btnSeis2)
        var btnTiempo2 = findViewById<Button>(R.id.btnTiempo2)
        var btnDificil2 = findViewById<Button>(R.id.btnDificil2)
        var btnMapa2 = findViewById<Button>(R.id.btnMapa2)


        btnMultiple2.setOnClickListener {
            val intent = Intent(this, MultipleNivel2::class.java)
            startActivity(intent)
        }
        btnSeis2.setOnClickListener {
            val intent = Intent(this, SeisNivel2::class.java)
            startActivity(intent)
        }
        btnTiempo2.setOnClickListener {
            val intent = Intent(this, TiempoNivel2::class.java)
            startActivity(intent)
        }
        btnMapa2.setOnClickListener {
            val intent = Intent(this, MapaNivel2::class.java)
            startActivity(intent)
        }

    }
        @SuppressLint("RestrictedApi")
        fun actionbar() {
            val barra = supportActionBar
            if (barra != null) {
                barra.setDefaultDisplayHomeAsUpEnabled(true)
                barra.setTitle("Atras")
            }
        }


    }




