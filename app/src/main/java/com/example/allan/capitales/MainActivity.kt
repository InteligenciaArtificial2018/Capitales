package com.example.allan.capitales

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * Aqui se llama los botones de cada layout
         */
        // Codigo para mandar a llamar layaout Nivel 1//
        val TAG = "com.example.allan.Main.NIVEL1"
        var btnNiveluno = findViewById<Button>(R.id.btnNiveluno)
        var btnNiveldos = findViewById<Button>(R.id.btnNiveldos)
        var btnTodascapiales = findViewById<Button>(R.id.btnTodascapitales)
        var btnNivelprueba = findViewById<Button>(R.id.btnNivelprueba)


        btnNiveluno.setOnClickListener {
            val intent = Intent(this, Nivel1::class.java)
            startActivity(intent)
        }
        // Codigo para mandar a llamar layaout Nivel 2//
        btnNiveldos.setOnClickListener {
            val intent = Intent(this, Nivel2::class.java)
            startActivity(intent)

        }
        btnTodascapiales.setOnClickListener {
            val intent = Intent(this, TodasCapitales::class.java)
            startActivity(intent)
        }
        btnNivelprueba.setOnClickListener {
            val url = "https://tierra.tutiempo.net/capitales-de-paises.html"
            val uri = Uri.parse(url)
            val web = Intent(Intent.ACTION_VIEW, uri)
            startActivity(web)
        }
    }
}
