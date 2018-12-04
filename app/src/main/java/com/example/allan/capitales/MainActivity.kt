package com.example.allan.capitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Codigo para mandar a llamar layaout Nivel 1//
        val TAG = "com.example.allan.Main.NIVEL1"
        var btnNiveluno = findViewById<Button>(R.id.btnNiveluno)
        var btnNiveldos = findViewById<Button>(R.id.btnNiveldos)
        var btnNiveltres = findViewById<Button>(R.id.btnNiveltres)
        var btnTodascapiales = findViewById<Button>(R.id.btnTodascapitales)


        btnNiveluno.setOnClickListener {
            val intent = Intent(this, Nivel1::class.java)
            startActivity(intent)
        }
        // Codigo para mandar a llamar layaout Nivel 2//
        btnNiveldos.setOnClickListener {
            val intent = Intent(this, Nivel2::class.java)
            startActivity(intent)
        }
        // Codigo para mandar a llamar layaout Nivel 3//
        btnNiveltres.setOnClickListener {
            val intent = Intent(this, nivel3::class.java)
            startActivity(intent)
        }
        // Codigo para mandar a llamar layaout Nivel 3//
        btnTodascapitales.setOnClickListener {
            val intent = Intent(this, GridActivity::class.java)
            startActivity(intent)
        }
    }
}
