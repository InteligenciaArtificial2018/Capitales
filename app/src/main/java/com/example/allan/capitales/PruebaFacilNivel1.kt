package com.example.allan.capitales

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PruebaFacilNivel1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba_facil_nivel1)
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
